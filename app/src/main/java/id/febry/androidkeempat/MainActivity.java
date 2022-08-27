package id.febry.androidkeempat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSwitch;
    private Button btnSave;
    private EditText etInput;
    private TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSwitch = findViewById(R.id.btn_switch_activity);
        btnSave = findViewById(R.id.btn_save);
        etInput = findViewById(R.id.et_input);
        tvText = findViewById(R.id.tv_text);

        btnSave.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tvText.setText(etInput.getText().toString());
                    }
                }
        );

        btnSwitch.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                        intent.putExtra("TEXT", "DUMMY");

                        startActivity(intent);
                    }
                }
        );

        Log.d("LIFECYCLE", "Create");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        tvText.setText(savedInstanceState.getString("TEXT", "Dari User"));
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("TEXT", tvText.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFECYCLE", "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFECYCLE", "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFECYCLE", "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFECYCLE", "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFECYCLE", "Destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LIFECYCLE", "Restart");
    }
}