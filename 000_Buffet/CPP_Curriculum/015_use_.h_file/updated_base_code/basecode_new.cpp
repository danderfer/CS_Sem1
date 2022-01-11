// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	gotoxy(10,40);
	drawbox(2,2,6,4,'^');
	cout<<endl<<endl<<" ^^^^^^"<<endl<<" ^^^^^^"<<endl<<" ^^^^^^"<<endl<<" ^^^^^^"<<endl;
	
	for(int c1=0; c1!=4;c1++ )
	{
		cout<<endl<<" ";
		for(int c2=0; c2!=6;c2++)
		{
			cout <<"^";
		}
	}
	
	for(int c3=0;c3!=2;c3++)
	{
		cout<<endl;
			for(int c1=0; c1!=4;c1++ )
	{
		cout<<endl<<" ";
		for(int c2=0; c2!=6;c2++)
		{
			cout <<"^";
		}
	}
	
	}
}
