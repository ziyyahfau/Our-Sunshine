package intermediate.udacity.project.our_sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mMainToday;
    private ImageView mMainWeather;
    private TextView mMainWeatherDesc;
    private TextView mMainWTemperature;
    private RecyclerView mMainWeatherList;
    private String TAG = "MainActivity";
    private LinearLayoutManager layoutManager;
    private WeatherAdapter mWeatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViewBaru();

        Log.d(TAG, "onCreate: Here");
    }

    private void initViewBaru() {
        mMainToday = (TextView) findViewById(R.id.textTanggal);
        mMainWeather = (ImageView) findViewById(R.id.imgCloud);
        mMainWeatherDesc = (TextView) findViewById(R.id.textStatus);
        mMainWTemperature = (TextView) findViewById(R.id.textTemprature);
        mMainWeatherList = (RecyclerView) findViewById(R.id.reviewList);

        mMainToday.setText("Sunday");
        mMainWeather.setImageResource(R.mipmap.ic_cloud);
        mMainWTemperature.setText("32 Derajat");
        mMainWeatherDesc.setText("Petir Siang Bolong");

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mMainWeatherList.setLayoutManager(layoutManager);
        mMainWeatherList.setHasFixedSize(true);

        mWeatherAdapter = new WeatherAdapter();
        mMainWeatherList.setAdapter(mWeatherAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: here");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume:  here");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause: here");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: here ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: here");
    }
}
