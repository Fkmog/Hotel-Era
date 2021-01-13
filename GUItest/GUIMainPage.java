package GUItest;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUIMainPage extends JFrame implements ActionListener{
    public static JFrame HotelEra;
    public JTextArea textArea;

    public HotelEra()
    {
        //窗口框架
        HotelEra = new JFrame();
        HotelEra.setTitle("Hotel Era: Hotel Booking System");
        HotelEra.setBounds(600,300,500,400);
        HotelEra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //界面1
        JPanel panel = new JPanel();
        HotelEra.getContentPane().add(panel,BorderLayout.SOUTH);
        JButton button1 = new JButton("登陆");
        JButton button2 = new JButton("注册");

        panel.add(button1);
        panel.add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
