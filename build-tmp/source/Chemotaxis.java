import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {


Bacteria[] virus, germ;
public void setup()   
{    
  size(500, 500);
  background(255);
  virus = new Bacteria[10];
  germ = new Bacteria[10];
  for(int i = 0; i < virus.length; i++)
  {
  	virus[i] = new Bacteria();
  	germ[i] = new Bacteria();
  }
  //frameRate(5);
  //initialize bacteria variables here
}   
public void draw()   
{    
  background(255);
 for(int i = 0; i < virus.length; i++)
  {
    virus[i].move();
    virus[i].show(); 
    germ[i].jump();
    germ[i].show();
  }

  //move and show the bacteria
}  
class Bacteria    
{     
  int myX, myY, colors1, colors2, colors3;
  Bacteria()
  {
    myX = (int)(Math.random()*250)+125;
    myY = (int)(Math.random()*250)+125;
    colors1 = (int)(Math.random()*256);
    colors2 = (int)(Math.random()*256);
    colors3 = (int)(Math.random()*256);
  }
  public void move()
  {
    myX = myX + (int)(Math.random()*7)-3;
    myY = myY + (int)(Math.random()*7)-3;
  }
  public void show()
  {
    fill(colors1, colors2, colors3);
    ellipse(myX, myY, 10, 10);
  }
  public void jump()
  {
  	 myX = (int)(Math.random()*501);
    myY = (int)(Math.random()*501);
  }
}    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
