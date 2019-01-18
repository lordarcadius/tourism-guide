package in.vipul.imagescroll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void amr(View view){
        Intent intent = new Intent(MainActivity.this,amritsar.class);
        startActivity(intent);
    }
    public void ayo(View view){
        Intent intent = new Intent(MainActivity.this,ayodhya.class);
        startActivity(intent);
    }
    public void chen(View view){
        Intent intent = new Intent(MainActivity.this,chennai.class);
        startActivity(intent);
    }
    public void del(View view){
        Intent intent = new Intent(MainActivity.this,delhi.class);
        startActivity(intent);
    }
    public void guj(View view){
        Intent intent = new Intent(MainActivity.this,gujarat.class);
        startActivity(intent);
    }
    public void jam(View view){
        Intent intent = new Intent(MainActivity.this,jammu.class);
        startActivity(intent);
    }
    public void ker(View view){
        Intent intent = new Intent(MainActivity.this,kerala.class);
        startActivity(intent);
    }
    public void lav(View view){
        Intent intent = new Intent(MainActivity.this,lavasa.class);
        startActivity(intent);
    }
    public void mum(View view){
        Intent intent = new Intent(MainActivity.this,mumbai.class);
        startActivity(intent);
    }
    public void pat(View view){
        Intent intent = new Intent(MainActivity.this,patna.class);
        startActivity(intent);
    }
}
