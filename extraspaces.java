public class extraspaces 
{
    public static void main (String args[])
    {
        String str="        abc    def   gh       ij     ";

        System.out.println(str.replaceAll("\\s+", " ").trim());
    }
}

