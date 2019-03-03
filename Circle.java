import java.awt.*;

public class Circle
{
  private int x;
  private int y;
  private int r;
  private Color c;
  
  public Circle(int x, int y, int r, Color c)
  {
    this.x = x;
    this.y = y;
    this.r = r;
    this.c = c;
  }
  
  public Circle(Circle other)
  {
    this.x = other.x;
    this.y = other.y;
    this.r = other.r;
    this.c = other.c;
  }
  
  public void draw(Graphics g, int x, int y)
  {
    this.x = x;
    this.y = y;
    g.fillOval(this.x, this.y, this.r * 2, this.r * 2);
    g.setColor(this.c);
  }
  
  public void draw(Graphics g)
  {
    g.drawOval(this.x, this.y, this.r * 2, this.r * 2);
  }
}