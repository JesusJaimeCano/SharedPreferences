package e.jesus.sharedpreference;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Jesus on 29/12/2017.
 */

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_dos);

        MyPreferences myPreferences = new MyPreferences(this);

        if (myPreferences.isFirstTime()){
            Toast.makeText(this, "Bienvendido "+ myPreferences.getUserName(), Toast.LENGTH_SHORT).show();
            myPreferences.setOld(true);
        }else{
            Toast.makeText(this, "Hola de nuevo" + myPreferences.getUserName(), Toast.LENGTH_SHORT).show();
        }


    }
}
