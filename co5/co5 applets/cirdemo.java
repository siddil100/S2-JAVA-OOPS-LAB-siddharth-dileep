//TO draw circle,rectangle and a line
import java.applet.*;
import java.awt.*;
public class cirdemo extends Applet
{
public void paint(Graphics g)
{
g.drawOval(20,20,200,120);
g.drawRect(10,10,50,100);
g.drawLine(15,14,50,100);
}
}