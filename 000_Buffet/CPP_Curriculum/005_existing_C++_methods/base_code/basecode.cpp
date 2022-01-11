// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int counter;
	int dime1;
	int dime2;
	dime1 = 2;
	dime2 = 11;
	cout<<"What do you want your line to be?"<<endl;
	char sym;
	cin>>sym;
	cout<<"How long do you want it?"<<endl;
	int num;
	cin>>num;
	cout<<"Horizontal, Vertical, or Diagonal?"<<endl<<"h for Horizontal, v for Vertical d for Diagonal"<<endl;
	char angle;
	cin>>angle;
	if(angle=='h')
	{
		for(counter=0;counter!=num;counter++)
		{
			cout<<sym;

		}
	}
	else if(angle=='v')
	{
		for(counter=0;counter!=num;counter++)
		{
			cout<<sym<<endl;

		}
	}
	else if(angle='d')
	{
		cout<<endl;
		for(counter=0;counter!=num;counter++)
		{
			cout<<sym<<endl;
			gotoxy(dime1,dime2);
			dime1=dime1+1;
			dime2=dime2+1;
		}
	}
}
