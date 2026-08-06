class Employee3
{

    static int empid = 500;

    static void emp1() 
    {
        empid++;
        System.out.println("Employee id: " + empid);
    }

    public static void main(String[] args) 
    {
        Employee3 obj = new Employee3();
        obj.emp1();
    }
}

class Employee3Sample 
{

    public static void main(String args[]) 
    {

        Employee3 obj = new Employee3();

        obj.emp1();
    }
}