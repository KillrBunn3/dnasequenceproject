import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DnaSequence {
	private char[] dna;

	/**
	 * Filter characters that are not a, t, c, or g. Create new array from it.
	 * Then, put filtered characters back into char[] dna.
	 */

	public DnaSequence(char[] dna) {

		new String(dna);
		this.dna = new String(dna).replaceAll("[^ATCG]", "").toCharArray();

	}

	/**
	 * DnaSequence(String) takes in a string, produces a chararray
	 */
	public DnaSequence(String dna) {

		this.dna = dna.replaceAll("[^ATCG]", "").toCharArray();

	}

	/**
	 * Draws in file, throws exception if no file is found. Turns file into
	 * string, then to char array.
	 */
	public DnaSequence(File file) throws FileNotFoundException {
		String dna = "";

		Scanner input = new Scanner(file);

		while (input.hasNextLine()) {
			dna += input.nextLine().replaceAll("[^ATCG]", "");
		}

		this.dna = dna.toCharArray();

		input.close();

	}

	// returns character at specified index
	public char baseAt(int index) {
		if (index < 0 || index > dna.length) {
			return 0;
		}
		return dna[index];
	}

	// A to T and C to G and vice versa for a single
	// position. Does not return anything....?
	// use switch cases for this
	public void complement(int index) {
		
		if (index < 0 || index > dna.length) {
			
			}
		else {
			switch (dna[index]) {
			case 'A' :
				dna[index] = 'T';
			case 'T' :
				dna[index] = 'A';
			case 'C' :
				dna[index] = 'G';
			case 'G' :
				dna[index] = 'C';
		
			}
		}
	}

	// Checks to see if DnaSequence matches other sequence (that).
	public boolean equals(DnaSequence that) {

		if (this.length() != that.length()) {
			return false;
		}
		for (int i = 0; i < length(); i++) {
			if (this.dna[i] != that.dna[i]) {
				return false;
			}
		}
		return true;
	}

	// gcContent finds percentage of sequence that is C or G.
	public static double gcContent() {
		return 0;

	}

	// hammingDistance finds amount of bases that differ between two arrays.
	public static int hammingDistance(DnaSequence that) {
		return 0;

	}

	// length finds the length of the DnaSequence.
	public int length() {
		return dna.length;

	}

	// mutationPoints finds the places where the arrays differ and returns
	// 'true' if
	// the compared letter is not the same, false if it is.
	public static boolean[] mutationPoints(DnaSequence that) {
		return null;

	}

	// nucleotideCounts finds the amount of times a nucleotide occurs in the
	// sequence.
	public int[] nucleotideCounts() {
		return null;

	}

	// reverseComplement flips the sequence backwards and then finds the
	// complements
	// to each nucleotide.
	public static DnaSequence reverseComplement() {
		return null;

	}

	// toString turns the dna char array into a string.
	public java.lang.String toString() {
		return new String(dna);

	}

}
