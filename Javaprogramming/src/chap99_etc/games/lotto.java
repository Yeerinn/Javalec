package chap99_etc.games;

import java.util.Scanner;

public class lotto {
	private int num = 0;
	
	
	private int[] com = new int[6];
	
	private int[] user = new int[6];
	
	public int gameCnt = 0;
	
	private Scanner sc = new Scanner(System.in);
	
	public void start() {
		generateRandom ();
		
		while(true) {
		
			getUserInput();
			
		public void generateRandom() {
			for(int i = 0; i < com.length; i++) {
				com [i] = (int)(Math.random() * 45) + 1;
				
				if(i < 0) {
					if(checkDumplicate(com, i)) {
						i--;
						continue;
					}
				}
			}
		}
			
		public void getUserInput() {
			for(int i = 0; i < user.length; i++) {
				System.out.println("1 ~ 45까지 정수 하나 입력.");
				user[i] = sc.nextInt();
				
				if(i < 0) {
					if(checkDumplicate(user, i)) {
						i--;
						continue;
					}
				}
			}
			gameCnt++;
		}
			
		public boolean checkDumplicate(int[] arr, int num) {
			for(int j = 0; j < num; j++) {
				if(arr[num] == arr[j]) {
					return true;
				}
			}
			return false;
		}
			
			
			
			
			
			
	}
	
	
	
	}

	
}
