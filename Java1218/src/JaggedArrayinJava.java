
public class JaggedArrayinJava {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//不规则的数组
		int arr[][]=new int [5][];
		for(int i=0;i<arr.length;++i)
		{
			arr[i]=new int [i+1];
		}
		int count=0;
		for(int i=0;i<arr.length;++i)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=count++;
			}
		 } 
		System.out.println("Contents of 2D Jagged Array");
		for(int i=0;i<arr.length;++i)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
