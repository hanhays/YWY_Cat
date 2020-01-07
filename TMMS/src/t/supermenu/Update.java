package t.supermenu;

import java.util.Scanner;
import t.interfaces.Command;
import t.interfaces.UpdateCommand;
import t.member.MemberDAO;
import t.submenu.UpdateDepart;
import t.submenu.UpdateMember;

public class Update implements Command {

	@Override
	public void execute(Scanner sc) throws Exception {

		MemberDAO dao = new MemberDAO();
		
		UpdateCommand[] uc = { new UpdateMember(), new UpdateDepart() };
		
		System.out.println("1��:ȸ���������� 2��:�μ��������� 3��:�ʱ�ȭ��");
		
		int menu = Integer.parseInt(sc.nextLine()) - 1;
		
		if (menu != uc.length) {
			String msg=menu==0?"���̵�":"�μ���ȣ";
			System.out.println("������ "+msg+"�� �Է��� �ּ���");
			String target = sc.nextLine();
			 boolean flag=dao.idDuplicate("id",target);
			if (flag) {
				uc[menu = uc.length != menu ? menu : uc.length + 1].execute(sc,target);
			} else {
				System.out.println("�Է��Ͻ� ���̵�� �����ϴ�.");
				System.out.println("1:�ٽ��Է� 2��:�ʱ�ȭ��");
				menu = Integer.parseInt(sc.nextLine());
				if (menu == 1) {
					execute(sc);
				} else {
					return;
				}
			}
		} else {
			System.out.println("�ʱ�ȭ������ �̵� �մϴ�.");
			return;
		}
	}
	public String toString() {
		return "����  ";
	}

}
