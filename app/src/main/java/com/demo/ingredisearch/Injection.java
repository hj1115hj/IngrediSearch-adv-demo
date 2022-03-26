package com.demo.ingredisearch;

import android.content.Context;

import androidx.room.Room;

import com.demo.ingredisearch.repository.RecipeRepository;
import com.demo.ingredisearch.repository.sources.favorites.FavoriteDatabase;

public class Injection {
    private final Context context;
    private RecipeRepository recipeRepository;

    public Injection(Context context) {
        this.context = context;
    }

    public RecipeRepository getRecipeRepository() {
        return recipeRepository;
    }

    public void setRecipeRepository(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    private FavoriteDatabase createDatabase(Context context) {
        return Room.inMemoryDatabaseBuilder(
                context,
                FavoriteDatabase.class
        ).allowMainThreadQueries().build();
    }
}
