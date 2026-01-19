package LabAssignment1;


//Q1. Fibonacci Series & Average Calculation

//						Requirements
//Generate the first 20 Fibonacci numbers using iterative logic.
//Store all numbers in an array.
//Print the numbers in one line.
//Compute and print the average.


//				Expected Output
//The first 20 Fibonacci numbers are:
//1 1 2 3 5 8 ... 6765
//Average: 885.5

public class Q1_attempt1_Fibonacci {
	public static void main(String []args) {
		int size = 20;
		int []fibonacci_series = new int[size] ;
		fibonacci_series[0]=0;
		fibonacci_series[1]=1;

		for(int i=2;i<size;i++) {
			fibonacci_series[i] = fibonacci_series[i-1] + fibonacci_series[i-2] ;	
		}

		System.out.println("The first 20 Fibonacci numbers are : ");
		for(int i=0;i<size;i++) {
			System.out.print(fibonacci_series[i] +" ");
		}


		int sum = 0;

		for(int i=0;i<size;i++) {
			sum += fibonacci_series[i];
		}
		double average = (double)sum / size ;
		System.out.print("\nAverage : "+ average) ;

		  
	}

}
