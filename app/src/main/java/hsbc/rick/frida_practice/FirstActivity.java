package hsbc.rick.frida_practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static hsbc.rick.frida_practice.R.layout.first_layout;

public class FirstActivity extends AppCompatActivity {
    private String total = "FRIDA_test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(first_layout);
        //建立一个button1，并调用Toast显示短信息
        Button button1 = findViewById(R.id.button_1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "You click button_1",
                        Toast.LENGTH_SHORT).show();
                fun(10,20);
                Log.d("string" , fun("LoWeRcAsE Me!!!!!!!!!"));


            }
        });


        //建立一个button2，使用显式Intent调用第二个page
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    void fun(int x , int y ){
        Log.d("Sum" , String.valueOf(x+y));
    }
    
    String fun(String x){
        total +=x;
        return x.toLowerCase();
    }

    String secret(){

        return total;
    }

}
