package com.demo.ingredisearch.repository.sources.favorites;

import android.content.Context;

import androidx.room.Room;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FavoritesSourceImplTest {

    /* TODO: declare InstantTaskExecutorRule */

    // SUT
    FavoritesSourceImpl mFavoritesSource;

    FavoriteDatabase mDatabase;

    @Before
    public void init() {
        mDatabase = createDatabase(null /* TODO */);
        mFavoritesSource = new FavoritesSourceImpl(mDatabase, null);
    }

    @After
    public void tearDown() {
        mDatabase.close();
    }

    private FavoriteDatabase createDatabase(Context context) {
        return Room.inMemoryDatabaseBuilder(
                context,
                FavoriteDatabase.class
        ).allowMainThreadQueries().build();
    }

    @Test
    public void getFavorites_noFavorites_returnEmptyList() {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

    @Test
    public void getFavorites_someFavorites_returnAll() {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

    @Test
    public void addFavorites_noDuplicateId_addToFavoritesWithFavoriteStatusAsTrue() {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

    @Test
    public void addFavorites_recipeWithSameIdAlreadyExists_rejectAddition() {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

    @Test
    public void removeFavorite_removesRecipeFromFavorites() {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

    @Test
    public void clearFavorites_removeAllFavorites() {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

}
