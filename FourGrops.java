import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FourGrops {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int totStudents = 20, startRollNo = 101, outListArg = 0;

		List<List<Integer>> outerList = new ArrayList<List<Integer>>();

		for (int i = 1; i <= totStudents; i++) {

			addRolNo(outerList, startRollNo, outListArg);

			startRollNo++;
			outListArg++;

			if (outListArg == 4)
				outListArg = 0;

		}
		
		System.out.println("Total Number of Students : " + totStudents);
		System.out.println("Output : ");
		
		int groupNo = 1;
		for (List<Integer> inList : outerList) {

			System.out.println("Group " + groupNo + " :");

			for (Integer rollNo : inList) {

				System.out.println(rollNo);

			}

			groupNo++;

		}

	}

	public static void addRolNo(List<List<Integer>> outerList, int rollNo, int outListArg) {

		List<Integer> innerList = new ArrayList<Integer>();

		if (outerList.size() == 4) {
			innerList = outerList.get(outListArg);
			innerList.add(rollNo);
			outerList.set(outListArg, innerList);
		} else {
			innerList.add(rollNo);
			outerList.add(innerList);
		}
		// return outerList;

	}

}
