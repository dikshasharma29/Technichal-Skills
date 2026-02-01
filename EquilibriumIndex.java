import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] Ps = new int[n];
        int[] Ls = new int[n];
        int[] Rs = new int[n];

        Ps[0] = arr[0];
        for (int i = 1; i < n; i++) {
            Ps[i] = Ps[i - 1] + arr[i];
        }

        Ls[0] = 0;
        for (int i = 1; i < n; i++) {
            Ls[i] = Ps[i - 1];
        }

        for (int i = 0; i < n; i++) {
            Rs[i] = Ps[n - 1] - Ps[i];
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (Ls[i] == Rs[i]) {
                count++;
            }
        }

        System.out.println("The number of equilibrium index is : " + count);
    }
}
