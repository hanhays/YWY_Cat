package y.q;

import java.util.Scanner;

import y.q.QuestionDAO;
import y.q.QuestionDTO;

public class Question {
	private final String[] question = { 
			"Test라는 이름의 class를 선언하세요.",
			"class의 구성요소를 순서대로 입력하세요.",
			"멤버변수의 선언 공식을 한글로 적어주세요.", 
			"String타입인 name이라는 멤버변수를 선언하세요.",
			"class 이름이 Test라는 Default Constructor(을)를 생성 하세요.",
			"class 이름은 Test인 User Constructor(을)를 생성하시고 \n멤버변서 name의 값을 초기화 하세요.",
			"class의 기능을 표현하는 것을 입력하세요. (한글로)",
			"반환타입은 없고 파라메터로 String타입의 name이라는 변수명으로 받고 있는 \n setName이라는 method를 선언하고 methodcope안에서 name이라는 멤버변수의 값을 \n 파라메터로 받은 name을 대입시켜보세요.",
			"멤버변수인 name을 반환하는  getName이라는 method를 선언해보세요.",
			"i라는 변수명 타입을 정수의 기본형으로 선언하고 30으로 초기화 시키세요.", 
			"d라는 변수명 타입을 실수의 기본형으로 선언하고 1.2로 초기화 시키세요.",
			"t라는 변수명으로 Test타입인 객체를 생성하세요. ", 
			"SuperClass타입으로 SubClass객체를 생성할때 사용하는 단어를 입력하세요(한글로)",
//			"",
//			"",
//			"", 
//			"",
//			"",
//			""
			};
	private final String[] answer= {
			"publicclassTest{}",
			"멤버변수,생성자,메소드",
			"접근제한자타입변수명;",
			"privateStringname;",
			"publicTest(){}",
			"publicTest(Stringname){this.name=name;}",
			"메소드",
			"publicvoidsetName(Stringname){this.name=name;}",
			"publicStringgetName(){returnname;}",
			"inti=30;",
			"doubled=1.2;",
			"Testt=newTest();",
			"다형성",
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
				System.out.print("답:");
				String answer=sc.nextLine();
				flag=dao.answerCheck(new QuestionDTO(answer.replace(" ","")));
				 if(flag) {
					 System.out.println("정답");
				 }else {
					 System.out.println("오답");
				 }
			}
			i++;
		}
	}
	

}
