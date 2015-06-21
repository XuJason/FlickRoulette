package com.example.jason.flickroulette;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "MyActivity";

    private Button mSpinButton;
    private TextView mLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLogo = (TextView) findViewById(R.id.LogoView);
        mSpinButton = (Button) findViewById(R.id.spinButton);

        TextView mTitleView = (TextView) findViewById(R.id.title);
        TextView mYearView = (TextView) findViewById(R.id.year);
        TextView mRunTimeView = (TextView) findViewById(R.id.runtime);
        TextView mLinkView = (TextView) findViewById(R.id.link);
        TextView mReleaseDateView = (TextView) findViewById(R.id.releaseDate);
        TextView mSynopsisView = (TextView) findViewById(R.id.synopsis);

        LinearLayout movieView = (LinearLayout) findViewById(R.id.movie_view);

        getMovies();


    }

    private void getMovies() {
        String apiKey = "sjy2wegm4tgz8dxt3su2txd6";

        String rottenTomatoesUrl = "http://api.rottentomatoes.com/api/public/v1.0.json?apikey="+apiKey;
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(rottenTomatoesUrl)
                .build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
            }

            @Override
            public void onResponse(Response response) throws IOException {
                try {
                    if (response.isSuccessful()) {
                        Log.v(TAG, response.body().string());
                    }
                } catch (IOException e) {
                    Log.e(TAG, "Exception caught: ", e);
                }
            }
        });

        mSpinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mLogo.setText("LOL");
                setContentView(R.layout.movie_view);
            }
        });
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager manager = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();
        boolean isAvailable = false;
        if(networkInfo != null && networkInfo.isConnected()) {
            isAvailable = true;
        }
        return isAvailable;
    }


    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
