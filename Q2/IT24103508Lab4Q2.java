import java.util.Scanner;
public class IT24103508Lab4Q2{
public static void main(String[]args){
	Scanner input= new Scanner(System.in);
	
	Double examMarks, labMarks, examPercentage, labPercentage,FinalMarks;
	
		//get values 		
	
	System.out.print("Please enter the exam marks (out of 100): ");
	examMarks=input.nextDouble();

	if(examMarks<0 || examMarks >100)
	{System.out.print("Invalid input for Exam Marks");}
	
	
	System.out.print("Please enter the lab marks (out of 100): ");
	labMarks=input.nextDouble();

	if(labMarks<0 || labMarks >100)
	{System.out.print("Invalid input for Lab Marks");}
	

	System.out.print("Please enter the percentage given for the Exam: ");
	examPercentage=input.nextDouble();
	
	System.out.print("Please enter the percentage given for the Lab Submission: ");
	labPercentage=input.nextDouble();
		
	if(labPercentage + examPercentage !=100)
	{System.out.print("The percentages must add up to 100");}
	


	FinalMarks= (examMarks*examPercentage/100)+(labMarks*labPercentage/100);
	System.out.println("Final exam marks is :" +FinalMarks);
	}
}

	