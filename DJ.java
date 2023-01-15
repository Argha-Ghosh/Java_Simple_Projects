//Ar_Lazy_dev

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;

public class DJ extends Thread implements ActionListener{

    static boolean DJ_status= false;
    static JFrame frame;
    static JButton button;
    static JLabel label;
    static Random rand = new Random();
    static int r, g, b;
    
    public static void main(String[] args)throws FileNotFoundException,FontFormatException,IOException{

        DJ thread = new DJ();

        frame = new JFrame();
        button = new JButton();
        label = new JLabel("It's DJ Guys!!!!!!");

        InputStream new_font1 = new FileInputStream("Katerlin_fontspace.ttf");
        InputStream new_font2 = new FileInputStream("NeonLights-22d.ttf");

        Font font1 = Font.createFont(Font.TRUETYPE_FONT,new_font1);
        Font font2 = Font.createFont(Font.TRUETYPE_FONT,new_font2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        button.setText("DJ OFF");
        button.setFont(font2.deriveFont(20f));
        button.setPreferredSize(new Dimension(100,50));
        button.setFocusable(false);
        button.setForeground(Color.RED);
        button.addActionListener(new DJ());

        label.setBounds(20,10,150,70);
        label.setFont(font1.deriveFont(80f));
        label.setForeground(Color.MAGENTA);

        frame.add(button);
        frame.add(label);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        thread.start();

        
    }

    public void Change_Label_Color(){
            
        r=rand.nextInt(256);
        g=rand.nextInt(256);
        b=rand.nextInt(256);

        label.setForeground(new Color(r,g,b));
    }

    @Override
    public void run(){
        while(true){
            
            if(DJ_status== true){
                Change_Label_Color();
                try {
                    Thread.sleep(350);
                } catch (InterruptedException e) {}
            }
            
        }
    }


    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getActionCommand()=="DJ OFF"){

            button.setText("DJ ON");
            button.setForeground(Color.ORANGE);
            DJ_status= true;

        }
        else if(e.getActionCommand()=="DJ ON"){
            
            button.setText("DJ OFF");
            button.setForeground(Color.RED);
            DJ_status= false;
        }
    }    
}
