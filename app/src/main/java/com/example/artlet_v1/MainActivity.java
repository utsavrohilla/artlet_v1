package com.example.artlet_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
//import DatabaseHelper;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.folioreader.FolioReader;

/*public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;
    MangaReader mr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //this.db = new DatabaseHelper(getApplicationContext());
        Search_Fragment searchFragment = new Search_Fragment();
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.mainactivity, searchFragment, "Search_Fragment");
        fragmentTransaction.commit();
    }

    public void testManga(View view)
    {
        Intent newIntent = new Intent(this, MangaReader.class);
        startActivity(newIntent);
    }

    public void testEpub(View view)
    {
        FolioReader folioReader = FolioReader.get();
        folioReader.openBook(R.raw.lightningthief);
    }
}*/

public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.db = new DatabaseHelper(getApplicationContext());
        DatabaseHelper d1 = new DatabaseHelper(this);
    }

    public void show_login(View v)
    {
        Intent i=new Intent(this, LoginActivity.class);
        startActivity(i);
    }

    public void show_register(View v)
    {
        Intent i=new Intent(this, RegisterActivity.class);
        startActivity(i);
    }
}
