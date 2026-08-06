class Employee
{
    int id;
    String name;

    Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    void show()
    {
        System.out.println(id + " " + name);
    }
}

class ThisDemo
{
    public static void main(String args[])
    {
        Employee e1 = new Employee(11, "Harry");

        e1.show();
    }
}