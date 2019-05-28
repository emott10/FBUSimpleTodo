package com.mott.eric.fbusimpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static com.mott.eric.fbusimpletodo.MainActivity.ITEM_POSITION;
import static com.mott.eric.fbusimpletodo.MainActivity.ITEM_TEXT;

public class EditItemActivity extends AppCompatActivity {

    EditText etText;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        etText = findViewById(R.id.etEditText);
        etText.setText(getIntent().getStringExtra(ITEM_TEXT));
        position = getIntent().getIntExtra(ITEM_POSITION, 0);
        getSupportActionBar().setTitle("Edit Item");
    }

    public void onSaveItem(View v){
        Intent i = new Intent();
        i.putExtra(ITEM_TEXT, etText.getText().toString());
        i.putExtra(ITEM_POSITION, position);
        setResult(RESULT_OK, i);
        finish();
    }
}
