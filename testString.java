package sortTests;

import org.junit.Test;

import arraySorting.StringSort;

import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class testString {
	String[] countries = { "Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark",
			"France", "Netherlands", "Italy", "Germany" };
	StringSort sSort = new StringSort(countries);
	@Test
	   public void testIntegerSort() {	
	      String sorted = "[ Australia, America, Denmark, France, Germany, India, Italy, Netherlands, South-Africa, Yugoslavia, Zimbabwe]";
	      assertEquals(sorted,sSort);     
	   }
}
