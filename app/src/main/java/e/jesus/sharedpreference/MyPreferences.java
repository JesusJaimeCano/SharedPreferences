package e.jesus.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Jesus on 29/12/2017.
 */

public class MyPreferences {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context context;


    private static final int PRIVATE_MODE = 0;
    private static final String USER_NAME = "name";
    private static final String IS_FIRST_TIME = "IsFirstTime";
    private static final String PREF_NAME = "preferencias";

    public MyPreferences(Context context) {
        this.context = context;
        preferences = this.context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor = preferences.edit();
    }

    public boolean isFirstTime(){
        return preferences.getBoolean(IS_FIRST_TIME, true);

    }
    public void setOld(boolean b){
        if(b){

            editor.putBoolean(IS_FIRST_TIME,false);
            editor.commit();

        }
    }

    public  void setUserName(String name){
        editor.putString(USER_NAME,name);
        editor.commit();
    }

    public String getUserName(){
        return  preferences.getString(USER_NAME,"");
    }

}
