package y.q;

import java.util.Scanner;

public class MainEx {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Question q=new Question();
		boolean flag=true;
		while (flag) {
			System.out.println("1번:문제 2:종료");
			int menu=Integer.valueOf(sc.nextLine())-1;
			switch (menu) {
			case 0:
				q.getAnswer(sc);
				break;

			default:
				flag=false;
				break;
			}
		}
		
	}
}
