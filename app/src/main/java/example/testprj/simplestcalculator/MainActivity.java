package example.testprj.simplestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static TextView uneditableTV;
    private static TextView buttonEditableTV;

    private static Button button00;
    private static Button button01;
    private static Button button02;
    private static Button button03;

    private static Button button10;
    private static Button button11;
    private static Button button12;
    private static Button button13;


    private static Button button20;
    private static Button button21;
    private static Button button22;
    private static Button button23;

    private static Button button30;
    private static Button button31;
    private static Button button32;
    private static Button button33;

    private static  boolean pluspressed = false;
    private static  boolean minuspressed = false;
    private static  boolean multiplypressed = false;
    private static  boolean dividepressed = false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uneditableTV = findViewById(R.id.tv_closed_text);
        buttonEditableTV = findViewById(R.id.tv_button_editable_text);

        button00 = findViewById(R.id.b_00);
        button01 = findViewById(R.id.b_01);
        button02 = findViewById(R.id.b_02);
        button03 = findViewById(R.id.b_03);

        button10 = findViewById(R.id.b_10);
        button11 = findViewById(R.id.b_11);
        button12 = findViewById(R.id.b_12);
        button13 = findViewById(R.id.b_13);

        button20 = findViewById(R.id.b_20);
        button21 = findViewById(R.id.b_21);
        button22 = findViewById(R.id.b_22);
        button23 = findViewById(R.id.b_23);

        button30 = findViewById(R.id.b_30);
        button31 = findViewById(R.id.b_31);
        button32 = findViewById(R.id.b_32);
        button33 = findViewById(R.id.b_33);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.b_00:
                        uneditableTV.setText("");
                        buttonEditableTV.setText("0");
                        break;
                    case R.id.b_01:
                        uneditableTV.setText(buttonEditableTV.getText() + "+");
                        pluspressed = true;
                        buttonEditableTV.setText("0");
                        break;
                    case R.id.b_02:
                        uneditableTV.setText(buttonEditableTV.getText() + "-");
                        minuspressed = true;
                        buttonEditableTV.setText("0");
                        break;
                    case R.id.b_03:
                        uneditableTV.setText(buttonEditableTV.getText() + "*");
                        multiplypressed = true;
                        buttonEditableTV.setText("0");
                        break;

                    case R.id.b_10:
                        if (buttonEditableTV.getText().equals("0")){
                            buttonEditableTV.setText("7");
                        }
                        else {
                            buttonEditableTV.setText(buttonEditableTV.getText()+"7");
                        }
                        break;

                    case R.id.b_11:
                        if (buttonEditableTV.getText().equals("0")){
                            buttonEditableTV.setText("8");
                        }
                        else {
                            buttonEditableTV.setText(buttonEditableTV.getText()+"8");
                        }
                        break;

                    case R.id.b_12:
                        if (buttonEditableTV.getText().equals("0")){
                            buttonEditableTV.setText("9");
                        }
                        else {
                            buttonEditableTV.setText(buttonEditableTV.getText()+"9");
                        }
                        break;

                    case R.id.b_13:
                        uneditableTV.setText(buttonEditableTV.getText() + "/");
                        dividepressed = true;
                        buttonEditableTV.setText("0");
                        break;

                    case R.id.b_20:
                        if (buttonEditableTV.getText().equals("0")){
                            buttonEditableTV.setText("4");
                        }
                        else {
                            buttonEditableTV.setText(buttonEditableTV.getText()+"4");
                        }
                        break;

                    case R.id.b_21:
                        if (buttonEditableTV.getText().equals("0")){
                            buttonEditableTV.setText("5");
                        }
                        else {
                            buttonEditableTV.setText(buttonEditableTV.getText()+"5");
                        }
                        break;

                    case R.id.b_22:
                        if (buttonEditableTV.getText().equals("0")){
                            buttonEditableTV.setText("6");
                        }
                        else {
                            buttonEditableTV.setText(buttonEditableTV.getText()+"6");
                        }
                        break;

                    case R.id.b_23:
                        if (pluspressed) calculation(1);
                        if (minuspressed) calculation(2);
                        if (multiplypressed) calculation(3);
                        if (dividepressed) calculation(4);
                        break;

                    case R.id.b_30:
                        if (buttonEditableTV.getText().equals("0")){
                            buttonEditableTV.setText("1");
                        }
                        else {
                            buttonEditableTV.setText(buttonEditableTV.getText()+"1");
                        }
                        break;

                    case R.id.b_31:
                        if (buttonEditableTV.getText().equals("0")){
                            buttonEditableTV.setText("2");
                        }
                        else {
                            buttonEditableTV.setText(buttonEditableTV.getText()+"2");
                        }
                        break;

                    case R.id.b_32:
                        if (buttonEditableTV.getText().equals("0")){
                            buttonEditableTV.setText("3");
                        }
                        else {
                            buttonEditableTV.setText(buttonEditableTV.getText()+"3");
                        }
                        break;

                    case R.id.b_33:
                        if (buttonEditableTV.getText().equals("0")){

                        }
                        else {
                            buttonEditableTV.setText(buttonEditableTV.getText()+"0");
                        }
                        break;
                }
            }
        };

        button00.setOnClickListener(onClickListener);
        button01.setOnClickListener(onClickListener);
        button02.setOnClickListener(onClickListener);
        button03.setOnClickListener(onClickListener);

        button10.setOnClickListener(onClickListener);
        button11.setOnClickListener(onClickListener);
        button12.setOnClickListener(onClickListener);
        button13.setOnClickListener(onClickListener);

        button20.setOnClickListener(onClickListener);
        button21.setOnClickListener(onClickListener);
        button22.setOnClickListener(onClickListener);
        button23.setOnClickListener(onClickListener);

        button30.setOnClickListener(onClickListener);
        button31.setOnClickListener(onClickListener);
        button32.setOnClickListener(onClickListener);
        button33.setOnClickListener(onClickListener);

    }

    private static void calculation (int operationNumber){

        String onlyNumbers =((String)uneditableTV.getText()).substring(0,((String)uneditableTV.getText()).length()-1);

        double uneditedtextinDouble = Double.parseDouble(onlyNumbers);


        switch (operationNumber){
            case 1:

                uneditableTV.setText(Double.toString(uneditedtextinDouble+Double.parseDouble((String)buttonEditableTV.getText())));
                break;
            case 2:
                uneditableTV.setText(Double.toString(uneditedtextinDouble-Double.parseDouble((String)buttonEditableTV.getText())));
                break;
            case 3:
                uneditableTV.setText(Double.toString(uneditedtextinDouble*Double.parseDouble((String)buttonEditableTV.getText())));
                break;
            case 4:
                uneditableTV.setText(Double.toString(uneditedtextinDouble/Double.parseDouble((String)buttonEditableTV.getText())));
                break;

        }

    }
}
