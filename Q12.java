System.out.println("please enter an Odd number");
			int b3 = s.nextInt();
			for (int l = 1; l <= n3; l++) {
				for (int i3 = 1; i3 <= b3; i3++) {
					for (int j3 = i3; j3 <= b3; j3++) {
						System.out.print(" ");
					}
					for (int k = 1; k <= i3; k++) {
						System.out.print("* ");
					}

					System.out.println();
				}
			}
			for (int o = 1; o <= b3; o++) {
				for (int m = 1; m <= b3; m++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
			
			System.out.println("please enter number of the question ,and for exit press 0");

		         	break;