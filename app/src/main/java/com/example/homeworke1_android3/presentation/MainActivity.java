package com.example.homeworke1_android3.presentation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homeworke1_android3.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EmojiAdapter emojiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.cards);
        emojiAdapter = new EmojiAdapter();
        recyclerView.setAdapter(emojiAdapter);
    }
}