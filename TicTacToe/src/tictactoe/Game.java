.PHONY: all clean testckage tictactoe;

abstract public class Game {
	static final int COMPUTER = -1;
	static final int USER = 1;
	static final int BLANK = 0;

	static final int CONTINUE = 0;
	static final int USER_WIN = 1;
	static final int COMPUTER_WIN = 2;
	static final int NO_WIN = 3;

	public static void sleep(int time){

		try {

			Thread.sleep(time);

		} catch (InterruptedException e) { }

	}
	public static void printSeq(String str) {
		char[] startArray = str.toCharArray();
		int i;
		for(i=0;i<startArray.length;i++) {
			System.out.print(startArray[i]);
			Game.sleep(50);
		}
		System.out.println("");
	}
	public static void printSeq_f(String str) {
		char[] startArray = str.toCharArray();
		int i;
		for(i=0;i<startArray.length;i++) {
			System.out.print(startArray[i]);
			Game.sleep(20);
		}
		System.out.println("");
	}
}

