import java.util.*;

public class CountOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list of numbers e.g.( 15 25 15 11 25 32 15 32): ");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println("Occurrence of " + entry.getKey() + "=" + entry.getValue());
        }

        scanner.close();
    }
}