package timer;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimerTest
{
    public static void main(String[] args)
    {
        ActionListener listener = new TimePrinter();

        // построить таймер, вызывающий приемник событий
        // каждые 10 секунд
        Timer t = new Timer(10000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println(new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
