import java.util.Scanner;
import java.lang.Math;
class Test{
	public static void main(String args[]){
			Scanner myObj = new Scanner(System.in);
			System.out.println("Enter number :- ");
			int number = myObj.nextInt();
			if(number % 2 == 0){
				System.out.println("The number " + number + " is even ");
			}else{
				System.out.println("The number " + number + " is odd");
			}
			
	}
}

class Test{
	
	public static void main(String args[]){
		
		System.out.println(factorial(7));
	}
	public static int factorial(int n){
		if(n >= 1){
			return n * factorial(n-1);
		}else{
			return 1;
		}
	}
}


class Test{
	public static int add(int x, int y){
		for(int i = 1; i <= y; i++){
			x++;
		}
		return x;
	}
	public static void main(String args[]){
		System.out.println(add(1, 32));
	}
}


// class Test{
	// public static void main(String args[]){
		// long loan = 50000000L;
		// int years = 5;
		// double rate = 10.75;
		
		// double amount = loan*(Math.pow(1 + rate/100, years));
		// double CI = amount-loan;
		// System.out.println(amount);
		// System.out.println(CI);
	// }
// }

// class Test{
// 	public static double CelsiusToFarenhite(double celsius){
// 		double farenhite = (celsius *9/5) + 32;
		
// 		return farenhite;
// 	}
// 	public static double FarenhiteToCelsius(double farenhite){
// 		double celsius = (farenhite - 32) * 5/9;
// 		return celsius;
// 	}
// 	public static void main(String args[]){
// 		Scanner myObject = new Scanner(System.in);
		
// 		System.out.print("Enter celsius :- ");
		
// 		double celsius = myObject.nextInt();
// 		double farenhite = CelsiusToFarenhite(celsius);
// 		System.out.println("Farenhite is :- " + farenhite);
// 		System.out.println("Celsius is :- " + FarenhiteToCelsius(farenhite));
		
// 	}
// }


// class Test{
// 	public static void main(String args[]){
// 		System.out.print("Enter year :- ");
// 		Scanner sc = new Scanner(System.in);
// 		int year = sc.nextInt();
// 		String check = chechkLeap(year);
// 		System.out.println(check);
// 	}
// 	public static String chechkLeap(int year){
// 		String leap = (year%4 == 0) ? (year % 100 == 0 ? (year % 400 == 0 ? "is a leap" : "not a leap") : "is a leap") : "not a leap";
// 		return leap;
// 	}
// }


// class Test{
// 	public static void main(String args[]){
// 		int a = 1;
// 		int n = 10;
// 		display(a, n);
// 	}
// 	public static void display(int a, int n){
	
// 	if(a <= n){
// 		System.out.print(a);
// 		a++;
// 		display(a, n);
// 	}
// 	return;	
		
// 	}
// }

// class Test{
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter your number :- ");
// 		int a = sc.nextInt();
// 		while (a > 0) {
// 			int remainder = a % 10;
// 			System.out.println(remainder);
// 			a = a / 10;
// 		}
// 	}
// }

// class Test{
// 	public static void main(String args[]){
// 		int year = 1997;
// 		int remainder = year % 100;
// 		System.out.print(remainder);
// 	}
// }


// class Test{
// 	public static void main(String args[]){
// 		int ar[] = {1, 2, 3, 4, 5};
// 		for(int element : ar){
// 			System.out.print(element);
// 		}
// 	}
// }


// class Test{
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter first number :- ");
// 		int fnum = sc.nextInt();
// 		System.out.println("Enter second number :- ");
// 		int snum = sc.nextInt();
// 		System.out.println("Enter third number :- ");
// 		int tnum = sc.nextInt();
// 		int maxNum[] = {fnum, snum, tnum};
// 		int highestNum = checkMax(maxNum);
// 		System.out.print("Highest num is :- " + highestNum);
// 	}

// 	public static int checkMax(int maxNum[]){
// 		int firstMax = maxNum[0];
// 		for(int element : maxNum){
// 			if(element > firstMax){
// 				firstMax = element;
// 			}
// 		}
// 		return firstMax;
// 	}
// }


// class Test{
// 	public static void main(String args[]){
// 		int i = 3;
// 		do{
// 			System.out.println(i);
// 			i++;

// 		}while(i <= 6);
// 	}
// }

