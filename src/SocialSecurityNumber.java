import java.util.Scanner;

public class SocialSecurityNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a SSN: ");
		String ssn = input.nextLine();

		if (ssn.length() == 11) {
			if ((ssn.charAt(0) > '0') && (ssn.charAt(0) < '9')) {
				if ((ssn.charAt(1) > '0') && (ssn.charAt(1) < '9')) {
					if ((ssn.charAt(2) > '0') && (ssn.charAt(3) < '9')) {
						if (ssn.charAt(3) == '-') {
							if ((ssn.charAt(4) > '0') && (ssn.charAt(4) < '9')) {
								if ((ssn.charAt(5) > '0') && (ssn.charAt(5) < '9')) {
									if (ssn.charAt(6) == '-') {
										if ((ssn.charAt(7) > '0') && (ssn.charAt(7) < '9')) {
											if ((ssn.charAt(8) > '0') && (ssn.charAt(8) < '9')) {
												if ((ssn.charAt(9) > '0') && (ssn.charAt(9) < '9')) {
													if ((ssn.charAt(10) > '0') && (ssn.charAt(10) < '9')) {
														System.out.print(ssn + " is a valid Social Security Number.");
													}else {
														System.out.print(ssn + " is an invalid Social Security Number.");
													}
												}else {
													System.out.print(ssn + " is an invalid Social Security Number.");
												}
											}else {
												System.out.print(ssn + " is an invalid Social Security Number.");
											}
										}else {
											System.out.print(ssn + " is an invalid Social Security Number.");
										}
									}else {
										System.out.print(ssn + " is an invalid Social Security Number.");
									}
								}else {
									System.out.print(ssn + " is an invalid Social Security Number.");
								}
							}else {
								System.out.print(ssn + " is an invalid Social Security Number.");
							}
						}else {
							System.out.print(ssn + " is an invalid Social Security Number.");
						}
					}else {
						System.out.print(ssn + " is an invalid Social Security Number.");
					}
				}else {
					System.out.print(ssn + " is an invalid Social Security Number.");
				}

			} else {
				System.out.print(ssn + " is an invalid Social Security Number.");
			}

		}else{
		System.out.print(ssn + " is an invalid Social Security Number.");
		}
	}

}
