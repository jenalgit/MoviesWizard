package in.adityabhardwaj.movieswizard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainListActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<MainList> datalist;
    MainListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        lv =(ListView)findViewById(R.id.mainlist);
        datalist = new ArrayList<>();

        MainList one = new MainList();
        one.setName("Popular Movies");
        datalist.add(one);

        MainList two = new MainList();
        two.setName("Top Rated");
        datalist.add(two);

        MainList three = new MainList();
        three.setName("Upcoming");
        datalist.add(three);

        MainList four = new MainList();
        four.setName("Now Playing");
        datalist.add(four);

        adapter = new MainListAdapter(MainListActivity.this,datalist);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent();
                i.putExtra("urlpos", position);
                i.setClass(MainListActivity.this, MovieListActivity.class);
                startActivity(i);


            }
        });
    }
}
