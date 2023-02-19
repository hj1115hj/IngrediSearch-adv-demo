package com.demo.ingredisearch.repository.sources.remote;

import static org.mockito.Mockito.mock;

import com.demo.ingredisearch.TestData;
import com.demo.ingredisearch.models.Recipe;
import com.demo.ingredisearch.repository.sources.ResponseCallback;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import retrofit2.Callback;

public class RecipeApiClientTest {

    // SUT
    RecipeApiClient mRemoteDataSource;

    /* TODO: Create necessary mocks */

    @Before
    public void init() {
        /* TODO: 1. Open the mocks
         *       2. Create a RecipeApiClient
         */
    }

    @Test
    public void searchRecipes_whenFailedByNetworkError_returnsErrorResponse() {
        // Arrange (Given)

        // Act (When),

        // Assert (Then)

    }

    @Test
    public void searchRecipes_whenFailedWithHTTPError_returnsErrorResponse() {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)
    }

    @Test
    public void searchRecipes_whenFailedWithAuthError_returnsErrorResponse() {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)

    }

    @Test
    public void searchRecipes_whenSucceedWithNullResult_returnsEmptyList() {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)

    }

    @Test
    public void searchRecipes_whenSucceed_returnsRecipesList() {
        // Arrange (Given)

        // Act (When)

        // Assert (Then)

    }

    @Test
    public void searchRecipe_whenFailedByNetworkError_returnsErrorResponse() {
//        // Arrange (Given)
//        doAnswer(invocation -> {
//            Callback<RecipeResponse> callback = invocation.getArgument(0);
//            callback.onFailure(mockRecipeResponseCall, new IOException("Network Error"));
//            return null;
//        }).when(mockRecipeResponseCall).enqueue(isA(Callback.class));
//
//        // Act (When)
//        mRemoteDataSource.searchRecipe("some query id", new ResponseCallback<>() {
//            @Override
//            public void onDataAvailable(Resource<Recipe> response) {
//                fail("should not be called");
//            }
//
//            @Override
//            public void onError(Resource<Recipe> response) {
//                // Assert (Then)
//                assertThat(response, is(Resource.error("Network Error", null)));
//            }
//        });
    }

    @Test
    public void searchRecipe_whenFailedWithHTTPError_returnsErrorResponse() {
//        // Arrange (Given)
//        when(mockRecipeResponseResponse.isSuccessful()).thenReturn(false); // can omit
//        when(mockRecipeResponseResponse.message()).thenReturn("HTTP Error");
//        doAnswer(invocation -> {
//            Callback<RecipeResponse> callback = invocation.getArgument(0);
//            callback.onResponse(mockRecipeResponseCall, mockRecipeResponseResponse);
//            return null;
//        }).when(mockRecipeResponseCall).enqueue(isA(Callback.class));
//
//        // Act (When)
//        mRemoteDataSource.searchRecipe("some query id", new ResponseCallback<>() {
//            @Override
//            public void onDataAvailable(Resource<Recipe> response) {
//                fail("should not be called");
//            }
//
//            @Override
//            public void onError(Resource<Recipe> response) {
//                // Assert (Then)
//                assertThat(response, is(Resource.error("HTTP Error", null)));
//            }
//        });
    }

    @Test
    public void searchRecipe_whenFailedWithAuthError_returnsErrorResponse() {
//        // Arrange (Given)
//        when(mockRecipeResponseResponse.isSuccessful()).thenReturn(true);
//        when(mockRecipeResponseResponse.code()).thenReturn(401);
//        doAnswer(invocation -> {
//            Callback<RecipeResponse> callback = invocation.getArgument(0);
//            callback.onResponse(mockRecipeResponseCall, mockRecipeResponseResponse);
//            return null;
//        }).when(mockRecipeResponseCall).enqueue(isA(Callback.class));
//
//        // Act (When)
//        mRemoteDataSource.searchRecipe("some query id", new ResponseCallback<>() {
//            @Override
//            public void onDataAvailable(Resource<Recipe> response) {
//                fail("should not be called");
//            }
//
//            @Override
//            public void onError(Resource<Recipe> response) {
//                // Assert (Then)
//                assertThat(response, is(Resource.error("Authorization Error", null)));
//            }
//        });
    }

    @Test
    public void searchRecipe_whenSucceedWithNullResult_returnsNull() {
//        // Arrange (Given)
//        when(mockRecipeResponseResponse.isSuccessful()).thenReturn(true);
//        when(mockRecipeResponseResponse.body()).thenReturn(null);
//        doAnswer(invocation -> {
//            Callback<RecipeResponse> callback = invocation.getArgument(0);
//            callback.onResponse(mockRecipeResponseCall, mockRecipeResponseResponse);
//            return null;
//        }).when(mockRecipeResponseCall).enqueue(isA(Callback.class));
//
//        // Act (When)
//        mRemoteDataSource.searchRecipe(TestData.recipeDetails01.getRecipeId(), new ResponseCallback<>() {
//            @Override
//            public void onDataAvailable(Resource<Recipe> response) {
//                // Assert (Then)
//                assertThat(response, is(Resource.success(null)));
//            }
//
//            @Override
//            public void onError(Resource<Recipe> response) {
//                fail("should not be called");
//            }
//        });
    }

    /*
     * Use mock for our `ResponseCallback` to verify the callback is called.
     * Use `ArgumentCaptor` to capture the Retrofit callback and invoke it with the mocked response.
     */
    @Test
    public void searchRecipe_whenSucceed_returnsRecipe() {
        // Arrange (Given)
        // TODO: Create a mock for `ResponseCallback` and `ArgumentCaptor`.
        ResponseCallback<Recipe> mockResponseCallback = mock(ResponseCallback.class);
        ArgumentCaptor<Callback<RecipeResponse>> mockCallbackCaptor = ArgumentCaptor.forClass(Callback.class);

        // Act (When)
        mRemoteDataSource.searchRecipe(TestData.recipe1.getRecipeId(), mockResponseCallback);

        // Assert (Then)
        // TODO: Capture the Retrofit callback and invoke it with the mocked response
        //       and verify the callback is called with the expected response.

    }

}
