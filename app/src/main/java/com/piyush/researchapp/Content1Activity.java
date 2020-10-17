package com.piyush.researchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Content1Activity extends AppCompatActivity {
    Button content1_Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content1);

        content1_Btn = findViewById(R.id.content1_Btn);

        content1_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoContent2Activity();
            }
        });
    }

    private void gotoContent2Activity() {
        Intent intent=new Intent(this,Content2Activity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Disabled Back Press", Toast.LENGTH_SHORT).show();
    }
}