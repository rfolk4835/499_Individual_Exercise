package sortTests;

import org.junit.Test;

import arraySorting.IntegerSort;

import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class testInt {
	int[] array = new int[] { 12, 3, 5, 21, 4, 85, 6, 9, 2, 1 };
	IntegerSort intSort = new IntegerSort(array);
	
	@Test
	   public void testIntegerSort() {	
	      String sorted = "[1, 2, 3, 4, 5, 6, 9, 12, 21, 85]";
	      assertEquals(sorted,intSort);     
	   }
}
