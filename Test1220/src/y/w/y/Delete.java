package y.w.y;

import java.util.Scanner;

public class Delete implements Command {

	public Delete() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excute(Scanner sc) {
		MemberDAO dao=new MemberDAO();
		System.out.println("������ ���̵� �Է����ּ���.");
		String id=sc.nextLine();
		boolean flag=dao.idCheck(id);
		if (!flag) {
				dao.delete(new MemberDTO(id));
		}else {
			System.out.println("�ߺ��Ⱦ��̵��Դϴ�.");
			System.out.println("1��:�ٽ��Է� 2��:�ʱ�ȭ��");
			int age = Integer.parseInt(sc.nextLine());
			if (age==1) {
				excute(sc);
			}else {
				return;
			}
		}
	}

	@Override
	public String toString() {
		return "Delete ";
	}

}
