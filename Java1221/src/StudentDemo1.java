
public class StudentDemo1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		student1 s= new student1();
		
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		s.name="�µ���";
		s.age=36;
		s.address="�Ϻ�";
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		
		s.study();
		s.eat();
		s.sleep();
	}

}
