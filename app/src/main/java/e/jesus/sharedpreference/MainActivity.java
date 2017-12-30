package e.jesus.sharedpreference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    MyPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = new MyPreferences(this);

        if (!preferences.isFirstTime()){
            Intent i = new Intent(this, Actividad2.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(i);
            finish();
        }



    }

    public  void guardarUsuario(View v){
        EditText usuario = findViewById(R.id.usuarioET);

        preferences.setUserName(usuario.getText().toString());
        Intent i = new Intent(this, Actividad2.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(i);
        finish();
    }
}
