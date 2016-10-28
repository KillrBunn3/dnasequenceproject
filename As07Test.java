public class As07Test {
	public static void main(String[] args) {
		char[] bases = { 'G', 'A', 'T', 'T', 'A', 'C', 'A'};
		DnaSequence seq = new DnaSequence(bases);
		System.out.println(seq); // Should be: GATTACA
		System.out.println(seq.baseAt(2)); // Should be: T
		System.out.println(DnaSequence.gcContent()); // Should be: 0.2857142857142857
		System.out.println();
	}
}
