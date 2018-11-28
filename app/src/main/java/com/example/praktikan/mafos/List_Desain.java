package com.example.praktikan.mafos;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class List_Desain extends AppCompatActivity {
    ListView listView;
    List<Design> designs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__desain);

        designs = listDesigns();
        listView = (ListView) findViewById(R.id.ListViewDesign);
        listView.setAdapter(new AdapterDesign(this, designs));
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Design");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                launchMatchesFor(designs.get((int) l));
            }
        });
    }

    private void launchMatchesFor(Design design) {
        Log.i("UI", "Diklik; " +design.getJenisDesign());
        Intent i = new Intent(this, JenisActivity.class);
        i.putExtra("team", design.getJenisDesign());
        startActivity(i);
    }

    private  List<Design> listDesigns(){
        List<Design> designs = new ArrayList<>();

        designs.add(Design.generateDesign("Kaligrafi"));
        designs.add(Design.generateDesign("Interior"));
        designs.add(Design.generateDesign("Exterior"));
        designs.add(Design.generateDesign("Desain Grafis"));
        designs.add(Design.generateDesign("Ilustrator"));

        return designs;
    }
}
