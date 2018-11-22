package info.sonjoy.rotate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setToggle(View view)
    {
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);

        //int check = b1.getVisibility();

        if( b1.getVisibility() == View.VISIBLE )
        {
            b2.setVisibility(View.VISIBLE);

            b1.setVisibility(View.INVISIBLE);
            b3.setVisibility(View.INVISIBLE);
            b4.setVisibility(View.INVISIBLE);
        }

        else if( b2.getVisibility() == View.VISIBLE )
        {
            b3.setVisibility(View.VISIBLE);

            b1.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.INVISIBLE);
            b4.setVisibility(View.INVISIBLE);
        }

        else if( b3.getVisibility() == View.VISIBLE )
        {
            b4.setVisibility(View.VISIBLE);

            b1.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.INVISIBLE);
            b3.setVisibility(View.INVISIBLE);
        }

        else
        {
            b1.setVisibility(View.VISIBLE);

            b2.setVisibility(View.INVISIBLE);
            b3.setVisibility(View.INVISIBLE);
            b4.setVisibility(View.INVISIBLE);
        }
    }
}
