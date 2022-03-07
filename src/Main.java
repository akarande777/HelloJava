import algorithms.*;
import data_structures.*;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 12; i++)
			list.append(r.nextInt(100));
		BubbleSort.sort(list, (a, b) -> a - b);
		for (int i = 0; i < list.length(); i++)
			System.out.println(list.getItem(i));
	}
}
