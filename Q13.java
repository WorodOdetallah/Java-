System.out.println("please enter an Odd number");
			int n21 = s.nextInt();
			for (int i1 = 1; i1 <= n21; i1++) {
				for (int j1 = 1; j1 <= i1; j1++) {
					System.out.print(" ");
				}
				for (int k = 0; k <= n21 - i1; k++) {
					System.out.print("* ");
				}

				System.out.println();
			}

			for (int i1 = 1; i1 <= n21; i1++) {
				for (int j1 = i1; j1 <= n21; j1++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i1; k++) {
					System.out.print("* ");
				}

				System.out.println();
			}
			System.out.println("please enter number of the question ,and for exit press 0");
			
			break;
