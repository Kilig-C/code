import java.util.Scanner;

public class CharacterCode {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int bigCount = 0; //保存大写字母个数
		int smallCount = 0; //保存小写字母个数
		int numberCount = 0; //保存数字个数
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line=sc.nextLine();
		//把字符串转换为字符数组
		char[] chs = line.toCharArray();
		//遍历字符数组获取每一个字符
		for(int x=0;x<chs.length;x++)
		{
			char ch = chs[x];
			if(Character.isUpperCase(ch))
			{
				bigCount++;
			}
			else if(Character.isLowerCase(ch))
			{
				smallCount++;
			}
			else if(Character.isDigit(ch))
			{
				numberCount++;
			}
		}
		System.out.println("大写字母："+ bigCount +"个");
		System.out.println("小写字母："+ smallCount + "个");
		System.out.println("数字字符："+ numberCount +  "个");
	}

}
