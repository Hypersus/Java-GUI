package top.zeke.GUI;

import java.awt.*;

public class TestLayout {
    public static void main(String[] args) {
        /*
        Set Frame
         */
        Frame frame = new Frame();
        frame.setBounds(500,500,500,500);
        frame.setLayout(new GridLayout(2,1));
        frame.setVisible(true);
        /*
        Create all the panels
         */
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));
        /*
        Create all the buttons
         */
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");
        Button button6 = new Button("button6");
        Button button7 = new Button("button7");
        Button button8 = new Button("button8");
        Button button9 = new Button("button9");
        Button button10 = new Button("button10");
        /*
        Set panel1
         */
        panel1.add(button1,BorderLayout.WEST);
        panel1.add(button2,BorderLayout.EAST);
        panel1.add(panel2,BorderLayout.CENTER);
        /*
        Set panel2
         */
        panel2.add(button3);
        panel2.add(button4);
        /*
        Set panel3
         */
        panel3.add(button5,BorderLayout.WEST);
        panel3.add(button6,BorderLayout.EAST);
        panel3.add(panel4,BorderLayout.CENTER);
        /*
        Set panel4
         */
        panel4.add(button7);
        panel4.add(button8);
        panel4.add(button9);
        panel4.add(button10);
        /*
        Set top frame
         */
        frame.add(panel1);
        frame.add(panel3);
    }
}
