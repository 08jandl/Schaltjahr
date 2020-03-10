package campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean istEins = istSchaltjahr(3469);
        System.out.println("Ist ein Schaltjahr: " + istEins);
    }

    public static boolean istSchaltjahr (int jahr) {

        boolean schaltjahr = true;

        if (jahr % 4 == 0 && jahr % 100 == 0 && jahr % 400 == 0) {
            schaltjahr = true;
        }
        else if (jahr % 4 == 0 && jahr % 100 == 0) {
            schaltjahr = false;
        }
        else if ( jahr % 4 == 0) {
            schaltjahr = true;
        }
        else {
            schaltjahr = false;
        }
        return schaltjahr;
    }

}
