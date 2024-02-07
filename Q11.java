int c;
			System.out.println("please enter a number");
			c = s.nextInt();

			for (int w = 1; w <= c; w++) {
				for (int e = 0; e <= c - 1; e++) {
					if (e < w)
						System.out.print("*");
					if (e >= w)
						System.out.print("#");
				}
				System.out.println();

			}
			
			System.out.println("please enter number of the question ,and for exit press 0");

			break;