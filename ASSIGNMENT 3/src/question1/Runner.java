package question1;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("ALI", 19, 047);

		
		String[] quesStatement = { "Where is Allah?[Everywhere , InSky]", "Where are stars?[Space , Water]",
				"Where is sun?[Air , Milkyway]", "Where is earth?[SolarSystem , BlackHole]",
				"In which continent is Pakistan Situated?[Asia , Africa]" };
		String[] answers = { "Everywhere", "Space", "Milkyway", "SolarSystem", "Asia" };
		Exam exm1 = new Exam(quesStatement, answers);


		System.out.println("------------------");
		exm1.assignStudents(stu1);
		exm1.TakeExam();

		exm1.displayStatus();
		System.out.println(exm1.toString());

	}
}
