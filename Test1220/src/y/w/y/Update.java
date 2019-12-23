package y.w.y;

import java.util.Scanner;

public class Update implements Command {

	public Update() {
	}

	@Override
	public void excute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		System.out.println("수정할 아이디를 입력해주세요.");
		String id = sc.nextLine();
		boolean flag = dao.idCheck(id);
		if (!flag) {
			System.out.print("수정할 이름을 입력해주세요:");
			String name = sc.nextLine();
			System.out.print("수정할 나이를 입력해주세요:");
			int age = Integer.parseInt(sc.nextLine());
			dao.update(new MemberDTO(id, name, age));
		} else {
			System.out.println("중복된아이디입니다.");
			System.out.println("1번:다시입력 2번:초기화면");
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
		return "Update ";
	}

}
