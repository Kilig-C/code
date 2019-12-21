class Student6
{
	private String name; //成员变量
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName(String name) //局部变量
	{
		this.name =name; //左边成员变量 右边局部
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
		// TODO 自动生成的方法存根
			Student6 s=new Student6();
			s.setName("光头强");
			s.setAge(28);
			System.out.println(s.getName()+"----"+s.getAge());
	}
	

}
