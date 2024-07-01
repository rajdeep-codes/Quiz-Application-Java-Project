package Quiz.Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {

    JButton Start, Back;

    String name;

    Rules(String name){

        this.name = name;

        JLabel heading = new JLabel("Welcome "+ name +" to QUIZ TEST");
        heading.setBounds(150,100,700,30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,28));
        heading.setForeground(new Color(22,99,54));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(70,150,700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN,16));
        rules.setForeground(new Color(22,99,54));
        rules.setText(

                "<html>"+

                        "1. Participation in the quiz is free." +"<br><br>" +
                        "2. Only registered candidates can participate in the quiz." +"<br><br>" +
                        "3. The quiz consists of 10 questions." +"<br><br>" +
                        "4. You only have 15 seconds to answer a question." +"<br><br>" +
                        "5. All questions are multiple choice question." +"<br><br>" +
                        "6. Each correct answer awards 10 point, there are no negative points for incorrect answers." +"<br><br>" +
                        "7. Any form of cheating will result in disqualification." +"<br><br>" +

                        "<html>"


        );
        add(rules);


        Back = new JButton("Back");
        Back.setBounds(150,500,100,30);
        Back.setBackground(new Color(22,99,54));
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);

        Start = new JButton("Start");
        Start.setBounds(300,500,100,30);
        Start.setBackground(new Color(22,99,54));
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        add(Start);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("Icons/back.png"));
        Image i1 = i.getImage().getScaledInstance(800,650, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel image = new JLabel(i2);
        image.setBounds(0,0,800,650);
        add(image);





       setSize(800,650);
       setLocation(300,60);
       setLayout(null);
       setUndecorated(true);
       setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == Start){
           setVisible(false);
           new Quiz(name);

       } else {
           setVisible(false);
           new Login();
       }

    }

    public static void main(String[] args) {
      new Rules("User");
    }
}
