package corejava;

class Animal 
{
	//method
	public void display()
	{
		System.out.println("Inside Parent Class");
	}
}
//child class
class Cat extends Animal 
{
	public void sound()
	{
		System.out.println("Meow Meow...");
	}
	
}
class Kitty extends Cat
{
	public void run()
	{
		System.out.println("She Runs By Small Paws...");
	}
}
class Tester
{
	public static void main(String[] args)
	{
		Kitty c = new Kitty();//creating objects of child class
		c.display();
		c.sound();
		c.run();
	}
}
