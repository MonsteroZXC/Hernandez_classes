package mcm.edu.ph.hernandez_classes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView display = findViewById(R.id.txtDisplay);

        Hero clockwerk = new Hero();

        clockwerk.heroName ="Rattletrap";
        clockwerk.heroLvl =1;
        clockwerk.baseHealth =200;
        clockwerk.baseMana =75;
        clockwerk.armor =0.0;
        clockwerk.strength =26.0;
        clockwerk.agility =13.0;
        clockwerk.intelligence =18.0;

        Hero taps = new Hero();

        taps.heroLvl = 99;
        taps.heroName = "Adrian";
        taps.baseHealth = 99999;
        taps.baseMana = 99999;

        display.setText(String.valueOf(clockwerk.totalHealth(clockwerk.strength,clockwerk.baseHealth)));





    }
}