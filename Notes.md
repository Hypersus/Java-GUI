---
title: Notes
---

## AWT(Abstract Windows Tools)

### Frame

- frame.setLocation():传入的x,y坐标为Frame左上角相对于屏幕左上角，x轴向右为正，y轴向下为正
- frame.setSize():设置宽高，单位px
- frame.setBounds():四个参数，分别对应setLocation()和setSize()的参数
- frame.setVisible():默认为false，布局结束需要显示是传入true进行显示
- frame.setLayout():设置内部组件的布局方式

### Panel

- 面板组件，无法单独显示，只能加到容器中（如Frame）
- 带参构造方法中new Panel()可以添加布局作为参数

### 布局管理器

- 流式布局：FlowLayout
- 东西南北中：BorderLayout
- 表格布局：GridLayout

### Button

#### Button监听

- button.addActionListener()传入接口ActionListener，可以通过匿名内部类实现ActionListener同时实例化

  ```java
  button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          System.out.println("out");
      }
  });
  ```

  其中actionPerformed传入实例ActionEvent e，ActionEvent带有property actionCommand，可以用button.setActionCommand(String command)传入字符串command设置actionCommand的值，button中的setActionCommand源码如下：

  ```java
  /**
       * Sets the command name for the action event fired
       * by this button. By default this action command is
       * set to match the label of the button.
       *
       * @param     command  a string used to set the button's
       *                  action command.
       *            If the string is <code>null</code> then the action command
       *            is set to match the label of the button.
       * @see       java.awt.event.ActionEvent
       * @since     JDK1.1
       */
  public void setActionCommand(String command) {
      actionCommand = command;
  }
  ```

  此处设置的actionCommand可直接传入ActionEvent的actionCommand（具体过程待补充...）

  于是可以利用button的setActionCommand()方法给每一个button设置不同的actionCommand，然后新建一个自己的类MyActionListener实现接口ActionListener，并重写actionPerformed方法，方法体内部用switch语句或if语句对e.getActionCommand()的返回值进行判断，这样子多个button就可以实现actionListener共享，并在MyActionListener的actionPerformed方法中对按下各个按钮触发的事件进行单独设置，实现分离

  ```java
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
          switch (e.getActionCommand()){
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
  ```

  

## Swing

