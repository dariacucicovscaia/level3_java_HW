package StreamCallbacks;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class HOF {

	public static void main(String[] args) {

		Stream.generate(new Supplier<Integer>() {
			int j = 0;

			@Override
			public Integer get() {
				if (j == 6) {
					return 20;
				}
				return (j++ + 2) * 10;
			}
		 })
		.limit(7)
		.filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				if (t >= 50)
					return true;
				return false;
			}

		})
				// positive approach
		.forEach(new Consumer<Integer>() {
			int j = 0;

			@Override
			public void accept(Integer i) {
				System.out.println(j++ + " " + i);
			}
		});

	}
}
