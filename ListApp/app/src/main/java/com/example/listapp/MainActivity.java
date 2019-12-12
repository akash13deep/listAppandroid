package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView lv;
MyListView adapter;
MainActivity customView = null;
List<ListItem> course = new ArrayList<ListItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customView = this;
        setData();
        Resources res=getResources();

        lv = findViewById(R.id.listv);

        adapter = new MyListView(customView,course,res);
        lv.setAdapter(adapter);
    }

    public void setData()
    {
        ListItem item = new ListItem("Java","javaa");
        course.add(item);
        item = new ListItem("C#","c");
        course.add(item);
        item = new ListItem("Swift","swift");
        course.add(item);
        item = new ListItem("PHP","php");
        course.add(item);
    }
    public void onItemClick(int i)
    {
        ListItem tempVal = (ListItem)course.get(i);

    }
}
