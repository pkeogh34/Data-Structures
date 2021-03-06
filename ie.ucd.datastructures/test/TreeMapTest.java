import Classes.TreeMap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class TreeMapTest {

	@Test
	void testSize() {
		TreeMap<Integer, String> map = new TreeMap<>();
		assertEquals(0, map.size());
		map.put(1, "one");
		map.put(2, "two");
		assertEquals(2, map.size());
	}

	@Test
	void testRoot() {
		TreeMap<Integer, String> map = new TreeMap<>();
		Integer[] arr = new Integer[] {35,26,15,24,33,4,12,1,23,21,2,5};

		for(Integer i : arr) {
			map.put(i, Integer.toString(i));
		}
		
		//assertEquals(java.util.Optional.of(35), ((TreeMap<Integer, String>) map).root().getElement().getKey());
	}

	@Test
	void testGet() {
		TreeMap<Integer, String> map = new TreeMap<>();
		Integer[] arr = new Integer[] {35,26,15,24,33,4,12,1,23,21,2,5};

		for(Integer i : arr) {
			map.put(i, Integer.toString(i));
		}
		assertEquals("15", map.get(15));
		assertEquals("24", map.get(24));
		assertEquals(null, map.get(-1));

	}

	@Test
	void testPut() {
		TreeMap<Integer, String> map = new TreeMap<>();
		Integer[] arr = new Integer[] {35,26,15,24,33,4,12,1,23,21,2,5};

		for(Integer i : arr) {
			map.put(i, Integer.toString(i));
		}
		
		assertEquals("[1, 2, 4, 5, 12, 15, 21, 23, 24, 26, 33, 35]", map.keySet().toString());
	}

	@Test
	void testRemoveK() {
		TreeMap<Integer, String> map = new TreeMap<>();
		Integer[] arr = new Integer[] {35,26,15,24,33,4,12,1,23,21,2,5};

		for(Integer i : arr) {
			map.put(i, Integer.toString(i));
		}

		assertEquals(12, map.size());
		assertEquals("26", map.remove(26));
		assertEquals(11, map.size());

	}

	@Test
	void testFirstEntry() {
		//Classes.TreeMap<Integer, String> map = new Classes.TreeMap<>();
		TreeMap<Integer, String> map = new TreeMap<>();
		Integer[] arr = new Integer[] {35,26,15,24,33,4,12,1,23,21,2,5};

		for(Integer i : arr) {
			map.put(i, Integer.toString(i));
		}
		
		assertEquals(java.util.Optional.of(1), map.firstEntry().getKey());
	}

	@Test
	void testLastEntry() {
		TreeMap<Integer, String> map = new TreeMap<>();
		//java.util.Classes.TreeMap<Integer, String> map = new java.util.Classes.TreeMap<>();
		Integer[] arr = new Integer[] {35,26,15,24,33,4,12,1,23,21,2,5};

		for(Integer i : arr) {
			map.put(i, Integer.toString(i));
		}
		
		assertEquals(java.util.Optional.of(35), map.lastEntry().getKey());
	}

	@Test
	void testCeilingEntry() {
		TreeMap<Integer, String> map = new TreeMap<>();
		//java.util.Classes.TreeMap<Integer, String> map = new java.util.Classes.TreeMap<>();
		Integer[] arr = new Integer[] {35,26,15,24,33,4,12,1,23,21,2,5};

		for(Integer i : arr) {
			map.put(i, Integer.toString(i));
		}
		
		assertEquals(java.util.Optional.of(12), map.ceilingEntry(11).getKey());
		
		assertEquals(java.util.Optional.of(2), map.ceilingEntry(2).getKey());

	}

	@Test
	void testFloorEntry() {
		TreeMap<Integer, String> map = new TreeMap<>();
		//java.util.Classes.TreeMap<Integer, String> map = new java.util.Classes.TreeMap<>();
		Integer[] arr = new Integer[] {35,26,15,24,33,4,12,1,23,21,2,5};

		for(Integer i : arr) {
			map.put(i, Integer.toString(i));
		}
		
		assertEquals(java.util.Optional.of(5), map.floorEntry(11).getKey());
		assertEquals(java.util.Optional.of(5), map.floorEntry(5).getKey());

	}

	@Test
	void testLowerEntry() {
		TreeMap<Integer, String> map = new TreeMap<>();
		//java.util.Classes.TreeMap<Integer, String> map = new java.util.Classes.TreeMap<>();
		Integer[] arr = new Integer[] {35,26,15,24,33,4,12,1,23,21,2,5};

		for(Integer i : arr) {
			map.put(i, Integer.toString(i));
		}
		
		assertEquals(java.util.Optional.of(23), map.lowerEntry(24).getKey());
		assertEquals(java.util.Optional.of(26), map.lowerEntry(31).getKey());
	}

	@Test
	void testHigherEntry() {
		TreeMap<Integer, String> map = new TreeMap<>();
		//java.util.Classes.TreeMap<Integer, String> map = new java.util.Classes.TreeMap<>();
		Integer[] arr = new Integer[] {35,26,15,24,33,4,12,1,23,21,2,5};

		for(Integer i : arr) {
			map.put(i, Integer.toString(i));
		}
		
		assertEquals(java.util.Optional.of(12), map.higherEntry(11).getKey());
	}

	@Test
	void testToString() {
		TreeMap<Integer, String> map = new TreeMap<>();
		//java.util.Classes.TreeMap<Integer, String> map = new java.util.Classes.TreeMap<>();
		Integer[] arr = new Integer[] {35,26,15,24,33,4,12,1,23,21,2,5};

		for(Integer i : arr) {
			map.put(i, Integer.toString(i));
		}
		assertEquals("", map.toString());
	}

	@Test
	void testSubMap() {
		TreeMap<Integer, String> map = new TreeMap<>();
		//java.util.Classes.TreeMap<Integer, String> map = new java.util.Classes.TreeMap<>();
		Integer[] arr = new Integer[] {35,26,15,24,33,4,12,1,23,21,2,5};

		for(Integer i : arr) {
			map.put(i, Integer.toString(i));
		}
				
		//assertEquals("[12, 15, 21, 23, 24, 26, 33]",map.subMap(12, 34).keySet().toString());
	}

}
