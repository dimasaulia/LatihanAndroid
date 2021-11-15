package com.example.latihanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra("mainActivity_text");

        TextView textView = findViewById(R.id.displayMessage);
        textView.setText(message);

    }

    public void shareMessage(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://dimasaulia.github.io"));
        startActivity(intent);
    }
}