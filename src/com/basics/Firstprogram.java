package com.basics;
import java.util.Scanner;

 

public class Firstprogram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String response="iqiq";
		int i = 1;
		while(!response.equals("Q") && i <3) {
			System.out.print("u are playing a game");
			System.out.println("enter q to quit game");
			response=scanner.next().toUpperCase();
			i++;
		}
			System.out.println("u quite the game");
		
//		String name = "";
//		while(name.isEmpty()) {
//			System.out.println("plz enter your name");
//			name=scanner.nextLine();
//		}
//		System.out.println("hello" + name);
//		scanner.close();
			
		}

		
//		String username;
//		
//		
//		System.out.print("enter your name:");
//		username=scanner.nextLine();
//		if(username.length()<4 || username.length()>12) {
//			System.out.println("character must have below 14 char");
//		}
//		else if(username.contains(" ") || username.contains("_")){
//			System.out.println("username must not contain any underscore or space");
//			
//		}
//		else {
//			System.out.println("hello"+username);
//		}
		
	
//		double num1;
//		double num2;
//	char operator;
//		double result = 0;	
//		boolean validOperation= true;
//		System.out.print("enter your first number:");
//		num1=scanner.nextDouble();
//		
//		System.out.print("enter the operator (+,-,*./,%,^:)");
//		operator=scanner.next().charAt(0);
//		
//		System.out.print("enter your second number:");
//		num2=scanner.nextDouble();
//		
//		switch(operator) {
//		case '+'->result = num1 + num2;
//		case '-'->result = num1 - num2;		
//		case '*'->result = num1 * num2;
//		case '^'->result = Math.pow(num1,num2);
//		case '/'->{
//			
//		
//		
//		if(result == 0) {
//			System.out.println("cant divide with zero");
//			validOperation = false;
//		}else {
//			result= num1/num2;
//			
//		}
//		}
//		default ->{
//			System.out.println("invalid operator");
//			validOperation=false;
//		}
//		
//		
//		
//	}
//		if(validOperation) {
//			System.out.println(result);
//		}
		
		
//		String day;
//		System.out.print("enter the day");
//		 day=scanner.nextLine();
//	
//		
//		
//		switch(day) {
//		case "monday","tuesday","wednesday","thursday","friday"->
//		System.out.println("it is a weekday");
//		
//		case "saturday","sunday"->System.out.println("it is a weekend");
//	
//		
//		default->System.out.println(day + " it is not a day");
//		}
		
		
		
		 
//		
//		double temp;
//		double newTemp;
//		String unit;
//		
//		System.out.print("enter the temperature:");
//		temp = scanner.nextDouble();
//		
//		System.out.print("enter units F or C :");
//		unit= scanner.next().toUpperCase();
//		
//
//       newTemp=(unit.equals("C"))?(temp-32)*5/9:(temp*5/9)+32;
//       System.out.printf(" your final coverted temp is %.1f°%s " , newTemp,unit);
       
		
		
//     int income = 30000;
//    	 double tax=(income>=10000)?0.25:0.15;
//    	 System.out.println(tax);
     
		
		
//		int number=3;
//		String evenOrOdd= (number % 2 ==0)?"even":"odd";
//		System.out.println(evenOrOdd);
//		
//		double weight;
//		double newweight;
//		int choice;
//		
//		System.out.println("welcome to weight converter");
//		System.out.println("option 1 for lbs to kgs :");
//		System.out.println("option 2 for kgs to lbs :");
//		
//		System.out.println("choose an option");
//		choice=scanner.nextInt();
//		
//		if(choice == 1) {
//			System.out.print("enter your weight:");
//			weight=scanner.nextDouble();
//			newweight = weight * 0.4535;
//			System.out.printf("your new kg weight is %.2f:" ,newweight);
//		}
//		else if(choice == 2) {
//			System.out.print("enter your weight:");
//			weight=scanner.nextDouble();
//			newweight = weight * 2.2046;
//			System.out.printf("your new lbs weight is %.2f:" , newweight);
//		}else {
//			System.out.println("not your choice");
//		}
		
		
		
		
		
		
//		String email;
//		String username;
//		String domain;
//		
//		System.out.print("enter ur email ");
//		
//	    email= scanner.nextLine();
//	    if(email.contains("@")) {
//	    	 username= email.substring(0,email.indexOf("@"));
//			 domain= email.substring(email.indexOf("@") + 1);
//			System.out.println(username);
//			System.out.println(domain);
//	    }else {
//	    	System.out.println("email must contain @ character");
//	    }
		
		
		
