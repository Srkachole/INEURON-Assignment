package com.assignment;

import java.util.Random;
import java.util.Scanner;


class Umpire {
	int guessNum;
	
	int guessNum() {
		
		Random rd = new Random();
		guessNum = rd.nextInt(1,6); 
		return guessNum;
	}
}

class Player_Name{
	
	Scanner sc = new Scanner(System.in);
	
	String p_name_1;
	String p_name_2;
	String p_name_3;
	
	String player_1() {
		System.out.println("Enter the Player 1 Name : ");
		p_name_1 = sc.next();
		return p_name_1;
	}
	String player_2() {
		System.out.println("Enter the Player 2 Name : ");
		p_name_2 = sc.next();
		return p_name_2;
	}
	
	String player_3() {
		System.out.println("Enter the Player 3 Name : ");
		p_name_3 = sc.next();
		return p_name_3;
	}
}


class Player {
	int guessNum_1;
	int guessNum_2;
	int guessNum_3;
	
	Player_Name pn = new Player_Name();
	String p_name_1 = pn.player_1();
	String p_name_2 = pn.player_2();
	String p_name_3 = pn.player_3();
	
	Scanner sc = new Scanner(System.in);
	int guessNum_1() {
		
		System.out.println(p_name_1+" Select the number between 1 to 5 : ");
		guessNum_1 = sc.nextInt();	
		return guessNum_1;
	}
	
	int guessNum_2() {
		
		System.out.println(p_name_2+" Select the number between 1 to 5 : ");
		guessNum_2 = sc.nextInt();	
		return guessNum_2;
	}
	
	int guessNum_3() {
		
		System.out.println(p_name_3+" Select the number between 1 to 5 : ");
		guessNum_3 = sc.nextInt();	
		return guessNum_3;
		}
}
class Result {
	Player P1 = new Player();
	
	String p_name_1 = P1.p_name_1;
	String p_name_2 = P1.p_name_2;
	String p_name_3 = P1.p_name_3;
	
	int numPlayer_1 = P1.guessNum_1();
	int numPlayer_2 = P1.guessNum_2();
	int numPlayer_3 = P1.guessNum_3();
	
	Umpire ump = new Umpire();
	int UmpireNum = ump.guessNum();
	
	void compare() {
		
		if (UmpireNum==numPlayer_1) {
			if(UmpireNum==numPlayer_1 && UmpireNum==numPlayer_2 && UmpireNum==numPlayer_3) {
				System.out.println("All players "+p_name_1+ p_name_2 + p_name_2 + p_name_3+ " Wonnnn.....");
			}
			else if(UmpireNum==numPlayer_1 && UmpireNum==numPlayer_2){
				System.out.println(p_name_1 +" and "+ p_name_2 +" Wonnnn.....");
			}
			else if(UmpireNum==numPlayer_1 && UmpireNum==numPlayer_3){
				System.out.println(p_name_1 +" and "+p_name_3+" Wonnnn.....");
			}
			else{
				System.out.println(p_name_1 +" Wonnnn.....");
			}
		}
		
		else if (UmpireNum==numPlayer_2) {
			if(UmpireNum==numPlayer_2 && UmpireNum==numPlayer_3) {
				System.out.println(p_name_2+" and" +p_name_3+" Wonnnn.....");
			}else{
				System.out.println(p_name_2+" Wonnnn.....");
			}
		}
		else if (UmpireNum==numPlayer_3) {
			System.out.println(p_name_3+" Wonnnn.....");
		}
		else {
			System.out.println("NO Winner");
		}
		
	}
}


public class assignment_3 {

	public static void main(String[] args) {
		// Guesser Game
			System.out.println("Game has Started.Best Luck.... ");
			
			
			Result res = new Result();
			res.compare();
			System.out.println("Computer Guess Number is : "+res.UmpireNum);
	}
}
