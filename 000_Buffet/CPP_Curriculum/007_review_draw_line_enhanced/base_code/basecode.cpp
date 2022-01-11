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
	cout<<"How far down do you want it?"<<endl; 
	int down;
	cin>>down;
	cout<<"How far right?"<<endl;
	int right;
	cin>>right;
	gotoxy(right,down);
		for(counter=0;counter!=num;counter++)
		{
			cout<<sym;

		}

}
