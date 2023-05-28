package question1;

public class Question {
	private String id;
	private String quesStatement;
	private String answer;
	public Question() {
	}
	public Question(String id, String quesStatement, String answer) {
		this.id = id;
		this.quesStatement = quesStatement;
		this.answer = answer;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setQuesStatement(String quesStatement) {
		this.quesStatement = quesStatement;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getId() {
		return this.id;
	}

	public String getQuesStatement() {
		return this.quesStatement;
	}

	public String getAnswer() {
		return this.answer;
	}
}