class Animal
{
	void eat()
	{
		System.out.println("animal : eat");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("dog : eat");
	}
	void eatTest()
	{
		this.eat(); //this 调用自己的方法
		super.eat(); //super 调用父类方法
	}
}
public class Animal_Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			Animal a=new Animal();
			a.eat();
			Dog d=new Dog();
			d.eatTest();
	}

}
