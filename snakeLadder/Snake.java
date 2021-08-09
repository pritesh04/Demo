package com.Bridgelabz.snakeLadder;





public class Snake {
	public static int pos = 0;
	public static int dice = 0;


	public static void main(String[] args) {
		int min=0, max=6,mn=0,mx=2;
		  int i=0;
while(pos!=100)
			{
				dice = (int) (Math.random()*(max-min+1)+min);
				System.out.println("Dice number is " + dice);
				i++;
				int  choice = (int) (Math.random()*(mx-mn+1)+mn);
				System.out.println("Choice is " + choice );
				if(choice == 0)
				{
					pos=pos+0;
				}
				if(choice == 1)
				{
					pos=pos+dice;
				}
				if(choice == 2)
				{
					pos=pos- dice;
				}
				if(pos == 100)
				{
					System.out.println("Winner");
				}
				if(pos<0)
				{pos=0;}
				if(pos>100)
				{
					pos=pos-dice;
				}
				
				System.out.println("Position is "+ pos);
				System.out.println("-------");
			}
			System.out.println("Total dice throw "+ i);


			
	}
}


