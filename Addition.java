class Addition 
{

    void Sum(int a, int b) 
    {
        System.out.println(a + b);
    }

    void Sum(int a, int b, int c) 
    {
        System.out.println(a + b + c);
    }

    void Sum(float a, float b)
    {
        System.out.println(a + b);
    }
}

class Methodload 
{

    public static void main(String args[]) 
    {

        Addition obj = new Addition();

        obj.Sum(10, 20);
        obj.Sum(10, 20, 30);
        obj.Sum(10.05f, 15.20f);
    }
}
