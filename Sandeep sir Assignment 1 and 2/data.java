// class data{
//     public static void main(String[] args) {
//         boolean str = true;
//         String str1 = String.valueOf(str);
//         System.out.println(str1);
//     }
// }

// class data{
//     public static void main(String[] args) {
//      boolean b1 = Boolean.parseBoolean("true");
//      System.out.println(b1);
//     }
// }

// class data{
//     public static void main(String[] args) {

//         String str1 = "True";
//         boolean str = Boolean.getBoolean(str1);
//         System.out.println(str);
//     }
// }

// class data{
//     public static void main(String[] args) {

//         String str1 = "siddesh";
//         boolean str = Boolean.parseBoolean(str1);
//         System.out.println(str);
//     }
// }

// ---------------------------Byte code------------

// class data{
//     public static void main(String[] args) {
//         String b = "12";
//         Byte bb = Byte.parseByte(b);
//         System.out.println(bb);
//     }
// }

// class data{
//     public static void main(String[] args) {
//         byte b = 12;
//         Byte bb = b;
//         System.out.println(bb);
//     }
// }
// class data{
//     public static void main(String[] args) {
import java.sql.Time;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

//         Scanner sc = new Scanner(System.in);   
//         char c = sc.next().charAt(0);   

//         if(Character.isLowerCase(c)){
//                 System.out.println(Character.toUpperCase(c));
//             }else{

//                 System.out.println(Character.toLowerCase(c));
//         }
//         if(c == (int)c){
//             System.out.println(c + Character.toChars(c, null, c));
//         }

//     }
// }

// class data{
//     public static void main(String[] args) {
//         byte a = 19;
//         byte b = Byte.valueOf(a);
//         System.out.println(b);
// }}

// class data{
//     public static void main(String[] args) {

//         short b = 12;
//         String a = Short.toString(b);
//         System.out.println(a);
// }}

// class data{
//     public static void main(String[] args) {

//         short b = 12;
//         short a = Short.valueOf(b);
//         System.out.println(a);
// }}

// class data{
//     public static void main(String[] args) {

//         String a = new String("12");
//         short b = Short.parseShort(a);
//         System.out.println(b);
// }}

// class data{
//     public static void main(String[] args) {

//         int a = Integer.bitCount(30);

//         System.out.println(a);
// }}

// class data{
//     public static void main(String[] args) {

//         byte a = 30;
//         Byte obj = Byte.valueOf(a);
//         byte b = obj.byteValue();
//         System.out.println(a + " is " +b);
// }}

// class data{
//     public static void main(String[] args) {
//         // double a = Double.doubleToLongBits(16d);
//         // Double a = Double.parseDouble("10.5");
//         // byte b = a.byteValue();
//         ///////////////////up and below both work-----------
//         // double a = 10.5;
//         // byte b = (byte)a;
//         // System.out.println(b);
//         // -----------------minvalue for double-----
//         // System.out.println(Double.MAX_VALUE);
//         // double a = Double.longBitsToDouble(0x7fefffffffffffffL);
//         // System.out.println(a);
//         // System.out.println(Double.MIN_VALUE);
//     }
// }

// class data{
//     public static void main(String[] args) {
//         double a = 19.99d;
//         String s = String.valueOf(a);
//         System.out.println(s);

//     }
// }

// class data{
//     public static void main(String[] args) {
//         Double a = 19.99d;
//         double b = a.doubleValue();
//         System.out.println(b);

//     }
// }

// class data{
//     public static void main(String[] args) {
//         int a = 2;
//         int b = 6;
//         System.out.println(Integer.max(a, b)); 
//         System.out.println(Integer.min(a, b)); 
//         System.out.println(Integer.sum(a, b));
//     }
// }

// class data{
//     public static void main(String[] args) {
//         double a = 8d;
//         String hexconvert = Double.toHexString(a);
//         System.out.println(hexconvert);

//         long b = 1666l;
//         String octconvert = Long.toHexString(b);
//         System.out.println(octconvert);

//         long b = 1666l;
//         String octconvert = Long.toOctalString(b);
//         System.out.println(octconvert);

