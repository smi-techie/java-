import java.util.Scanner;
public class Percentage{
      public static void main(String[] args){
	    System.out.println("getting the percentage:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks1");
		int marks1 = sc.nextInt();
		System.out.println("Enter marks2");
		int marks2 = sc.nextInt();
		int totalMarks=marks1+marks2;
		int percentage = (totalMarks*100)/200;
		System.out.println("Percentage:"+percentage+"%");
		}
}		
		
	        