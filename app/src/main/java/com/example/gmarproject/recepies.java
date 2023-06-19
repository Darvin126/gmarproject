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
DBHelper db;
Button testbtn;
Toast t, toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepies);
        db = new DBHelper(this);
        testbtn = findViewById(R.id.testbtn);
        testbtn.setOnClickListener(this);
        LinearLayout layout = findViewById(R.id.recepieslayout);

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
            toast.makeText(getApplicationContext(), "test successfully", toast.LENGTH_SHORT).show();
        }

        boolean isEmpty = true;
        for (String item : db.makemedinner(newing)) {
            if (item != null && !item.isEmpty()) {
                isEmpty = true;
                Toast.makeText(this,item,Toast.LENGTH_LONG ).show();
                break;
            }
        }
        if (!isEmpty){
            t.makeText(getApplicationContext(), "No recepies found", t.LENGTH_LONG).show();
            toast.makeText(getApplicationContext(), "test successfully", toast.LENGTH_SHORT).show();
        }
         else for (int i = 0;i < db.makemedinner(newing).length;i++){
            Button btn = new Button(this);
            btn.setText(db.makemedinner(newing)[i]);
            btn.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(btn);
        }

    }

    @Override
    public void onClick(View view) {
    }
}