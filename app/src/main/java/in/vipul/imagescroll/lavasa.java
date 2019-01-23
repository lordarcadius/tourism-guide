package in.vipul.imagescroll;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lavasa extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lavasa);
        getSupportActionBar().setTitle("Tourism Guide - Lavasa");
    }
    public void read(View view){
        button = findViewById(R.id.but);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Lavasa"));
        startActivity(intent);
    }
}