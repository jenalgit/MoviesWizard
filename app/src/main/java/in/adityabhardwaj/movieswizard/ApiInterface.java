package in.adityabhardwaj.movieswizard;

        import java.util.ArrayList;

        import retrofit2.Call;
        import retrofit2.http.Body;
        import retrofit2.http.GET;
        import retrofit2.http.Header;
        import retrofit2.http.POST;
        import retrofit2.http.Path;
        import retrofit2.http.Query;

/**
 * Created by Aditya on 27-03-2016.
 */



public interface ApiInterface {
    @GET("top_rated")
    Call<MovieList> getMovieList1( @Query("api_key") String token);

    @GET("upcoming")
    Call<MovieList> getMovieList2( @Query("api_key") String token);

    @GET("popular")
    Call<MovieList> getMovieList0( @Query("api_key") String token);

    @GET("now_playing")
    Call<MovieList> getMovieList3( @Query("api_key") String token);

//    @GET("users/{id}")
//    Call<User> getUser(@Path("id") int userId);
//
//    @GET("posts?userId")
//    Call<ArrayList<Post>> getPosts(@Query("userId") int id);
//
//    @GET("users")
//    Call<ArrayList<User>> getUsers();
//
//    @POST("posts")
//    Call<User> createUser(@Body User user);
//
//    @POST("posts")
//    Call<Post> createPost(@Body Post post);



}
