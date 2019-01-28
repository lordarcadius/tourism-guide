package in.vipul.imagescroll;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ayodhya extends AppCompatActivity {
    Button button;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayodhya);
        getSupportActionBar().setTitle("Tourism Guide - Ayodhya");
        image = findViewById(R.id.img);
        Picasso.get()
                .load("https://i.imgur.com/sk0Lap8.png")
                .into(image);
    }
    public void read(View view){
        button = findViewById(R.id.but);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Ayodhya"));
        startActivity(intent);
    }
}
