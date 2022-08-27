package id.febry.androidkeempat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentActivity extends AppCompatActivity {

    private Button btnSwitch;
    private int currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        btnSwitch = findViewById(R.id.btn_switch_fragment);

        currentFragment = 0;

        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_view, ExampleFragment.class, null)
                .commit();


        btnSwitch.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(currentFragment == 0){
                            getSupportFragmentManager().beginTransaction()
                                    .setReorderingAllowed(true)
                                    .replace(R.id.fragment_view, SecondFragment.class, null)
                                    .commit();
                            currentFragment = 1;
                        } else {
                            getSupportFragmentManager().beginTransaction()
                                    .setReorderingAllowed(true)
                                    .replace(R.id.fragment_view, ExampleFragment.class, null)
                                    .commit();
                            currentFragment = 0;
                        }

                    }
                }
        );

    }
}