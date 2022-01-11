// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
int xa=35;
int ya=4;
char flake;
cout<<"What do you want your snowflake to be?"<<endl;
cin>>flake;
cout<<"test";
while(true)
{
	gotoxy(xa-1,ya);
	cout<<flake<<endl;
	sleep(1);
	gotoxy(xa-2,ya);
	cout<<"     "<<endl;
	ya=ya+1;
	gotoxy(xa,ya+1);	
	cout<<flake<<endl;
	gotoxy(xa-2,ya);
	sleep(1);
	cout<<"     "<<endl;
	
}
}
