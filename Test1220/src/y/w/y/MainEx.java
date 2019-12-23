package y.w.y;

import java.util.Scanner;

public class MainEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Member CRUD!!");
		boolean flag=true;
		Command[] com= {new Create(),new List(),new Read(),new Update(),new Delete()};
		while (flag) {
			int i = 1;
			for (Command nav : com) {
				System.out.print(i + "¹ø:" + nav);
				i++;
				if (i == 6) {
					System.out.println(i + "¹ø:end");
				}
			} 
			try {
				i=Integer.parseInt(sc.nextLine())-1;
				flag=com[i] instanceof Command? true:false;
				com[i=i<com.length?i:com.length+1].excute(sc);
			} catch (Exception e) {
				
				System.out.println("Good bye~");
				sc.close();
				return;
			}
			
		}
	}

}
