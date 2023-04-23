package com.demo.ingredisearch.repository;

import androidx.lifecycle.LiveData;

import com.demo.ingredisearch.models.Recipe;
import com.demo.ingredisearch.util.Resource;

import java.util.List;

public class RecipeRepository {

    private static volatile RecipeRepository INSTANCE = null;

    private RecipeRepository() {

    }

    public static RecipeRepository getInstance() {
        if (INSTANCE == null) {
            synchronized (RecipeRepository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new RecipeRepository();
                }
             }
        }
        return INSTANCE;
    }

    public LiveData<Resource<List<Recipe>>> getRecipes() {
        // TODO
        return null;
    }

    public LiveData<Resource<Recipe>> getRecipe() {
        // TODO
        return null;
    }

    public void searchRecipes(String query) {
        // TODO
    }

    public void searchRecipe(String recipeId) {
        // TODO
    }

    public LiveData<List<Recipe>> getFavorites() {
        // TODO
        return null;
    }

    public void addFavorite(Recipe recipe) {
        // TODO
    }

    public void removeFavorite(Recipe recipe) {
        // TODO
    }

    public void clearFavorites() {
        // TODO
    }

    // TODO - destroy!!

}
