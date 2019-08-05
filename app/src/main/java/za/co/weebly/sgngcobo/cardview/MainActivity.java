package za.co.weebly.sgngcobo.cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // init the CardView
        CardView cardView = (CardView) findViewById(R.id.card_view);
        cardView.setRadius(19F);
        // Implement onClickListener event on CardView
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello CardView", Toast.LENGTH_LONG).show();
            }
        });

    }
}

