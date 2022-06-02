package sg.edu.rp.c346.id21018545.demodynamiclistviewcolorlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etElement, etIndexElement;
    Button btnAdd;
    ListView lvColour;
    ArrayList <String> alColours;
    ArrayAdapter <String> aaColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etElement = findViewById(R.id.editTextColour);
        btnAdd = findViewById(R.id.buttonAddItem);
        lvColour = findViewById(R.id.listViewColour);
        etIndexElement = findViewById(R.id.editTextIndex);
        alColours = new ArrayList<>();
        alColours.add("red");
        alColours.add("Orange");

        aaColour = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, alColours);
        lvColour.setAdapter(aaColour);

        btnAdd.setOnClickListener(new View.onClickListener() {
            @Override
            public void onClick(View v) {
                String colour = etElement.getText().toString();
                alColours.add(colour);
                aaColour.notifyDataSetChanged();
            }
        });
    }
}
