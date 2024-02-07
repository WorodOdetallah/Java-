int a, j, c = 0;
			double n1, n2;
			for (a = 10; a <= 99; a++) {
				for (j = a + 1; j <= 99; j++) {
					n1 = (double) a / j;
					n2 = (double) (a / 10) / (j % 10);
					if (n1 == n2) {
						System.out.println(a + "/" + j);
						c++;
					}
				}
			}
			System.out.println("the number of how much fractions we have is " + c);
			
			System.out.println("please enter number of the question ,and for exit press 0");

			break;