// class Test{
// 	public static void main(String args[]){
// 		for (int i = 1; i <= 5; i++) {
// 			for (int j = 1; j <= i; j++) {
// 				System.out.print(i + " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// class Test{
// 	public static void main(String args[]){
// 		for (int i = 1; i <= 5; i++) {
// 			for (int j = 1; j <= i; j++) {
// 				System.out.print(j + " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// class Test{
// 	public static void main(String args[]){
// 		for (char ch = 'A'; ch <= 'E'; ch++) {
// 			for (char j = 'A'; j <= ch; j++) {
// 				System.out.print(j + " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// class Test{
// 	public static void main(String args[]){
// 		for (int i = 0; i <= 5; i++) {
// 			for (int j = 0; j <= i; j++) {
// 				System.out.print("*"+ " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }


// class Test{
// 	public static void main(String args[]){
// 		for (char ch = 'A'; ch <= 'E'; ch++) {
// 			for (char j = 'A'; j <= ch; j++) {
// 				System.out.print(ch + " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }


import java.io.*;


// class Test{
// 	public static void main(String args[]){
// 		for(int row = 1; row <= 4; row++){

// 			for(int pcol = 4; pcol >= row; pcol--){
// 				System.out.print("* ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// class Test{
// 	public static void main(String args[]){
// 		for(int row = 1; row <= 4; row++){
// 			for(int scol = 4; scol >=row; scol--){
// 				System.out.print(" ");
// 			}
// 			for(int pcol = 1; pcol <= row; pcol++){
// 				System.out.print("*");
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// class Test{
// 	public static void main(String args[]){
// 		for(int i = 1; i<=4; i++){
// 			for(int j = 1; j<=i; j++){
// 				System.out.print("* ");
// 			}
// 			System.out.println();
// 		}

// 		for(int row = 4; row >=0; row--){
// 			for(int col = 1; col <row; col++){
// 				System.out.print("* ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// class Test{
// 	public static void main(String args[]){
// 		for (int i = 1; i <= 5; i++) {
// 			for(int j = 1; j<=i; j++){
// 				System.out.print(" ");
// 			}
// 			for(int k = 5; k >= i; k--){
// 				System.out.print("* ");
// 			}
// 			System.out.println();
// 		}
// 		for(int i = 2; i<= 5; i++){
// 			for(int j= 5; j >= i; j--){
// 				System.out.print(" ");
// 			}
// 			for (int k = 1; k <= i; k++) {
// 				System.out.print("* ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }


// class Test{
// 	public static void main(String args[]){
// 		for (int i = 5; i > 0; i--) {
// 			for (int j = 1; j <= i; j++) {
// 				System.out.print(" ");
// 			}
// 			for (int k = i; k <= 5; k++) {
// 				System.out.print(k + " ");
// 			}
// 			System.out.println();
// 		}

// 	}
// }


// class Test{
// 	public static void main(String args[]){
// 		for (int i = 1; i <=5; i++) {
// 			for(int j = 5; j >=i; j--){
// 				System.out.print(" ");
// 			}
// 			for (int k = 1; k <= i; k++) {
// 				System.out.print(k + " ");	
// 			}
// 			System.out.println();
// 		}

// 	}
// }

// class Test{
// 	public static void main(String args[]){
// 		for (char i = 'A'; i <='E'; i++) {
// 			for (char j = 'E'; j >= i; j--) {
// 				System.out.print(" ");
// 			}
// 			for (char k = 'A'; k <=i ; k++) {
// 				System.out.print(k + " ");	
// 			}
// 			System.out.println();
// 		}

// 	}
// }

// class Test{
// 	public static void main(String args[]){
// 		for (int i = 1; i <= 5; i++) {
// 				for (int j = 1; j <=i; j++) {
// 					if(i == 1 || j == 1 || i == 5 || j == 5|| i == j){
// 						System.out.print("* ");
// 					}else{
// 						System.out.print("  ");
// 					}
// 				}
// 				System.out.println();
// 		}
// 	}
// }


// class Test{
// 	public static void main(String args[]){
// 		for (int i = 1; i <= 9 ; i++) {
// 			for (int j = 9; j >=i; j--) {
// 				System.out.print(" ");
// 			}
// 			for (int k = 1; k <= i; k++) {
// 				System.out.print(k + " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// class Test{

// 	int length = 10 ,breadth = 20;

// 	void Rectangle(){
// 		double areaofRect = length * breadth;
// 		System.out.println(areaofRect);
// 	}

// 	public static void main(String args[]){
// 		Test t1 = new Test();
// 		t1.Rectangle();
// 	}
// }


// class Test{
// 	static int a  =5;
// 	void inc(){
// 		System.out.print(a);
		
// 	}
// 	public static void main(String args[]){
// 			++a;
// 			Test t = new Test();
// 			t.inc();
					
// 		}
// 	}

// class Test{

// 	public static void main(String args[]){
// 		int a = 5;
// int b = 3;
// int c = 7;
// int d = ++a * b-- % c;
// System.out.println(d);
// 	}
// }
