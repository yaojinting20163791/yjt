/*************************************************
  Copyright (C), 信1604-2  20163791  姚金亭
  File name: animal     // 文件名
  Author: yaojinting      Version:1.1    Date:2019.5.31 // 作者、版本及完成日期
  Description: 动物编码   // 用于详细说明此程序文件完成的主要功能，与其他模块
                  // 或函数的接口，输出值、取值范围、含义及参数间的控
                  // 制、顺序、独立或依赖等关系
  Others: none        // 其它内容的说明
  History: none       // 修改历史记录列表，每条修改记录应包括修改日期、修改
                  // 者及修改内容简述 

*************************************************/

#pragma once
#include<string>
#include<iostream>
using namespace std;

/*定义animal类*/
class animal
{
/*受保护成员*/
protected:
	string name;
	int age;
/*公有成员*/
public:
	animal();
	animal(string m,int n);
	void show();
};

/*定义fish类*/
class fish:virtual public animal
{
/*受保护成员*/
protected:
	int velocity;
/*公有成员*/
public:
	fish();
	fish(string m,int n,int s);
	void show();
};

/*定义beast类*/
class beast:virtual public animal
{
/*受保护成员*/
protected:
	int appetite;
/*公有成员*/
public:
	beast();
	beast(string m,int n,int a);
	void show();
};

/*定义anphibious类*/
class amphibious:public fish,public beast
{
/*公有成员*/
public:
	amphibious(string m,int n,int s,int a );
	void show();
};