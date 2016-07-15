package energigas.app.systemstrategy.energigas.utils;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Kelvin on 15/07/2016.
 */

public class Utils {

    private static final String TAG = Utils.class.getSimpleName();

    public static boolean isSuccessful(JSONObject jsonObject){
        try {
            return jsonObject.getBoolean("Successful");
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG + " :PARSE isSuccessful ",""+e.getMessage());
            return  false;
        }
    }

    public static JSONArray getListObject(JSONObject jsonObject){
        try {
            return jsonObject.getJSONArray("Value");
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG + " :PARSE getListObject ",""+e.getMessage());
            return  null;
        }
    }
}
