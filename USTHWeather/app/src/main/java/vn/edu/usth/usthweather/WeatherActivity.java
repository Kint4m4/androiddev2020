package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i(TAG,"onCreate: Weather activity is creating.");
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"onStart: Weather activity is starting.");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume: Weather activity is resuming.");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause: Weather activity is pausing.");

    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop: Weather activity is stopping.");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy: Weather activity is being destroyed.");
    }
}