//         long b = 1666l;
//         String octconvert = Long.toBinaryString(b);
//         System.out.println(octconvert);
//     }
// }

// class data{
//     public static void main(String[] args) {
//         byte a = 10;
//         Byte b = Byte.valueOf(a);
//         System.out.println(b.byteValue());

//         ////Double bit value///

//         int b = Double.SIZE;
//         System.out.println(b);
//     }
// }

// class data{
//     public static void main(String[] args) {
//         String a = new String("254");
//         int b = Integer.valueOf(a);
//         System.out.println(b);
//     }
// }

// class data{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your dob :- ");
//         int dob = sc.nextInt();
//         int mon = sc.nextInt();
//         int day = sc.nextInt();
//         Calendar c = Calendar.getInstance();
//         int year = (c.get(Calendar.YEAR) - dob);
//         int month = (c.get(Calendar.MONTH) - mon);
//         int days = (c.get(Calendar.DAY_OF_MONTH) - day);
//         System.out.println("Your age is :- " + year + "YEARS" + month + "months" + days + "days");

//     }
// }

// class data{
//     public static void main(String[] args) {
//         LocalDate date = LocalDate.now();
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//         DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
//         DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//         String text = date.format(formatter);
//         String text1 = date.format(formatter1);
//         String text2 = date.format(formatter2);
//         System.out.println(text);
//         System.out.println(text1);
//         System.out.println(text2);
//     }
// }

// class data{
//     public static void main(String[] args) {
//         LocalTime time = LocalTime.now();
//         int hr = time.getHour();
//         int min = time.getMinute();
//         int sec = time.getSecond();
//         LocalTime text = LocalTime.of(hr, min);
//         LocalTime text2 = LocalTime.of(hr, min, sec);
//         System.out.println(text);
//         System.out.println(text2);
//     }
// }

// class data{
//     public static void main(String[] args) {
//         LocalDate date = LocalDate.now();
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//         DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
//         DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//         String text = date.format(formatter);
//         // String text1 = date.format(formatter1);
//         String text2 = date.format(formatter2);
//         LocalTime time = LocalTime.now();
//         int hr = time.getHour();
//         int min = time.getMinute();
//         int sec = time.getSecond();
//         LocalTime time1 = LocalTime.of(hr, min);
//         LocalTime time2 = LocalTime.of(hr, min, sec);
//         System.out.println(text + " " + time1);
//         System.out.println(text2 + " " + time2);
//     }
// }
// class data{
//     public static void main(String[] args) {

//         ZoneId z = ZoneId.of("Asia/Kolkata");
//         LocalTime time = LocalTime.now(z);
//         int sec = time.getSecond();
//         LocalTime text = LocalTime.of(time.getHour(), time.getMinute());
//         // LocalTime text2 = LocalTime.of(hr, min, sec);
//         System.out.println(text);
//         // System.out.println(text2);
//     }
// }
// class bmi{
//     double height;
//     double weight;
//     double bmi;

//     void bmi(double height, double weight){
//         this.height = height;
//         this.weight = weight;
//     }
//     double bmiCalculator(){
//         height = (height/100);
//         bmi = (weight/(height*height));
//         return bmi*10000;
//     }
// }
// class data{
//     public static void main(String[] args) {
//         bmi b = new bmi();
//         Scanner sc = new Scanner(System.in);
//         double height = sc.nextDouble();
//         double weight = sc.nextDouble();
//         b.bmi(height, weight);
//         System.out.println(b.bmiCalculator());
//     }
// }

// class Book{
//     String title;
//     String author;
//     String publisher;
//     String isbn;
//     int year;
//     double price;
//     int quantity;
//     int totalValue;

//     void Book(double price, int quantity){
//         this.price = price;
//         this.quantity = quantity;
//     }
//     int getInventoryvalue(){
//         totalValue = (int)price * quantity;
//         return totalValue;
//     }

//     int increaseQuantity(int value){
//         return value + 1;
//     }
//     int decreaseQuantity(int value){
//         return value - 1;
//     }

// }

