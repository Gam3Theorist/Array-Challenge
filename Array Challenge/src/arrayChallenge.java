import java.util.Scanner;

public class arrayChallenge
	{
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);

		public static void main(String[] args)
			{
			    challengeOne();
				challengeTwo();
				challengeThree();
				challengeFour();
			}
		public static void challengeOne()
			{
				String[] name = new String[6];
				name[0] = "Pablo";
				name[1] = "John";
				name[2] = "JT";
				name[3] = "Caden";
				name[4] = "Adam";
				name[5] = "John again.";
				System.out.println(name[2]);
			}
		public static void challengeTwo()
			{
				int[] number = new int[6];
				number[0] = 65;
				number[1] = 89;
				number[2] = 69;
				number[3] = 666;
				number[4] = 420;
				number[5] = 2;
				System.out.println(number[number.length - 1]);
			}
		public static void challengeThree()
			{
				int[] number = new int[6];
				number[0] = 65;
				number[1] = 89;
				number[2] = 69;
				number[3] = 666;
				number[4] = 420;
				number[5] = 2;
				for (int i = 0; i < 6; i = i + 1)
					{
						System.out.println(number[i]);
					}
			}
		public static void challengeFour()
			{
				double[] number = new double[6];
				number[0] = 65.0;
				number[1] = 89.0;
				number[2] = 69.0;
				number[3] = 666.0;
				number[4] = 420.0;
				number[5] = 2.0;
				double length = number[number.length - 1];
				double sum = 0;
				for (int i = 0; i < number.length; i = i + 1)
					{
						sum = sum + number[i];
					}
			double average = sum / number.length;
				System.out.println("The average of the numbers is " + average + "!");
			}
	}