int i = 1, num, num1, s1, s2, n, sum6 = 0, p2 = 1, p = 1;
			System.out.println("please enter a number");
			num = s.nextInt();
			num1 = num;
			for (i2 = 0; num1 > 0; i++) {
				num1 /= 10;
				p2 *= 10;
			}
			p2 /= 10;
			do {
				n = num % 100;
				s1 = n % 10;
				s2 = n / 10;
				sum6 += p * (s1 * 10 + s2);
				p *= 100;
				num /= 100;
			} while (num > 9);

			if (i % 2 == 0)
				System.out.println(sum6);
			else
				System.out.println(sum6 + p2 * num);
break;
