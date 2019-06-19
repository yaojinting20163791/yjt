#include "animal.h"
#include<string>
#include<iostream>
using namespace std;

int main()
{

	string p,q;
	int n1,n2,s1,a1;
	cin>>p>>q>>n1>>n2>>s1>>a1;
    amphibious t1(p,n1,s1,a1);
	t1.show();
	return 0;


}