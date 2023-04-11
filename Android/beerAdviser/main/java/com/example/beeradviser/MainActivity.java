package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();
//    TextView brands;
//    Spinner color;
//    Button find_beer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        brands =  findViewById(R.id.brands);
//        color = findViewById(R.id.color);

    }

//    public void onClickFindBeer(View view) {
//        String beerType = String.valueOf(color.getSelectedItem());
//        brands.setText(beerType);
//    }
    //Called when the button gets clicked
    public void onClickFindBeer(View view) {
//Get a reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);
//Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
//Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
//Display the selected item
//        brands.setText(beerType);

        //Get recommendations from the BeerExpert class
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }
//Display the beers
        brands.setText(brandsFormatted);


    }


}


