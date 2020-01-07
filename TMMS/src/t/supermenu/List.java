package t.supermenu;

import java.util.Scanner;

import t.interfaces.Command;
import t.interfaces.ListCommand;
import t.submenu.ListDepart;
import t.submenu.ListJoin;
import t.submenu.ListMember;

public class List implements Command{
	public List() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute(Scanner sc) throws Exception {
		
		ListCommand[] lc= {new ListMember(),new ListDepart(),new ListJoin()};
		int menu = 0;
		while (menu != lc.length) {
			System.out.println("1��:ȸ��List 2��:�μ�List 3��:����List 4��:�ʱ�ȭ��");
			menu = Integer.parseInt(sc.nextLine())-1;
			try {
				
				lc[menu=lc.length!=menu?menu:lc.length+1].execute();
			
			} catch (Exception e) {
				break;
			}
		}
		return;
	}
	public String toString(){
		return "����Ʈ  ";
	}
}
