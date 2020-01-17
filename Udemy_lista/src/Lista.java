import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Rai");
		list.add("Anny");
		list.add("Ther");
		list.add("Min");

		list.add(1, "Roxo");

		System.out.println(list.size());

		// list.remove(1);

		list.removeIf(x -> x.charAt(0) == 'R');
		
		for (String i : list) {
			System.out.println(i);
		}

		System.out.println("--------------------------");

		// list.remove(1);

		list.removeIf(x -> x.charAt(0) == 'R');

		for (String i : list) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		System.out.println(list.indexOf("Anny"));
		
		System.out.println("--------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'T').collect(Collectors.toList());
		
		for (String i : result) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
}
