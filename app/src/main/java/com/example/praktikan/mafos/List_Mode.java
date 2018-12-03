package com.example.praktikan.mafos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import android.widget.ListView;

public class List_Mode extends AppCompatActivity {
    ListView listView;
    List<Mode> modes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__mode);

        modes = listMode();
        listView = (ListView) findViewById(R.id.ListViewMode);
        listView.setAdapter(new AdapterMode(this, modes));
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Mode");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                launchMatchesFor(modes.get((int) l));
            }
        });
    }

    private void launchMatchesFor(Mode mode) {
        Log.i("UI", "Diklik: " + mode.getJenisMode());
        Intent i = new Intent(this, JenisActivity.class);
        i.putExtra("mode", mode.getJenisMode());
        startActivity(i);
    }

    private List<Mode> listMode() {
        List<Mode> modes = new ArrayList<>();

        modes.add(Mode.generateMode("Pakaian Wanita"));
        modes.add(Mode.generateMode("Tas"));
        modes.add(Mode.generateMode("Aksesoris"));
        modes.add(Mode.generateMode("Kaos"));

        return modes;
    }
}
