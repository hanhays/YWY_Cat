package y.w.y;

import java.util.Scanner;

public class Read implements Command {

	public Read() {
	}

	@Override
	public void excute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		System.out.println("조회할 아이디를 입력해주세요.");
		String id = sc.nextLine();
		boolean flag = dao.idCheck(id);
		if (!flag) {
			MemberDTO dto=new MemberDTO(id);
			dto=dao.read(dto);
			System.out.println("아이디:"+dto.getId());
			System.out.println("이름:"+dto.getName());
			System.out.println("나이:"+dto.getAge());
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
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
		return "Read ";
	}

}
