class Student3
{
	private String name; //��Ա����
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName(String name) //�ֲ�����
	{
		name =name; //�������Ǿֲ�����
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		age = age;
	}
}
public class Student2 {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			Student3 s=new Student3();
			s.setName("�����");
			s.setAge(21);
			System.out.println(s.getName()+"---"+s.getAge());
	}

}
