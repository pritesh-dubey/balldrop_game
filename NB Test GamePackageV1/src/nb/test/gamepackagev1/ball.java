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
public class ball {
    int x;
    int y;
    int width, height;
    
    public ball(int x, int y)
    {
        this.x=x;
        this.y=y;
        this.width=10;
        this.height=10;
    }       
    
    public void show (Graphics g)
    {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 20, 20);
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
}
