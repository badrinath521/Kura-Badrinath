
abstract class House 
{
      final void buildhouse() 
    {
        constructBase();
        constructRoof();
        constructWalls();
        constructWindows();
        constructDoors();
        paintHouse();
        decorateHouse();
    }
 public abstract void decorateHouse();
 public abstract void paintHouse();
 public abstract void constructDoors();
 public abstract void constructWindows();
 public abstract void constructWalls();

    private final void constructRoof() 
    {
        System.out.println("Roof has been constructed.");
    }
    private final void constructBase() 
    {
        System.out.println("Base has been constructed.");
    }
}
 class ConcreteWallHouse extends House 
{
	 public void decorateHouse() 
	 {
        System.out.println("decorating concrete wall house");
     }
      
      public void paintHouse() 
      {
    	  System.out.println("painting concrete wall house");
      }
      public void constructDoors() 
      {
            System.out.println("constructing doors for concrete wall house");
      }
      
      public void constructWindows() 
      {
            System.out.println("constructing windows for concrete wall house");
      }
      public void constructWalls() 
      {
            System.out.println("construct walls for concrete wall house");
      }
}

  class GlassWallHouse extends House 
{
    public void decorateHouse() 
    {
        System.out.println("Decorating Glass Wall House");
    }
 
   
    public void paintHouse() 
    {
        System.out.println("Painting Glass Wall House");
    }
 
    
    public void constructDoors() 
    {
        System.out.println("Constructing Doors for Glass Wall House");
    }
 
    
    public void constructWindows() 
    {
        System.out.println("Constructing Windows for Glass Wall House");
    }
 
   
    public void constructWalls() 
    {
        System.out.println("Constructing Glass Wall for my House");
    }
}

  
public class Template 
{
      public static void main(String[] args) 
      {
 
            System.out.println("going to build concrete wall house");
 
            House house = new ConcreteWallHouse();
            house.buildhouse();
 
            System.out.println("successfully constructed concrete wall house");
 
            System.out.println("---------");
 
            System.out.println("going to build glasswallhouse");
 
            house = new GlassWallHouse();
            house.buildhouse();
 
            System.out.println("successfully constructed glasswallhouse");
      }
}

