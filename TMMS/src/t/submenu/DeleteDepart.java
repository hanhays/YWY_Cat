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
			System.out.println("정말로 삭제 하시겠습니까?");
			
		}else {
			System.out.println(target+"(은)는 존재하지 않습니다.");
			System.out.println("1번:다시입력 2번:초기화면");
			int menu=Integer.parseInt(sc.nextLine());
			if(menu==1) {
				execute(sc);
			}else {
				return;
			}
		}
	}
	public String toString() {
		return "부서삭제  ";
	}
}
