public class SCString 
{
    public static void main (String args[])
    {
        String str="a!B@c#1$2%3";

        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
    }
}