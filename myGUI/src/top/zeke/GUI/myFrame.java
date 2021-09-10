package top.zeke.GUI;

import java.awt.*;

public class myFrame {
    public static void main(String[] args) {
        //New a frame instance
        Frame frame = new Frame("My First Window");
        Panel panel = new Panel();
        frame.setLayout(null);
        //Set visibility
//        frame.setVisible(true);
        //Set the width and height
//        frame.setSize(400,400);
        //Set color
        Color color = new Color(114, 35, 153);
        frame.setBounds(500,400,400,400);
        //Set background color
        frame.setBackground(Color.blue);
        //Set the location
//        frame.setLocation(500,400);
        //Set resizable
//        frame.setResizable(false);
        /*
        Set panel in the frame
         */

        //x and y is set w.r.t frame
        panel.setBounds(100,100,100,100);
        //set background color of panel
        panel.setBackground(Color.yellow);
        //add panel to the frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
