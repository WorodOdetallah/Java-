int sum4 = 0;
			int c1 = 1;
			for (int num8 = 1; c1 <= 10; num8++) {
				int d3 = 2;
				int num13 = num8;
				int sum9 = 0;
				double num22 = num8;
				while (num13 / d3 != 0) {
					if (num13 / d3 == num22 / d3) {
						sum9 += num13 / d3;
					}
					d3++;
				}
				d3 = 2;
				int sum3 = 0;
				double sum11 = sum9;
				while (sum9 / d3 != 0) {
					if (sum9 / d3 == sum11 / d3) {
						sum3 += sum9 / d3;
					}
			     		d3++;
				}
				if (num13 == sum3 && sum9 != sum3 && sum4 != sum3) {
					System.out.println(c1 + ") " + sum3 + " and " + sum9 + " are mates");
					sum4 = sum9;
					c1++;
				}
			}
			
			
			
			System.out.println("please enter number of the question ,and for exit press 0");
			
			break;
			default:System.out.println(" question number incorrect  please enter correct number or press 0 to exit");
		}
		
		q = s.nextInt();
		
		}

	}
}