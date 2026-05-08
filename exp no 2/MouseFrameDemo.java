import java.awt.*;
import java.awt.event.*;

public class MouseFrameDemo extends Frame implements MouseListener
{
    Label l;

    public MouseFrameDemo()
    {
        l = new Label("Move mouse inside frame");
        l.setBounds(50, 80, 200, 30);
        add(l);

        setLayout(null);
        setSize(300, 200);
        setTitle("Mouse Event Frame");

        addMouseListener(this);

        setVisible(true);
    }

    public void mouseClicked(MouseEvent e)
    {
        l.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e)
    {
        setVisible(true);
        l.setText("Mouse Entered - Frame Visible");
    }

    public void mouseExited(MouseEvent e)
    {
        l.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args)
    {
        new MouseFrameDemo();
    }
}