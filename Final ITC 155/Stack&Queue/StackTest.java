package together;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Stack;
import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	public void collapseTest() {
		int[] list = {7 , 2, 8, 9, 4, 11, 7, 1, 42};
		Stack<Integer> r = new Stack<Integer>();
		for(int num:list) {
			r.push(num);
		}
		Collapsing.collapse(r);
		int[] list2 = {9, 17, 15, 8, 42};
		Stack<Integer> expected = new Stack<Integer>();
		for (int i: list2) {
			expected.push(i);
		}
		//System.out.print(expected);
		assertEquals(expected, r);
	}

}
