package com.example.gmarproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.inputmethodservice.Keyboard;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DBNAME = "Login.db";

    public DBHelper( Context context) {
        super(context, "Login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create table users(username TEXT primary key , password TEXT )");
        MyDB.execSQL("create table recepies(rname TEXT primary key)");
        MyDB.execSQL("create table ingrediants(iname TEXT primary key)");
        MyDB.execSQL("create table comd(rname TEXT primary key, iname TEXT)");
// Inserting sample data for the initial start of the application
        insertRecepies("בולונז");
        insertRecepies("עוגיית שוקולד");
        insertRecepies("עוגת גבינה");
        insertRecepies("לחמניות בשר");
        insertRecepies("מרק תפוח אדמה");
        insertRecepies("מרק עגבניות ופסטה");
        insertRecepies("צלי בשר");
        insertRecepies("קונכיות פסטה ממולאות בשר");
        insertRecepies("כנפיים צלויות על תפוח אדמה");
        insertRecepies("חזה עוף");
        insertRecepies("מקרוני וגבינה");
        insertRecepies("פסטת חמאת עגבניות ופירורי לחם");
        insertRecepies("פסטה ברוטב עגבניות");
        insertRecepies("לחמניות פופאוברס");
        insertRecepies("נאגטס");
        insertRecepies("פסטה רוזה");
        insertIngrediants("eggs");
        insertIngrediants("milk");
        insertIngrediants("meat");
        insertIngrediants("flour");
        insertIngrediants("tomato");
        insertIngrediants("potato");
        insertIngrediants("cheese");
        insertIngrediants("chicken");
        insertIngrediants("heavy cream");
        insertIngrediants("chocolate");
        insertIngrediants("pasta");
        insertComb("בולונז","meat");
        insertComb("בולונז","pasta");
        insertComb("בולונז","tomatoes");
        insertComb("עוגיית שוקולד","flour");
        insertComb("עוגיית שוקולד","eggs");
        insertComb("עוגיית שוקולד","milk");
        insertComb("עוגיית שוקולד","chocolate");
        insertComb("פסטה רוזה","pasta");
        insertComb("פסטה רוזה","tomatoes");
        insertComb("פסטה רוזה","heavy cream");
        insertComb("עוגת גבינה","flour");
        insertComb("עוגת גבינה","eggs");
        insertComb("עוגת גבינה","milk");
        insertComb("לחמניות בשר","meat");
        insertComb("לחמניות בשר","flour");
        insertComb("לחמניות בשר","eggs");
        insertComb("נאגטס","flour");
        insertComb("נאגטס","eggs");
        insertComb("נאגטס","chicken");
        insertComb("מרק תפוח אדמה","potatoes");
        insertComb("מרק עגבניות ופסטה","pasta");
        insertComb("מרק עגבניות ופסטה","tomatoes");
        insertComb("צלי בשר","meat");
        insertComb("צלי בשר","tomatoes");
        insertComb("צלי בשר","chicken");
        insertComb("קונכיות פסטה ממולאות בשר","pasta");
        insertComb("קונכיות פסטה ממולאות בשר","meat");
        insertComb("כנפיים צלויות על תפוח אדמה","chicken");
        insertComb("כנפיים צלויות על תפוח אדמה","potatoes");
        insertComb("חזה עוף","chicken");
        insertComb("מקרוני וגבינה","pasta");
        insertComb("מקרוני וגבינה","milk");
        insertComb("מקרוני וגבינה","heavy cream");
        insertComb("פסטת חמאת עגבניות ופירורי לחם","pasta");
        insertComb("פסטת חמאת עגבניות ופירורי לחם","tomatoes");
        insertComb("פסטת חמאת עגבניות ופירורי לחם","flour");
        insertComb("פסטת חמאת עגבניות ופירורי לחם","heavy cream");
        insertComb("פסטה ברוטב עגבניות","pasta");
        insertComb("פסטה ברוטב עגבניות","tomatoes");
        insertComb("לחמניות פןפאוברס","flour");
        insertComb("לחמניות פןפאוברס","eggs");
        insertComb("לחמניות פןפאוברס","nilk");
        insertComb("לחמניות פןפאוברס","cheese");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
      MyDB.execSQL("drop Table if exists users");
      MyDB.execSQL("drop Table if exists recepies");
      MyDB.execSQL("drop Table if exists ingredians");
      MyDB.execSQL("drop Table if exists comb");
    }
     public Boolean insertData (String username , String password){
         SQLiteDatabase MyDB = this.getWritableDatabase();
         ContentValues contentValues =  new ContentValues();
         contentValues.put("username", username);
         contentValues.put("password", password);
         long result = MyDB.insert("users", null, contentValues );
         if (result==-1) return false;
         else
             return true;

     }

    public Boolean insertRecepies (String rname){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues =  new ContentValues();
        contentValues.put("rname", rname);
        long result = MyDB.insert("recepies", null, contentValues );
        if (result==-1) return false;
        else
            return true;

    }
    public Boolean insertIngrediants (String iname){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues =  new ContentValues();
        contentValues.put("iname", iname);
        long result = MyDB.insert("ingrediants", null, contentValues );
        if (result==-1) return false;
        else
            return true;

    }
    public Boolean insertComb (String rname, String iname){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues =  new ContentValues();
        contentValues.put("rname", rname);
        contentValues.put("iname", iname);
        long result = MyDB.insert("comb", null, contentValues );
        if (result==-1) return false;
        else
            return true;

    }

     public Boolean checkusername(String username){
        SQLiteDatabase MyDB = this.getWritableDatabase();
         Cursor cursor = MyDB.rawQuery("select * from users where username = ?", new String[] {username});
         if(cursor.getCount()>0)
             return true;
         else
             return false;
     }

     public Boolean checkusernamepassword(String username,String password ){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where username = ? and password = ?", new String[] {username, password});
         if(cursor.getCount()>0)
             return true;
         else
             return false;
     }
     public String makemedinner(String[] ingrediants){
         SQLiteDatabase MyDB = this.getWritableDatabase();
         String str = "Select rnames from comb where";
         for(int i = 0; i < ingrediants.length; i++){
            str += " iname = \"" + ingrediants[i] + "\" ";
            if(i<ingrediants.length-1){
                str+= " and ";
            }
         }
          Cursor cursor = MyDB.rawQuery(str,null);
          return str;
     }
}
