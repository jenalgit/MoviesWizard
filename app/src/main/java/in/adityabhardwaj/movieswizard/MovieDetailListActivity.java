package in.adityabhardwaj.movieswizard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MovieDetailListActivity extends AppCompatActivity {

    TextView title;
    TextView releaseDate;
    TextView plot;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail_list);


        Intent i = getIntent();
        Movie m = (Movie) i.getSerializableExtra("nameMovie");


        setContentView(R.layout.activity_movie_detail_list);
        title = (TextView) findViewById(R.id.title);
        releaseDate = (TextView) findViewById(R.id.release);
        plot = (TextView) findViewById(R.id.plot);
        image = (ImageView) findViewById(R.id.imageView);
        String path = m.getPoster_path();


        title.setText(m.getTitle());
        releaseDate.setText(m.getRelease_date());
        plot.setText(m.getOverview());
        Picasso.with(MovieDetailListActivity.this).load("http://image.tmdb.org/t/p/w500/" + path ).resize(600,350).into(image);

    }


}
