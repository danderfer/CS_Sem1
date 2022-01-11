// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
int x = 5;
int y = 5;
char move = 's';

while(true)
{
	while(kbhit()==0)
	{
		sleep(1);
		gotoxy(x,y);
		cout<<"O";
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
	}
	move = getch();
	
}

}