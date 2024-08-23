package d0823;

interface Action{
	public void eat();
}

class Animal implements Action{
	public void eat() {
		
	}
}
class Cat extends Animal{
	
}
class Dog extends Animal{
	
}
class Human implements Action{

	@Override
	public void eat() {		
	}
	
}
public class InterfaceTest {

	public static void main(String[] args) {
		
		Action[] actions = new Action[3];
		actions[0] =new Cat();
		actions[1] =new Dog();
		actions[2] =new Human();
		 
	}
}
