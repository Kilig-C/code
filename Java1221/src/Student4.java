class Student5
{
	private String name; //成员变量
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName(String name1) //局部变量
	{
		name =name1; //左边成员变量 右边局部
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
		// TODO 自动生成的方法存根
		Student5 s=new Student5();
		s.setName("晨哥哥");
		s.setAge(21);
		System.out.println(s.getName()+"---"+s.getAge());
	}

}
