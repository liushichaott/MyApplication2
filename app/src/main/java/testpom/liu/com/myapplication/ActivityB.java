package testpom.liu.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class ActivityB extends AppCompatActivity implements View.OnClickListener {

    private Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_b);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        Child child = new Child();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent intent = new Intent(ActivityB.this, ActivityB.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(ActivityB.this, ActivityC.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(ActivityB.this, ActivityD.class);
                startActivity(intent3);
                break;
            case R.id.button4:
                Intent intent4 = new Intent(ActivityB.this, ActivityE.class);
                startActivity(intent4);
                break;
        }
    }

    private String tag = "activityB-------";

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(tag, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(tag, "onRestart");
    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(tag, "onNewIntent");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag, "onPause");
    }
}
