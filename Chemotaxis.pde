
Bacteria[] virus, germ;
void setup()   
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
void draw()   
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
  void move()
  {
    myX = myX + (int)(Math.random()*7)-3;
    myY = myY + (int)(Math.random()*7)-3;
  }
  void show()
  {
    fill(colors1, colors2, colors3);
    ellipse(myX, myY, 10, 10);
  }
  void jump()
  {
  	 myX = (int)(Math.random()*501);
    myY = (int)(Math.random()*501);
  }
}    