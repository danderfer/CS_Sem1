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
	cout<<"Width? ";
	int wide;
	cin>>wide;
	cout<<"Length? ";
	int longy;
	cin>>longy;
	cout<<"How far down?"<<endl;
	int down;
	cin>>down;
	down=down+10;
	cout<<"How far right?"<<endl;
	int right;
	cin>>right;
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
}



