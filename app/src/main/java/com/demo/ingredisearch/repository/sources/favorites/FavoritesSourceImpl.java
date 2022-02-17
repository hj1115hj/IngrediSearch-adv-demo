package com.demo.ingredisearch.repository.sources.favorites;

import androidx.lifecycle.LiveData;

import com.demo.ingredisearch.models.Recipe;

import java.util.List;

public class FavoritesSourceImpl {
    private final FavoriteDao dao;

    public FavoritesSourceImpl(FavoriteDatabase database) {
        dao = database.favoritesDao();
    }

    // Ignore error condition just for simplicity
    public LiveData<List<Recipe>> getFavorites() {
        // TODO
        return null;
    }

    public void addFavorite(Recipe recipe) {
        // TODO
    }

    public void removeFavorite(Recipe recipe) {
        dao.delete(recipe);
    }

    public void clearFavorites() {
        dao.clear();
    }

}

