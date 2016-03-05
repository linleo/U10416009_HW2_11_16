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
	
	//get method for first random number
	int getRand1()
	{
		return rand1;
	}
	
	//get method for second random number
	int getRand2()
	{
		return rand2;
	}
	
	//get method for first random number to multiply second random
	int getRealAns()
	{
		return realAns;
	}
	
	//get method for counter	 	
	int getCounter()
	{
		return counter;
	}
	
	//get method for answer this array list	 	
	ArrayList<Integer> getAnswer()
	{
		return answer;
	}
	
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
