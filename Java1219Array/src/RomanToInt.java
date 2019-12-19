import java.util.Scanner;

/*
 * 
给定一个罗马数字 sss，将罗马数字转换成整数。

如罗马数字I，II，III，IV，V分别代表数字 1,2,3,4,5。

首先要来了解一下罗马数字表示法，基本字符有 7 个：I、V、X、L、C、D、M，分别表示 1、5、10、50、100、500、1000。

在构成数字的时候，有下列规则：

1、相同的数字连写，所表示的数等于这些数字相加得到的数，如：III =3；

2、小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数， 如：VIII =8；XII =12；

3、小的数字，（限于Ⅰ、X和C）在大的数字的左边，所表示的数等于大数减小数得到的数，如：IV =4；IX =9；

4、正常使用时，连写的数字重复不得超过三次。

例如，罗马数字2写做丨I ,即为两个并列的1, 12写做XII ,即为X + II. 27写做XXVII,即为 XX + V + II.
通常惲况下，罗马数字中小的数字在大的数字的右边，但也存在特例，
例如4不写做IIII,而是 IV.数字1在数字5的左边，所表示的数等于大数5减小数1得到的数值4 
同样地，数字9表 示为IX。这个特殊的规则只适用于以下六种情况：
I可以放在V (5)和X (10)的左边，来表示4和9。
X可以放在L (50)和C (100)的左边，来表示40和90。
C可以放在D (500)和M (1000)的左边，来表示400和900。
给定一个罗马数字，将其转换成整数。输入确保在1到3999的范围内。
 */

public class RomanToInt {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);//新建一个读取标准输入（键盘）的扫描器对象
		
		String s=in.nextLine(); //输入字符串
		//以上这一行把键盘输入的一行字符串读取到变量 s 中
		System.out.println("转化为整数为："+romanToInt(s));//函数调用
	}
	
	public static int romanToInt(String s)
	{
		char[] ch=s.toCharArray(); //将字符串转化为新的字符数组
		int result=0; //此变量用来存储将罗马数组转换成整数的值
		for(int i=0;i<ch.length;++i)
		{
			switch(ch[i])
			{
			case 'M': result+=1000;break; //M代表1000
			case 'D': result+=500;break; //D代表500
			case 'L': result+=50;break; //L代表50
			case 'V': result+=5;break; //V代表5
			case 'I':  //I代表1
				if(i+1 < ch.length&&(ch[i+1]=='V'||ch[i+1]=='X'))//X代表10
				{
					result-=1;//判断I的下一个字符如果为V或者X表示减1为4或者9 
				}
				else
				{
					result+=1;; //当下一个字符无或者不为V或者X的话则代表加1
				}
				break;
			case 'X': //X代表10
				if(i+1 < ch.length&&(ch[i+1]=='L'||ch[i+1]=='C'))//C代表100 L代表50
				{
					result-=10;//判断X的下一个字符如果为L或者C表示减10为40或者90 
				}
				else
				{
					result+=10; //当下一个字符无或者不为V或者X的话则代表加10
				}
				break;
			case 'C': //C代表100
				if(i+1 < ch.length&&(ch[i+1]=='D'||ch[i+1]=='M'))//D代表500 M代表1000
				{
					result-=100;//判断X的下一个字符如果为D或者M表示减10为400或者900
				}
				else
				{
					result+=10; //当下一个字符无或者不为V或者X的话则代表加100
				}
				break;
			}	
		}
		return result; //返回的为罗马数字转化为的整数
	}
}


