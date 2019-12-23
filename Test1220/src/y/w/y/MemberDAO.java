package y.w.y;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class MemberDAO {
	private static ArrayList<MemberDTO> db =new ArrayList<MemberDTO> ();
	public MemberDAO() {
	}
	public ArrayList<MemberDTO> list(){
		return db;
	}
	public MemberDTO read(MemberDTO dto) {
		return db.get(db.indexOf(dto));
	}
	public void create(MemberDTO dto) {
		System.out.println(dto.getId()+"���̵� ���� �մϴ�.");
		db.add(dto);
	}
	public void update(MemberDTO dto) {
		System.out.println(dto.getId()+"���̵� ���� �մϴ�.");
		db.set(db.indexOf(dto),dto);
	}
	public void delete(MemberDTO dto) {
		System.out.println(dto.getId()+"���̵� ���� �մϴ�.");
		db.remove(db.indexOf(dto));
	}
	public boolean idCheck(String id) {
		return db.indexOf(new MemberDTO(id))==-1?true:false;
	}
	public boolean idPattern(String id) {
		return Pattern.matches("^[a-zA-Z0-9]*$",id);
	}
}
