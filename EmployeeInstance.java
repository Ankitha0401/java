class EmployeeInstance 
{

    static int empid = 500;

    static void emp1() 
    {
        empid++;
        System.out.println("Employee id: " + empid);
    }
}

class SampleInstance 
{

    public static void main(String args[]) 
    {

        EmployeeInstance.emp1();
        EmployeeInstance.emp1();
        EmployeeInstance.emp1();
        EmployeeInstance.emp1();
        EmployeeInstance.emp1();
        EmployeeInstance.emp1();
    }
}