package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.net.Uri;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callphone  (View view){
        Uri uri = Uri.parse("tel:088537768907");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }

    public void showmap (View view) {
        Uri uri = Uri.parse("https://www.google.co.id/maps/place/7%C2%B000'41.4%22S+110%C2%B024'40.7%22E/@-7.0115329,110.4114873,21z/data=!4m6!3m5!1s0x0:0x0!7e2!8m2!3d-7.0114895!4d110.4112966");
        Intent it = new Intent (Intent.ACTION_VIEW,uri );
        startActivity(it);

    }

    public void email(View view){
    Intent intent = new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    intent.putExtra(Intent.EXTRA_EMAIL,new String[] {"DickyS@gmail.com."});
    intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android");

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
}