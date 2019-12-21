class Student10
{
	int num=10;//非静态变量
	static int num2=20;//静态变量
}
public class StudentDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			Student10 s=new Student10();
			System.out.println(s.num);
			
			System.out.println(Student10.num2);
			System.out.println(s.num2);
	}

}
