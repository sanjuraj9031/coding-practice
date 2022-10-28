public class areaa {
    static double area(double radius)
    {
        return Math.PI*radius*radius;
    }

    static double area(double l,double b)
    {
        return l*b;
    }

    public static void main(String args[])
    {
        System.out.println(area(15));
    }
}
