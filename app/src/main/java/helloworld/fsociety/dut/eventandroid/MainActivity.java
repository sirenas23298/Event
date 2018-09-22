package helloworld.fsociety.dut.eventandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txt_a, txt_b;
    TextView result;
    int a, b;
    Button enter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_a = (EditText) findViewById(R.id.a);
        txt_b = (EditText) findViewById(R.id.b);
        result = (TextView)findViewById(R.id.result);

        // Anonymous listener
        enter =  (Button) findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(txt_a.getText().toString().trim());
                b = Integer.parseInt(txt_b.getText().toString().trim());
                result.setText(String.valueOf(a+b));
            }
        });

        enter.setOnClickListener(this);

    }
    //Onclick in XML
    public void Sum(View view) {
        a = Integer.parseInt(txt_a.getText().toString().trim());
        b = Integer.parseInt(txt_b.getText().toString().trim());
        result.setText(String.valueOf(a+b));
    }

    @Override
    //
    //Activity is listener
    public void onClick(View v) {
        a = Integer.parseInt(txt_a.getText().toString().trim());
        b = Integer.parseInt(txt_b.getText().toString().trim());
        result.setText(String.valueOf(a+b));
    }
}
