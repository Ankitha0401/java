class LocalVariables 
{

    public void show() 
    {
        int a = 10;
        System.out.println("Inside show method, a = " + a);
    }

    public void display() 
    {
        int b = 20;
        System.out.println("Inside display method, b = " + b);

        // System.out.println("a = " + a); 
    }

    public static void main(String[] args) 
    {
        LocalVariables obj = new LocalVariables();

        obj.show();
        obj.display();
    }
}