// class data{
//     public static void main(String[] args) {
//         Book b = new Book();
//         Scanner sc = new Scanner(System.in);
//         String title = sc.nextLine();
//         String author = sc.nextLine();
//         String publisher = sc.nextLine();
//         String isbn = sc.nextLine();
//         int year = sc.nextInt();
//         double price = sc.nextFloat();
//         int quantity = sc.nextInt();

//         b.Book(price, quantity);
//         System.out.println(b.getInventoryvalue());
//         b.increaseQuantity(1);
//         b.decreaseQuantity(1);
//     }
// }

//////Electricity Bill

// class Ebcal{
//   String customerName;
//   double unitsConsumed;
//   double billAmount;

//   void Ebcal(double units, String name){
//     this.unitsConsumed = units;
//     this.customerName = name;
//   }

//   String setName(String name){
//     return customerName;
//   }

//   double setUnit(double unit){
//     return unitsConsumed;
//   }

//   double calBillAmt(){
//     if(unitsConsumed <= 100){
//         billAmount = unitsConsumed * 5;
//         return billAmount;
//     }else if(unitsConsumed > 100 && unitsConsumed <= 300){
//         billAmount = unitsConsumed * 7;
//         return billAmount;
//     }else{
//         billAmount = unitsConsumed * 10;
//         return billAmount;
//     }
//   }

// }
// class data{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter cutsomername :- ");
//         String customerName = sc.nextLine();
//         System.out.println("Enter unitsConsumed :- ");
//         double unitsConsumed = sc.nextDouble();
//         Ebcal ebc = new Ebcal();
//         ebc.Ebcal(unitsConsumed, customerName);
//         ebc.setName(customerName);
//         ebc.setUnit(unitsConsumed);
//         ebc.calBillAmt();
//         System.out.println(ebc.setName(customerName) + " has consumed " + ebc.unitsConsumed + "\n" + "units that generates bill amount of Rs " +  ebc.calBillAmt());
//     }
// }

// 0.23216600

/////////phone bill ///////////////////////////
// class Tb{

//         String name;
//         int number;
//         int calls;
//         double callsinmins;
//         double telephoneBill = 0;

//     void Tb(int totalcalls){
//         this.calls = totalcalls;
//     }
//     double flatRate = 821.21;
//     double calculateBill(){
//         if(calls <= 100 ){
//             telephoneBill = calls * 11.60830000;
//             return telephoneBill + flatRate;
//         }else{
//             telephoneBill = calls * 11.60830000;
//             return telephoneBill + flatRate;
//         }
//     }
// }

// class data{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter name :-");
//         String name = sc.next() + sc.nextLine();
//         System.out.print("Enter number :-");

//         int number = sc.nextInt() + sc.nextInt();

//         System.out.println("Enter totalCalls :-");
//         int totalcalls = sc.nextInt();
//         System.out.println("Enter callmins :-");
//         double callsinmins = sc.nextDouble();
//         Tb cal = new Tb();
//         cal.Tb(totalcalls);
//         System.out.println(cal.calculateBill());

//     }
// }
////////////////////////Bank Problem////////////////////
// class Bank {
//     int accNum;
//     int accBalance = 0;
//     Scanner s = new Scanner(System.in);

//     void Bank(int accountNumber) {
//         this.accNum = accountNumber;
//     }

//     int recheck() {
//         System.out.println("Enter account number again :-");
//         int userAcc = s.nextInt();
//         return userAcc;
//     }

//     void addBalance() {
//         int check = recheck();
//         System.out.println("Enter funds to add :-");
//         int moneyAdded = s.nextInt();
//         if (accNum == check) {
//             accBalance = accBalance + moneyAdded;
//             System.out.println("Your account balance is " + accBalance);
//         } else {
//             System.out.println("Invalid accountNumber !!");
//         }
//     }

//     void withdraw() {
//         System.out.println("Withdraw Request in process.....");
//         int check = recheck();
//         System.out.println("Enter funds to withdraw :-");
//         int moneywithdraw = s.nextInt();
//         if (accNum == check) {
//             if (accBalance < moneywithdraw) {
//                 System.out.println("Insufficent funds!!");
//             } else {
//                 accBalance = accBalance - moneywithdraw;
//                 System.out.println("Rs " + moneywithdraw + " have been withdrawn ");
//                 System.out.println("Your account balance is " + accBalance + " Rs");
//             }

