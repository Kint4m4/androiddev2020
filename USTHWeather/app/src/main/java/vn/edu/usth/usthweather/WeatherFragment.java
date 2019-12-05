package vn.edu.usth.usthweather;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class WeatherFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RelativeLayout weather = new RelativeLayout(getActivity());
        weather.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
        weather.setBackgroundColor(0xFFBCFFFE);
        RelativeLayout.LayoutParams tempParam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        RelativeLayout.LayoutParams imageviewParam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        RelativeLayout.LayoutParams locateParam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

            TextView temp = new TextView(getActivity());
            temp.setText("39°Celcius");
            temp.setLayoutParams(tempParam);
            tempParam.addRule(RelativeLayout.ALIGN_PARENT_LEFT);

            ImageView icon = new ImageView(getActivity());
            icon.setImageResource(R.drawable.sunny);
            icon.setLayoutParams(imageviewParam);
            imageviewParam.addRule(RelativeLayout.CENTER_IN_PARENT);

            TextView locate = new TextView(getActivity());
            locate.setText("Ha Noi");
            locate.setLayoutParams(locateParam);
            locateParam.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

        weather.addView(temp);
        weather.addView(icon);
        weather.addView(locate);

        return weather;
        // Inflate the layout for this fragment
    }
}
