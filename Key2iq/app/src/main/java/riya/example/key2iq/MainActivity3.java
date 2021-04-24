package riya.example.key2iq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    Toolbar toolbar2;
    RadioButton four, six, eight,ten;
    Button bt_submit;
    TextView txtVieww;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        toolbar2 = findViewById(R.id.toolbar_2);
        four=findViewById(R.id.radio_4);
        six=findViewById(R.id.radio_6);
        eight=findViewById(R.id.radio_8);
        ten=findViewById(R.id.radio_10);
        bt_submit=findViewById(R.id.button_submit2);
        txtVieww=findViewById(R.id.txt_2);
        toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });

       bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (four.isChecked())
                {
                    txtVieww.setText("Incorrect");
                }
                else if (six.isChecked() )
                {
                    txtVieww.setText("Incorrect");
                }
                else if (eight.isChecked() )
                {
                    txtVieww.setText("Correct");
                }
                else

                    txtVieww.setText("Incorrect");
            }
        });

    }
}