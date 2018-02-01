package com.example.android.favoritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mToysListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // caut text view-ul din layout
        mToysListTextView = (TextView) findViewById(R.id.tv_toy_names);

        // fac o lista de string-uri toyNames astfel: din ToyBox.java preiau ce returneaza functia getToyNames
        String[] toyNames = ToyBox.getToyNames();

        // iau fiecare string toyName din lista de string-uri toyNames si le adaug in Text View-ul mToysListTextView, plus endline
        for (String toyName : toyNames) {
            mToysListTextView.append(toyName + "\n\n\n");
        }
    }
}
