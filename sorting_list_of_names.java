import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class sorting_list_of_names {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.print("Enter the number of names: ");
        int count = in.nextInt();
        in.nextLine();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter name " + i + ": ");
            String name = in.nextLine();
            names.add(name);
        }

        System.out.print("Sort names in ascending (A) or descending (D) order? ");
        String sortOrder = in.nextLine();

        if (sortOrder.equalsIgnoreCase("A")) {
            Collections.sort(names);
        } else if (sortOrder.equalsIgnoreCase("D")) {
            Collections.sort(names, Collections.reverseOrder());
        } else {
            System.out.println("Invalid sort order choice.");
            return;
        }

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
