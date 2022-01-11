// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int counter;
	int thing=0;
	int counter2;
	cout<<"What do you want your box to be made of?"<<endl;
	char box;
	cin>>box;
	cout<<"What is your first number?"<<endl;
	int x;
	cin>>x;
	cout<<"What is your second number?"<<endl;
	int y;
	cin>>y;
	cout<<"What is your operator?"<<endl;
	char tin;
	cin>>tin;
	cout<<endl;
	int wide=20;
	int longy=7;
	int down=10;
	int right=10;
	for(counter2=0;counter2!=longy;counter2++)
	{
	cout<<endl;
	gotoxy(right,down);
	down=down+1;
if(thing<1||thing>longy-2)
		{
			for(counter=0;counter!=wide;counter++)
				{
					cout<<box;
				}
		}
		else
		{
			cout<<box;
			for(counter=0;counter!=wide-2;counter++)
			{
				cout<<" ";
			}
			cout<<box;
		}
		thing++;
	}
	if(tin=='+')
	{
		gotoxy(15,13);
		cout<<x<<" "<<tin<<" "<<y<<" = "<<x+y;
	}
	else if(tin=='-')
	{
		gotoxy(15,13);
		cout<<x<<" "<<tin<<" "<<y<<" = "<<x-y;
	}
	else if (tin=='*')
	{
		gotoxy(15,13);
		cout<<x<<" "<<tin<<" "<<y<<" = "<<x*y;
	}
	else if(tin=='/')
	{
		gotoxy(15,13);
		cout<<x<<" "<<tin<<" "<<y<<" = "<<x/y;
	}
	gotoxy(0,20);
}




