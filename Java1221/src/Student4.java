class Student5
{
	private String name; //��Ա����
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName(String name1) //�ֲ�����
	{
		name =name1; //��߳�Ա���� �ұ߾ֲ�
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age1)
	{
		age = age1;
	}
}
public class Student4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Student5 s=new Student5();
		s.setName("�����");
		s.setAge(21);
		System.out.println(s.getName()+"---"+s.getAge());
	}

}
