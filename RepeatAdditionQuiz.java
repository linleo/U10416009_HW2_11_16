import java.security.SecureRandom;
import java.util.ArrayList;

public class RepeatAdditionQuiz
{
	//array list
	ArrayList<Integer> answer = new ArrayList<>();
	
	//random number
	SecureRandom srand = new SecureRandom();
	int rand1 = srand.nextInt(9) + 1;
	int rand2 = srand.nextInt(9) + 1;
	int realAns = rand1 * rand2;
	
	int counter = 0;
	
	//constructor
	RepeatAdditionQuiz(){}
	
	//display first question
	void displayQuestion()
	{
		System.out.print("What is " + rand1 + " * " + rand2 + " ? ");
	}
	
	//display second question
	void displaySecondQuestion()
	{
		System.out.print("Wrong answer. Try again. What is " + rand1 + " * " + rand2 + " ? ");
	}
} 
