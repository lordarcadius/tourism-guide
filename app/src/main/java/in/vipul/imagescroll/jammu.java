package in.vipul.imagescroll;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class jammu extends AppCompatActivity {
    Button button;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jammu);
        getSupportActionBar().setTitle("Tourism Guide - J & K");
        image = findViewById(R.id.img);
        Picasso.get()
                .load("https://i.imgur.com/xNOCT2X.png")
                .into(image);
    }
    public void read(View view){
        button = findViewById(R.id.but);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Jammu_and_Kashmir"));
        startActivity(intent);
    }
}
