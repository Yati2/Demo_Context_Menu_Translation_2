package sg.edu.rp.c346.id20028056.democontextmenutranslation2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText=findViewById(R.id.tvTranslatedText);
        registerForContextMenu(tvTranslatedText);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();
        if (id==R.id.EnglishSelection) { //check whether the selected menu item ID is 0
            //code for action
//            Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
            tvTranslatedText.setText("Hello");
            return true; //menu item successfully handled
        } else if (id==R.id.ItalianSelection) { //check if the selected menu item ID is 1
            //code for action
//            Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
            tvTranslatedText.setText("Ciao");
            return true;  //menu item successfully handled
        }
        return super.onContextItemSelected(item);
    }
}