import java.util.Arrays;

public class A_sort {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String[] data= {"1","4","3","2"};
		System.out.println(Arrays.toString(data));
		Arrays.sort(data); //������Ԫ�ؽ������� ����
		System.out.println(Arrays.toString(data));
		
		byte bArr[]= {10,8,2,99};
		Arrays.sort(bArr);
		for(byte number : bArr) //������һ������number 
		{
			System.out.print(number + " "); 
		}
		System.out.println();
		
		int[] arry= new int[] {33,22,99};
		System.out.println(Arrays.toString(arry));
		
		//ʹ��binarySearchʱ��������������
		byte byteArr[] = {10,5,30,22,99};
		Arrays.sort(byteArr);
		byte searchVal =30;
		int retVal = Arrays.binarySearch(byteArr,searchVal);
		System.out.println("30�������е�λ��Ϊ��"+ retVal);
		
		//equals �Ƚ��ַ������������������Ƿ���ͬ��
		// ==     �Ƚ��������������ֵ���������������ڴ��е��׵�ַ
		/*
		 * ���ڷ��ַ���������˵��"=="��"equals"������
		 * ��������ͬ�Ķ��������Ƚ��䣬
		 * �����ڶ��ڴ���׵�ַ��������
		 * �Ƚ��������ñ����Ƿ�ָ��ͬһ������!!!!
		 */
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		System.out.println(arr1.equals(arr2));
		System.out.println(arr1==arr2);
		
		int[] arr3=arr2;
		System.out.println(arr2.equals(arr3));
		System.out.println(arr2==arr3);
	}
	
}
