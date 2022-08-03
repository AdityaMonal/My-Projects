#include <iostream>
#include <stdlib.h>
#include <time.h>
#include <conio.h>
using namespace std;

bool gameOver;
const int width =20;
const int height =20;
int x,y, fruitX,fruitY,score;
int tX[100], tY[100]; 
int nTail;
enum eDirection
{
	STOP=0,LEFT,RIGHT,UP,DOWN
};
eDirection dir;
void Setup()
{
	gameOver= false;
	dir=STOP;
	x=width/2;
	y=height/2;
	fruitX=1+rand()%(width-1);
	fruitY=1+rand()%(height-1);
	score=0;
	nTail=0;
}
void Draw()
{
	system("cls");
	//top BOrder
	for(int i=0; i<width+1; i++)
		cout<<"#";
	cout<<"\n";
	
	for(int i=0; i<height; i++)
	{
		for(int j=0; j<width+1; j++)
		{
			//head of snake
			if(i==y and j==x)
			{
				cout<<"0";
				//continue;
			}
			//FRUIT
			else if(i==fruitY and j==fruitX)
			{
				cout<<"@";
				//continue;
			}
			
			//LEFT RIGHT BORDER
			else if(j==0 or j==width)
			{
				cout<<"#";
				//continue;
			}
			else
			{
				bool br=false;
				for(int k=0; k<nTail; k++)
				{
					if(i==tY[k] and j==tX[k])
					{
						cout<<"o";
						br=true;
						break;
					}
						
				}
				if (!br)
					cout<<" ";
			}
		}
		cout<<"\n";	
	}
	//bottom BOrder
	for(int i=0; i<width+1; i++)
		cout<<"#";

	cout<<"\n";
	cout<<"fruits: "<<nTail;
}
void Input()
{
	if(_kbhit())	
	{
		switch(_getch())
		{
			case 'w':
				dir=UP;
				break;
			case 'a':
				dir=LEFT;
				break;
			case 's':
				dir=DOWN;
				break;
			case 'd':
				dir=RIGHT;
				break;
			case 'x':
				gameOver=true;
				break;
		}
	}	
}
void Logic()
{
	int prevX=tX[0];
	int prevY=tY[0];
	int prev2X,prev2Y;
	tX[0]=x;
	tY[0]=y;
	for(int i=1; i<nTail; i++)
	{
		prev2X=tX[i];
		prev2Y=tY[i];
		tX[i]=prevX;
		tY[i]=prevY;
		prevX=prev2X;
		prevY=prev2Y;
	}
	switch(dir)
	{
		case STOP:
			break;
		case UP:
			y--;
			break;
		case LEFT:
			x--;
			break;
		case RIGHT:
			x++;
			break;
		case DOWN:
			y++;
			break;
		default:
			break;
			
	}
	
//	if(x==0 or x==width or y==0 or y==height)
//		gameOver=true;
	if(x==0) x=width-1;
	if(y==0) y=height-1;
	if(x==width) x=0;
	if(y==height) y=0;
	for(int i=0; i<nTail; i++)
	{
		if(tX[i]==x and tY[i]==y)
		{
			gameOver=true;
		}
	}
	if(x==fruitX and y==fruitY)
	{	
		score+=10;
		fruitX=1+rand()%(width-1);
		fruitY=1+rand()%(height-1);
		nTail++;
	}
}
int main()
{
	srand(time(NULL));
	Setup();
	while(!gameOver)
	{
			Draw();
			Input();
			Logic();
	}
	cout<<"score: "<<score;
	return 0;
}
