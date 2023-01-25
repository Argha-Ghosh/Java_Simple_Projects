import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;
//Ar_Lazy_Dev
//Java beginner's course - Bro Code (Youtube)

public class basic_animation_demo extends JPanel implements ActionListener{

    static Image setting;

    static Timer timer;

    final static int panel_height = 420;
    final static int panel_width = 420;

    static int x=0;
    static int y=0;
    static int deg = 0;
    static int rot = 10;

    Random random_x = new Random();
    Random random_y = new Random();

    int x_velocity = random_x.nextInt(6)+1;
    int y_velocity = random_y.nextInt(6)+1;
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        basic_animation_demo panel = new basic_animation_demo();

        timer = new Timer(20, panel);
        setting = new ImageIcon("setting.png").getImage();

        panel.setPreferredSize(new Dimension(panel_width,panel_height));
        panel.setBackground(Color.PINK);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        timer.start();
    }

    @Override
    public void paint(Graphics g){
        
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.rotate(Math.toRadians(deg),x+32,y+32);
        g2d.drawImage(setting, x, y, null);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(x>panel_width-setting.getWidth(null) || x<0){
            x_velocity *= -1;
            rot *= -1;
        }
        if(y>panel_width-setting.getHeight(null) || y<0){
            y_velocity *= -1;
            rot *= -1;
        }

        x= x + x_velocity;
        y= y + y_velocity;
        deg+=rot;
        repaint();

    }

}