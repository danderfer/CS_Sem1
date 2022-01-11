// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));

char move;
int x=0;
int y=0;

while(true)
{
	while(kbhit()==0)
	{gotoxy(x,y);
	cout<<".";
	y=random(100);
	x=random(250);
	sleep(1);
	
	}
	move=getch();
	move=getch();
		if(move=='c')
	{
		gotoxy(0,0);
		for(int count=0;count!=250;count++)
		{
			for(int count2=0;count2!=100;count2++)
			{
				cout<<" ";
			}
			
		}
	}
}













}
