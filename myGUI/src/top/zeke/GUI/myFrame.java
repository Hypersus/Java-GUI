package top.zeke.GUI;

import java.awt.*;

public class myFrame {
    public static void main(String[] args) {
        //New a frame instance
        Frame frame = new Frame();
        //Set visibility
        frame.setVisible(true);
        //Set the width and height
        frame.setSize(400,400);
        //Set color
        Color color = new Color(114, 35, 153);
        //Set background color
        frame.setBackground(Color.blue);
        //Set the location
        frame.setLocation(500,400);
        //Set resizable
        frame.setResizable(false);

    }
}
