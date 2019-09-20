#include<stdio.h>

int main()
{
	int num[10] = {0};
	int time1 = 18;
	int time2 = 00;
	int T1, T2, T, t, n1 = 0, n2 = 0;
	T1 = 18;
	T2 = 45;
	T = 285;
	t = T1 + T2;
	int j = 0;
	n1 = T / t;
	n2 = T%t;
		while (n1<n2)
		{
			t++;
			n2 = n2 - n1;
		}
		for (int k = 0; k<n1;k++)
		{
			num[k] = t;
		}
		for (int k = 1; k <= n2&&j<n1;)
		{
			num[j] += k;
			n2--;
			j++;
		}
	for (int i = n1-1,j=1; 0 <= i; i--,j++)
	{
		printf("到达码头时间为：%d : %d\t\t第 %d 次停靠时间为：%d分钟\n", time1, time2, j, num[i] - 45);
		time2 += num[i]-45;
		if (time2 >= 60)
		{
			time2 -= 60;
			time1++;
		}
		printf("离开码头时间为：%d : %d\n", time1, time2);
		time2 += 45;
		if (time2 >= 60)
		{
			time2 -= 60;
			time1++;
		}
	}
	return 0;
}