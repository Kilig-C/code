#include<iostream>

using namespace std;

#define OK 1
#define ERROR 0
#define TRUE  1
#define FALSE 0
typedef int ElemType;
typedef int Status;
typedef struct Node
{
	ElemType data;
	struct Node *next;
}Node;
typedef struct Node *LinkList;//����LinkList
//��ʼ������˳��ջ���Ա�L�Ѿ����ڣ������������L����Ϊ�ձ�
Status ClearList(LinkList *L)
{
	LinkList p, q;
	p = (*L)->next;		//*pָ���һ�����
	while (p)			//�ӱ�ͷѭ������β������β��Ϊ��
	{
		q = p->next;
		free(p);
		p = q;
	}
	(*L)->next = NULL;	//ͷ���ָ��Ϊ��
	return OK;
}
int main()
{

	return 0;
}


