package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About(){

        // 🔥 CORRECT IMAGE PATH (icons not icon)
        ImageIcon i1 = new ImageIcon(getClass().getResource("/icon/about.png"));

        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(350,0,300,200);
        add(img);

        JLabel heading = new JLabel("<html><b>ERP Developed by:</b><br>Pranshu & Jagjot</html>");
        heading.setBounds(70,20,300,130);
        heading.setFont(new Font("Tahoma", Font.BOLD,28));
        add(heading);

        JLabel name = new JLabel("© Jagjot  |  Pranshu");
        name.setBounds(60,260,600,40);
        name.setFont(new Font("Tahoma", Font.BOLD,28));
        add(name);

        JLabel contact = new JLabel("Contact: jagjot24272@iiitd.ac.in  |  pranshu23386@iiitd.ac.in");
        contact.setBounds(70,340,600,40);
        contact.setFont(new Font("Tahoma", Font.PLAIN,18));
        add(contact);

        setSize(700,500);
        setLocation(400,150);
        getContentPane().setBackground(new Color(252,228,210));
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new About();
    }
}
