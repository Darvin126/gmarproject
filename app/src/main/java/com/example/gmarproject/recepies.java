package com.example.gmarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

//www.mako.co.il/food-recipes/recipes_column-pasta/Recipe-dd269cd9815a281027.htm?sCh=bc0539cdf3178110&pId=25483675 פסטה רוזה
//https://www.mako.co.il/food-cooking_magazine/food-store/Recipe-4bb855142603871026.htm?sCh=bc0539cdf3178110&pId=25483675 בולונז
//https://www.mako.co.il/food-recipes/recipes_column-cakes/Recipe-688a56783d6f181027.htm?sCh=131539cdf3178110&pId=25483675 עוגיית שוקולד
//https://www.mako.co.il/food-cooking_magazine/recipes_by_rotem_liberzon/Recipe-d8134c2674be081027.htm?sCh=131539cdf3178110&pId=25483675&referrer=https%3A%2F%2Fwww.mako.co.il%2Ffood-recipes%2Frecipes_column-cakes%3FPartner%3Dblockscomp%26page%3D3 עוגת גבינה
//https://www.mako.co.il/food-cooking_magazine/recipes_by_rotem_liberzon/Recipe-fe731510c9cd481027.htm?sCh=6ae439cdf3178110&pId=25483675 לחמניות בשר
//https://www.mako.co.il/food-cooking_magazine/food-store/Recipe-15809be6258a081027.htm?sCh=f44539cdf3178110&pId=25483675 נאגטס
//https://www.mako.co.il/food-cooking_magazine/food-store/Recipe-15c0f468a7fc341006.htm?sCh=15f439cdf3178110&pId=25483675 מרק תפוחי אדמה
//https://www.mako.co.il/food-recipes/recipes_column-soups/Recipe-e45a6c798e66771027.htm?sCh=15f439cdf3178110&pId=25483675 מרק עגבניות ופסטה
//https://www.mako.co.il/food-cooking_magazine/food-store/Recipe-0a3b8a9d62c7b71027.htm?sCh=6ae439cdf3178110&pId=25483675 צלי בשר
//https://www.mako.co.il/food-recipes/recipes_column-meat/Recipe-d74e867b461bc71027.htm?sCh=6ae439cdf3178110&pId=25483675 קונכיות פסטה ממולאות בשר
//https://www.mako.co.il/food-recipes/recipes_column-chicken/Recipe-f747413ddcdb481027.htm?sCh=55e439cdf3178110&pId=25483675 כנפיים צלויות על תפוחי אדמה ובצל
//https://www.mako.co.il/food-cooking_magazine/food-store/Recipe-f3cdf953b532d71026.htm?sCh=55e439cdf3178110&pId=25483675 חזה עוף עסיסי
//https://www.mako.co.il/food-cooking_magazine/ron_yohananov_recipes/Recipe-a0b93725ac86a61006.htm?sCh=bc0539cdf3178110&pId=25483675 מקרוני וגבינה
//https://www.mako.co.il/food-cooking_magazine/ruthie_rousso_recipes/Recipe-2fba4f2c85a1071027.htm?sCh=bc0539cdf3178110&pId=25483675 פסטת חמאת עגבניות ופירורי לחם
//https://www.mako.co.il/food-cooking_magazine/cooking-with-children/Recipe-ca358ae44ac2b61027.htm?sCh=bc0539cdf3178110&pId=25483675 פסטה רוטה עגבניות
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
            Button button = new Button(this);
            button.setText("פסטה בולונז");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (flour && milk && chocolate && eggs){
            Button button = new Button(this);
            button.setText("עוגת שוקולד");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (pasta && tomato && heavycream){
            Button button = new Button(this);
            button.setText("פסטה רוזה");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (flour && eggs && milk){
            Button button = new Button(this);
            button.setText("עוגת גבינה");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (flour && eggs && meat){
            Button button = new Button(this);
            button.setText("לחמניות בשר");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (flour && eggs && chicken){
            Button button = new Button(this);
            button.setText("נאגטס");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (potatoes){
            Button button = new Button(this);
            button.setText("מרק תפוח אדמה");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (pasta && tomato ){
            Button button = new Button(this);
            button.setText("מרק עגבניות ופסטה");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (chicken && tomato && meat){
            Button button = new Button(this);
            button.setText("צלי בשר");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (pasta && meat){
            Button button = new Button(this);
            button.setText("קונכיות ממולאת בשר");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (chicken && potatoes ){
            Button button = new Button(this);
            button.setText("כנפייים צלויות על תפוח אדמה");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (chicken){
            Button button = new Button(this);
            button.setText("חזה עוף");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (pasta && milk && heavycream){
            Button button = new Button(this);
            button.setText("מקרוני וגבינה");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (pasta && tomato && flour && heavycream){
            Button button = new Button(this);
            button.setText("פסטת חמאת עגבניות ופירורי לחם");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (pasta && tomato){
            Button button = new Button(this);
            button.setText("פסטה ברוטה עגבניות");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }
        if (flour && eggs && cheese && milk){
            Button button = new Button(this);
            button.setText("לחמניות פופאוברס");
            // Add any other desired properties and attributes

            // Add the button to the activity's layout
            LinearLayout layout = findViewById(R.id.recepieslayout); // Replace with your activity's root layout
            layout.addView(button);
        }


    }

    @Override
    public void onClick(View view) {

    }
}