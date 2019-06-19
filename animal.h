/*************************************************
  Copyright (C), ��1604-2  20163791  Ҧ��ͤ
  File name: animal     // �ļ���
  Author: yaojinting      Version:1.1    Date:2019.5.31 // ���ߡ��汾���������
  Description: �������   // ������ϸ˵���˳����ļ���ɵ���Ҫ���ܣ�������ģ��
                  // �����Ľӿڣ����ֵ��ȡֵ��Χ�����弰������Ŀ�
                  // �ơ�˳�򡢶����������ȹ�ϵ
  Others: none        // �������ݵ�˵��
  History: none       // �޸���ʷ��¼�б�ÿ���޸ļ�¼Ӧ�����޸����ڡ��޸�
                  // �߼��޸����ݼ��� 

*************************************************/

#pragma once
#include<string>
#include<iostream>
using namespace std;

/*����animal��*/
class animal
{
/*�ܱ�����Ա*/
protected:
	string name;
	int age;
/*���г�Ա*/
public:
	animal();
	animal(string m,int n);
	void show();
};

/*����fish��*/
class fish:virtual public animal
{
/*�ܱ�����Ա*/
protected:
	int velocity;
/*���г�Ա*/
public:
	fish();
	fish(string m,int n,int s);
	void show();
};

/*����beast��*/
class beast:virtual public animal
{
/*�ܱ�����Ա*/
protected:
	int appetite;
/*���г�Ա*/
public:
	beast();
	beast(string m,int n,int a);
	void show();
};

/*����anphibious��*/
class amphibious:public fish,public beast
{
/*���г�Ա*/
public:
	amphibious(string m,int n,int s,int a );
	void show();
};