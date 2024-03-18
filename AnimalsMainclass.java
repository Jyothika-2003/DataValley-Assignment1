class Animal
{
    public void makeSound(){
	    System.out.println("Animal Sounds");
	 }
}
class Dog extends Animal
{
    public void makeSound(){
	    System.out.println("Dog Sounds");
	 }
}
class Cat extends Animal
{
    public void makeSound(){
	    System.out.println("Cat Sounds");
	 }
}
class Mainclass
{
    public static void main(Strings args[])
    {
        Animal dog = new Dog();
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
    }
}
