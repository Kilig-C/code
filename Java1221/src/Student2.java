class Student3
{
	private String name; //成员变量
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName(String name) //局部变量
	{
		name =name; //两个都是局部变量
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
		// TODO 自动生成的方法存根
			Student3 s=new Student3();
			s.setName("晨哥哥");
			s.setAge(21);
			System.out.println(s.getName()+"---"+s.getAge());
	}

}
