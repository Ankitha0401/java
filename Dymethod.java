class Animal 
{
    void sound() 
    {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal 
{

    @Override
    void sound() 
    {
        System.out.println("Dog barks");
    }
}

public class Dymethod 
{

    public static void main(String[] args) 
    {

        Animal myPet = new Dog();
        Animal myPet1 = new Animal();

        myPet.sound();
        myPet1.sound();
    }
}