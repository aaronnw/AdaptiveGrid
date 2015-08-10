package wilson.aaron.adaptivegrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity implements View.OnClickListener{
    Button testButton1;
    Button testButton2;
    Button testButton3;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GridLayout myGrid = new GridLayout(this);

        testButton1 = new Button(this);
        testButton1.setText("Button 1");
        testButton1.setId(R.id.button1ID);
        testButton1.setOnClickListener(this);

        testButton2 = new Button(this);
        testButton2.setText("Button 2");
        testButton2.setId(R.id.button2ID);
        testButton2.setOnClickListener(this);

        testButton3 = new Button(this);
        testButton3.setText("Button 3");
        testButton3.setId(R.id.button3ID);
        testButton3.setOnClickListener(this);

        result = new TextView(this);
        result.setText("Nothing pressed");

        myGrid.addView(testButton1);
        myGrid.addView(testButton2);
        myGrid.addView(testButton3);
        myGrid.addView(result);

        setContentView(myGrid);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == testButton1.getId()){
            result.setText("Pressed 1!");
        }else if(v.getId() == testButton2.getId()){
           result.setText("Pressed 2!");
        }else if(v.getId() == testButton3.getId() ){
           result.setText("Pressed 3!");
        }
    }
}
