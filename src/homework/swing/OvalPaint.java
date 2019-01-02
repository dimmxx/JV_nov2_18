package homework.swing;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class OvalPaint  extends JPanel {

     BufferedImage img = ImageIO.read(new File("cells.png"));
     BufferedImage img1 = ImageIO.read(new File("run.png"));
     Image img3 = img.getScaledInstance(300, 300, Image.SCALE_DEFAULT);




     ImageIcon icon1 = new ImageIcon(new ImageIcon("run.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));


    public OvalPaint() throws IOException {
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    //g.setColor(Color.orange);
    //g.fillRect(0, 0, getWidth(), getHeight());
    //g.setColor(Color.red);
  //  g.fillOval(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2);



    for(int i = 0; i < 700; i++){
        //repaint();

         try {
             g.drawImage(img1, i, 0, this);
             g.drawImage(img3, 0, 1, this);
             repaint();

                Thread.sleep(1);




            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }






  }


  public static void main(String args[]) {

        JFrame frame = new JFrame("OvalPaint");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




      OvalPaint panel = null;
      try {
          panel = new OvalPaint();
      } catch (IOException e) {
          e.printStackTrace();
      }

      frame.add(panel);

    frame.setSize(700, 200);
    frame.setVisible(true);

  }










}
