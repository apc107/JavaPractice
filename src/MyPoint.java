public class MyPoint {
    private int x, y; 
    public static void main (String args[]) {
       MyPoint start, end;
       start = new MyPoint ();   // Create Object
       end = new MyPoint ();
       start.x = 10;
       start.y = 10; 
       end.x = 20;
       end.y = 30; 
       System.out.println("Start Point = X: " + start.x + " Y: " + start.y);
       System.out.println("End Point = X: " + end.x + " Y: " + end.y);   
       MyPoint stray; 
       stray = end;   // stray, end is reference 
       System.out.println("End Point = X: " + end.x + " Y: " + end.y);
       System.out.println( "Stray Point = X: " + stray.x + " Y: " + stray.y); 
       stray.x = 100;    stray.y  = 50;  
       System.out.println("End Point = X: " + end.x + " Y: " + end.y);    
       System.out.println( "Stray Point = X: " + stray.x + " Y: " + stray.y);    
       start.x = 200;    start.y = 250; 
       System.out.println("Start Point = X: " + start.x + " Y: " + start.y);   
       System.out.println( "End Point = X: " + end.x + " Y: " + end.y);  
  }
}