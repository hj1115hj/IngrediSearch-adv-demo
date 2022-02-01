package com.demo.ingredisearch.repository.sources.favorites;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.room.Room;

import com.demo.ingredisearch.models.Recipe;

import java.util.List;

public class FavoritesSourceImpl {
    private final Context context;
    private final FavoriteDao dao;

    public FavoritesSourceImpl(Context context) {
        this.context = context;
        dao = createDatabase().favoritesDao();
    }

    private FavoriteDatabase createDatabase() {
        return Room.inMemoryDatabaseBuilder(
                context,
                FavoriteDatabase.class
        ).allowMainThreadQueries().build();
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

