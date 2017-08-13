package intermediate.udacity.project.our_sunshine;


import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Fauziyyah Faturahma on 8/13/2017.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_weather, parent, false);
        return new WeatherViewHolder(contentView);
    }

    @Override
    public void onBindViewHolder(WeatherAdapter.WeatherViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final ImageView mWeatherImage;
        private final TextView mWeatherDate;
        private final TextView mWeatherDesc;
        private final TextView mWeatherTemprature;
        private final CardView mWeatherCardView;

        public WeatherViewHolder(View itemView){
            super(itemView);

            mWeatherImage = (ImageView) itemView.findViewById(R.id.imageViewIcon);
            mWeatherDate = (TextView) itemView.findViewById(R.id.Weather_date);
            mWeatherDesc = (TextView) itemView.findViewById(R.id.Weather_status);
            mWeatherTemprature = (TextView) itemView.findViewById(R.id.weather_temprature);
            mWeatherCardView = (CardView) itemView.findViewById(R.id.cardviewAdapter);

            mWeatherCardView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {

            Toast.makeText(view.getContext(), "Posisi ke:" + getAdapterPosition(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(view.getContext(), DetailActivity.class);
            view.getContext().startActivity(intent);

        }
    }
}
