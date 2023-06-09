import java.sql.Date;
import java.util.ArrayList;

public class Gym {

	String g_name;
	String g_addresss;

	String[] workout_plans = { "Premium: cardio, weight traning, gymnasthics, calesthenics, swimming pool access ",
			"Standard: weight traning" };

	ArrayList<Member> gym_members = new ArrayList<Member>();

	public Gym(String g_name, String g_addresss) {
		this.g_name = g_name;
		this.g_addresss = g_addresss;
	}

	//////////// ADD PREMIUM MEMBER//////////
	public void addPremiumMember(String name, int age, int fees, String trainerName) {
		int id = gym_members.size() + 1;
		Member m = new PremiumMember(name, id, age, fees, trainerName);// Polymorphism
		((PremiumMember) m).setPlan(workout_plans[0]);
		gym_members.add(m);
		m.fee_status = true;
		System.out.println("Your ID is " + id);
	}

	//////////// ADD STANDARD MEMBER//////////
	public void addStandardMember(String name, int age, int fees) {
		int id = gym_members.size() + 1;
		Member m = new StandardMember(name, id, age, fees);// Polymorphism
		((StandardMember) m).setPlan(workout_plans[1]);
		gym_members.add(m);
		m.fee_status = true;
		System.out.println("Your ID is " + id);
	}

	////////// GET CURRENT INCOME/////////
	public int getCurrentIncome() {
		int curr = 0;
		for (Member m : gym_members) {
			m.dueFee();
			if (m.fee_status == true) {
				curr += m.m_fees;
			}
		}
		return curr;
	}

	/////////// GET ESTIMATED INCOME////////////
	public int getEstimatedIncome() {
		int est = 0;
		for (Member m : gym_members) {
			est += m.m_fees;
		}
		return est;
	}

	////////// VIEW MEMBER DETAILS/////////////
	public void viewMemberDetails(int id) {
		for (Member m : gym_members) {
			if (m.m_id == id) {
				m.showDetail();
			}
		}
	}

	////////// SHOW FEE DEFAULTERS/////////////
	public void showDefaulters() {
		for (Member m : gym_members) {
			if (m.fee_status == false) {
				m.dueFee();
				System.out.println("NAME: " + m.m_name + ", ID" + m.m_id + " , DUE FEES: " + m.due_fees);
			}
		}
	}

	////////// COLLECT MEMBER FEE///////////////
	public void collectFee(int id) {
		for (Member m : gym_members) {

			if (m.m_id == id) {
				m.fee_status = true;
				System.out.println("Fee Collected !!!");
			}
		}
	}

	///////// RESET FEE STAUS FOR EVERY MEMBER//////////
	public void resetAllFeeStatus() {
		for (Member m : gym_members) {
			m.fee_status = false;
		}
		System.out.println("Fee Status Reset Done !!!");
	}

	/////////// MEMBER FEE STATUS////////////
	public void showFeeStatus(int id) {
		for (Member m : gym_members) {
			if (m.m_id == id) {
				m.dueFee();
				System.out.println("NAME: " + m.m_name + " , DUE FEES: " + m.due_fees);
			}
		}
	}

}