import java.util.ArrayList;
import java.awt.*;

public class Snake 
{
  Circle head;
  ArrayList<Circle> body;
  private int RADIUS = 15;
  
  private String name;
  private int x, y; 
  private String direction = "Nowhere";
  
  public void face(String direction)
  {
    this.direction = direction;
  }
    
  public Snake(String name) 
  {
    this.name = name;  
    this.x = 120; 
    this.y = 70;
    this.direction = "Nowhere";
    this.head = new Circle(this.x, this.y, RADIUS, Color.BLUE);
    this.body = new ArrayList<Circle>();
    this.body.add(new Circle(this.x + 2 * RADIUS, this.y - 0 * RADIUS, RADIUS, Color.RED));
    this.body.add(new Circle(this.x + 4 * RADIUS, this.y - 0 * RADIUS, RADIUS, Color.RED));
    this.body.add(new Circle(this.x + 6 * RADIUS, this.y - 0 * RADIUS, RADIUS, Color.RED));
    this.body.add(new Circle(this.x + 6 * RADIUS, this.y + 2 * RADIUS, RADIUS, Color.RED));
    this.body.add(new Circle(this.x + 6 * RADIUS, this.y + 4 * RADIUS, RADIUS, Color.RED));
    this.body.add(new Circle(this.x + 8 * RADIUS, this.y + 4 * RADIUS, RADIUS, Color.RED));
    this.body.add(new Circle(this.x + 8 * RADIUS, this.y + 6 * RADIUS, RADIUS, Color.RED));
    this.body.add(new Circle(this.x + 8 * RADIUS, this.y + 8 * RADIUS, RADIUS, Color.RED));
    this.body.add(new Circle(this.x + 6 * RADIUS, this.y + 8 * RADIUS, RADIUS, Color.RED));
    this.body.add(new Circle(this.x + 4 * RADIUS, this.y + 8 * RADIUS, RADIUS, Color.RED));
    this.body.add(new Circle(this.x + 2 * RADIUS, this.y + 8 * RADIUS, RADIUS, Color.RED));
    this.body.add(new Circle(this.x + 2 * RADIUS, this.y + 6 * RADIUS, RADIUS, Color.RED));
   
  }
  public void draw(Graphics g) 
  {
    g.drawString(name, this.x, this.y);
    this.head.draw(g, this.x, this.y);
    for (Circle c: this.body)
    {
      c.draw(g);
    }
  }
  public void move() {
    if (this.direction.equals("Nowhere"))
    {
    }
    else
    {
      body.add(0, new Circle(this.head));
      body.remove(body.size() - 1);
    }
    
    if (this.direction.equals("East")) this.x += 2 * this.RADIUS;
    if (this.direction.equals("West")) this.x -= 2 * this.RADIUS;
    if (this.direction.equals("North")) this.y -= 2 * this.RADIUS;
    if (this.direction.equals("South")) this.y += 2 * this.RADIUS;
    
  }
}