//         } else {

//         }
//     }

//     void display(){
//         System.out.println("Your account balance is "+accBalance);
//     }

// }

// class data {


//     static int menulist(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println();
//         System.out.println("Enter 0 for exit");
//         System.out.println("Enter 1 for add balane");
//         System.out.println("Enter 2 for withdraw");
//         System.out.println("Enter 3 for display balance");
//         return sc.nextInt();
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter account holder name");
//         String holderName = sc.next();
//         sc.nextLine();
//         System.out.println("Enter account number :-");
//         int accNum = sc.nextInt();
//         Bank b = new Bank();
//         b.Bank(accNum);
//         menulist();
//         int choice;
//         while ((choice = data.menulist() ) != 0) {
//             switch (choice) {
//                 case 0: System.exit(choice);
//                 case 1 : 
//                         b.addBalance();
//                         break;
//                 case 2 : b.withdraw();   
//                         break;
//                 case 3 : b.display();   
//                         break;
//                 default:
//                     break;
//             }
            
//         }

//     }
// }
import java.util.Scanner;

// class Credit {
//     private int creditHistory;
//     private double creditUtilization;
//     private boolean paymentHistory;

//     Credit(){
//         this.creditHistory=0;
//         this.creditUtilization=0;
//         this.paymentHistory=false;
//     }
//     public void setCreditHistory(int creditHistory){
//         this.creditHistory=creditHistory;
//     }
//     public int getCreditHistory(){
//         return this.creditHistory;
//     }
//     public void setCreditUtilization(double creditUtilization){
//         this.creditUtilization=creditUtilization;
//     }
//     public double getCreditUtilization(){
//         return this.creditUtilization;
//     }
//     public void setPaymentHistory(boolean paymentHistory){
//         this.paymentHistory=paymentHistory;
//     }
//     public boolean getPaymentHistory(){
//         return this.paymentHistory;
//     }
// }
// class data{
//     private static Scanner sc=new Scanner(System.in);
//     private Credit ct=new Credit(); 
//     public void input(){
//         System.out.print("Enter credit history : ");
//         ct.setCreditHistory(sc.nextInt());
//         System.out.print("Enter credit utilization : ");
//         ct.setCreditUtilization(sc.nextDouble());
//         System.out.print("Enter payment history : ");
//         ct.setPaymentHistory(sc.nextBoolean());
//     }
//     public void creditScore(){
//         input();
//         int creditScore;
//         if(ct.getPaymentHistory()){
//             creditScore = (ct.getCreditHistory() * 15) + (int)(ct.getCreditUtilization() * 30) + 55;
//         }
//         else{
//             creditScore = (ct.getCreditHistory() * 15) + (int)(ct.getCreditUtilization() * 30) + 35;
//         }
//         System.out.println("Credit score : "+ creditScore);
//     }
//     public static void main(String[] args) {
//         data cl=new data();
//         cl.creditScore();
//     }
// }



import java.util.Scanner;

// public class data {

// 	public static void main(String[] args) {
// 		System.out.println("Enter arr size :- ");
// 		Scanner scanner = new Scanner(System.in);
// 		int n = scanner.nextInt();
// 		int arr[] = new int[n];
		
// 		for (int i = 0; i < arr.length; i++) {
// 			System.out.println("Enter " + i + " element");
// 			arr[i] = scanner.nextInt();
			
// 		}
// 		for (int i : arr) {
// 			System.out.print(i + " ");
// 		}
// 		System.out.println();
// 		int sum = 0;
// 		for (int j : arr) {
// 			sum = sum +j;
// 		}
// 		System.out.print(sum  + " is the total sum ");
		
