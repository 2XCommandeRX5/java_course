package L13;

import javafx.beans.WeakInvalidationListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {


    public static void main(String[] args) {
        JFrame window = new JFrame("My UI");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize( new Dimension(800, 600));
        window.setLocationRelativeTo(null);
        window.setLayout(new FlowLayout());

        JPanel inputPan = new JPanel(new FlowLayout());
        inputPan.setPreferredSize(new Dimension(400, 100));
        inputPan.setBackground(Color.BLUE);
        initInputPan(inputPan);
        window.add(inputPan);

        JPanel keyboard = new JPanel(new GridLayout(4,4));
        keyboard.setPreferredSize(new Dimension(400,400));
        initButtonsPan(keyboard);
        window.add(keyboard);

        window.setVisible(true);
    }

    private static void initButtonsPan(JPanel panel) {
        String [][] symbols = {
                {"7","8","9","+"},
                {"4","5","6","-"},
                {"1","2","3","*"},
                {"0","<-","=","/"}
        };

        for (int i = 0; i < symbols.length ; i++) {
            for (int j = 0; j < symbols[i].length; j++) {
                JButton curBut = new JButton(symbols[i][j]);
                curBut.addActionListener(e -> {
                    String t = inputArea.getText();

                    if (e.getActionCommand().equalsIgnoreCase("<-")){
                        t.substring(0,t.length()-2);
                        inputArea.setText(t);
                    } else if (e.getActionCommand().equalsIgnoreCase("=")) {

                    } else {
                        if (t.equals("0")) t = "";
                        inputArea.setText(t+e.getActionCommand());
                    }
                });
                panel.add(curBut);
            }
        }
    }

    private static JTextField inputArea;
    private static void initInputPan (JPanel pan) {
        inputArea = new JTextField("0");
        inputArea.setPreferredSize(new Dimension(380,45));
        pan.add(inputArea);
        JLabel errorMsg = new JLabel();
        errorMsg.setPreferredSize(new Dimension(150,30));
        errorMsg.setBackground(Color.black);
        pan.add(errorMsg);
    }
}
