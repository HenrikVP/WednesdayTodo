package com.example.wednesdaytodo;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<TodoItem> todoList;
    private TodoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listViewTodos);

        todoList = new ArrayList<>();
        todoList.add(new TodoItem("Buy milk"));
        todoList.add(new TodoItem("Finish Android assignment"));
        todoList.add(new TodoItem("Go for a walk"));

        adapter = new TodoAdapter(this, todoList);
        listView.setAdapter(adapter);
    }
}
