package main;


import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class AppStream {

	static int is = 0;
	public static void main(String[] args) {
		Consumer<Integer> c = new ConsImpl<Integer>();	
		Supplier<Integer> s = new Suply<Integer>();
		Stream.generate(s)                             // 20 30 40 50 60 70 20
			  .limit(7)
			  .filter(wh -> wh >= 50)        // positive approach
			  .forEach(c);
		
	}
}

class ConsImpl<T> implements Consumer<Integer> {
	static int j=0;
	@Override
	public void accept(Integer i) {
			System.out.println(j++ +" "+ i);
	}
}

class Suply<T> implements Supplier<Integer>{
	static int j=0;
	@Override
	public Integer get() {
		if (j == 6) {
			return 20;
		}
		return (j++ + 2) * 10;
	}
	
}


