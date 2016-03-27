package in.adityabhardwaj.movieswizard;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Aditya on 28-03-2016.
 */


public class MovieListActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter<String> adapter;
    ArrayList<String> data;
    MovieList a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);
        Intent intent = getIntent();
        final int urlname = intent.getIntExtra("urlpos", 0);
        lv = (ListView) findViewById(R.id.movielist);


        if (urlname == 3) {
            Call<MovieList> getMovieListCall = ApiClient.getInterface().getMovieList3("d9e34e27006acff0c50d8740b18b8a7c");
            getMovieListCall.enqueue(new Callback<MovieList>() {
                @Override
                public void onResponse(Call<MovieList> call, Response<MovieList> response) {
                    if (response.isSuccessful()) {
                        a = response.body();


                        Log.i("gurchetanhello", String.valueOf(a.results.size()));
                        data = new ArrayList<String>(a.results.size());
                        for (int i = 0; i < a.results.size(); i++) {
                            String mm = a.results.get(i).getTitle();
                            data.add(mm);
                        }
                        adapter = new ArrayAdapter<String>(MovieListActivity.this, android.R.layout.simple_list_item_1, data);
                        lv.setAdapter(adapter);

                        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Intent i = new Intent();
                                i.putExtra("nameMovie", a.results.get(position));
                                i.setClass(MovieListActivity.this, MovieDetailListActivity.class);
                                startActivity(i);

                            }
                        });
                    }
                }

                @Override
                public void onFailure(Call<MovieList> call, Throwable t) {

                }
            });
        }

        if (urlname == 2) {
            Call<MovieList> getMovieListCall = ApiClient.getInterface().getMovieList2("d9e34e27006acff0c50d8740b18b8a7c");
            getMovieListCall.enqueue(new Callback<MovieList>() {
                @Override
                public void onResponse(Call<MovieList> call, Response<MovieList> response) {
                    if (response.isSuccessful()) {
                        a = response.body();


                        Log.i("gurchetanhello", String.valueOf(a.results.size()));
                        data = new ArrayList<String>(a.results.size());
                        for (int i = 0; i < a.results.size(); i++) {
                            String mm = a.results.get(i).getTitle();
                            data.add(mm);
                        }
                        adapter = new ArrayAdapter<String>(MovieListActivity.this, android.R.layout.simple_list_item_1, data);
                        lv.setAdapter(adapter);
                        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Intent i = new Intent();
                                i.putExtra("nameMovie", a.results.get(position));
                                i.setClass(MovieListActivity.this, MovieDetailListActivity.class);
                                startActivity(i);
                            }

                        });
                    }
                }

                @Override
                public void onFailure(Call<MovieList> call, Throwable t) {

                }
            });
        }


        if (urlname == 1) {
            Call<MovieList> getMovieListCall = ApiClient.getInterface().getMovieList1("d9e34e27006acff0c50d8740b18b8a7c");
            getMovieListCall.enqueue(new Callback<MovieList>() {
                @Override
                public void onResponse(Call<MovieList> call, Response<MovieList> response) {
                    if (response.isSuccessful()) {
                        a = response.body();


                        Log.i("gurchetanhello", String.valueOf(a.results.size()));
                        data = new ArrayList<String>(a.results.size());
                        for (int i = 0; i < a.results.size(); i++) {
                            String mm = a.results.get(i).getTitle();
                            data.add(mm);
                        }
                        adapter = new ArrayAdapter<String>(MovieListActivity.this, android.R.layout.simple_list_item_1, data);
                        lv.setAdapter(adapter);
                        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Intent i = new Intent();
                                i.putExtra("nameMovie", a.results.get(position));
                                i.setClass(MovieListActivity.this, MovieDetailListActivity.class);
                                startActivity(i);
                            }

                        });
                    }
                }

                @Override
                public void onFailure(Call<MovieList> call, Throwable t) {

                }
            });
        }

        if (urlname == 0) {
            Call<MovieList> getMovieListCall = ApiClient.getInterface().getMovieList0("d9e34e27006acff0c50d8740b18b8a7c");
            getMovieListCall.enqueue(new Callback<MovieList>() {
                @Override
                public void onResponse(Call<MovieList> call, Response<MovieList> response) {
                    if (response.isSuccessful()) {
                        a = response.body();


                        //  Log.i("gurchetanhello", String.valueOf(a.results.size()));
                        data = new ArrayList<String>(a.results.size());
                        for (int i = 0; i < a.results.size(); i++) {
                            String mm = a.results.get(i).getTitle();
                            data.add(mm);
                        }
                        adapter = new ArrayAdapter<String>(MovieListActivity.this, android.R.layout.simple_list_item_1, data);
                        lv.setAdapter(adapter);
                        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Intent i = new Intent();
                                i.putExtra("nameMovie", a.results.get(position));
                                i.setClass(MovieListActivity.this, MovieDetailListActivity.class);
                                startActivity(i);
                            }

                        });
                    }
                }

                @Override
                public void onFailure(Call<MovieList> call, Throwable t) {

                }
            });
        }
    }
}

