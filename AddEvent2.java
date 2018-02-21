package calc;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;

	public class AddEvent2 extends MouseAdapter implements ActionListener{

    TextField TA, TB;
    Button BTN0, BTN1, BTN2, BTN3, BTN4 ,BTN5, BTN6, BTN7, BTN8, BTN9, BTN10, BTN11, BTN12, BTN13, BTN14, BTN15;

	String input = "";
	int num1 = 0;
	int num2 = 0;
	int answer = 0;
	int tick = 0;
	boolean plus = false;
	boolean sub = false;
	boolean div = false;
	boolean mult = false;
	
	public AddEvent2(TextField t1, TextField t2, Button b0, Button b1, Button b2, Button b3, Button b4, Button b5, Button b6, Button b7,
		Button b8, Button b9, Button b10, Button b11, Button b12, Button b13, Button b14, Button b15) {
		TA=t1;
		TB=t2;
		BTN0=b0;
		BTN1=b1;
		BTN2=b2;
		BTN3=b3;
		BTN4=b4;
		BTN5=b5;
		BTN6=b6;
		BTN7=b7;
		BTN8=b8;
		BTN9=b9;
		BTN10=b10;
		BTN11=b11;
		BTN12=b12;
		BTN13=b13;
		BTN14=b14;
		BTN15=b15;
	}
		public void actionPerformed (ActionEvent X){
		Button BTN = (Button)X.getSource();
		try {
//BUTTONS 0-9 PRESSED     
	if (BTN == BTN0) input = input + "0";
	    if (BTN == BTN1) input = input + "1";
	    if (BTN == BTN2) input = input + "2";
	    if (BTN == BTN3) input = input + "3";
	    if (BTN == BTN4) input = input + "4";
	    if (BTN == BTN5) input = input + "5";
	    if (BTN == BTN6) input = input + "6";
	    if (BTN == BTN7) input = input + "7";
	    if (BTN == BTN8) input = input + "8";
	    if (BTN == BTN9) input = input + "9";
	    TA.setText(input);
   
//PLUS BUTTON PRESSED 
    if (BTN == BTN10) { 
    tick++;
    //input = input + TA.getText();
    num1 = Short.valueOf(input);
    plus = true;
    input="";
    }
   
//MINUS BUTTON PRESSED   
    if (BTN == BTN11) { 
    tick++;
    //input = input + TA.getText();
    num1 = Short.valueOf(input);
    sub = true;
    input="";
    }
   
//DIVIDE BUTTON PRESSED     
    if (BTN == BTN12) { 
    tick++;
    //input = input + TA.getText();
    num1 = Short.valueOf(input);
    div = true;
    input="";
    }
   
//MULTIPLY BUTTON PRESSED     
    if (BTN == BTN13) { 
    tick++;
    //input = input + TA.getText();
    num1 = Short.valueOf(input);
    mult = true;
    input="";
    }
   
//EQUALS BUTTON PRESSED
    if (BTN == BTN14) { 
    num2 = Short.valueOf(input);
    tick = 0;
    if (plus==true) {TA.setText(Integer.toString(num1+num2)); answer=num1+num2; input=(Integer.toString(answer));plus=false;}
    if (sub==true) {TA.setText(Integer.toString(num1-num2)); answer=num1-num2; input=(Integer.toString(answer));sub=false;}
    if (div==true) {TA.setText(Integer.toString(num1/num2)); answer=num1/num2; input=(Integer.toString(answer));div=false;}
    if (mult==true) {TA.setText(Integer.toString(num1*num2)); answer=num1*num2; input=(Integer.toString(answer));mult=false;}
    }
   
//CLEAR BUTTON PRESSED
    if (BTN == BTN15) { 
    TA.setText("Cleared");
    TimeUnit.SECONDS.sleep(1);
    input = "";
    TA.setText(input);
    num1 = 0;
    num2 = 0;
    tick = 0;
    answer=0;
    }

//SEQUENTIAL OPERATORS PRESSED
    if (tick>=2) {
    TA.setText("You cannot do that");
    TimeUnit.SECONDS.sleep(2);
    input= "";
    TA.setText(input);
        num1 = 0;
        num2 = 0;
        tick = 0;
        answer=0;
    }
}
//EXCEPTIONS 
		catch (ArithmeticException E1) {
		TA.setText("You cannot divide by 0");
		try {
		TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	    input = "";
	    TA.setText(input);
	    num1 = 0;
	    num2 = 0;
	    tick = 0;
	    answer=0;
		}
        catch (NumberFormatException E1) {
        TA.setText("Please enter two numbers");
        try {
		TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	    input = "";
	    TA.setText(input);
	    num1 = 0;
	    num2 = 0;
	    tick = 0;
	    answer=0;
	    }
        
		catch (Exception E1) {
		TA.setText("Unspecified Error");
		try {
		TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	    input = "";
	    TA.setText(input);
	    num1 = 0;
	    num2 = 0;
	    tick = 0;
	    answer=0;
        }
}

		public void mouseEntered(MouseEvent e) {
		Button BTN = (Button) e.getSource();
		try {
		if (BTN == BTN10) {TB.setText("This will enable you to add two numbers");}
		if (BTN == BTN11) {TB.setText("This will enable you to subtract two numbers");}
		if (BTN == BTN12) {TB.setText("This will enable you to divide two numbers");}
		if (BTN == BTN13) {TB.setText("This will enable you to multiply two numbers");}
		if (BTN == BTN14) {TB.setText("This will complete the calculation");}
		if (BTN == BTN15) {TB.setText("This will clear the current calculation");}
		}
		catch (Exception E) {};

		}


		public void mouseExited(MouseEvent e) {
		Button BTN = (Button) e.getSource();
		try {
		if (BTN == BTN10) {TB.setText("");}
		if (BTN == BTN11) {TB.setText("");}
		if (BTN == BTN12) {TB.setText("");}
		if (BTN == BTN13) {TB.setText("");}
		if (BTN == BTN14) {TB.setText("");}
		if (BTN == BTN15) {TB.setText("");}
		}
		catch (Exception E) {};
		}

}  