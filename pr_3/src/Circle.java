public class Circle extends Shape
{
    protected double radius;

    public double getArea()
    {
        return (3.14*radius*radius);
    }
    public double getPerimeter()
    {
        return (2*3.14*radius);
    }
    public String toString()
    {
        return ("Area: " + getArea() + " Perimeter: " +getPerimeter());
    }

    public Circle(){};
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius= radius;
        this.color= color;
        this.filled = filled;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
}
