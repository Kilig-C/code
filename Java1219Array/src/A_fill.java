import java.util.Arrays;

public class A_fill {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//Arrays��λ��java.util���У������˲�������ĸ��ַ���

		int[] data = {1,2,3,4};
		Arrays.fill(data,9); //��ָ��Ԫ�������������(���滻��������ԭ����Ԫ�أ�
		System.out.println(Arrays.toString(data));//����������ַ�����ʽ
		
		Arrays.fill(data,1,3,88);//������Ĳ���Ԫ�����һ��ֵ,����ʼλ�õ�����λ�ã�ȡͷ��ȡβ
		System.out.println(Arrays.toString(data));//����������ַ�����ʽ
	}

}
