package tbc.techbytecare.kk.androidslidetounlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ncorti.slidetoact.SlideToActView;

public class MainActivity extends AppCompatActivity {

    SlideToActView slideToActView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slideToActView = findViewById(R.id.slideToUnlock);

        slideToActView.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(SlideToActView slideToActView) {
                startActivity(new Intent(MainActivity.this,HomeActivity.class));
                finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        slideToActView.resetSlider();
    }
}
