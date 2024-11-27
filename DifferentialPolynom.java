public class DifferentialPolynom {
    public static void main(String[] args) {
        double[] coeffs = {4,1,6,8,67};
        double[] coeffs2 = {2,8};
        double[] coeffs3 = {98,256,1,7,34,90,2};
        double[] coeffs4 = {93};
        double[] coeffs5 = {0.5424, 0.8693265};

        System.out.println(java.util.Arrays.toString(diffPoly(coeffs)));
        System.out.println(java.util.Arrays.toString(diffPoly(coeffs2)));
        System.out.println(java.util.Arrays.toString(diffPoly(coeffs3)));
        System.out.println(java.util.Arrays.toString(diffPoly(coeffs4)));
        System.out.println(java.util.Arrays.toString(diffPoly(coeffs5)));

    }
    public static double[] diffPoly(double[] coeffs){
    
        double[] leeresarray = new double[0];
        double[] ablcoeffs = new double[coeffs.length - 1];

        if(coeffs.length <= 1){
            return leeresarray; // ein Array mit nur einem Element gibt ein leeres Array zurück.
        } else{
            for (int i = 1; i < coeffs.length; i++) { // wird ab dem 2. Index angefangen, weil der 1. Index
                // in der Ableitung == 0 ist.
                ablcoeffs[i-1] = coeffs[i] * i; // "i - 1" das wir das erste Element in dem Array "ablcoeffs"
                // in dem ersten Index speichern wollen.
            }
        } return ablcoeffs;
    }

}