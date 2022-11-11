package com.example.aplikasichatakbarnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.aplikasichatakbar.Chat1;

public class MainActivity extends AppCompatActivity {
    private TextView penrima;
    public  static final String KONTAK = "NAMA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pageADI(View view){
        Intent page1 = new Intent(MainActivity.this, Chat1.class);
        page1.putExtra(KONTAK, "BANG ADI");
        startActivity(page1);
    }

    public void pageMAN(View view){
        Intent page1 = new Intent(MainActivity.this, Chat1.class);
        page1.putExtra(KONTAK, "BANG MAN");
        startActivity(page1);
    }

    public void pageNDUT(View view){
        Intent page1 = new Intent(MainActivity.this, Chat1.class);
        page1.putExtra(KONTAK, "BANG NDUT");
        startActivity(page1);
    }
}