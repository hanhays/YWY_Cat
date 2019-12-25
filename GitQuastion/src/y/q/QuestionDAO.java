package y.q;

import java.util.ArrayList;
public class QuestionDAO {
	private static ArrayList<QuestionDTO> qdb = new ArrayList<QuestionDTO>();

	public QuestionDAO() {
	}

	public ArrayList<QuestionDTO> list() throws Exception {
		return qdb;
	}

	public void questionAdd(QuestionDTO dto) throws Exception {
		qdb.add(dto);
	}
	public QuestionDTO qdbGet(QuestionDTO dto) {
		return qdb.get(qdb.indexOf(dto));
	}

	public void questionRemove() throws Exception {
		qdb.clear();
	}
	public boolean answerCheck(QuestionDTO dto) {
		boolean flag=qdb.indexOf(dto)==-1?false:true;
		return flag;
	}
	
}
