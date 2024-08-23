package d0823;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> strs = new ArrayList<String>();

		System.out.println(strs.size());
		strs.add("일");

		System.out.println(strs.size());
		strs.add("이");
		
		System.out.println(strs.size());
	}
}
