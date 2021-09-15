package top.zeke.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestListener {
    public static void main(String[] args) {
        //Instantiate a frame
        Frame frame = new Frame();
        //Instantiate 2 buttons
        Button button = new Button("button");
        Button button2 = new Button("button");
        //Initiate the frame
        frame.setBounds(500,500,500,500);
        frame.setLayout(new GridLayout(3,1));
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //Set different actionCommand
        button.setActionCommand("Start");
        button2.setActionCommand("Stop");
        MyActionListener myActionListener = new MyActionListener();
        //Add only one actionListener
        button.addActionListener(myActionListener);
        button2.addActionListener(myActionListener);
        //Add buttons to the frame
        frame.add(button,0);
        frame.add(button2,1);
        frame.setVisible(true);
//        frame.pack();

    }
}
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Start":
                System.out.println("Start button clicked");
                break;
            case "Stop":
                System.out.println("Stop button clicked");
                break;
            default:
                break;
        }
    }
}