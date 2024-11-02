/*
Solve 2nd grade equation, using SCANNER too
ax^2 + bx + c
ask a; ask b; ask c;

x1 = (-b + squareroot of -b+4ab) / 2a;
x2 = (-b - squareroot of -b4ab) / 2a
if a == 0
	print "can't be solved";
else
	inside_root = b^2 - 4ac
	if (d < 0)
		print "no real result"
	else
		root = Math.sqrt(inside_root); ** Math.sqrt is the f(x) of the squareroot
		x1 = (-b + d) / 2a;
		x2 = (-b - d) / 2a;
		print x1;
		print x2;

*/

import java.util.Scanner;

public class SecondGradeEquationResult{
	public static void main(String[] args) {
		System.out.println("Solving a Second Grade Equation...");
		
		Scanner sc = new Scanner(System.in); //ask a; ask b; ask c
		System.out.println("Enter a");
		Double a = sc.nextDouble();
		System.out.println("Enter b");
		Double b = sc.nextDouble();
		System.out.println("Enter c");
		Double c = sc.nextDouble();

		if (a == 0)
		System.out.println("Can't be solved");
		else{
			Double inside_root = (b * b) - (4 * a * c); // discriminante(inside_root): What´s inside the root, I´ll just call it root
			if (inside_root < 0)
				System.out.println("No real result");
			else{
				double root = Math.sqrt(inside_root);
				double x1 = (-b + root) / (2 * a);
				double x2 = (-b - root) / (2 * a);
				//Now we print the 2 results
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
				System.out.println("Ending programm...");
			}
		}
	}
}