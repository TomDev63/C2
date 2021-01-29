// LInk to Alex Lee YouTube recursion  https://www.youtube.com/watch?v=sE0sH8vSmE4
// Eclipse GIT for Beginners https://www.youtube.com/results?search_query=git+eclipse+tutorial+for+beginners+v
// And a bit by Seb

public class RecursionCountDown
	{

		public static void main(String[] args)
			{
				countDown(10);
			}

		public static void countDown(int n) 
			{
				if (n==0) 
					{
						System.out.println("Done!");
					}
				else
					{
						System.out.println("This cycle : " +n);
						n--;
						countDown(n);
					}
			}
		
		// Need a  base case
	}
