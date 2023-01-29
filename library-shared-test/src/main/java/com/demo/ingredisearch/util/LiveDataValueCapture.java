package com.demo.ingredisearch.util;

import static java.util.Collections.unmodifiableList;

import java.util.ArrayList;
import java.util.List;

/*
 * Adapted from Google codelab by Jungsun Kim
 */

/**
 * Represents a list of capture values from a LiveData.
 */
public class LiveDataValueCapture<T> {
    private Object lock = new Object();
    private List<T> values = new ArrayList<>();

    public List<T> getValues() {
        synchronized (lock) {
            return unmodifiableList(values); // copy to avoid returning reference to mutable list
        }
    }

    public void addValue(T value) {
        synchronized (lock) {
            values.add(value);
        }
    }

    public void apply(Runnable runnable) {
        runnable.run();
    }
}

/**
 * Extension function to capture all values that are emitted to a LiveData<T> during the execution of
 * `captureBlock`.
 */
//        inline fun<T>LiveData<T>.captureValues(block:LiveDataValueCapture<T>.()->Unit)
//
//        {
//        val capture=LiveDataValueCapture<T> ()
//        val observer=Observer<T> {
//        capture.addValue(it)
//        }
//        observeForever(observer)
//        try{
//        capture.block()
//        }finally{
//        removeObserver(observer)
//        }
//        }

