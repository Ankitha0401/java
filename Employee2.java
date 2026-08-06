class Employee2 
{

    static int empid = 500;

    static void emp1() 
    {
        System.out.println("From emp1 method");
        System.out.println("Employee id: " + empid);
        empid++;
    }

    public void emp2() 
    {
        System.out.println("From emp2 method");
        System.out.println("Employee id: " + empid);
    }
}

class SampleEmployee2 
{

    public static void main(String args[]) 
    {

        Employee2 obj = new Employee2();

        obj.emp1();
        obj.emp2();
    }
}