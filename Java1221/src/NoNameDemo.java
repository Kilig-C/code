
public class NoNameDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//�����ֵĵ���
		Student s=new Student();
		s.show();
		s.show();
		System.out.println("-----------");
		
		//��������
		//new Student();
		//����������÷���
		new Student().show();
		new Student().show(); //������ʵ�����´�����һ���µĶ���
	    System.out.println("-----------");
	    
	    //����������Ϊʵ�ʲ�������
	    StudentDemo sd= new StudentDemo();
	    //Student ss=new Student();
	    //sd.method(ss); //�����s��һ��ʵ�ʲ���
	    //��������
	    sd.method(new Student());
	    
	    //����һ��
	    new StudentDemo().method(new Student());
	
	}
}
