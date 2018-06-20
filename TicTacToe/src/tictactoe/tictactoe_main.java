package tictactoe;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class tictactoe_main {

	private static Scanner scanner;

	public static void main(String[] args) throws FileNotFoundException {
		int count=1;
		int i;
		String copyright = "Developer : 21300126 Kim,Seung Woo, 21500209 Kim,Hye Yeong, 21700196 Kim,\n"
				+ "Hae Rin,21700371 Song, Min Seok, 21700583 Lee, Ji Hyun,\n 21700712 Cha, Yun JI";
		String startString = "|*******************Tic-Tac-Toe*******************|";
		Game.printSeq_f(copyright);
		System.out.println("");
		Game.printSeq(startString);

		Scanner scanner = new Scanner(System.in);
		String state = "Yes";

		// Make array map
		int[][] map = new int[3][3];
		LoadSave loadSaveHandler = new LoadSave();

		// Array initialize

		SaveMakeClean(map);
		Computer ai = new Computer();
		Needhelp();


		ai.inputlevel();

		int turn = Game.USER;
		int flag = Game.CONTINUE;


		LogicCheck check = new LogicCheck();
		RockPaperScissor ordergame = new RockPaperScissor();

		turn=ordergame.RPS();
		Print.origin();

		while(state.toLowerCase().charAt(0) == 'y') {

			// Handle input (in InputHandle, Logic check will be called and return that value)
			if (turn == Game.COMPUTER) {
				System.out.println("<<Computer turn>>");
				System.out.println("(please wait)");
				Game.sleep(1300);
				ai.computerInput(map);
				flag = check.ScoreCheck(map);
				Game.sleep(1500);//컴퓨터 맵은 늦게 나오기
			}
			else {
				InputHandle.run(map);
				flag = check.ScoreCheck(map);
				Game.sleep(500);

			}

			Print.show(map);

			if(flag != Game.CONTINUE) {
				winner(flag,count);
				count ++;
				loadSaveHandler.run(flag, "load_save.txt");
				
				state = ContinueOrNot();
				if (state.equals("y")) {
					SaveMakeClean(map);
					Print.origin();
					turn = (flag == Game.COMPUTER_WIN) ? Game.USER : Game.COMPUTER;
					continue;
				}
			}
			turn = (turn == Game.COMPUTER) ? Game.USER : Game.COMPUTER;
		}

		loadSaveHandler.showResult("load_save.txt");

		System.out.println("\nEnter any key to close the game");
		String close = scanner.next();
		scanner.close();
	}




	private static void SaveMakeClean(int[][]array) {
		int i=0;
		int j=0;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				array[i][j] = 0;
			}
		}
	}

	private static void winner(int flag, int count) {
		Game.sleep(500);
		System.out.println("<<Result>>");
		if(flag == Game.USER_WIN)
			System.out.println("game " + count +" : "+ "  User win");
		else if(flag == Game.COMPUTER_WIN)
			System.out.println("game " + count +":"+ "  Computer win");
		else if(flag == Game.NO_WIN)
			System.out.println("game" + count +" : " + "  NO Winner");
	}

	private static void Needhelp() {
		Game.printSeq("Do you need explain of TicTacToe?");
		
		String scanString;
		scanner = new Scanner(System.in);

		while(true) {
			System.out.print("Please enter (Yes/No) : ");
			scanString = scanner.nextLine();
			if (scanString.equals("Yes")) {
				Explain.explain();
				return;
			}else if (scanString.equals("No")) {
				return;
			}else {
				System.out.println("   Plz input again");
				continue;
			}
		}
	}
	
	private static String ContinueOrNot() {
		System.out.println("Do you want to play game again? ");
		while(true) {
			System.out.print("Please enter (Yes/No) : ");
			String scanString = scanner.nextLine();
			if (scanString.equals("Yes")) {
				return "y";
			}else if (scanString.equals("No")) {
				return "n";
			}else {
				System.out.println("  Plz input again");
				continue;
			}
		}

	}





}
