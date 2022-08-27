package id.febry.androidkeempat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ExampleFragment extends Fragment {

    private Button btnHello;
    private TextView tvFragment;

    public ExampleFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_example, container, false);

        btnHello = view.findViewById(R.id.btn_hello);
        tvFragment = view.findViewById(R.id.tv_fragment);

        btnHello.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tvFragment.setText("Button Clicked");
                    }
                }
        );

        return view;
    }
}