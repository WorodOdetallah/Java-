int ic = 1, id, d = 0, sum = 0;
			System.out.println("enter your Identity number");
			id = s.nextInt();
			while (id != 0) {
				d = id % 10;
				if (ic % 2 == 0 && d >= 6 && d <= 9) {
					sum += 1 + ((d * 2) % 10);
				}
				if (ic % 2 == 0 && d == 5) {
					sum += 1;
				}
				if (ic % 2 == 0 && d >= 0 && d <= 4) {
					sum += d * 2;
				}
				if ((ic % 2) != 0) {
					sum += d;
				}

				id /= 10;
				ic++;
			}
			if (sum % 10 == 0)
				System.out.println("your Identity number is correct");
			else
				System.out.println("your Identity number is incorrect");
			
			System.out.println("please enter any number of the question ,and for exit press 0");

			break;