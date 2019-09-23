package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.activity.DynamicActivity;
import polinema.ac.id.starterchapter05.activity.StaticActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_praktikum_fragment(View view) {
    }

    public void btn_dynamic_fragment(View view) {
        Intent i = new Intent(this, DynamicActivity.class);
        startActivity(i);
    }

    public void btn_static_fragment(View view) {
        Intent i = new Intent(this, StaticActivity.class);
        startActivity(i);
    }
}
