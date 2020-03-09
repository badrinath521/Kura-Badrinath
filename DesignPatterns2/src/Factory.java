import java.io.*;

 interface GeometricShape 
{
    void draw();
}

 class Line implements GeometricShape 
{
    public void draw() 
    {
        System.out.println("Line Drawn.");
    }
}
 class Rectangle implements GeometricShape 
{
  
    public void draw() 
    {
        System.out.println("Rectangle is drawn.");
    }
}
 class Circle implements GeometricShape
{
    public void draw() 
    {
        System.out.println("Circle is drawn.");
    }
}
 enum ShapeType 
{
    LINE,
    CIRCLE,
    RECTANGLE,
    TRIANGLE
}

abstract class ShapeFactory 
{
    public static GeometricShape getShape(ShapeType name) 
    {
        GeometricShape shape = null;
        switch (name) 
        {
            case LINE:
                shape = new Line();
                break;
            case CIRCLE:
                shape = new Circle();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
        }
        return shape;
    }
}

public class Factory 
{
    public static void main(String[] args)
    {
        
        GeometricShape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        if (circle != null) 
        {
            circle.draw();
        } 
        else 
        {
            System.out.println("This shape can not be drawn.");
        }
        
        GeometricShape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
        if (triangle != null) 
        {
            triangle.draw();
        } 
        else 
        {
            System.out.println("This shape can't be drawn");
        }
    }
}
