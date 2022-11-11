package com.example.aplikasichatakbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Chat1 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "MESSAGE";
    public static final int TEXT_REQUEST = 1;
    private EditText editText;
    private TextView textViewMessage, penerima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat1);
        editText = findViewById(R.id.editText);
        textViewMessage = findViewById(R.id.text_message);

        penerima = findViewById(R.id.penerima);
        Intent intent = getIntent();
        String kontak = intent.getStringExtra(MainActivity.KONTAK);
        penerima.setText(kontak);
    }

    public void openSecondActivity(View view){
        Intent intent = new Intent(this, Chat2.class);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    protected void onActivityResul(int requestCode, int resultCode,
                                   @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TEXT_REQUEST && resultCode == RESULT_OK){
            String reply = data.getStringExtra(Chat2.EXTRA_REPLY);
            textViewMessage.setText(reply);
        }
    }
}