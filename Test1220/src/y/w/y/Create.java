package y.w.y;

import java.util.Scanner;

public class Create implements Command {

	public Create() {
	}

	@Override
	public void excute(Scanner sc) {
		MemberDAO dao=new MemberDAO();
		System.out.println("���̵� �Է����ּ���.");
		String id=sc.nextLine();
		boolean flag=dao.idCheck(id);
		if (flag) {
			flag = dao.idPattern(id);
			if (flag) {
				System.out.print("�̸��� �Է����ּ���:");
				String name = sc.nextLine();
				System.out.print("���̸� �Է����ּ���:");
				int age = Integer.parseInt(sc.nextLine());
				dao.create(new MemberDTO(id, name, age));
			}else {
				System.out.println("�԰ݿ� ���� �ʽ��ϴ�.");
				System.out.println("1��:�ٽ��Է� 2��:�ʱ�ȭ��");
				int age = Integer.parseInt(sc.nextLine());
				if (age==1) {
					excute(sc);
				}else {
					return;
				}
			}
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
		return "Create ";
	}
	
}
