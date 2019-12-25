package y.q;

import java.util.Scanner;

import y.q.QuestionDAO;
import y.q.QuestionDTO;

public class Question {
	private final String[] question = { 
			"Test��� �̸��� class�� �����ϼ���.",
			"class�� ������Ҹ� ������� �Է��ϼ���.",
			"��������� ���� ������ �ѱ۷� �����ּ���.", 
			"StringŸ���� name�̶�� ��������� �����ϼ���.",
			"class �̸��� Test��� Default Constructor(��)�� ���� �ϼ���.",
			"class �̸��� Test�� User Constructor(��)�� �����Ͻð� \n������� name�� ���� �ʱ�ȭ �ϼ���.",
			"class�� ����� ǥ���ϴ� ���� �Է��ϼ���. (�ѱ۷�)",
			"��ȯŸ���� ���� �Ķ���ͷ� StringŸ���� name�̶�� ���������� �ް� �ִ� \n setName�̶�� method�� �����ϰ� methodcope�ȿ��� name�̶�� ��������� ���� \n �Ķ���ͷ� ���� name�� ���Խ��Ѻ�����.",
			"��������� name�� ��ȯ�ϴ�  getName�̶�� method�� �����غ�����.",
			"i��� ������ Ÿ���� ������ �⺻������ �����ϰ� 30���� �ʱ�ȭ ��Ű����.", 
			"d��� ������ Ÿ���� �Ǽ��� �⺻������ �����ϰ� 1.2�� �ʱ�ȭ ��Ű����.",
			"t��� ���������� TestŸ���� ��ü�� �����ϼ���. ", 
			"SuperClassŸ������ SubClass��ü�� �����Ҷ� ����ϴ� �ܾ �Է��ϼ���(�ѱ۷�)",
//			"",
//			"",
//			"", 
//			"",
//			"",
//			""
			};
	private final String[] answer= {
			"publicclassTest{}",
			"�������,������,�޼ҵ�",
			"����������Ÿ�Ժ�����;",
			"privateStringname;",
			"publicTest(){}",
			"publicTest(Stringname){this.name=name;}",
			"�޼ҵ�",
			"publicvoidsetName(Stringname){this.name=name;}",
			"publicStringgetName(){returnname;}",
			"inti=30;",
			"doubled=1.2;",
			"Testt=newTest();",
			"������",
//			"",
//			"",
//			"", 
//			"",
//			"",
//			""
	};
	public Question() {
		QuestionDAO dao = new QuestionDAO();
		for(int i=0; i<question.length;i++) {
			try {
				dao.questionAdd(new QuestionDTO(question[i],answer[i]));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void getAnswer(Scanner sc) throws Exception {
		QuestionDAO dao=new QuestionDAO();
		int i=1;
		boolean flag=true;
		for(QuestionDTO question:dao.list()) {
			if(i<(dao.list().size()+1)) {
				System.out.println(i+"."+question);
				System.out.print("��:");
				String answer=sc.nextLine();
				flag=dao.answerCheck(new QuestionDTO(answer.replace(" ","")));
				 if(flag) {
					 System.out.println("����");
				 }else {
					 System.out.println("����");
				 }
			}
			i++;
		}
	}
	

}
