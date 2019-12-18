import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//Arrays类位于java.util包中，包含了操作数组的各种方法

		//用指定元素填充整个数组(会替换掉数组中原来的元素）

		int[] data = {1,2,3,4};
		Arrays.fill(data,9);
		System.out.println(Arrays.toString(data));
	}

}
