package com.example.a10139.notedemo;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ArrayAdapter<String> adapter;
    private Button mbtnadd;
    public ArrayList list=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtnadd=findViewById(R.id.btnadd);
        mbtnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AddButtonActivity.class);
                startActivityForResult(intent,1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1)
        {
            String add=data.getStringExtra("editTextValue");
            ListView mlv=findViewById(R.id.lv);
            adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,list);
            adapter.add(add);
            mlv.setAdapter(adapter);
        }
        }

}
