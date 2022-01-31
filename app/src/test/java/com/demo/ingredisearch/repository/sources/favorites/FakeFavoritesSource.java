package com.demo.ingredisearch.repository.sources.favorites;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.demo.ingredisearch.models.Recipe;
import com.demo.ingredisearch.util.Resource;

import java.util.ArrayList;
import java.util.List;

public class FakeFavoritesSource {
    private final List<Recipe> favTable = new ArrayList<>();

    private final MutableLiveData<Resource<List<Recipe>>> mFavorites = new MutableLiveData<>();

    public LiveData<Resource<List<Recipe>>> getFavorites() {
        return mFavorites;
    }

    public void addFavorite(Recipe recipe) {
        if (contains(recipe)) return;

        Recipe newFavorite = new Recipe(recipe);
        newFavorite.setFavorite(true);
        favTable.add(newFavorite);
    }

    private boolean contains(Recipe recipe) {
        return favTable.stream().anyMatch(recipe::isSameAs);
    }

    public void removeFavorite(Recipe recipe) {
        favTable.removeIf(recipe::isSameAs);
    }

    public void clearFavorites() {
        favTable.clear();
    }

    public void prepareFavorites(List<Recipe> recipes) {
        // TODO
    }

    public void prepareFavorites(Recipe... recipes) {
        // TODO
    }
}
