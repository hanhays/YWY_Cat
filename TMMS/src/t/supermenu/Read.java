package t.supermenu;

import java.util.Scanner;

import t.interfaces.Command;
import t.interfaces.ReadCommand;
import t.submenu.ReadAge;
import t.submenu.ReadId;
import t.submenu.ReadName;

public class Read implements Command {
	public Read() {
	}
	@Override
	public void execute(Scanner sc) throws Exception {
		ReadCommand[] rc= {new ReadId(),new ReadName(),new ReadAge()};
		boolean flag= true;
		while (flag) {
			int i=1;
			for (ReadCommand nav : rc) {

				System.out.print(i + "��:" + nav + "  ");
				i++;
				if (i == rc.length + 1) {
					System.out.println(i + "��:�ʱ�ȭ��");
				}
			} 
			int menu=Integer.parseInt(sc.nextLine())-1;
			try {
				rc[menu=rc.length!=menu? menu:rc.length+1].execute(sc);
			} catch (Exception e) {
				System.out.println("�ʱ�ȭ������");
				flag=false;
				return;
			}
		}
	}
	public String toString() {
		return "��ȸ  ";
	}
}