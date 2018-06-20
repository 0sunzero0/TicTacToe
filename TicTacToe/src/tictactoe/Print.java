package tictactoe;

public class Print {

	public static void origin() {
		//처음 표 보여주는 함수
		Game.sleep(1500);
		System.out.println("");
		System.out.println("<<< MAP >>>");
		System.out.println("  ㅡ   ㅡ  ㅡ");
		System.out.println("| 1 ㅣ 2 ㅣ 3 |");
		System.out.println(" ㅡ   ㅡ   ㅡ ");
		System.out.println("| 4 ㅣ 5 ㅣ 6 |");
		System.out.println(" ㅡ   ㅡ  ㅡ ");
		System.out.println("| 7 ㅣ 8 ㅣ 9 |");
		System.out.println(" ㅡ   ㅡ  ㅡ ");
		System.out.println("");
	
	}
	
	public static void show(int[][] map) {
		//현재상태를 보여주는 함수
		
		int i=0,j=0;
	
		System.out.println(" ㅡ   ㅡ  ㅡ ");
		for(i=0;i<3;i++) {
			System.out.print("| ");
			for(j=0;j<3;j++) {
				if(map[i][j] == 0) {
					System.out.print("  ");
					System.out.print("| ");
				}
				else if(map[i][j] ==1) {
					System.out.print("●");
					System.out.print("| ");
				}
				else if(map[i][j] == -1) {
					System.out.print("○");
					System.out.print("| ");
					
				}
			}
			System.out.println("\n ㅡ  ㅡ ㅡ ");
			
		}
		System.out.println("User : ● Computer : ○ ");
		System.out.println("\n");
	}

	

}

