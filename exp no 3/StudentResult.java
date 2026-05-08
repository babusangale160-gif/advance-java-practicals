import java.awt.*;
import java.awt.event.*;

public class StudentResult extends Frame implements ActionListener
{
    Label l1, l2, l3, l4;
    TextField t1, t2, t3, t4;
    Button b;

    StudentResult()
    {
        setLayout(null);

        l1 = new Label("Name");
        l1.setBounds(50, 50, 100, 20);
        add(l1);

        t1 = new TextField();
        t1.setBounds(150, 50, 150, 25);
        add(t1);

        l2 = new Label("Math Marks");
        l2.setBounds(50, 100, 100, 20);
        add(l2);

        t2 = new TextField();
        t2.setBounds(150, 100, 150, 25);
        add(t2);

        l3 = new Label("Science Marks");
        l3.setBounds(50, 150, 100, 20);
        add(l3);

        t3 = new TextField();
        t3.setBounds(150, 150, 150, 25);
        add(t3);

        l4 = new Label("English Marks");
        l4.setBounds(50, 200, 100, 20);
        add(l4);

        t4 = new TextField();
        t4.setBounds(150, 200, 150, 25);
        add(t4);

        b = new Button("Submit");
        b.setBounds(120, 250, 80, 30);
        add(b);

        b.addActionListener(this);

        setTitle("Student Form");
        setSize(350, 350);
        setVisible(true);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e)
    {
        String name = t1.getText();

        int m1 = Integer.parseInt(t2.getText());
        int m2 = Integer.parseInt(t3.getText());
        int m3 = Integer.parseInt(t4.getText());

        float avg = (m1 + m2 + m3) / 3.0f;

        Frame f = new Frame("Result");
        f.setLayout(null);

        Label r = new Label("Name: " + name + "  Avg: " + avg);
        r.setBounds(50, 80, 250, 30);

        f.add(r);

        f.setSize(300, 200);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f.dispose();
            }
        });
    }

    public static void main(String[] args)
    {
        new StudentResult();
    }
}