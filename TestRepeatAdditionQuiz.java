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
		}
		System.out.print("You got it!");
	}	
}
