//package question_1;
//
//public class HumanResource {
//
//	Association[] hr = new Association[0];
//
///////////////////////////////////////////////////////////////////////////
//	public HumanResource() {
//	}
//
///////////////////////////////////////////////////////////////////////////
//	public void addHumanResource(String name, String id, String type) {
//		hr = extendArr(hr);
//		int i = hr.length - 1;
//		if (type.equalsIgnoreCase("Teacher")) {
//			hr[i] = new Teacher(name, id);
//			hr[i].associate();
//		} else if (type.equalsIgnoreCase("Student")) {
//			hr[i] = new Student(name, id);
//			hr[i].associate();
//		}
//		System.out.println("\n-> ADDED..!\n");
//	}
//
//	private Association[] extendArr(Association[] originalArr) {
//		Association[] extendedArr = new Association[originalArr.length + 1];
//		for (int i = 0; i < originalArr.length; i++) {
//			extendedArr[i] = originalArr[i];
//		}
//		return extendedArr;
//	}
//
/////////////////////////////////////////////////////////////////////////////
//	public void delHumanResource(String id) {
//		for (int i = 0; i < hr.length; i++) {
//			if (hr[i].getId().equals(id)) {
//				hr[i] = null;
//			}
//		}
//		hr = reduceArr(hr);
//		System.out.println("--> DELETED ID [" + id + "]..!");
//	}
//
////To Run this function i have used getter
//	private Association[] reduceArr(Association[] originalArr) {
//		Association[] reducedArr = new Association[originalArr.length - 1];
//		int count = -1;
//		for (int i = 0; i < originalArr.length; i++) {
//			if (originalArr[i] != null) {
//				count++;
//				reducedArr[count] = originalArr[i];
//			}
//		}
//		return reducedArr;
//	}
//
////////////////////////////////////////////////////////////////////////////////
//	public String toString() {
//		String output = "\t----------------------------";
//		for (int i = 0; i < hr.length; i++) {
//			output = output + "\n" + hr[i];
//		}
//		output = output + "\n\n\t----------------------------";
//		return output;
//	}
/////////////////////////////////////////////////////////////////////////////////	
//}
package question_1;

import java.util.*;

public class HumanResource {

	int count = 0;
	ArrayList<Association> HRlist = new ArrayList<Association>();

/////////////////////////////////////////////////////////////////////////
	public HumanResource() {
	}

/////////////////////////////////////////////////////////////////////////
	public void addHumanResource(String name, String id, String type) {

		if (type.equalsIgnoreCase("Teacher")) {
			HRlist.add(new Teacher(name, id));
			HRlist.get(count).associate();
		} else if (type.equalsIgnoreCase("Student")) {
			HRlist.add(new Student(name, id));
			HRlist.get(count).associate();
		}
		count++;
	}

///////////////////////////////////////////////////////////////////////////
	public void delHumanResource(String name, String id) {
		for (int i = 0; i < HRlist.size(); i++) {
			if ((HRlist.get(i).getId().equals(id)) || (HRlist.get(i).getName().equalsIgnoreCase(name))) {
				HRlist.remove(i);
			}
		}
	}

//////////////////////////////////////////////////////////////////////////////
	public String toString() {
		String output = "\t----------------------------";
		for (int i = 0; i < HRlist.size(); i++) {
			output = output + "\n" + HRlist.get(i).toString();
		}
		output = output + "\n\n\t----------------------------";
		return output;
	}
///////////////////////////////////////////////////////////////////////////////	
}
