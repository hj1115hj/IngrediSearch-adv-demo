package com.demo.ingredisearch.features.details;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RecipeDetailsViewModelTest {
//    @Rule
//    public InstantTaskExecutorRule rule = new InstantTaskExecutorRule();
//
//    // SUT
//    RecipeDetailsViewModel mViewModel;
//
//    RecipeRepository mRecipeRepository;
//    FakeRemoteDataSource mRemoteDataSource;
//
//    @Before
//    public void init() {
//        mRemoteDataSource = new FakeRemoteDataSource(new SingleExecutors());
//        mRecipeRepository = RecipeRepository.getInstance(null, mRemoteDataSource);
//
//        mViewModel = new RecipeDetailsViewModel(mRecipeRepository);
//    }
//
//    @After
//    public void tearDown() {
//        mRecipeRepository.destroy();
//    }
//
//    @Test
//    public void searchRecipe_returnsThatRecipe() throws Exception {
//        // Given
//        mRemoteDataSource.addRecipes(TestData.recipeDetails01, TestData.recipeDetails02);
//
//        // When
//        mViewModel.searchRecipe(TestData.recipeDetails01.getRecipeId());
//
//        // Then
//        Resource<Recipe> resource = LiveDataTestUtil.getOrAwaitValue(mViewModel.getRecipe());
//        assertThat(resource, is(Resource.success(TestData.recipeDetails01)));
//    }
//
//    @Test
//    public void searchRecipe_noMatch_returnsNull() throws Exception {
//        // Given
//        mRemoteDataSource.addRecipes(TestData.recipeDetails01);
//
//        // When
//        mViewModel.searchRecipe(TestData.recipeDetails02.getRecipeId());
//
//        // Then
//        Resource<Recipe> resource = LiveDataTestUtil.getOrAwaitValue(mViewModel.getRecipe());
//        assertThat(resource, is(Resource.success(null)));
//    }
//
//    @Test
//    public void searchRecipe_error_returnsError() throws Exception {
//        // Given
//        mRemoteDataSource.setDataStatus(DataStatus.NetworkError);
//
//        // When
//        mViewModel.searchRecipe(TestData.recipeDetails01.getRecipeId());
//
//        // Then
//        Resource<Recipe> resource = LiveDataTestUtil.getOrAwaitValue(mViewModel.getRecipe());
//        assertThat(resource, is(Resource.error("Network Error", null)));
//    }
}