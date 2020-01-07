package t.submenu;

import java.util.Scanner;

import t.depart.DepartDAO;
import t.interfaces.ReadCommand;
import t.member.MemberDAO;
import t.member.MemberDTO;

public class ReadId implements ReadCommand {
	
	public ReadId() {
	}

	@Override
	public void execute(Scanner sc) throws Exception {

		System.out.println("ID�� �Է��ϼ���");
		String target = sc.nextLine();

		MemberDAO dao = new MemberDAO();
		if (dao.idDuplicate("id",target)) {
			MemberDTO dto = dao.memberRead("id",target);
			System.out.println("���̵�\t�̸�\t����\t�μ���");
			System.out.print(dto.getId() + "\t");
			System.out.print(dto.getName() + "\t");
			System.out.print(dto.getAge() + "\t");
			System.out.print(new DepartDAO().getDname(dto.getDid()) + "\n");
		} else {
			System.out.println(target + "(��)�� ���� ID�Դϴ�.");
		}

	}

	@Override
	public String toString() {
		return "���̵����ȸ";
	}
}