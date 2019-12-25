package y.q;

import java.io.Serializable;

public class QuestionDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String question;
	private String answer;
	public QuestionDTO() {
		
	}
	
	public QuestionDTO(String answer) {
		this.answer = answer;
	}

	public QuestionDTO(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
		String getQuestion() {
		return question;
	}
	void setQuestion(String question) {
		this.question = question;
	}
	String getAnswer() {
		return answer;
	}
	void setAnswer(String answer) {
		this.answer = answer;
	}

	static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return question;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuestionDTO other = (QuestionDTO) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		return true;
	}

	
}
