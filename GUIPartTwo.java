//Ar_Lazy_Dev
//Java beginner's course - Bro Code (Youtube)

//My second GUI program :'O

//Jframe --> A GUI window to add components to :)
//Jlabel --> Label for or Jframe :)

import java.awt.*;
import java.io.*;
import javax.swing.*;


public class GUIPartTwo{
    
    public static void main(String[] args) throws FileNotFoundException,IOException,FontFormatException{

        JFrame frame = new JFrame();  //created an instance of the Jframe class

        frame.setSize(500,500);  //sets the window size\

        frame.setVisible(true);  //This makes the GUI window visible

        frame.setResizable(false); //makes the window non-resizable

        //makes the program to terminate on pressing the close button,
        //otherwise the program will keep running in the background
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        frame.setTitle("Izumi X Kyoko"); //set a title for the window :)

        //now we'll change the default icon of the window which is a bit complex :(
        ImageIcon icon = new ImageIcon("WHY.jpg"); //creates an ImageIcon 

        frame.setIconImage(icon.getImage()); //this changes the icon of the frame

        //now we'll change the default background color
        frame.getContentPane().setBackground(new Color(177,156,217));




        //now, Let's add label to our frame :)
        JLabel label = new JLabel();

        label.setText("Kawaii Couple :)"); //set the text for the label

        //Now that the label is created let's add the label to our frame

        frame.add(label);

        ImageIcon image = new ImageIcon("Horimiya kawaii.png");

        label.setIcon(image);

        //now we are going to change the label text position

        //both of this positions are relative to the image
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);

        //now let's change the font style and color

        label.setForeground(new Color(255,255,255));

        //I want to add a custom font in my frame so let's make a font

        InputStream font = new FileInputStream("NeonLights-22d.ttf");

        Font neonlight = Font.createFont(Font.TRUETYPE_FONT, font);

        Font large_NeonLight = neonlight.deriveFont(25f);
        
        label.setFont(large_NeonLight);

        //let's align the label text and image

        label.setHorizontalAlignment(JLabel.CENTER);


    }

}