package example.testprj.simplestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static TextView uneditableTV;
    private static TextView buttonEditableTV;
    private static TextView operatorsTV;

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
        operatorsTV = findViewById(R.id.tv_operator_placement);


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
                        operatorsTV.setText("");
                        pluspressed = false;
                        minuspressed = false;
                        multiplypressed = false;
                        dividepressed = false;
                        break;
                    case R.id.b_01:
                        doublePressCheck();
                        operatorsTV.setText("+");
                        pluspressed = true;
                        buttonEditableTV.setText("0");
                        break;
                    case R.id.b_02:
                        doublePressCheck();
                        operatorsTV.setText("-");
                        minuspressed = true;
                        buttonEditableTV.setText("0");
                        break;
                    case R.id.b_03:
                        doublePressCheck();
                        operatorsTV.setText("*");
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
                        doublePressCheck();
                        operatorsTV.setText("/");
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
                        buttonEditableTV.setText(uneditableTV.getText());
                        uneditableTV.setText("");
                        operatorsTV.setText("");
                        pluspressed = false;
                        minuspressed = false;
                        multiplypressed = false;
                        dividepressed = false;
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

    private void calculation (int operationNumber){



        double uneditedTextInDouble = Double.parseDouble((String)(uneditableTV.getText()));
        double buttonEditedTextInDouble = Double.parseDouble((String)(buttonEditableTV.getText()));
        double operationResult = uneditedTextInDouble;

        switch (operationNumber){
            case 1:

                operationResult = uneditedTextInDouble + buttonEditedTextInDouble;
                break;
            case 2:
                operationResult = uneditedTextInDouble - buttonEditedTextInDouble;
                break;
            case 3:
                operationResult = uneditedTextInDouble * buttonEditedTextInDouble;
                break;
            case 4:

                if (buttonEditedTextInDouble == 0){
//                    AlertDialog.Builder alert_builder = new AlertDialog.Builder(MainActivity.this);
//
//                    alert_builder.setMessage("Can't divide by zero").setPositiveButton("Ok", null);
//
//                    AlertDialog alert_zero = alert_builder.create();
//
//                    alert_zero.show();

                    Toast.makeText(this,"Can't divide by zero",Toast.LENGTH_LONG)
                            .show();


                }
                else {
                    operationResult = uneditedTextInDouble / buttonEditedTextInDouble;
                }
                break;

        }

        if (operationResult % 1 == 0) {
            uneditableTV.setText(Integer.toString((int)operationResult));
        }
        else {
            uneditableTV.setText(Double.toString(operationResult));
        }
        buttonEditableTV.setText("0");


    }


    private void doublePressCheck(){
        if (pluspressed){
            calculation(1);
        }
        else if (minuspressed){
            calculation(2);
        }
        else if (multiplypressed){
            calculation(3);
        }
        else if (dividepressed){
            calculation(4);
        }
        else {
            uneditableTV.setText(buttonEditableTV.getText());
        }
    }



}
