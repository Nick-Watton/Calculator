package calc;
import java.awt.*;
import java.awt.event.*;

public class WinMath2 {
    public static void main (String [] args) {

    Frame F = new Frame("Calculator");
    F.setVisible(true);
    F.setSize(500,450);
   
    WEvents t = new WEvents(F);
        F.addWindowListener(t);
   
   
   
    TextField T1 = new TextField();
    T1.setColumns(40);
    TextField T2 = new TextField();
    T1.setColumns(40);
        Panel P1 = new Panel();
        Panel P2 = new Panel();
        P2.setLayout(new GridLayout(4,4,5,5));
        

        Button B0 = new Button("0");
        Button B1 = new Button("1");
        Button B2 = new Button("2");
        Button B3 = new Button("3");
        Button B4 = new Button("4");
        Button B5 = new Button("5");
        Button B6 = new Button("6");
        Button B7 = new Button("7");
        Button B8 = new Button("8");
        Button B9 = new Button("9");
        Button B10 = new Button("+");
        Button B11= new Button("-");
        Button B12 = new Button("/");
        Button B13 = new Button("x");
        Button B14 = new Button("=");
        Button B15 = new Button("C");
        
        B0.setFont(new Font("Arial", Font.PLAIN, 40));
        B1.setFont(new Font("Arial", Font.PLAIN, 40));
        B2.setFont(new Font("Arial", Font.PLAIN, 40));
        B3.setFont(new Font("Arial", Font.PLAIN, 40));
        B4.setFont(new Font("Arial", Font.PLAIN, 40));
        B5.setFont(new Font("Arial", Font.PLAIN, 40));
        B6.setFont(new Font("Arial", Font.PLAIN, 40));
        B7.setFont(new Font("Arial", Font.PLAIN, 40));
        B8.setFont(new Font("Arial", Font.PLAIN, 40));
        B9.setFont(new Font("Arial", Font.PLAIN, 40));
        B10.setFont(new Font("Arial", Font.PLAIN, 40));
        B11.setFont(new Font("Arial", Font.PLAIN, 40));
        B12.setFont(new Font("Arial", Font.PLAIN, 40));
        B13.setFont(new Font("Arial", Font.PLAIN, 40));
        B14.setFont(new Font("Arial", Font.PLAIN, 40));
        B15.setFont(new Font("Arial", Font.PLAIN, 40));
        T1.setFont(new Font("Arial", Font.PLAIN, 20));
        T2.setFont(new Font("Arial", Font.PLAIN, 20));
       
        F.add(P1, BorderLayout.NORTH);
        F.add(P2, BorderLayout.CENTER);
        F.add(T2, BorderLayout.SOUTH);
        P1.add(T1);
        
        P2.add(B7);
        P2.add(B8);
        P2.add(B9);
        P2.add(B13);        
        P2.add(B4);
        P2.add(B5);
        P2.add(B6);
        P2.add(B11);
        P2.add(B1);
        P2.add(B2);
        P2.add(B3);
        P2.add(B10);
        P2.add(B15);
        P2.add(B0);
        P2.add(B14);
        P2.add(B12);
       
        AddEvent2 E1 = new AddEvent2 (T1, T2, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15);
        AddEvent2 E2 = new AddEvent2 (T1, T2, B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15);
       
        B0.addActionListener(E1);
        B1.addActionListener(E1);
        B2.addActionListener(E1); //Use for event handlers/catch
        B3.addActionListener(E1);
        B4.addActionListener(E1);
        B5.addActionListener(E1);
        B6.addActionListener(E1);
        B7.addActionListener(E1);
        B8.addActionListener(E1);
        B9.addActionListener(E1);
        B10.addActionListener(E1);
        B11.addActionListener(E1);
        B12.addActionListener(E1);
        B13.addActionListener(E1);
        B14.addActionListener(E1);
        B15.addActionListener(E1);
        
        
        B10.addMouseListener((MouseListener) E2);
        B11.addMouseListener((MouseListener) E2);
        B12.addMouseListener((MouseListener) E2);
        B13.addMouseListener((MouseListener) E2);
        B14.addMouseListener((MouseListener) E2);
        B15.addMouseListener((MouseListener) E2);
        
        B10.addMouseListener(new MouseAdapter(){}); 
        B11.addMouseListener(new MouseAdapter(){}); 
        B12.addMouseListener(new MouseAdapter(){});   
        B13.addMouseListener(new MouseAdapter(){}); 
        B14.addMouseListener(new MouseAdapter(){}); 
        B15.addMouseListener(new MouseAdapter(){}); 

}
}
