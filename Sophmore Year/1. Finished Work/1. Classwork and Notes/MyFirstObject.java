public class MyFirstObject{
   //FEILDS: (Also called attributes or instance variables)
   int x;
   int y;
   
   //CONSTRUCTORS:
   public MyFirstObject(int xPoint, int yPoint){//for 2
      x = xPoint;
      y = yPoint;
   }
   public MyFirstObject(){ //for 0 
      x = 0;
      y = 0;
   }
   
   //INSTANCE METHODS:
   //Void Method: translates the point by given amount
   public void translate (int dx, int dy){
      x = x+dx;
      y = y+dy;
   }
   //Return Method: Calculates the distance to the origin of the graph
   public double distanceToOrigin (){
      double d = Math.sqrt(x*x+y*y);
      return d;
   }
      
}//Class end