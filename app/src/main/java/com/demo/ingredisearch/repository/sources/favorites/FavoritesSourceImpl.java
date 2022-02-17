package com.demo.ingredisearch.repository.sources.favorites;

import androidx.lifecycle.LiveData;

import com.demo.ingredisearch.models.Recipe;
import com.demo.ingredisearch.util.AppExecutors;

import java.util.List;

public class FavoritesSourceImpl {
    private final FavoriteDatabase database;
    private final FavoriteDao dao;
    private final AppExecutors appExecutors;

    public FavoritesSourceImpl(FavoriteDatabase database, AppExecutors appExecutors) {
        this.database = database;
        dao = database.favoritesDao();
        this.appExecutors = appExecutors;
    }

    // Ignore error condition just for simplicity
    public LiveData<List<Recipe>> getFavorites() {
        return dao.getFavorites();
    }

    public void addFavorite(Recipe recipe) {
        // TODO

        appExecutors.diskIO().execute(() ->
                database.runInTransaction(() -> dao.insert(recipe /*TODO*/))
        );
    }

    public void removeFavorite(Recipe recipe) {
        appExecutors.diskIO().execute(() ->
                database.runInTransaction(() -> dao.delete(recipe))
        );
    }

    public void clearFavorites() {
        appExecutors.diskIO().execute(() ->
                database.runInTransaction(dao::clear)
        );
    }

}

