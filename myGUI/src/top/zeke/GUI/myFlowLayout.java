package top.zeke.GUI;

import java.awt.*;

public class myFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button = new Button("Button1");
        //Set layout of the frame
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        frame.setSize(500,500);
        frame.add(button);
        frame.setVisible(true);
    }
}
