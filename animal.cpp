/************************************************************
  Copyright (C), ��1604-2  20163791  Ҧ��ͤ
  FileName: animal.cpp
  Author: yaojinting      Version:1.1    Date:2019.5.31
  Description: �������    // ģ������     
  History: none        // ��ʷ�޸ļ�¼

***********************************************************/

#include "animal.h"

animal::animal(string m,int n)
{
	name=m;
	age=n;
}

void animal:: show()
{
	cout<<"Animal, "<<name<<", "<<age;
}

fish::fish(string m,int n,int s):animal(m,n)
{
	velocity=s;
}

/*fish�������*/
void fish:: show()
{
   cout<<"Fish, "<<name<<", "
	   <<age<<", "<<velocity<<endl;
}

beast::beast(string m,int n,int a):animal(m,n)
{
	appetite=a;
}

/*beast�������*/
void beast::show()
{
	cout<<"Beast, "<<name<<", "
		<<age<<", "<<appetite<<endl;
}

amphibious::amphibious(string m,int n,int s,int a ):
animal(m,n),fish(m,n,s),beast(m,n,a)
{

}

/*amphibious�������*/
void amphibious::show()
{
	cout<<"Fish, "<<name<<", "
		<<age<<", "<<velocity<<endl;
	cout<<"Beast, "<<name<<", "
		<<age<<", "<<appetite<<endl;
}