//		int length=name.length();
//		char letter = name.charAt(2);
//		int index= name.indexOf("o");
//		name=name.toLowerCase();
//		name=name.replace("o","a");
		
//		if(name.isEmpty()) {
//			System.out.println("your name is empty");
//		}else {
//			System.out.println("your name is " + name);
//			
//		}
//		 if(name.contains("")) {
//			 System.out.println("your name contains space");
//		 }else {
//			 System.out.println("your name doesnot contains empty");
//			 
//		 }
		
//		if(name.equalsIgnoreCase("password")){
//			System.out.println("your name cant be password");
//		}else {
//			System.out.println("your name " + name);
//		}
		  
//		boolean isStudent= true;
//		boolean isSenior= false;
//		double price = 9.99;
//		
//		if(isStudent) {
//			
//			if(isSenior) {
//				System.out.println("you are a senior you have 20% discount:");
//				System.out.println("you are a student you have 10% discount:");
//				price*=0.7;
//				 
//				
//			}else {
//				System.out.println("you are a student you have 10% discount:");
//				price*=0.9;
//			}
//		}
//		else {
//			price *=1;
//		
//		}
//		System.out.printf("your price is: %.2f", price);
		
		
//		double amount;
//		double intrestRate;
//		double compound;
//		int year;
//		double total;
//		
//		System.out.print("enter the principle:");
//		amount=scanner.nextDouble();
//		
//		System.out.print("enter the intrestrate:");
//		intrestRate = scanner.nextDouble()/100;
//		
//		System.out.print("enter the compound:");
//		compound=scanner.nextDouble();
//		
//		System.out.print("enter the how many years:");
//		year=scanner.nextInt();
//		
//		total=amount*Math.pow(1+intrestRate/compound,compound * year);
//		
//		System.out.printf("your principle amount is : %.2f\n total is : %.2f", amount,total);
//		int id1=2;
//		int id2=23;
//		int id3=256;
//		int id4=2098;
//		
//		System.out.printf("%-4d\n", id1);
//		System.out.printf("%-4d\n",id2);
//		System.out.printf("%-4d\n",id3);
//		System.out.printf("%-  4d\n",id4);


//		double price1 = 90.99;
//
//		double price2 = 100.99;
//
//		double price3 = -580.99;
//		
//		System.out.printf("% .2f\n",price1);
//		System.out.printf("% .2f\n",price2);
//		System.out.printf("% .2f\n",price3);
		
//		
//		String name= "avinash";
//		char firstLetter = 'S';
//		int age = 40;
//		double height= 60.5;
//		boolean isEmployed = true;
//		
//		System.out.printf("hello %s\n",name);
//		System.out.printf("your name starts with a %c\n",firstLetter);
//		System.out.printf("you are %d years old\n ",age);
//		System.out.printf("you are %f inches tall \n ",height);
//		System.out.printf("emoloyes: %b\n ",isEmployed);
//		
//		System.out.printf("%s is %d years old ",name,age );
		
		
//		
//		double result;
//		result= Math.floor(3.99);
//		System.out.println(result);
//		
//		double radius;
//		double circumference;
//		double volume;
//		double area;
//		
//		System.out.print("enter the radius:");
//		radius = scanner.nextDouble();
//		circumference= 2* Math.PI * radius;
//		System.out.println("your cercemference: " + circumference);
//		area = Math.PI * Math.pow(radius, 2);
//		volume= (4.0/3.0) * Math.PI * Math.pow(radius,3);
//		System.out.println("your area: " + area);
//		System.out.println("your volume: " + volume);
//		
			
		
//		double a;
//		double b;
//		double c;
//		
//		System.out.print("enter the side A:");
//		a=scanner.nextDouble();
//		
//		System.out.print("enter the side B:");
//		b=scanner.nextDouble();
//		
//		
//		c=Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//		System.out.println("Side C " + c);
	
		
		
//		Random random = new Random();
//		
//		boolean isHeads;
//		isHeads= random.nextBoolean();
//		if(isHeads) {
//			System.out.println("heads");
//		}else {
//			System.out.println("tails"); 
//		}
		
//		System.out.println(Math.PI);
//		System.out.println(Math.E);
		
