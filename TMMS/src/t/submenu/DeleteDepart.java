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
	
	}
	public String toString() {
		return "부서삭제  ";
	}
}
