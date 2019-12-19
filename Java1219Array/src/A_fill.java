import java.util.Arrays;

public class A_fill {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//Arrays类位于java.util包中，包含了操作数组的各种方法

		int[] data = {1,2,3,4};
		Arrays.fill(data,9); //用指定元素填充整个数组(会替换掉数组中原来的元素）
		System.out.println(Arrays.toString(data));//返回数组的字符串形式
		
		Arrays.fill(data,1,3,88);//对数组的部分元素填充一个值,从起始位置到结束位置，取头不取尾
		System.out.println(Arrays.toString(data));//返回数组的字符串形式
	}

}
