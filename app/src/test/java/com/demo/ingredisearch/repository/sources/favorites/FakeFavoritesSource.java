package com.demo.ingredisearch.repository.sources.favorites;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.demo.ingredisearch.models.Recipe;
import com.demo.ingredisearch.util.AppExecutors;

import java.util.ArrayList;
import java.util.List;

public class FakeFavoritesSource {
    public static final long FAKE_DB_DELAY = 100L;

    private final AppExecutors mAppExecutors;

    private final List<Recipe> favTable = new ArrayList<>();

    private final MutableLiveData<List<Recipe>> mFavorites = new MutableLiveData<>();

    public FakeFavoritesSource(AppExecutors appExecutors) {
        this.mAppExecutors = appExecutors;
    }

    public LiveData<List<Recipe>> getFavorites() {
        refresh();
        return mFavorites;
    }

    /**
     * Refreshes the LiveData with the current data in the table.
     */
    private void refresh() {
        try {
            Thread.sleep(FAKE_DB_DELAY);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        mAppExecutors.diskIO().execute(() -> {
            // TODO

        });
    }

    public void addFavorite(Recipe recipe) {
        if (contains(recipe)) return;

        Recipe newFavorite = new Recipe(recipe);
        newFavorite.setFavorite(true);
        favTable.add(newFavorite);

        refresh();
    }

    private boolean contains(Recipe recipe) {
        return favTable.stream().anyMatch(recipe::isSameAs);
    }

    public void removeFavorite(Recipe recipe) {
        if (favTable.removeIf(recipe::isSameAs)) {
            refresh();
        }
    }

    public void clearFavorites() {
        favTable.clear();
        refresh();
    }

    public void prepareFavorites(List<Recipe> recipes) {
        // TODO
    }

    public void prepareFavorites(Recipe... recipes) {
        // TODO
    }
}
