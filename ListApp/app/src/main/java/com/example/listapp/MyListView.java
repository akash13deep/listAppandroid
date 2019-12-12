package com.example.listapp;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MyListView extends BaseAdapter implements View.OnClickListener
{
private Activity activity;
private List<ListItem> data = new ArrayList<ListItem>();
private static LayoutInflater inflater = null;
public Resources res;
ListItem item = null;
int i = 0;


    public MyListView(Activity a,List d,Resources r)

{
    activity=a;
    data=d;
    res=r;
    inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

}

    @Override
    public int getCount() {
    if(data.size()<=0)
        return 1;
    return data.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    public void onClick(View view) {
        Log.v("customAdapter", "row button is clicked");
    }
public static class ViewHolder
{
    public TextView text;
    public ImageView img;
}
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vi = view;
        ViewHolder holder;
        if (view == null)
        {
            vi = inflater.inflate(R.layout.mylist, null);
        holder = new ViewHolder();
        holder.text = vi.findViewById(R.id.test);
        holder.img = vi.findViewById(R.id.j);
        vi.setTag(holder);
    }
        else
            holder = (ViewHolder)vi.getTag();
        if(data.size()<=0)
        {
            holder.text.setText("No Data");
        }
        else
        {
            item = null;
            item = (ListItem) data.get(i);

            holder.text.setText(item.getItemNmae());
            holder.img.setImageResource(res.getIdentifier("com.example.listapp:drawable/"+item.getItemImage(),null,null));
            vi.setOnClickListener(new OnItemClickListener(i));
        }

        return vi;
    }
    private class OnItemClickListener implements View.OnClickListener
    {
        private  int i;
        OnItemClickListener(int i){
            this.i=i;
        }
        public void OnClick(View v)
        {
            MainActivity m = (MainActivity) activity;
            m.onItemClick(i);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
