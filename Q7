
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
		int examGrade,avgTasks,numTask,finalGrade = 0;
		System.out.println("Enter exam grade:");
		examGrade=scan.nextInt();
		System.out.println("Enter average of tasks :");
		avgTasks=scan.nextInt();
		System.out.println("Enter number of tasks :");
		numTask=scan.nextInt();
		if (numTask<=4)
		{
		finalGrade=0;	
		}
		else if (numTask==5 ||numTask==6 && examGrade>=55)
		{
			finalGrade=(int) (0.2*avgTasks+0.8*examGrade);
		}
		else if (examGrade<=54)
		{
			finalGrade=examGrade;
		}
		else if (numTask==7 ||numTask==8 && examGrade<=54 && avgTasks>=80)
		{
			finalGrade=(int) (0.25*avgTasks+0.75*examGrade);
		}
		else if (numTask==7 ||numTask==8 && examGrade<=54 && avgTasks<=80)
		{
			finalGrade=(int) (0.2*avgTasks+0.8*examGrade);
		}
		else if (examGrade>=55 &&examGrade<=100)
		{
			finalGrade=(int) (0.3*avgTasks+0.7*examGrade);
		}
		System.out.println("Final Grade is : " +finalGrade);
	}

}
