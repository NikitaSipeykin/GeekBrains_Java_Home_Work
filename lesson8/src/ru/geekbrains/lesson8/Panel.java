package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Panel extends JPanel {

    private JButton numbers[] = new JButton[10];
    private Font font = new Font("SanSerif",Font.BOLD,20);
    private JTextField display = new JTextField();
    private JButton backspace = new JButton("C");
    private JButton equ = new JButton("=");
    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");
    private JButton multiply = new JButton("*");
    private JButton divide = new JButton("/");

    int SUM = 0, DIF = 0, MUT = 0, DIV = 0;
    String j, h;
    int a, c;

    public Panel(){
        setLayout(null);
        setFocusable(true);
        grabFocus();

        backspace.setBounds(10,250,50,50);
        backspace.setFont(font);
        add(backspace);

        equ.setBounds(130,250,50,50);
        equ.setFont(font);
        add(equ);

        plus.setBounds(190,70,50,50);
        plus.setFont(font);
        add(plus);

        minus.setBounds(190,130,50,50);
        minus.setFont(font);
        add(minus);

        multiply.setBounds(190,190,50,50);
        multiply.setFont(font);
        add(multiply);

        divide.setBounds(190,250,50,50);
        divide.setFont(font);
        add(divide);

        numbers[0] = new JButton("0");
        numbers[0].setBounds(70,250, 50,50);
        numbers[0].setFont(font);
        add(numbers[0]);

        for(int x =0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                numbers[x * 3 + y + 1] = new JButton((y * 3 + x + 1)+"");
                numbers[x * 3 + y + 1].setBounds(x*(50+10)+10,y * (50 + 10) + 70,50,50);
                numbers[x * 3 + y + 1].setFont(font);
                add(numbers[x * 3 + y +1]);
            }
        }
        display.setBounds(10,10,230,50);
        display.setFont(font);
        display.setEditable(false);
        add(display);

        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                display.setText(display.getText()+b.getText());

                if(e.getSource() == backspace){
                    display.setText(null);
                }
                if(e.getSource() == plus){
                    j = display.getText();
                    display.setText(null);
                    SUM++;
                }
                if(e.getSource() == minus){
                    j = display.getText();
                    display.setText(null);
                    DIF++;
                }
                if(e.getSource() == multiply){
                    j = display.getText();
                    display.setText(null);
                    MUT++;
                }
                if(e.getSource() == divide){
                    j = display.getText();
                    display.setText(null);
                    DIV++;
                }
                if(e.getSource() == equ){
                    h = display.getText();
                    c = Integer.parseInt(h);
                    a = Integer.parseInt(j);

                    if(SUM == 1){
                        display.setText(a + c +"");
                        SUM = 0;
                        a = 0;
                        c = 0;
                        h = "";
                        j = "";
                    }
                    if(DIF == 1){
                        display.setText(a - c +"");
                        SUM = 0;
                        a = 0;
                        c = 0;
                        h = "";
                        j = "";
                    }
                    if(MUT == 1){
                        display.setText(a * c +"");
                        SUM = 0;
                        a = 0;
                        c = 0;
                        h = "";
                        j = "";
                    }
                    if(DIV == 1){
                        display.setText(a / c +"");
                        SUM = 0;
                        a = 0;
                        c = 0;
                        h = "";
                        j = "";
                    }
                }
            }
        };
        for(JButton b : numbers){
            b.addActionListener(l);
        }
        backspace.addActionListener(l);
        plus.addActionListener(l);
        minus.addActionListener(l);
        multiply.addActionListener(l);
        divide.addActionListener(l);
        equ.addActionListener(l);



        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char symbol = e.getKeyChar();

                if(!Character.isDigit(symbol)){
                    return;
                }
                display.setText(display.getText()+symbol);
            }
        });
    }
}
