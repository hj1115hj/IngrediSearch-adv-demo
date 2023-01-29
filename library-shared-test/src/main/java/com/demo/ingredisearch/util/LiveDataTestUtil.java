package com.demo.ingredisearch.util;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* Copyright 2019 Google LLC.
   SPDX-License-Identifier: Apache-2.0 */
public class LiveDataTestUtil {
    @SuppressWarnings("unchecked")
    public static <T> T getOrAwaitValue(final LiveData<T> liveData) throws InterruptedException {
        final Object[] data = new Object[1];
        final CountDownLatch latch = new CountDownLatch(1);
        Observer<T> observer = new Observer<T>() {
            @Override
            public void onChanged(@Nullable T o) {
                data[0] = o;
                latch.countDown();
                liveData.removeObserver(this);
            }
        };
        liveData.observeForever(observer);
        // Don't wait indefinitely if the LiveData is not set.
        if (!latch.await(2, TimeUnit.SECONDS)) {
            throw new RuntimeException("LiveData value was never set.");
        }
        //noinspection unchecked
        return (T) data[0];
    }

    /*
     * Adapted from Google codelab by Jungsun Kim
     */

    /**
     * Get the current value from a LiveData without needing to register an observer.
     */
    @SuppressWarnings("unchecked")
    public static <T> T getValueForTest(LiveData<T> liveData) {
        final T[] value = (T[]) new Object[1];
        Observer<T> observer = t -> value[0] = t;
        liveData.observeForever(observer);
        liveData.removeObserver(observer);
        return value[0];
    }

    /**
     * Capture all values that are emitted to a LiveData<T> during the execution of
     * `captureBlock`.
     */
    public static <T> LiveDataValueCapture<T> captureValues(LiveData<T> liveData, Runnable captureBlock) {
        LiveDataValueCapture<T> capture = new LiveDataValueCapture<>();
        Observer<T> observer = capture::addValue;
        liveData.observeForever(observer);
        try{
            capture.apply(captureBlock);
        } finally {
            liveData.removeObserver(observer);
        }
        return capture;
    }

}
