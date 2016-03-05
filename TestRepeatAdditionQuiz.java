import java.util.Scanner;
import java.util.ArrayList;

public class TestRepeatAdditionQuiz
{
	public static void main(String[] args)
	{
		RepeatAdditionQuiz repeat = new RepeatAdditionQuiz();
		int realAns = repeat.getRealAns();
		int counter = repeat.getCounter();
		ArrayList<Integer> answer = repeat.getAnswer();
		repeat.displayQuestion();
		//user input
		Scanner input = new Scanner(System.in);
		answer.add(input.nextInt());
		
		//judge the answer is true or not
		while (answer.get(counter) != realAns) 
		{	
			repeat.displaySecondQuestion();
			answer.add(input.nextInt());
			counter++;
			//to tell user if an answer is entered again 
			for (int i=0;i<=counter-1;i++)
			{
				if (answer.get(counter) == answer.get(i))
				{
					System.out.println("You already entered " + answer.get(counter));
					break;
				}	
			}
		}
		System.out.print("You got it!");
	}	
}
