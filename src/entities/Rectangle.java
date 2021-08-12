package entities;

public class Rectangle {

    public double Width;
    public double Height;

    public double area(){
        return Width * Height;
    }

    public double perimeter(){
        return 2.0 * (Width + Height);
    }

    public double diagonal(){
        return Math.sqrt( Math.pow(Width,2.0) + Math.pow(Height,2.0));
    }



}
