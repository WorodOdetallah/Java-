int num5, d1, num11, num2 = 0, sum1 = 0, p3 = 1, p22 = 0, p4 = 1;
			System.out.println("please enter any number");
			num5 = s.nextInt();
			System.out.println("please enter a digts");
			d1 = s.nextInt();
			for (int g = 1; g <= d1; g++) {
				p4 *= 10;
			}
			while (num5 > 0) {
				p22 = p4;
				num11 = num5 % p4;
				while (num11 > 0) {
					num2 *= 10;
					num2 += (num11 % 10);
					num11 /= 10;
				}
				num2 *= p3;
				sum1 += num2;
				p3 *= p4;
				num5 /= p4;
				num2 = 0;
			}
			System.out.println(sum1);
			
			System.out.println("please enter number of the question ,and for exit press 0");

			break;