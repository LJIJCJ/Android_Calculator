package com.example.a25726.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_view = findViewById(R.id.tv_view);
        tv_view.setGravity(Gravity.RIGHT|Gravity.BOTTOM);
        tv_view.setLines(2);
        tv_view.setMaxLines(1);
        tv_view.setMovementMethod(new ScrollingMovementMethod());

        findViewById(R.id.bt_0).setOnClickListener(this);
        findViewById(R.id.bt_1).setOnClickListener(this);
        findViewById(R.id.bt_2).setOnClickListener(this);
        findViewById(R.id.bt_3).setOnClickListener(this);
        findViewById(R.id.bt_4).setOnClickListener(this);
        findViewById(R.id.bt_5).setOnClickListener(this);
        findViewById(R.id.bt_6).setOnClickListener(this);
        findViewById(R.id.bt_7).setOnClickListener(this);
        findViewById(R.id.bt_8).setOnClickListener(this);
        findViewById(R.id.bt_9).setOnClickListener(this);
        findViewById(R.id.bt_add).setOnClickListener(this);
        findViewById(R.id.bt_subtraction).setOnClickListener(this);
        findViewById(R.id.bt_multiplication).setOnClickListener(this);
        findViewById(R.id.bt_divide).setOnClickListener(this);
        findViewById(R.id.bt_sqrt).setOnClickListener(this);
        findViewById(R.id.bt__).setOnClickListener(this);
        findViewById(R.id.bt_equ).setOnClickListener(this);
        findViewById(R.id.bt_c).setOnClickListener(this);
        findViewById(R.id.bt_ce).setOnClickListener(this);
    }
    public String[] str={"0","1","2","3","4","5","6","7","8","9","+","-","*","/","√",".","="};

    @Override
    public void onClick(View v){

        String inf = tv_view.getText().toString();
        switch (v.getId()){
            case R.id.bt_0:
                {
                    String newStr = String.format("%s%s",inf,str[0]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_1:
                {
                    String newStr = String.format("%s%s",inf,str[1]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_2:
                {
                    String newStr = String.format("%s%s",inf,str[2]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_3:
                {
                    String newStr = String.format("%s%s",inf,str[3]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_4:
                {
                    String newStr = String.format("%s%s",inf,str[4]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_5:
                {
                    String newStr = String.format("%s%s",inf,str[5]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_6:
                {
                    String newStr = String.format("%s%s",inf,str[6]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_7:
                {
                    String newStr = String.format("%s%s",inf,str[7]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_8:
                {
                    String newStr = String.format("%s%s",inf,str[8]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_9:
                {
                    String newStr = String.format("%s%s",inf,str[9]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_add:
                {
                    String newStr = String.format("%s%s",inf,str[10]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_subtraction:
                {
                    String newStr = String.format("%s%s",inf,str[11]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_multiplication:
                {
                    String newStr = String.format("%s%s",inf,str[12]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_divide:
                {
                    String newStr = String.format("%s%s",inf,str[13]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_sqrt:
                {
                    String newStr = String.format("%s%s",inf,str[14]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt__:
                {
                    String newStr = String.format("%s%s",inf,str[15]);
                    tv_view.setText(newStr);
                    break;
                }
            case R.id.bt_equ:
                {
                    break;
                }
            case R.id.bt_c:
                {
                    if(inf.length()!=0){
                        String newStr = inf.substring(0,inf.length()-1);
                        tv_view.setText(newStr);
                    }
                    break;
                }
            case R.id.bt_ce:
                {
                    tv_view.setText("");
                    break;
                }
        }
    }
}
