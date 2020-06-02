package com.example.recview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hooks
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listItems = new ArrayList<>();

            ListItem listItem = new ListItem(
                    "Elly Wenani",
                    "Software and application developer"
            );

        ListItem listItem1 = new ListItem(
                "Japheth Ngugi",
                "Game developer"
        );

        ListItem listItem2 = new ListItem(
                "Elly Wenani",
                "Software and application developer"
        );

        ListItem listItem3 = new ListItem(
                "Japheth Ngugi",
                "Game developer"
        );

        ListItem listItem4 = new ListItem(
                "Elly Wenani",
                "Software and application developer"
        );

        ListItem listItem5 = new ListItem(
                "Japheth Ngugi",
                "Game developer"
        );

        ListItem listItem6 = new ListItem(
                "Elly Wenani",
                "Software and application developer"
        );

        ListItem listItem7 = new ListItem(
                "Japheth Ngugi",
                "Game developer"
        );

        ListItem listItem8 = new ListItem(
                "Elly Wenani",
                "Software and application developer"
        );

        ListItem listItem9 = new ListItem(
                "Japheth Ngugi",
                "Game developer"
        );

            listItems.add(listItem);
            listItems.add(listItem1);
            listItems.add(listItem2);
            listItems.add(listItem3);
            listItems.add(listItem4);
            listItems.add(listItem5);
            listItems.add(listItem6);
            listItems.add(listItem7);
            listItems.add(listItem8);
            listItems.add(listItem9);

        adapter = new MyAdapter(listItems, this);
        recyclerView.setAdapter(adapter);

    }

}