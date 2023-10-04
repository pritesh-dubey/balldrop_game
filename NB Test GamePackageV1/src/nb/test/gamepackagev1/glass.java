/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nb.test.gamepackagev1;
import java.awt.*;

/**
 *
 * @author lenovo
 */
public class glass {
     private int x;
    private int y = 30;
   private Color gcolor = Color.BLACK;
   int width, height;
    
    public glass(int x, int y, Color gcolor)
    {
        this.x=x;
        this.y=y;
        this.gcolor= gcolor;
        this.width= 12;
        this.height=10;
        
    }       
    
    public void show (Graphics g)
    {
        g.setColor(gcolor );
        g.fillRect(x,y,5,50);
        g.fillRect(x,y+50,55,5);
        g.fillRect(x+50,y,5,50);
       
    }
    
    public int getX()
    {
        return x;
    }
    
    public void setX(int newX)
    {
        x = newX;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void setY(int newY)
    {
        y = newY;
    }
    
     public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
/**
 *
 * @author lenovo
 */

    
}
