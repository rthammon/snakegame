import javax.swing.*;
import java.awt.event.*; 
import java.util.*; 
import java.awt.*;

public class Game implements World 
{
  Snake snake; 
  public Game() 
  {
    this.snake = new Snake("Larry");  
  }
  public void update() 
  {
    this.snake.move(); 
  }
  public void draw(Graphics g) 
  {
    this.snake.draw(g); 
  }
  public void mousePressed(MouseEvent e) 
  { 
  
  } 
  public void keyPressed(KeyEvent e) 
  {
    int code = e.getKeyCode();
    if (code == 37) 
    { // left
      this.snake.face("West");
    }
    else if (code == 38)
    { // up
      this.snake.face("North");
    }
    else if (code == 40)
    { // down
      this.snake.face("South");
    }
    else if (code == 39)
    {
      this.snake.face("East");
      // right
    }
    else
    {
      this.snake.face("Nowhere");
    }
    
   
  
  }
  public static void main(String[] args) 
  {
    BigBang game = new BigBang(200, new Game());  

    JFrame frame = new JFrame("Snake"); 

    frame.getContentPane().add( game ); 
    game.addMouseListener( game ); 
    frame.addKeyListener(game);
    frame.setVisible(true); 
    frame.setSize(400, 400); 
    //frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
    game.start(); 
  }
  public boolean hasEnded() 
  {
    return false; // never!! 
  }
}