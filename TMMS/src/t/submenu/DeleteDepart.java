package t.submenu;

import java.util.Scanner;

import t.interfaces.DeleteCommand;
import t.member.MemberDAO;

public class DeleteDepart implements DeleteCommand {

	public DeleteDepart() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Scanner sc) throws Exception {
		MemberDAO dao =new MemberDAO();
		Object target=sc.nextLine();
		boolean flag=dao.idDuplicate("id", target);
		if(flag) {
			System.out.println("������ ���� �Ͻðڽ��ϱ�?");
			
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
		return "�μ�����  ";
	}
}
