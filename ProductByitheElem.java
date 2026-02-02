public class ProductByitheElem {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4,5};
        int n = A.length;

        int[] P = new int[n];
        int Product = 1;

        
        for (int i = 0; i < n; i++) {
            Product = Product * A[i];
        }

        
        for (int i = 0; i < n; i++) {
            P[i] = Product / A[i];
        }


        for (int i = 0; i < n; i++) {
            System.out.print(P[i] + " ");
        }
    }



