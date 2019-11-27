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


public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        LinearLayout parent = new LinearLayout(getActivity());
        parent.setLayoutParams(new LinearLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT));
        parent.setOrientation(LinearLayout.HORIZONTAL);
        parent.setBackgroundColor(0xFFFF6600);

        ImageView weatherIcon= new ImageView(getActivity());
        weatherIcon.setImageResource(R.drawable.thunder);
        weatherIcon.setScaleType((ImageView.ScaleType.FIT_CENTER));
        weatherIcon.setScaleX((float)0.5);
        weatherIcon.setScaleY((float)0.5);
        weatherIcon.setAdjustViewBounds(true);

        TextView day = new TextView(getActivity());
        day.setText("Thursday");
        day.setPadding(0, 10, 0, 10);
        day.setTextSize(35);
        day.setTypeface(null, Typeface.BOLD);

        parent.addView(day);
        parent.addView(weatherIcon);

        return parent;
    }
}