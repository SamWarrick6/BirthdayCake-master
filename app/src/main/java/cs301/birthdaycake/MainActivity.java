package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView ckview = findViewById(R.id.cakeview);
        CakeController ckControl = new CakeController(ckview);
        Button blowOutButt = findViewById(R.id.button);
        blowOutButt.setOnClickListener(ckControl);
    }

    public void goodbye(View button) {
        Log.i("button","Goodbye");
    }
}
