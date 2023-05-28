package question1;
import java.util.*;
public class Exam extends Question {
	private Question[] q = new Question[5];
	private double score;
	private Student s;
	public Exam() {
		score = 0;
	}
	public Exam(String[] quesStatement, String[] answer) {

		for (int i = 0; i < q.length; i++) {
			
			Question obj = new Question();
			q[i] = obj;
			
			q[i].setQuesStatement(quesStatement[i]);
			q[i].setAnswer(answer[i]);
		}
	}
	public void assignStudents(Student s) {
		this.s = s;
	}
	public void TakeExam() {
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < q.length; i++) {
			
			System.out.print(q[i].getQuesStatement()+"\n<<Enter answer: ");
			String answer = inp.next();
			
			if (answer.equalsIgnoreCase(q[i].getAnswer())) {
				score = score + 2;
				System.out.println(">>Correct..!\n------------------");
			} else {
				System.out.println(">>Incorrect..! (correct option [" + q[i].getAnswer() + "] )\n------------------");
			}

		}
	}

	public void displayStatus() {
		if (score >= 5) {
			System.out.println("\n> PASS..! ("+score+") marks\n\n------------------");
		} else {
			System.out.println("\n> FAIL..! ("+score+") marks\n\n------------------");
		}
	}

	public String toString() {
		String info = "\n>>>>---SESSIONAL#2---23/7/2020---<<<<";
		return info;
	}
}
