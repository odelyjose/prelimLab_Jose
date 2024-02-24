package com.example.myappl;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Calculator extends AppCompatActivity {
    TextView tvNum1, tvNum2, tvDisplay ;
    EditText txtNum1, txtNum2;
    Button btnAdd, btnSub, btnMul , btnD;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//binding UI views to java widgets
        tvNum1 =findViewById(R.id.tvNum1);
        txtNum1=findViewById(R.id.txtNum1);
        tvNum2 =findViewById(R.id.tvNum2);
        txtNum2=findViewById(R.id.txtNum2);
        tvDisplay=findViewById(R.id.tvDisplay);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnD=findViewById(R.id.btnD);


        btnD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int num1 = Integer.parseInt(txtNum1.getText() + "");
                int num2 = Integer.parseInt(txtNum2.getText() + "");
                int div = num1 / num2;
                tvDisplay.setText("The quotient is " + div);
                Toast.makeText(getApplicationContext(), "Result is " + div, Toast.LENGTH_LONG).show();
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int num1 = Integer.parseInt(txtNum1.getText() + "");
                int num2 = Integer.parseInt(txtNum2.getText() + "");
                int mul = num1 * num2;
                tvDisplay.setText("The product is " + mul);
                Toast.makeText(getApplicationContext(), "Result is " + mul, Toast.LENGTH_LONG).show();
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int num1 = Integer.parseInt(txtNum1.getText() + "");
                int num2 = Integer.parseInt(txtNum2.getText() + "");
                int sum = num1 + num2;
                tvDisplay.setText("The sum is " + sum);
                Toast.makeText(getApplicationContext(), "Result is " + sum, Toast.LENGTH_LONG).show();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int num1=Integer.parseInt(txtNum1.getText() + "");
                int num2=Integer.parseInt(txtNum2.getText() + "");
                int sub=num1 - num2;
                tvDisplay.setText("The sub is " +sub);
                Toast.makeText(getApplicationContext(), "Result is " + sub, Toast.LENGTH_LONG).show();
            }
        });
    }
}