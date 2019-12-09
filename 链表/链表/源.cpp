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
typedef struct Node *LinkList;//定义LinkList
//初始条件：顺序栈线性表L已经存在，操作结果：将L重置为空表
Status ClearList(LinkList *L)
{
	LinkList p, q;
	p = (*L)->next;		//*p指向第一个结点
	while (p)			//从表头循环到表尾，到表尾即为假
	{
		q = p->next;
		free(p);
		p = q;
	}
	(*L)->next = NULL;	//头结点指针为空
	return OK;
}
int main()
{

	return 0;
}


