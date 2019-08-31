package com.example.a8puzzle2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    int num=0;
    Button[] btn = new Button[9];
    Button rst;
    TextView txt_status;
    ArrayList<Integer> list = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn[0] = (Button) findViewById(R.id.button1);
        btn[1] = (Button) findViewById(R.id.button2);
        btn[2] = (Button) findViewById(R.id.button3);
        btn[3] = (Button) findViewById(R.id.button4);
        btn[4] = (Button) findViewById(R.id.button5);
        btn[5] = (Button) findViewById(R.id.button6);
        btn[6] = (Button) findViewById(R.id.button7);
        btn[7] = (Button) findViewById(R.id.button8);
        btn[8] = (Button) findViewById(R.id.button9);
        txt_status=(TextView) findViewById(R.id.tvstatus);
        rst=(Button) findViewById(R.id.button_rnd);
        list=new ArrayList<Integer>();
        //For Help on ArrayList, I saw https://www.youtube.com/watch?v=e7U-wWdsp78
        //Populating the List
        for(int i=1; i<=9; i++){
            list.add(new Integer(i));
        }

        //Shuffling
        Collections.shuffle(list);

        //Calling Shufled list for generating random buttons
        for(int i=0; i<9; i++){
            //Assigned numbers to random buttons
            int butnum=list.get(i);
            btn[i].setText(Integer.toString(butnum));
            //btn_default  is a default value
            btn[i].setBackgroundResource(android.R.drawable.btn_default);
            //Setting Background Color of the buttons
            btn[i].setTextColor(Color.BLACK);
            //Setting the color and properties of the empty button
            if(butnum == 9){
                btn[i].setBackgroundColor(112558);
                btn[i].setTextColor(112558);
            }
        }

    }
    //Maintaining the color on winning
    public void colors(){
        if (list.get(0)==1 && list.get(1)==2  && list.get(2)==3  && list.get(3)==4  && list.get(4)==5  && list.get(5)==6  && list.get(6)==7  && list.get(7)==8  && list.get(8)==9  ) {
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
            for(int i=0; i<9; i++){
                btn[i].setBackgroundColor(Color.GREEN);
            }
            txt_status.setText("You Won");
        }else {
            txt_status.setText("Game in Progress");
        }
    }
    //Main Method Ends

    //Copy the same code and paste it to be called on press of RESET Button
    //In Short, Shuffling
    public void onReset(View v){
        list=new ArrayList<Integer>();

        //Populating the List
        for(int i=1; i<=9; i++){
            list.add(new Integer(i));
        }

        //Shuffling
        Collections.shuffle(list);

        //Calling Shufled list for generating random buttons
        for(int i=0; i<9; i++){
            //Assigned numbers to random buttons
            int butnum=list.get(i);
            btn[i].setText(Integer.toString(butnum));
            //btn_default  is a default value
            btn[i].setBackgroundResource(android.R.drawable.btn_default);
            //Setting Background Color of the buttons
            btn[i].setTextColor(Color.BLACK);
            //Setting the color and properties of the empty button
            if(butnum == 9){
                btn[i].setBackgroundColor(112558);
                btn[i].setTextColor(112558);
            }
        }

        if (list.get(0)==1 && list.get(1)==2  && list.get(2)==3  && list.get(3)==4  && list.get(4)==5  && list.get(5)==6  && list.get(6)==7  && list.get(7)==8  && list.get(8)==9  ) {
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
            for(int i=0; i<9; i++){
                btn[i].setBackgroundColor(Color.GREEN);
            }
            txt_status.setText("You Won");
        }else {
            txt_status.setText("Game Reset");
        }
    }

    public void onBtn1(View v){
        colors();
        if (list.get(1) == 9) {
            int temp;
            temp = list.get(0);
            btn[0].setText(Integer.toString(9));
            btn[0].setBackgroundColor(112558);
            btn[0].setTextColor(112558);
            list.set(0, 9);
            list.set(1, temp);
            btn[1].setText(Integer.toString(temp));
            btn[1].setBackgroundResource(android.R.drawable.btn_default);
            btn[1].setTextColor(Color.BLACK);
        } else if (list.get(3) == 9) {
            int temp;
            temp = list.get(0);
            btn[0].setText(Integer.toString(9));
            btn[0].setBackgroundColor(112558);
            btn[0].setTextColor(112558);
            list.set(0, 9);
            list.set(3, temp);
            btn[3].setText(Integer.toString(temp));
            btn[3].setBackgroundResource(android.R.drawable.btn_default);
            btn[3].setTextColor(Color.BLACK);
        }
    }
    public void onBtn2(View v){
        colors();
        if (list.get(0) == 9) {
            int temp;
            temp = list.get(1);
            btn[1].setText(Integer.toString(9));
            btn[1].setBackgroundColor(112558);
            btn[1].setTextColor(112558);
            list.set(1, 9);
            list.set(0, temp);
            btn[0].setText(Integer.toString(temp));
            btn[0].setBackgroundResource(android.R.drawable.btn_default);
            btn[0].setTextColor(Color.BLACK);
        } else if (list.get(2) == 9) {
            int temp;
            temp = list.get(1);
            btn[1].setText(Integer.toString(9));
            btn[1].setBackgroundColor(112558);
            btn[1].setTextColor(112558);
            list.set(1, 9);
            list.set(2, temp);
            btn[2].setText(Integer.toString(temp));
            btn[2].setBackgroundResource(android.R.drawable.btn_default);
            btn[2].setTextColor(Color.BLACK);
        } else if (list.get(4) == 9) {
            int temp;
            temp = list.get(1);
            btn[1].setText(Integer.toString(9));
            btn[1].setBackgroundColor(112558);
            btn[1].setTextColor(112558);
            list.set(1, 9);
            list.set(4, temp);
            btn[4].setText(Integer.toString(temp));
            btn[4].setBackgroundResource(android.R.drawable.btn_default);
            btn[4].setTextColor(Color.BLACK);
        }
    }
    public void onBtn3(View v) {
        colors();
        if (list.get(1) == 9) {
            int temp;
            temp = list.get(2);
            btn[2].setText(Integer.toString(9));
            btn[2].setBackgroundColor(112558);
            btn[2].setTextColor(112558);
            list.set(2, 9);
            list.set(1, temp);
            btn[1].setText(Integer.toString(temp));
            btn[1].setBackgroundResource(android.R.drawable.btn_default);
            btn[1].setTextColor(Color.BLACK);
        } else if (list.get(5) == 9) {
            int temp;
            temp = list.get(2);
            btn[2].setText(Integer.toString(9));
            btn[2].setBackgroundColor(112558);
            btn[2].setTextColor(112558);
            list.set(2, 9);
            list.set(5, temp);
            btn[5].setText(Integer.toString(temp));
            btn[5].setBackgroundResource(android.R.drawable.btn_default);
            btn[5].setTextColor(Color.BLACK);
        }
    }

    public void onBtn4(View v) {
        colors();
        if (list.get(0) == 9) {
            int temp;
            temp = list.get(3);
            btn[3].setText(Integer.toString(9));
            btn[3].setBackgroundColor(112558);
            btn[3].setTextColor(112558);
            list.set(3, 9);
            list.set(0, temp);
            btn[0].setText(Integer.toString(temp));
            btn[0].setBackgroundResource(android.R.drawable.btn_default);
            btn[0].setTextColor(Color.BLACK);
        } else if (list.get(4) == 9) {
            int temp;
            temp = list.get(3);
            btn[3].setText(Integer.toString(9));
            btn[3].setBackgroundColor(112558);
            btn[3].setTextColor(112558);
            list.set(3, 9);
            list.set(4, temp);
            btn[4].setText(Integer.toString(temp));
            btn[4].setBackgroundResource(android.R.drawable.btn_default);
            btn[4].setTextColor(Color.BLACK);
        } else if (list.get(6) == 9) {
            int temp;
            temp = list.get(3);
            btn[3].setText(Integer.toString(9));
            btn[3].setBackgroundColor(112558);
            btn[3].setTextColor(112558);
            list.set(3, 9);
            list.set(6, temp);
            btn[6].setText(Integer.toString(temp));
            btn[6].setBackgroundResource(android.R.drawable.btn_default);
            btn[6].setTextColor(Color.BLACK);
        }
    }

    public void onBtn5(View v) {
        colors();
        if (list.get(1) == 9) {
            int temp;
            temp = list.get(4);
            btn[4].setText(Integer.toString(9));
            btn[4].setBackgroundColor(112558);
            btn[4].setTextColor(112558);
            list.set(4, 9);
            list.set(1, temp);
            btn[1].setText(Integer.toString(temp));
            btn[1].setBackgroundResource(android.R.drawable.btn_default);
            btn[1].setTextColor(Color.BLACK);
        } else if (list.get(3) == 9) {
            int temp;
            temp = list.get(4);
            btn[4].setText(Integer.toString(9));
            btn[4].setBackgroundColor(112558);
            btn[4].setTextColor(112558);
            list.set(4, 9);
            list.set(3, temp);
            btn[3].setText(Integer.toString(temp));
            btn[3].setBackgroundResource(android.R.drawable.btn_default);
            btn[3].setTextColor(Color.BLACK);
        } else if (list.get(5) == 9) {
            int temp;
            temp = list.get(4);
            btn[4].setText(Integer.toString(9));
            btn[4].setBackgroundColor(112558);
            btn[4].setTextColor(112558);
            list.set(4, 9);
            list.set(5, temp);
            btn[5].setText(Integer.toString(temp));
            btn[5].setBackgroundResource(android.R.drawable.btn_default);
            btn[5].setTextColor(Color.BLACK);
        } else if (list.get(7) == 9) {
            int temp;
            temp = list.get(4);
            btn[4].setText(Integer.toString(9));
            btn[4].setBackgroundColor(112558);
            btn[4].setTextColor(112558);
            list.set(4, 9);
            list.set(7, temp);
            btn[7].setText(Integer.toString(temp));
            btn[7].setBackgroundResource(android.R.drawable.btn_default);
            btn[7].setTextColor(Color.BLACK);
        }
    }

    public void onBtn6(View v) {
        colors();
        if (list.get(2) == 9) {
            int temp;
            temp = list.get(5);
            btn[5].setText(Integer.toString(9));
            btn[5].setBackgroundColor(112558);
            btn[5].setTextColor(112558);
            list.set(5, 9);
            list.set(2, temp);
            btn[2].setText(Integer.toString(temp));
            btn[2].setBackgroundResource(android.R.drawable.btn_default);
            btn[2].setTextColor(Color.BLACK);
        } else if (list.get(4) == 9) {
            int temp;
            temp = list.get(5);
            btn[5].setText(Integer.toString(9));
            btn[5].setBackgroundColor(112558);
            btn[5].setTextColor(112558);
            list.set(5, 9);
            list.set(4, temp);
            btn[4].setText(Integer.toString(temp));
            btn[4].setBackgroundResource(android.R.drawable.btn_default);
            btn[4].setTextColor(Color.BLACK);
        } else if (list.get(8) == 9) {
            int temp;
            temp = list.get(5);
            btn[5].setText(Integer.toString(9));
            btn[5].setBackgroundColor(112558);
            btn[5].setTextColor(112558);
            list.set(5, 9);
            list.set(8, temp);
            btn[8].setText(Integer.toString(temp));
            btn[8].setBackgroundResource(android.R.drawable.btn_default);
            btn[8].setTextColor(Color.BLACK);
        }
    }

    public void onBtn7(View v) {
        colors();
        if (list.get(3) == 9) {
            int temp;
            temp = list.get(6);
            btn[6].setText(Integer.toString(9));
            btn[6].setBackgroundColor(112558);
            btn[6].setTextColor(112558);
            list.set(6, 9);
            list.set(3, temp);
            btn[3].setText(Integer.toString(temp));
            btn[3].setBackgroundResource(android.R.drawable.btn_default);
            btn[3].setTextColor(Color.BLACK);
        } else if (list.get(7) == 9) {
            int temp;
            temp = list.get(6);
            btn[6].setText(Integer.toString(9));
            btn[6].setBackgroundColor(112558);
            btn[6].setTextColor(112558);
            list.set(6, 9);
            list.set(7, temp);
            btn[7].setText(Integer.toString(temp));
            btn[7].setBackgroundResource(android.R.drawable.btn_default);
            btn[7].setTextColor(Color.BLACK);
        }
    }

    public void onBtn8(View v) {
        colors();
        if (list.get(4) == 9) {
            int temp;
            temp = list.get(7);
            btn[7].setText(Integer.toString(9));
            btn[7].setBackgroundColor(112558);
            btn[7].setTextColor(112558);
            list.set(7, 9);
            list.set(4, temp);
            btn[4].setText(Integer.toString(temp));
            btn[4].setBackgroundResource(android.R.drawable.btn_default);
            btn[4].setTextColor(Color.BLACK);
        } else if (list.get(6) == 9) {
            int temp;
            temp = list.get(7);
            btn[7].setText(Integer.toString(9));
            btn[7].setBackgroundColor(112558);
            btn[7].setTextColor(112558);
            list.set(7, 9);
            list.set(6, temp);
            btn[6].setText(Integer.toString(temp));
            btn[6].setBackgroundResource(android.R.drawable.btn_default);
            btn[6].setTextColor(Color.BLACK);
        } else if (list.get(8) == 9) {
            int temp;
            temp = list.get(7);
            btn[7].setText(Integer.toString(9));
            btn[7].setBackgroundColor(112558);
            btn[7].setTextColor(112558);
            list.set(7, 9);
            list.set(8, temp);
            btn[8].setText(Integer.toString(temp));
            btn[8].setBackgroundResource(android.R.drawable.btn_default);
            btn[8].setTextColor(Color.BLACK);
        }
    }

    public void onBtn9(View v) {
        colors();
        if (list.get(5) == 9) {
            int temp;
            temp = list.get(8);
            btn[8].setText(Integer.toString(9));
            btn[8].setBackgroundColor(112558);
            btn[8].setTextColor(112558);
            list.set(8, 9);
            list.set(5, temp);
            btn[5].setText(Integer.toString(temp));
            btn[5].setBackgroundResource(android.R.drawable.btn_default);
            btn[5].setTextColor(Color.BLACK);
        } else if (list.get(7) == 9) {
            int temp;
            temp = list.get(8);
            btn[8].setText(Integer.toString(9));
            btn[8].setBackgroundColor(112558);
            btn[8].setTextColor(112558);
            list.set(8, 9);
            list.set(7, temp);
            btn[7].setText(Integer.toString(temp));
            btn[7].setBackgroundResource(android.R.drawable.btn_default);
            btn[7].setTextColor(Color.BLACK);
        }
    }
}
