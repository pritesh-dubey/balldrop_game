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
public class spikebar {
   int x,y;
   int width, height;
    
    public spikebar(int x, int y)
    {
        this.x=x;
        this.y=y;
        this.width= 10;
        this.height=10;
    }
    
    public void show(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillRect(x+40,y+100, 70, 10);
        g.setColor(Color.BLACK);   
        g.fillOval(x+45, y+95, 5, 5);
        g.fillOval(x+55, y+95, 5, 5);
        g.fillOval(x+65, y+95, 5, 5);
        g.fillOval(x+75, y+95, 5, 5);
        g.fillOval(x+85, y+95, 5, 5);
        g.fillOval(x+95, y+95, 5, 5);
        
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
