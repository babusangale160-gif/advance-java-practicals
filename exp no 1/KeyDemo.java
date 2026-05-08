import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="KeyDemo" width=300 height=150>
</applet>
*/

public class KeyDemo extends Applet implements KeyListener
{
    String msg = "";

    public void init()
    {
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e)
    {
        msg = "Key Pressed";
        repaint();
    }

    public void keyReleased(KeyEvent e)
    {
        msg = "Key Released";
        repaint();
    }

    public void keyTyped(KeyEvent e)
    {
        msg = "Key Typed: " + e.getKeyChar();
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString(msg, 50, 80);
    }
}