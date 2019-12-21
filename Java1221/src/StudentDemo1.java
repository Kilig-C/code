
public class StudentDemo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		student1 s= new student1();
		
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		s.name="陈道明";
		s.age=36;
		s.address="上海";
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		
		s.study();
		s.eat();
		s.sleep();
	}

}