// 		System.out.println();
// 		int avg = 0;
// 		for (int j : arr) {
// 			avg = avg +j;
// 		}
// 		System.out.print(avg/arr.length  + " is the average ");
// 		System.out.println();
// 		int max = arr[0];
// 		for (int j : arr) {
// 			if(j >max) {
// 				max = j;
// 			}
// 		}
// 		System.out.println(max + " is the highest number");
// 		System.out.println();
// 		int low = arr[0];
// 		for (int i : arr) {
//             if(i < low){
//                 low = i;
//             }
//         }
//         System.out.println(low + " is the lowest number");
		
		
// 		System.out.println();
		
// 		for (int i = 0; i < arr.length; i++) {
// 			for (int j = i +1; j < arr.length; j++) {
// 				if(arr[i] < arr[j]) {
//                     int temp = arr[i];
// 					arr[i] = arr[j];
//                     arr[j] = temp;
                   
// 				}	
// 			}
//             System.out.println(arr[i]);
// 		}
// 	}

// }


import java.util.Scanner;
// public class que8 {
//     int num1 , deno1 ,num2,deno2;

//     public void printmenu(){
//         System.out.println("ENTER CHOICE");
//         System.out.println("+");
//         System.out.println("-");
//         System.out.println("*");
//         System.out.println("/");
//     }
//     public void reduceForm(int newdeno ,int newnum){
//         int temp = Math.min(newdeno,newnum);
//         int flag=0;
//         for(int i =2 ;i<=temp;i++){
//             if((newdeno%i==0)&&(newnum%i==0)){
//                 newdeno/=i;
//                 newnum/=i;
//                 flag=1;
//                 break;
//             }   
//         }
//         if(flag==1){
//           reduceForm(newdeno, newnum); 
//         }
//         else{
//             System.out.println(newnum +"/"+ newdeno);
//         }
        
//     }
//     public void getData(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the numerator of the first number");
//        this.num1=sc.nextInt();
//         System.out.println("enter the demomenator of the first number");
//         this.deno1=sc.nextInt();
//         System.out.println("enter the numerator of the second number");
//         this.num2=sc.nextInt();
//         System.out.println("enter the denomenator of the second number");
//         this.deno2=sc.nextInt();
//     }
//     public void add(){
//         int newdeno = this.deno1*this.deno2;
//         int newnum = ((this.deno2*this.num1)+(this.deno1*this.num2));
//         int temp = Math.min(newdeno,newnum);
       
//         System.out.print(this.num1+"/"+this.deno1+"+"+this.num2+"/"+this.deno2+" is "); 
//         reduceForm(newdeno, newnum) ;
//         }

//         public void substract( ){
//             int newdeno = this.deno1*this.deno2;
//             int newnum = ((this.deno2*this.num1)-(this.deno1*this.num2));
//             int temp = Math.min(newdeno,newnum);
            
//             System.out.print(this.num1+"/"+this.deno1+"-"+this.num2+"/"+this.deno2+" is ");
//             reduceForm(newdeno, newnum) ; 
//             }
//             public void mult(){
//                 int newdeno = this.deno1*this.deno2;
//                 int newnum = this.num1*this.num2;
//                 int temp = Math.min(newdeno,newnum);
                
//                 System.out.print(this.num1+"/"+this.deno1+"*"+this.num2+"/"+this.deno2+" is ");
//                 reduceForm(newdeno, newnum) ;
//                 }
//                 public void div(){
//                     int newdeno = this.num1*this.deno2;
//                     int newnum = this.deno1*this.num2;
//                     int temp = Math.min(newdeno,newnum);
                    
//                     System.out.print(this.num1+"/"+this.deno1+"/"+this.num2+"/"+this.deno2+" is ");
//                     reduceForm(newdeno, newnum) ;   
//                 }
//     public static void main(String[] args) {
//         char choice;
//         que8 obj = new que8();
//         obj.printmenu();
//         Scanner sc= new Scanner(System.in);
//         String temp = sc.next();
//         choice = temp.charAt(0);
//         obj.getData();
//         switch(choice){
//             case '+' : obj.add();
//             break;
//             case '-' : obj.substract();
//             break;
//             case '*' : obj.mult();
//             break;
//             case '/'  : obj.div();
//             break;
//         }
        
//     }
// }

