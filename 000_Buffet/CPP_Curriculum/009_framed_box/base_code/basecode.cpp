// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int counter;
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
	int thing=0;
	for(counter2=0;counter2!=longy;counter2++)
	{
		cout<<endl;
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
