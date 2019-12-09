#include<iostream>

using namespace std;

#define MAXSIZE 1000 //�����������󳤶���1000
#define OK 1
#define ERROR 0
#define TRUE 1
#define FALSE
typedef int ElemType;
typedef int Status;

//���Ա�ľ�̬����洢�ṹ
typedef struct
{
	ElemType data;
	int cur;
}Component, StaticLinkList[MAXSIZE];
//��һά����space�и����� ����һ��������
//space[0].curΪͷָ�룬��0����ʾ��ָ��
Status InitList(StaticLinkList space)
{
	int i;
	for (i = 0; i < MAXSIZE - 1; i++)
	{
		space[i].cur = i + 1;
	}
	space[MAXSIZE - 1].cur = 0;//Ŀǰ��̬����Ϊ�գ����һ��Ԫ�ص�curΪ0
	return OK;
}
//�����ÿռ�����ǿգ��򷵻ط���Ľ���±꣬���򷵻�0
int Malloc_SLL(StaticLinkList space)
{
	//��ǰ�����һ��Ԫ�ص�cur���ֵ������Ҫ���صĵ�һ�����ÿ���Ԫ�ص��±�
	int i = space[0].cur; 
	if (space[0].cur)
	{
		space[0].cur = space[i].cur;
		//����Ҫ�ó�һ��������ʹ���ˣ��������Ǿ͵ð�������һ����������������
	}
	return 0;
}
//��L�е�i��Ԫ��֮ǰ�����µ�Ԫ��e
Status ListInsert(StaticLinkList L, int i, ElemType e)
{
	int j, k, l;
	k = MAXSIZE - 1; //ע��k���������һ��Ԫ�ص��±�
	if (i<1 || i>ListLenght(L) + 1)
	{
		return ERROR;
	}
	j = Malloc_SLL(L); //��ÿ��з������±�
	if (j)
	{
		L[j].data = e; //�����ݸ�ֵ���˷�����data
		for (l = 1; l <= i - 1; ++l)
		{
			k = L[k].cur;
		}
		L[j].cur = L[k].cur; //�ѵ�i��Ԫ��֮ǰ��cur��ֵ����Ԫ�ص�cur
		L[k].cur = j;	//����Ԫ�ص��±긳ֵ����i��Ԫ��֮ǰԪ�ص�cur
		return OK;
	}
	return ERROR;
}
//ɾ����L�е�i������Ԫ��e
Status ListDelete(StaticLinkList L, int i)
{
	int j, k;
	if (i<1 || i>ListLenght(L))
	{
		return ERROR;
	}
	k = MAXSIZE - 1;
	for (i = 1; i <= i - 1; ++j)
	{
		k = L[k].cur;
	}
	j = L[k].cur;
	L[k].cur = L[j].cur;
	Free_SLL(L, j);
	return OK;
}
//���±�Ϊk�Ŀ��н����յ���������
void Free_SLL(StaticLinkList space, int k)
{
	space[k].cur = space[0].cur;	//�ѵ�һ��Ԫ��curֵ����Ҫɾ����Ԫ��cur
	space[0].cur = k;				//��Ҫɾ���ķ����±긳ֵ����һ��Ԫ�ص�cur
}
//��ʼ��������̬����L�Ѵ��ڡ��������������L������Ԫ�ظ���
int ListLenght(StaticLinkList L)
{
	int j = 0;
	int i = L[MAXSIZE - 1].cur;
	while (i)
	{
		i = L[i].cur;
		j++;
	}
	return j;
}
