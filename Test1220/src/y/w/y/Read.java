package y.w.y;

import java.util.Scanner;

public class Read implements Command {

	public Read() {
	}

	@Override
	public void excute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		System.out.println("��ȸ�� ���̵� �Է����ּ���.");
		String id = sc.nextLine();
		boolean flag = dao.idCheck(id);
		if (!flag) {
			MemberDTO dto=new MemberDTO(id);
			dto=dao.read(dto);
			System.out.println("���̵�:"+dto.getId());
			System.out.println("�̸�:"+dto.getName());
			System.out.println("����:"+dto.getAge());
		} else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			System.out.println("1��:�ٽ��Է� 2��:�ʱ�ȭ��");
			int age = Integer.parseInt(sc.nextLine());
			if (age == 1) {
				excute(sc);
			} else {
				return;
			}
		}
	}

	@Override
	public String toString() {
		return "Read ";
	}

}
