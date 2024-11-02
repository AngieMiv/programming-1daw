public class Loops{
    public static void main(String[] args){

        System.out.println("Initializing FOR Loop...");
		for (int f = 1; f <= 3; f++){
			System.out.println("f = " + f);
		}
		System.out.println("Ending FOR Loop.\n");

		System.out.println("Initializing WHILE Loop...");
		int w = 1;
		while(w <= 3){
			System.out.println("w = " + w );
			w++;
		}
		System.out.println("Ending WHILE Loop.\n");

		System.out.println("Initializing DO Loop...");
		int d = 1;
		do{
			System.out.println("d = " + d);
			d++;
		}while (d <= 3);
		System.out.println("Ending DO Loop.");
    }
}
