package com.example.praktikan.mafos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class BerandaActivity extends AppCompatActivity {

    ImageButton design, mode, smartphone,chat, order,web, makeover, kamera,  home, account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        setupViews();
    }

    private void setupViews() {
        design = (ImageButton) findViewById(R.id.design);
        design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(BerandaActivity.this,List_Desain.class));
            }
        });

        mode = (ImageButton) findViewById(R.id.mode);
        mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(BerandaActivity.this,List_Mode.class));
            }
        });

        smartphone = (ImageButton) findViewById(R.id.smartphone);
        smartphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Fitur Belum Tersedia");
            }
        });

        kamera = (ImageButton) findViewById(R.id.kamera);
        kamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Fitur Belum Tersedia");
            }
        });

        makeover = (ImageButton) findViewById(R.id.makeover);
        makeover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Fitur Belum Tersedia");
            }
        });

        web = (ImageButton) findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Fitur Belum Tersedia");
            }
        });

        chat = (ImageButton) findViewById(R.id.chat);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Fitur Belum Tersedia");
            }
        });

        order = (ImageButton) findViewById(R.id.order);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Fitur Belum Tersedia");
            }
        });


        account = (ImageButton) findViewById(R.id.profile);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(BerandaActivity.this,GoogleSignInActivity.class));
            }
        });

    }



    private void showToast(String text){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
