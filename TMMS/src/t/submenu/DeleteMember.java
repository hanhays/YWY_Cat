package t.submenu;

import java.util.Scanner;

import t.interfaces.DeleteCommand;

public class DeleteMember implements DeleteCommand {

	public DeleteMember() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Scanner sc) throws Exception {

	}
	public String toString() {
		return "회원삭제  ";
	}
}
