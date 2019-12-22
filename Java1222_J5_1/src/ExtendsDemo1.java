class Phone
{
	public void call(String name)
	{
		System.out.println("给"+name+"打电话");
	}
}
class NewPhone extends Phone
{
	public void call(String name)
	{
		super.call(name); 
		System.out.println("可以下班了");
	}
}

public class ExtendsDemo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			NewPhone np=new NewPhone();
			np.call("小青");
	}

}
