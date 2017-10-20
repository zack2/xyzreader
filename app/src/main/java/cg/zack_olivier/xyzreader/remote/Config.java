package cg.zack_olivier.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
        try {
            url = new URL("https://go.udacity.com/xyz-reader-json" );

        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            try {
                url = new URL("https://raw.githubusercontent.com/TNTest/xyzreader/master/data.json" );
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            Log.e(TAG, "There's malformed URL has occurred the string could not be parsed.");
        }

        BASE_URL = url;
    }
}
