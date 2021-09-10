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

## Swing

