package t.test;

import java.util.Scanner;

import t.supermenu.Delete;

public class Test {

	public static void main(String[] args) {
		Delete d=new Delete();
		Scanner sc=new Scanner(System.in);
		try {
			d.execute(sc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
