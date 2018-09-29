package archel.limbo.com.limboarchellab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITH","MainActivity onCreate has executed..");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4ITH","MainActivity onDestroy has executed..");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITH","MainActivity onStart has executed..");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d("4ITH","MainActivity OnPause has executed..");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d("4ITH","MainActivity onResume has executed..");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4ITH","MainActivity onStop has executed..");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4ITH","MainActivity onRestart has executed..");
    }

    public void showToast(View view)
    {
        Toast.makeText(getApplicationContext(), "showToast", Toast.LENGTH_SHORT).show();
    }

    public void showSnackbar(View view)
    {
        Snackbar.make(findViewById(android.R.id.content), "showSnackbar", Snackbar.LENGTH_LONG).show();
    }

}