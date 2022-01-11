// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int thing=0;
	int counter=0;
	char box= '@';
    int	counter2=0;
	char q;
	int wide=10;
	int longy=5;
	int down=2;
	int right=11;
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
while(true)
{
	gotoxy(15,4); cout<<"    ";
	gotoxy(15,4);
	cout<<random(100);
		if(q=='n'){gotoxy(15,4); cout<<"69";}
		if(q=='w'){gotoxy(15,4); cout<<"420";}	
	gotoxy(0,8);
	cout<<"Want another number? 'q' to quit, any other key to reroll"<<endl;
	q=getch();
	if(q=='q'){break;}
	
}
gotoxy(0,25);
}