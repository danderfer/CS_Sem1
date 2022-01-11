// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"What is your first number?"<<endl;
	int x;
	cin>>x;
	cout<<"What is your second number?"<<endl;
	int y;
	cin>>y;
	cout<<"What is your operator?"<<endl;
	char tin;
	cin>>tin;
	if(tin=='+')
	{
		cout<<x<<" "<<tin<<" "<<y<<" = "<<x+y;
	}
	else if(tin=='-')
	{
		cout<<x<<" "<<tin<<" "<<y<<" = "<<x-y;
	}
	else if (tin=='*')
	{
		cout<<x<<" "<<tin<<" "<<y<<" = "<<x*y;
	}
	else if(tin=='/')
	{
		cout<<x<<" "<<tin<<" "<<y<<" = "<<x/y;
	}
	
	
	
}
