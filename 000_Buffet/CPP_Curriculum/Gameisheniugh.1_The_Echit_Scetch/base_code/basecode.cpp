// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));


//This is bacicly an echit-scetch
//Use 'wasd' controls to move your cursor
//I couldn't finish the discription for the commands, but IMPORTANT, if you use p, then any arrow key you can pass through drawn images



char move;
int x=0;
int y=0;
char marker = '.';
while(true)
{
	{gotoxy(x,y);
	cout<<marker;
	move= getch();
	if(move=='s')
	{
		y=y+1;
	}
	if(move=='d')
	{
		x=x+1;  //normaly 3, but is 1 for fine detail
	}
	if(move=='w')
	{
		y=y-1;
	}
	if(move=='a')
	{
		x=x-1;  //normaly 3, but is 1 for fine detail
	}
	if(move=='e')
	{
		marker=' ';
	}
	if(move=='m')
	{
		marker='.';
	}
	if(move=='p')
	{
		marker=getch();
	}
	if(move=='c')
	{
		gotoxy(20,100);
		cout<<"Are you sure you want to clear? press 'c' again to procced";
		move=getch();
		if(move=='c')
		{
			gotoxy(0,0);
			for(int cn1=0;cn1!=150;cn1++)
			{
				cout<<endl;
				for(int cn2=0;cn2!=250;cn2++)
				{
					cout<<" ";
				}
			}
		}
	}
}













}
}