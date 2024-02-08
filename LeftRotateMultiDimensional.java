import java.util.Scanner;

public class LeftRotateMultiDimensional {

	public static void main(String[] args) {

//		int rowValue = 3, columnValue = 3;
//
//		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//		int rowValue = 4, columnValue = 4;

		// int[][] array1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13,
		// 14, 15, 16 } };

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the row count : ");

		int rowValue = scanner.nextInt();

		System.out.println("Enter the Column count : ");

		int columnValue = scanner.nextInt();

		System.out.println("Enter the no of left rotation count : ");

		int rotate = scanner.nextInt();

		int rotateOrder = 1;

		int[][] array1 = new int[rowValue][columnValue];

		int[][] outputArray = new int[rowValue][columnValue];

		for (int i = 0; i < rowValue; i++) {

			System.out.println("Enter the row " + (i + 1) + " value ( enter " + rowValue + " value ) : ");

			for (int j = 0; j < columnValue; j++) {
				array1[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Before Left Rotate : ");

		for (int i = 0; i < rowValue; i++) {
			for (int j = 0; j < columnValue; j++) {
				System.out.print(array1[i][j] + " ");
				outputArray[i][j] = array1[i][j];
			}
			System.out.println();
		}

		// process

		while (rotate != 0) {

			int i = 1, j = 1, startPosI = 1, startPosJ = 1, row = rowValue, column = columnValue;

			while (true) {

				for (j = startPosJ; j <= row; j++) { // top row iterate

					if (j == row)
						outputArray[i - 1][j - 1] = array1[i][j - 1];
					else
						outputArray[i - 1][j - 1] = array1[i - 1][j];
				}

				j--;

				for (i = (startPosI + 1); i <= column; i++) { // right side iterate

					if (i == column)
						outputArray[i - 1][j - 1] = array1[i - 1][j - 2];
					else
						outputArray[i - 1][j - 1] = array1[i][j - 1];

				}

				i = row;

				for (j = row - 1; j >= startPosJ; j--) { // bottom row iterate
					if (j == startPosJ)
						outputArray[i - 1][j - 1] = array1[i - 2][j - 1];
					else
						outputArray[i - 1][j - 1] = array1[i - 1][j - 2];
				}

				j = startPosJ;

				for (i = startPosI + 1; i < column; i++) { // left side iterate

					outputArray[i - 1][j - 1] = array1[i - 2][j - 1];

				}

				startPosI++;
				startPosJ++;
				i = startPosI;
				j = startPosJ;
				row--;
				column--;

				if (array1.length<=2 || startPosI == row)
					break;
				else {
					if (row % 2 == 0) {
						if ((startPosI - 1) == row)
							break;
					}
				}

			}

			System.out.println("Left Rotate " + rotateOrder + " time :");

			rotateOrder++;

			for (i = 0; i < rowValue; i++) {
				for (j = 0; j < columnValue; j++) {
					System.out.print(outputArray[i][j] + " ");
					array1[i][j] = outputArray[i][j];
				}
				System.out.println();
			}

			rotate--;

		}

	}

}
