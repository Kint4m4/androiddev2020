package vn.edu.usth.usthweather;


import android.app.ActionBar;
import android.graphics.Typeface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        LinearLayout forecast = new LinearLayout(getActivity());
        forecast.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        forecast.setOrientation(LinearLayout.HORIZONTAL);
        forecast.setPadding(28,30,0,20);

            LinearLayout day = new LinearLayout(getActivity());
            day.setLayoutParams(new LinearLayout.MarginLayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            day.setOrientation(LinearLayout.VERTICAL);
            day.setBackgroundColor(0xFF2D5D76);

            TextView mon = new TextView(getActivity());
            mon.setText("Mon");
            mon.setPadding(40,20,0,0);
            mon.setTextSize(24);

            TextView tue = new TextView(getActivity());
            tue.setText("Tue");
            tue.setPadding(40,100,0,0);
            tue.setTextSize(24);

            TextView wed = new TextView(getActivity());
            wed.setText("Wed");
            wed.setPadding(40,100,0,0);
            wed.setTextSize(24);

            TextView thu = new TextView(getActivity());
            thu.setText("Thu");
            thu.setPadding(40,100,0,0);
            thu.setTextSize(24);

            TextView fri = new TextView(getActivity());
            fri.setText("Fri");
            fri.setPadding(40,100,0,0);
            fri.setTextSize(24);

            TextView sat = new TextView(getActivity());
            sat.setText("Sat");
            sat.setPadding(40,100,0,0);
            sat.setTextSize(24);

            TextView sun = new TextView(getActivity());
            sun.setText("Sun");
            sun.setPadding(40,100,0,20);
            sun.setTextSize(24);

            day.addView(mon);
            day.addView(tue);
            day.addView(wed);
            day.addView(thu);
            day.addView(fri);
            day.addView(sat);
            day.addView(sun);


            LinearLayout weathericon = new LinearLayout(getActivity());
            weathericon.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            weathericon.setOrientation(LinearLayout.VERTICAL);
            weathericon.setBackgroundColor(0xFF2D5D76);

            TextView snow = new TextView(getActivity());
            snow.setCompoundDrawablesWithIntrinsicBounds(R.drawable.snow, 0, 0, 0);
            snow.setText("Snow day");
            snow.setPadding(20,20,0,0);
            snow.setCompoundDrawablePadding(50);
            snow.setTextSize(24);

            TextView sunny = new TextView(getActivity());
            sunny.setCompoundDrawablesWithIntrinsicBounds(R.drawable.sunny, 0, 0, 0);
            sunny.setText("It hot outside");
            sunny.setPadding(20,100,0,0);
            sunny.setCompoundDrawablePadding(50);
            sunny.setTextSize(24);


            TextView windy = new TextView(getActivity());
            windy.setCompoundDrawablesWithIntrinsicBounds(R.drawable.windy,0,0,0);
            windy.setText("Strong wind caution");
            windy.setPadding(20,100,0,0);
            windy.setCompoundDrawablePadding(50);
            windy.setTextSize(24);

            TextView rain__heavy = new TextView(getActivity());
            rain__heavy.setCompoundDrawablesWithIntrinsicBounds(R.drawable.heavy_rain,0,0,0);
            rain__heavy.setText("Don't forget your raincoat");
            rain__heavy.setPadding(20,100,0,0);
            rain__heavy.setCompoundDrawablePadding(50);
            rain__heavy.setTextSize(24);

            TextView rain = new TextView(getActivity());
            rain.setCompoundDrawablesWithIntrinsicBounds(R.drawable.moderate_rain,0,0,0);
            rain.setText("Bring your umbrella");
            rain.setPadding(20,100,0,0);
            rain.setCompoundDrawablePadding(50);
            rain.setTextSize(24);

            TextView overcast = new TextView(getActivity());
            overcast.setCompoundDrawablesWithIntrinsicBounds(R.drawable.overcast,0,0,0);
            overcast.setText("The weather seem sad");
            overcast.setPadding(20,100,0,0);
            overcast.setCompoundDrawablePadding(50);
            overcast.setTextSize(24);

            TextView thunder = new TextView(getActivity());
            thunder.setCompoundDrawablesWithIntrinsicBounds(R.drawable.thunder, 0, 0, 0);
            thunder.setText("Stay inside");
            thunder.setPadding(20,100,0,20);
            thunder.setCompoundDrawablePadding(50);
            thunder.setTextSize(24);


            weathericon.addView(snow);
            weathericon.addView(sunny);
            weathericon.addView(windy);
            weathericon.addView(rain);
            weathericon.addView(overcast);
            weathericon.addView(rain__heavy);
            weathericon.addView(thunder);


        forecast.addView(day);
        forecast.addView(weathericon);

        return forecast;
    }
}