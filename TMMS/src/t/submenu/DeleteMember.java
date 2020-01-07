package t.submenu;

import java.util.Scanner;

import t.interfaces.DeleteCommand;
import t.member.MemberDAO;

public class DeleteMember implements DeleteCommand {

	public DeleteMember() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Scanner sc) throws Exception {
		MemberDAO dao =new MemberDAO();
		System.out.println("�����Ͻ� ���̵� �Է��� �ּ���."); 
		String target=sc.nextLine();
		boolean flag=dao.idDuplicate("id", target);
		if(flag) {
			System.out.println(target+"(��)�������� ���� �Ͻðڽ��ϱ�?(Y/N)");
			String choice=sc.nextLine().toUpperCase();
			if(choice.equals("Y")) {
				dao.memberDelete(target);
			}else {
				System.out.println("1��:�ٽ��Է� 2��:�ʱ�ȭ��");
				int menu=Integer.parseInt(sc.nextLine());
				if(menu==1) {
					execute(sc);
				}else {
					return;
				}
			}
		}else {
			System.out.println(target+"(��)�� �������� �ʽ��ϴ�.");
			System.out.println("1��:�ٽ��Է� 2��:�ʱ�ȭ��");
			int menu=Integer.parseInt(sc.nextLine());
			if(menu==1) {
				execute(sc);
			}else {
				return;
			}
		}
	}
	public String toString() {
		return "ȸ������  ";
	}
}