//		double result;
//		result= Math.pow(2, 3);
//		System.out.println(result);
		
		
	
		
//		int number1;
//		int number2;
//		int number3;
//		number1 = random.nextInt(1,101);
//		number2 = random.nextInt(1,101);
//		number3 = random.nextInt(1,101);
//		System.out.println(number1);
//		System.out.println(number2);
//		System.out.println(number3);
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		int age;
//		String name;                                                                                                                                                                                                                                                                                                                                                                                                                  
//		boolean isStudent;
//		System.out.print("enter your name:");
//		name = scanner.nextLine();
//		
//		
//		System.out.print("enter your age:");
//		age=scanner.nextInt();
//		
//		System.out.print("r u a student (true or false)");
//		isStudent=scanner.nextBoolean();
//		if(name.isEmpty()) {
//			System.out.println("you didnt enter your name");
//		}else {
//			System.out.println("your name is " + name );
//		}
//		
//		if (age>=18) {
//			System.out.println("you are adult");
//		}
//		else if(age <=0) {
//			System.out.println("you r not born yet");
//		}
//		else {
//			System.out.println("you are a child");
//		}
//		
//		if(isStudent) {
//			System.out.println("your student");
//		}else {
//			System.out.println("your not student");
//		}
//		scanner.close();
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		String name;
//		double price;
//		int quantity;
//		char currency= '$';
//		double total;
//		
//		System.out.print("what item would u like to buy");
//		name = scanner.nextLine();
//		
//		System.out.print("what is the price for each");
//		price = scanner.nextDouble();
//		
//		System.out.print("how many would u like");
//		quantity = scanner.nextInt();
//		
//		total = price * quantity;
//		
//		
//		
//		System.out.println("you have bought " + quantity + " " + name + "/s" );
//		System.out.println("your total is " + currency + total);
//		
//		scanner.close();
//		
		
		
//		int x=10;
//		int y=2;
//		int z;
//		
//		
//		x--;
//		System.out.println(x);
//		
//		double result = 3+4*(7-5)/2;
//		System.out.println(result);
//				
		
		
		
//		int number = 24;
//		if (number % 3==0 && number % 4==0) {
//			System.out.println("fizz buzz");
//			
//		}else if(number % 3==0) {
//			System.out.println("fizz ");
//			
//		}
//		else if(number % 4==0) {
//			System.out.println("buzz ");
//			
//		}
//		else {
//			System.out.println("no fizz no buzz ");
//			
//		}
//		
//	  String name = "bro code";
//	  int gpa = 8;
//	  double pi = 3.1345;
//	  char gender = 'M';
//	  boolean isAdmin= true;
//	  
//	  if (gpa <=6 ) {
//		  System.out.println("yes " + name);
//	  }else {
//		  System.out.println("no " + name);
//		  
//	  }
//	  
//	}
		
//		System.out.print("enter your name :");
//		String name = scanner.nextLine();
//		System.out.print("enter your age :");
//		int age = scanner.nextInt();
//		System.out.print("enter your gpa :");
//		double gpa = scanner.nextDouble();
//		System.out.print("are u a student (true / false):");
//		boolean isStudent = scanner.nextBoolean();
//		
//		System.out.println("hello " + name);
//		System.out.println("you are "+ age + "years old");
//		System.out.println("your gpa is "+ gpa);
//		if (isStudent) {
//			System.out.println("you are enrolled");
//		}else {
//			System.out.println("you are not enrolled");
//			
//		}
//		System.out.println("enter your age");
//		int age = scanner.nextInt();
//		scanner.nextLine();
//		
// 		System.out.println("enter your name");
//		String name= scanner.nextLine();
//		
//		System.out.println("yor are " + age + "years old");
//		System.out.println("yor are " + name  + "good");
//		
//		
//		
//		
//		scanner.close();
		
//	  String name;
//	  String character;
//	  String adjective;
//	  String word;
//	  
//	  System.out.print("enter movie name:");
//	  name = scanner.nextLine();
//	  System.out.print("enter movie character:");
//	  character = scanner.nextLine();
//	  System.out.print("enter movie adjective:");
//	  adjective = scanner.nextLine();
//	  System.out.print("enter movie word:");
//	  word = scanner.nextLine();
//	  
//	  System.out.println("\ntoday i saw a " + name  + " movie");
//	  System.out.println("in that movie " + character  + " was amazing");
//	  System.out.println("direction is " + adjective  + " superb");
//	  System.out.println("story is " + word);
//		
//		
//		
//		
//		scanner.close();
	}


