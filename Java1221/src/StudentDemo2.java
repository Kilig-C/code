class Student10
{
	int num=10;//�Ǿ�̬����
	static int num2=20;//��̬����
}
public class StudentDemo2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			Student10 s=new Student10();
			System.out.println(s.num);
			
			System.out.println(Student10.num2);
			System.out.println(s.num2);
	}

}
