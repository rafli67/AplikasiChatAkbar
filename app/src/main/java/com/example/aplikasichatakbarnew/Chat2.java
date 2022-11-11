package com.example.aplikasichatakbarnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Chat2 extends AppCompatActivity {

    private static final String EXTRA_MESSAGE = "";
    private TextView textView;
    private EditText editTextReply;
    public static final String EXTRA_REPLY = "REPLY";
    
    @Override
    protected void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat2);
        textView = findViewById(R.id.text_message);
        editTextReply = findViewById(R.id.editTextReply);
        Intent intent = getIntent();
        String message = intent.getStringExtra(Chat2.EXTRA_MESSAGE);
        textView.setText(message);
    }
    
    public void returnReply(View view){
        String areply = editTextReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, areply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
