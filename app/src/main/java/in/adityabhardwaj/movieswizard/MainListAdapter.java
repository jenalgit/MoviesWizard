package in.adityabhardwaj.movieswizard;

/**
 * Created by Aditya on 28-03-2016.
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainListAdapter extends ArrayAdapter<MainList> {

    Context context;
    ArrayList<MainList>list;

    public MainListAdapter(Context context, ArrayList<MainList> objects) {
        super(context, 0, objects);
        this.context = context;
        list = objects;
    }
    static class ViewHolder{
        TextView leftview;
        ImageView rightview;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = View.inflate(context, R.layout.mainlistitem, null);
            ViewHolder vh = new ViewHolder();
            vh.leftview = (TextView)convertView.findViewById(R.id.mainlistitemname);
            vh.rightview = (ImageView)convertView.findViewById(R.id.mainlistitemimage);
            convertView.setTag(vh);
        }
        ViewHolder vh =(ViewHolder)convertView.getTag();
        MainList name = list.get(position);
        vh.leftview.setText(name.getName());
        if(position == 0)
            vh.rightview.setImageResource(R.drawable.goldstar);
        if(position == 1)
            vh.rightview.setImageResource(R.drawable.rated);
        if(position == 2)
            vh.rightview.setImageResource(R.drawable.upcoming);
        if(position == 3)
            vh.rightview.setImageResource(R.drawable.nowplaying);


        return convertView;
    }
}
