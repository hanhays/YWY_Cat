package y.w.y;

import java.util.Scanner;

public class List implements Command {

	public List() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excute(Scanner sc) {
		MemberDAO dao=new MemberDAO();
		System.out.println("***MemberList***");
		if (!dao.list().isEmpty()) {
			for (MemberDTO list : dao.list()) {
				System.out.println("  " + list);
			} 
		}else {
			System.out.println("존재하는 아이디가 없습니다.");
		}
		System.out.println("****************");

	}

	@Override
	public String toString() {
		return "List ";
	}
	

}
