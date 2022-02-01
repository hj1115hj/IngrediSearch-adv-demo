package com.demo.ingredisearch.repository.sources.favorites;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.demo.ingredisearch.models.Recipe;

import java.util.ArrayList;
import java.util.List;

public class FakeFavoritesSource {
    private final List<Recipe> favTable = new ArrayList<>();

    private final MutableLiveData<List<Recipe>> mFavorites = new MutableLiveData<>();

    public LiveData<List<Recipe>> getFavorites() {
        // TODO
        return mFavorites;
    }

    private void refresh() {
        // TODO
    }

    public void addFavorite(Recipe recipe) {
        if (contains(recipe)) return;

        Recipe newFavorite = new Recipe(recipe);
        newFavorite.setFavorite(true);
        favTable.add(newFavorite);
        // TODO
    }

    private boolean contains(Recipe recipe) {
        return favTable.stream().anyMatch(recipe::isSameAs);
    }

    public void removeFavorite(Recipe recipe) {
        if (favTable.removeIf(recipe::isSameAs)) {
            // TODO
        }
    }

    public void clearFavorites() {
        favTable.clear();
        // TODO
    }

    public void prepareFavorites(List<Recipe> recipes) {
        // TODO
    }

    public void prepareFavorites(Recipe... recipes) {
        // TODO
    }
}
