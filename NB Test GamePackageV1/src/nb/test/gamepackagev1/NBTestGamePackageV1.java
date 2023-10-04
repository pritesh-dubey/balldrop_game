package nb.test.gamepackagev1;

import edu.sjcny.gpv1.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class NBTestGamePackageV1 extends DrawableAdapter {
    static NBTestGamePackageV1 ge = new NBTestGamePackageV1();
    static GameBoard gb = new GameBoard(ge, "Blank Game Board");
    static glass g1= new glass(30,430, Color.GREEN);
    static glass g2= new glass(230,430, Color.GRAY);
    static glass g3= new glass(430,430, Color.ORANGE);
    
   static spikebar[] s = new spikebar[15];
  static ball bl = new ball(180, 60);
//  static int count = 10;

    public static void main(String[] args) {


        for (int j = 0; j < 15; j++) {
         int  xs = (int) (Math.random() * 80);
          int   ys = (int) (Math.random() * 80);
           s[j] = new spikebar(xs * 5, ys * 5);
        }
        
        showGameBoard(gb);
    JOptionPane.showMessageDialog( gb, "Move the ball to the glass to win the game");
    JOptionPane.showMessageDialog( gb, "Use the arrow keys to move the ball");

        
    }
        // moving the spikebar
      public void move() {
  for (int i = 0; i < 15; i++) {
        spikebar bar = s[i];
      int newY = bar.getY() - 2;
       if (newY < 0) {
            newY = 250;
      }
       bar.setY(newY);
         }  
      }
    
  
    
public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Color color1 = Color.YELLOW;
        Color color2 = Color.CYAN;

        GradientPaint gp = new GradientPaint(0, 100, color1, 0, 300, color2);

        g2d.setPaint(gp);
        g2d.fillRect(0, 0, 500, 500);
         g.setColor(Color.BLACK);
        Font myFont = new Font("Arial", Font.BOLD, 15); 
        g.setFont(myFont);
        g.drawString("Green=100                         Gray= 200                              Yellow= 300",30,60);
    
          bl.show(g);
          g1.show(g);
          g2.show(g);
          g3.show(g);
          
         
         
       move();
        
      for (int j=0; j<15; j++) {
          
            s[j].show(g);
        }
      
      // check for collision between ball,spikebar, and glass
     
      if (!(bl.getX() > g1.getX() + 20 || bl.getX() + 20 < g1.getX() || bl.getY() > g1.getY() + 20
                || bl.getY() + 20 < g1.getY()))
            {
                  
                System.out.println("You Scored 100");
                bl.setX(180);
                bl.setY(60);
                
            }
        
      if (!(bl.getX() > g2.getX() + 20 || bl.getX() + 20 < g2.getX() || bl.getY() > g2.getY() + 20 
                || bl.getY() + 20 < g2.getY()))
            {
                  
                System.out.println("You Scored 200");
                bl.setX(180);
                bl.setY(60);
                
            }
        
      if (!(bl.getX() > g3.getX() + 20 || bl.getX() + 20 < g3.getX() || bl.getY() > g3.getY() + 20
                || bl.getY() + 20 < g3.getY()))
            {
                  
                System.out.println("You Scored 300");
                bl.setX(180);
                bl.setY(60);
                
            }
        
      if (bl.getY()> 100){
        for (int i=1 ; i<15; i++){
      if (!(bl.getX() > s[i].getX() + 20 || bl.getX() + 20 < s[i].getX() || bl.getY() > s[i].getY() + 20 
                || bl.getY() + 20 < s[i].getY()) )
            {
                  
                System.out.println("The game is over");
//                JOptionPane.showMessageDialog(gb, "over");
     
            }
        
        }
            
      }    
            
    }




      public void rightButton()
    {
        moveRight(bl);
        
    }
     
    public void leftButton()      
     {
         moveLeft(bl);    
     }
     
    public void upButton()
     {
         moveUp(bl);
     }
     
    public void downButton()
     {
         moveDown(bl);
     }

    public void moveRight(ball bl)
    {
        int currentX = bl.getX();
        currentX+=5;
        bl.setX(currentX);
    }
     
     public void moveLeft(ball bl)
    {
        int currentX =bl.getX();
        currentX-=5;
        bl.setX(currentX);
    }
     
     public void moveUp(ball bl)
    {
        int currentY = bl.getY();
        currentY-=5;
       bl.setY(currentY);
    }
     
     public void moveDown(ball bl)
    {
        int currentY =bl.getY();
        currentY+=5;
        bl.setY(currentY);
    }

    public void keyStruck(char key)
     {
         switch (key)
         {
             case 'L':case 'l'://L will move sf3 snowfolk left 
                moveLeft(bl);
              
                break;
            case 'R':case 'r'://R will move sf3 snowfolk right 
                moveRight(bl);
                
                break;
             case 'U':case 'u'://U will move sf3 snowfolk up
                moveUp(bl);
              
                break;
             case 'D':case 'd':  //D will move sf3 snowfolk down
                moveDown(bl);
          
                break;
         }
      
     }

}