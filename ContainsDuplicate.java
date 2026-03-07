import java.util.*;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int arr[]) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {

            if(set.contains(arr[i])) {
                return true;  
            }

            set.add(arr[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(containsDuplicate(arr));
    }
}