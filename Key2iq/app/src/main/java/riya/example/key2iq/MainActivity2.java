package riya.example.key2iq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Toolbar toolbar;
    RadioButton tru, fals, uncertain;
    Button btn_submit, btn_contin;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar = findViewById(R.id.toolbar);
        tru=findViewById(R.id.radio_true);
        fals=findViewById(R.id.radio_false);
        uncertain=findViewById(R.id.radio_uncertaion);
        btn_submit=findViewById(R.id.submit_btn);
        btn_contin=findViewById(R.id.btn_continue);
        textView=findViewById(R.id.text_1);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tru.isChecked())
                {
                    textView.setText("Correct");
                }
                 else if (fals.isChecked() )
                {
                    textView.setText("Incorrect");
                }
                else

                    textView.setText("Incorrect");
                }
        });

      btn_contin.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent2=new Intent(MainActivity2.this,MainActivity3.class);
              startActivity(intent2);

          }
      });

    }
}