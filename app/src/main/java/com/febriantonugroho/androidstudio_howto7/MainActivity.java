package com.febriantonugroho.androidstudio_howto7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telegram = new Intent(Intent.ACTION_VIEW);
                telegram.setData(Uri.parse("https://t.me/DvorakIndonesia"));
                telegram.setPackage("org.telegram.messenger");
                startActivity(Intent.createChooser(telegram, "Share with"));
            }
        });
    }
}
