import java.util.Arrays;

public class A_sort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] data= {"1","4","3","2"};
		System.out.println(Arrays.toString(data));
		Arrays.sort(data); //对数组元素进行排序 升序
		System.out.println(Arrays.toString(data));
		
		byte bArr[]= {10,8,2,99};
		Arrays.sort(bArr);
		for(byte number : bArr) //创建了一个变量number 
		{
			System.out.print(number + " "); 
		}
		System.out.println();
		
		int[] arry= new int[] {33,22,99};
		System.out.println(Arrays.toString(arry));
		
		//使用binarySearch时数组必须是升序的
		byte byteArr[] = {10,5,30,22,99};
		Arrays.sort(byteArr);
		byte searchVal =30;
		int retVal = Arrays.binarySearch(byteArr,searchVal);
		System.out.println("30在数组中的位置为："+ retVal);
		
		//equals 比较字符串中所包含的内容是否相同。
		// ==     比较两个变量本身的值，即两个对象在内存中的首地址
		/*
		 * 对于非字符串变量来说，"=="和"equals"方法的
		 * 作用是相同的都是用来比较其，
		 * 对象在堆内存的首地址，即用来
		 * 比较两个引用变量是否指向同一个对象!!!!
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
