package com.example.android.inclassassignment09_vilmariet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    public EditText titleText;
    public EditText materialText;
    public EditText houseNumberText;
    public CheckBox blownAway;

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference titleRef = database.getReference("Three Little Pigs");
    private DatabaseReference pigreference = database.getReference("New Pig House");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleText = findViewById(R.id.title_text_id);
        materialText = findViewById(R.id.material_text_id);
        houseNumberText = findViewById(R.id.number_text_id);
        blownAway = findViewById(R.id.blown_away_id);

    }


    public void Add(View view) {
        String materialMessage = materialText.getText().toString();
        int houseNumberMessage = Integer.parseInt(houseNumberText.getText().toString());
        boolean hasBlownAway = blownAway.isChecked();

        pigreference.push().setValue(new ThreeLittlePigs(materialMessage, houseNumberMessage, hasBlownAway));

    }

    public void Set(View view) {
        String titleMessage = titleText.getText().toString();

       titleRef.setValue(titleMessage);
    }
}
