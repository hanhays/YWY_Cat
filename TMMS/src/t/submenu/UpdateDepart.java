package t.submenu;

import java.util.Scanner;
import t.interfaces.UpdateCommand;
import t.member.MemberDAO;
public class UpdateDepart implements UpdateCommand {
	public UpdateDepart() {
	}
	@Override
	public void execute(Scanner sc, Object target)   throws Exception{
		System.out.println("dname�� �Է��ϼ���.");
		String dname = sc.nextLine();
		MemberDAO dao = new MemberDAO();
		dao.Departupdate(dname, (Integer) target);
	}
}
