class Student6
{
	private String name; //��Ա����
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName(String name) //�ֲ�����
	{
		this.name =name; //��߳�Ա���� �ұ߾ֲ�
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			Student6 s=new Student6();
			s.setName("��ͷǿ");
			s.setAge(28);
			System.out.println(s.getName()+"----"+s.getAge());
	}
	

}
