package com.example.a10139.notedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class AddButtonActivity extends AppCompatActivity {


    private Button mbtn;
    private EditText medit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_button);
        mbtn=findViewById(R.id.btn_add);
        medit=findViewById(R.id.edit_add);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取edittext的值
                String add=medit.getText().toString();
                Intent data=new Intent(AddButtonActivity.this,MainActivity.class);
                data.putExtra("editTextValue",add);
                setResult(1,data);
                finish();
            }
        });
    }
}
