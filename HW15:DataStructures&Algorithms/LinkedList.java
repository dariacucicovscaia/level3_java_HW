import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class LinkedListHomeworkJ {
	public static void main(String args[]) {
		List<Integer> ll = new LinkedList<>();
		Set<Integer> linkedHashSet = new LinkedHashSet<>();

		// generate the random elem list
		int minValue = -100;
		int maxValue = 100;

		for (int i = 0; i < 26; i++) {
			int random_int = (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
			ll.add(random_int);
		}
		System.out.println("Initial list: " + ll + "\n");

		// find the duplicate number on a given integer LinkedList
		LinkedList<Integer> linkl = new LinkedList<>();

		for (int i = 0; i < 5; i++) {
			int random_int = (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
			linkl.add(random_int);
		}

		System.out.println("Second list: " + linkl);
		System.out.print("List of duplicate numbers from the two lists:[ ");

		for (Integer numbers : linkl) {
			if (ll.contains(numbers)) {
				System.out.print(numbers + " ");
			}
		}
		System.out.println("]\n");

		// find the largest and smallest numbers in the list
		System.out.println("Largest and smallest numbers from the initial list");
		int max = -100;
		int min = 100;
		for (int i = 0; i < ll.size(); i++) {
			if (ll.get(i) < min) {
				min = ll.get(i);
			}
			if (ll.get(i) > max) {
				max = ll.get(i);
			}

		}
		System.out.println("min = " + min);
		System.out.println("max = " + max + "\n");

		// count the number of duplicates of each value in the list
		ArrayList<Integer> dupesindex = new ArrayList<Integer>();
		int k = 0;
		for (int i = 0; i < ll.size(); i++) {
			if (Collections.frequency(ll, ll.get(i)) > 1) {
				dupesindex.add(i);
				k++;
			}
		}
		if (k == 0) {
			System.out.println("The initial list has no duplicates\n");
		} else {

			ListIterator<Integer> listi = dupesindex.listIterator();

			while (listi.hasNext()) {
				linkedHashSet.add(ll.get(listi.next()));
			}

			System.out.println(
					"The value/s: " + linkedHashSet + " is/are present more than one time in the initial list");

		}
		System.out.println();
		System.out.println("Initial list size: " + ll.size());
		for (Integer elem : ll)
			linkedHashSet.add(elem);

		System.out.println("No duplicate size: " + linkedHashSet.size() + "\n");

		// reverse the order of the elements in the list without creating a copy of the
		// list
		System.out.print("Initial list reversed: [");
		String ListReversed = "";
		for (int i = (ll.size() - 1); i >= 0; i--) {
			ListReversed += ll.get(i) + ", ";
		}
		ListReversed = ListReversed.substring(0, ListReversed.length() - 2);
		System.out.println(ListReversed + " ]");
	}

}
