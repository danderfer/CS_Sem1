// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int counter;
	cout<<"What do you want your line to be?"<<endl;
	char sym;
	cin>>sym;
	cout<<"How long do you want it?"<<endl;
	int num;
	cin>>num;
	cout<<"Horizontal or Vertical?"<<endl<<"h for Horizontal, v for Vertical"<<endl;
	char angle;
	cin>>angle;
	if(angle=='h')
	{
		for(counter=0;counter!=num;counter++)
		{
			cout<<sym;
		}
	}
	else if(angle=='v')
	{
		for(counter=0;counter!=num;counter++)
		{
			cout<<sym<<endl;
		}
	}
}
