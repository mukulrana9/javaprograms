import java.util.*;

class HashSetDemo
{
	public static void main(String[] args)
	{
		Set<Integer> numbers=new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		System.out.println("numbers: "+ numbers);
		boolean isRemoved = numbers.remove(10);
		System.out.println("After remove(10) => "+ numbers);
		List<Integers> perfectSquares =new ArrayList<>();
		perfectSquare.add(4);
		perfectSquare.add(9);
		numbers.removeAll(perfectSquares);
		System.out.println("After removeAll(perfectSquares) =>"+numbers);
		numbrers.removeIf(num ->num%2==0);
		System.out.println("After removeIf() =>" +numbers);
		numbers.clear();
		System.out.println("After clear() => "+numbers);
	}
}

