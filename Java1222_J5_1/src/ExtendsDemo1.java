class Phone
{
	public void call(String name)
	{
		System.out.println("��"+name+"��绰");
	}
}
class NewPhone extends Phone
{
	public void call(String name)
	{
		super.call(name); 
		System.out.println("�����°���");
	}
}

public class ExtendsDemo1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			NewPhone np=new NewPhone();
			np.call("С��");
	}

}
