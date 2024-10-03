public class Geometry {

    public double radius;
    public double length;
    public double width;
    public double base;
    public double height;
    public boolean isTriangle;

    public void areaCircle(double radius){
        
        double areaCircle = 3.142*(Math.pow(radius, 2));
        System.out.println("Area of Circle is " + areaCircle);
    }

    public void areaRectangle(double length, double width){

        double areaRectangle = length*width;
        System.out.println("Area of Rectangle is " + areaRectangle);
    }

    public void areaTriangle(double base, double height){
        double areaTriangle = 0.5 * base * height;
        System.out.println("Area of Triangle is " + areaTriangle);
    }

    public static void main(String[] args) {
        double radius = 4.5;
        double length = 5;
        double width = 10.4;
        double base = 20;
        double height = 7.5;

        Geometry geo = new Geometry();

        geo.areaCircle(radius);
        geo.areaRectangle(length, width);
        geo.areaTriangle(base, height);


    }
}
