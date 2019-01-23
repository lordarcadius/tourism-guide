package in.vipul.imagescroll;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kerala extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala);
        getSupportActionBar().setTitle("Tourism Guide - Kerala");
    }

    public void read(View view){
        button = findViewById(R.id.but);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Kerala"));
        startActivity(intent);
    }
}
