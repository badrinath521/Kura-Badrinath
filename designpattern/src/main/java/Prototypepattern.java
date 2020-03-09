import java.util.HashMap; 
import java.util.Map; 
 abstract class Color implements Cloneable 
{
    protected String colorName; 
    abstract void addColor(); 
    public Object clone() 
    { 
        Object clone = null; 
        try 
        { 
            clone = super.clone(); 
        }  
        catch (CloneNotSupportedException e)  
        { 
            e.printStackTrace(); 
        } 
        return clone; 
    } 
} 
class blackColor extends Color 
{ 
    public blackColor()  
    { 
        this.colorName = "black"; 
    } 
   void addColor()  
    { 
        System.out.println("Black color is added"); 
    } 
} 
class whiteColor extends Color
{ 
    public whiteColor() 
    { 
        this.colorName = "white"; 
    }
    void addColor()  
    { 
        System.out.println("white color  is added"); 
    } 
} 
class ColorStore
{ 
    private static Map<String, Color> colorMap = new HashMap<String, Color>();  
    static 
    { 
        colorMap.put("black", new blackColor()); 
        colorMap.put("white", new whiteColor()); 
    } 
    public static Color getColor(String colorName) 
    { 
        return (Color) colorMap.get(colorName).clone(); 
    }
}
class Prototypepattern 
{ 
    public static void main (String[] args) 
    { 
        ColorStore.getColor("black").addColor(); 
        ColorStore.getColor("white").addColor(); 
        ColorStore.getColor("white").addColor(); 
        ColorStore.getColor("black").addColor(); 
    } 
} 
