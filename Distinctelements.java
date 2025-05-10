import java.util.HashSet;

public class DistinctElements {
    public static void main(String[] args) {
        int[] array = {5,1,2,3,3,4};

        HashSet<Integer> distinct = new HashSet<>();

        for (int num : array) {
            distinct.add(num);
        }

        System.out.println("Distinct elements in the array:");
        for (int num : distinct) {
            System.out.print(num + " ");
        }
    }
}
