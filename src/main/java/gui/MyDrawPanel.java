package gui;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;

public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
//        g.setColor(Color.red);
//        g.fillRect(20,50,100,100);
//        Image image = new ImageIcon("cat.png").getImage();
//        g.drawImage(image,3,4,this);
//        g.fillRect(0,0, this.getWidth(), this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);

        g.setColor(orange);
//        g.fillOval(x,y,100,100);

//        Color randomColor = new Color(red, green, blue);
//        g.setColor(randomColor);
//        g.fillOval(70,70,100,100);
//
//        GradientPaint gradient = new GradientPaint(70,70,Color.blue,150,150,Color.orange);
//        g2d.setPaint(gradient);
//        g2d.fillOval(70,70,100,100);
    }
}
