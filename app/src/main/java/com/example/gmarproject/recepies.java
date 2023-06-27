package com.example.gmarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;






//https://www.mako.co.il/food-recipes/recipes_column-bread/Recipe-127f69e2a576281027.htm?sCh=860539cdf3178110&pId=25483675 לחמניות פופאוברס
public class recepies extends AppCompatActivity implements View.OnClickListener{
//DBHelper db;
Toast toast;
boolean tomato , potatoes , milk , pasta , cheese , flour , meat , heavycream , eggs , chocolate  ,chicken ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepies);

        int count = 0;
        for (int i =0; i < getIntent().getStringArrayExtra("aving").length; i++){
            if (getIntent().getStringArrayExtra("aving")[i] != null){
                count++;
            }
        }
         String[] newing = new String[count];
        int ingplacecount = 0;
        for (int i =0; i < getIntent().getStringArrayExtra("aving").length; i++){
            if (getIntent().getStringArrayExtra("aving")[i] != null){
                newing[ingplacecount] = getIntent().getStringArrayExtra("aving")[i];
                ingplacecount++;
            }
        }
        for (int i = 0; i < newing.length; i++){
            toast.makeText(getApplicationContext(), " test1 ", toast.LENGTH_SHORT).show();
            if (newing[i].equals("tomato")){
                tomato = true;
            }
            if (newing[i].equals("potato")){
                potatoes = true;
            }
            if (newing[i].equals("milk")){
                milk = true;
            }
            if (newing[i].equals("flour")){
                flour = true;
            }
            if (newing[i].equals("eggs")){
                eggs = true;
            }
            if (newing[i].equals("chocolate")){
                chocolate = true;
            }
            if (newing[i].equals("meat")){
                meat = true;
            }
            if (newing[i].equals("heavy cream")){
                heavycream = true;
            }
            if (newing[i].equals("pasta")){
                pasta = true;
            }
            if (newing[i].equals("chicken")){
                chicken = true;
            }
            if (newing[i].equals("cheese")){
                cheese = true;
            }
        }
        if (pasta && tomato && meat){
            Button button1 = new Button(this);
            button1.setText("פסטה בולונז");
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-cooking_magazine/food-store/Recipe-4bb855142603871026.htm?sCh=bc0539cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button1);
        }
        if (flour && milk && chocolate && eggs){
            Button button2 = new Button(this);
            button2.setText("עוגת שוקולד");
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-recipes/recipes_column-cakes/Recipe-688a56783d6f181027.htm?sCh=131539cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button2);
        }
        if (pasta && tomato && heavycream){
            Button button3 = new Button(this);
            button3.setText("פסטה רוזה");
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-recipes/recipes_column-pasta/Recipe-dd269cd9815a281027.htm?sCh=bc0539cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button3);
        }
        if (flour && eggs && milk){
            Button button4 = new Button(this);
            button4.setText("עוגת גבינה");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-cooking_magazine/recipes_by_rotem_liberzon/Recipe-d8134c2674be081027.htm?sCh=131539cdf3178110&pId=25483675&referrer=https%3A%2F%2Fwww.mako.co.il%2Ffood-recipes%2Frecipes_column-cakes%3FPartner%3Dblockscomp%26page%3D3"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button4);
        }
        if (flour && eggs && meat){
            Button button5 = new Button(this);
            button5.setText("לחמניות בשר");
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-cooking_magazine/recipes_by_rotem_liberzon/Recipe-fe731510c9cd481027.htm?sCh=6ae439cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button5);
        }
        if (flour && eggs && chicken){
            Button button6 = new Button(this);
            button6.setText("נאגטס");
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-cooking_magazine/food-store/Recipe-15809be6258a081027.htm?sCh=f44539cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button6);
        }
        if (potatoes){
            Button button7 = new Button(this);
            button7.setText("מרק תפוח אדמה");
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-cooking_magazine/food-store/Recipe-15c0f468a7fc341006.htm?sCh=15f439cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button7);
        }
        if (pasta && tomato ){
            Button button8 = new Button(this);
            button8.setText("מרק עגבניות ופסטה");
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-recipes/recipes_column-soups/Recipe-e45a6c798e66771027.htm?sCh=15f439cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button8);
        }
        if (chicken && tomato && meat){
            Button button9 = new Button(this);
            button9.setText("צלי בשר");
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-cooking_magazine/food-store/Recipe-0a3b8a9d62c7b71027.htm?sCh=6ae439cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button9);
        }
        if (pasta && meat){
            Button button10 = new Button(this);
            button10.setText("קונכיות ממולאת בשר");
            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-recipes/recipes_column-meat/Recipe-d74e867b461bc71027.htm?sCh=6ae439cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button10);
        }
        if (chicken && potatoes ){
            Button button11 = new Button(this);
            button11.setText("כנפייים צלויות על תפוח אדמה");
            button11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-recipes/recipes_column-chicken/Recipe-f747413ddcdb481027.htm?sCh=55e439cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button11);
        }
        if (chicken){
            Button button12 = new Button(this);
            button12.setText("חזה עוף");
            button12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-cooking_magazine/food-store/Recipe-f3cdf953b532d71026.htm?sCh=55e439cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button12);
        }
        if (pasta && milk && heavycream){
            Button button13 = new Button(this);
            button13.setText("מקרוני וגבינה");
            button13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-cooking_magazine/ron_yohananov_recipes/Recipe-a0b93725ac86a61006.htm?sCh=bc0539cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button13);
        }
        if (pasta && tomato && flour && heavycream){
            Button button14 = new Button(this);
            button14.setText("פסטת חמאת עגבניות ופירורי לחם");
            button14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-cooking_magazine/ruthie_rousso_recipes/Recipe-2fba4f2c85a1071027.htm?sCh=bc0539cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button14);
        }
        if (pasta && tomato){
            Button button15 = new Button(this);
            button15.setText("פסטה ברוטה עגבניות");
            button15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-cooking_magazine/cooking-with-children/Recipe-ca358ae44ac2b61027.htm?sCh=bc0539cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button15);
        }
        if (flour && eggs && cheese && milk){
            Button button16 = new Button(this);
            button16.setText("לחמניות פופאוברס");
            button16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Google link in a web browser
                    String googleLink = "https://www.mako.co.il/food-recipes/recipes_column-bread/Recipe-127f69e2a576281027.htm?sCh=860539cdf3178110&pId=25483675"; // Replace with your desired Google link
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleLink));
                    startActivity(intent);
                }
            });
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button16);
        }


    }

    @Override
    public void onClick(View view) {

    }
}