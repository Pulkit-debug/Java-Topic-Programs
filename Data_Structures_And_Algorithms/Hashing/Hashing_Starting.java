package Data_Structures_And_Algorithms.Hashing;

public class Hashing_Starting {
	static int mod(int n) {
		return n % 16;	
	}
	
	static int sascii(String s, int n) {
		
		// these both are the basic representations of the hashing.
		char a[] = s.toCharArray();
		int asciiSum = 0;
		for(int i = 0;i<a.length;i++) {
			asciiSum += a[i];
		}
		return asciiSum % n;
	}
	public static void main(String[] args) {
		// Writing some sample hash function;
		// 1. Simple mod function(for integer inputs)
		
		System.out.println(mod(500));
		// the function will find the mod of 500 with 16 which will give us reminder
		// Use of remainder:- remainder will be used as the storage for 500 in the array at cell 4. (remainder being 4)
		System.out.println(sascii("ABCDEFGH", 16));
		
		// Characterstics of a good hash function.
		/*
		1. It distributes the hash function uniformly across the hash table (must not get in the state of collision).
		2. The hash function uses all the input data
		*/
		
		
		// ********** Collision resolution techniques***************
		// Two types of collision resolution techniques	
		/* 		1. Direct Chaining Technique
		 * 		2. Open Addressing Technique 
		 * 
		 * Note: Hash table is not an array of integers it is a arary of refreences meaning in every cell of the array we store refferrences
		 * 
		 * 
		 * 1. Direct chaining: Implements the buckets as the linked list. Colliding elements are stored in linked list.
		 * 
		 * 2. Open Addressing: Colliding elements are stored in other vacant buckets. During storage and lookup these are found though so called "Probing".
		 * 
		 * 		2.1. Linear Probing: Linear probing is a strategy for resolving collisions. by placing the new key into the closet empty cell.
		 * 
		 * 		2.2. Qurdratic probing: Quadratic probing operates by taking the original hash index and adding successive values of an arbitary quadratic polynomial until an open slot is found.
		 * 
		 * 		2.3. Double Hashing: Interval between the probes is computed by another hash function.
		 */
	
		
		
		/* Pros and cons of Resolution Techniques
		 * 
		 * 
		 * 1. Direct chaining: 
		 * 		a. no fear of exhausting hash table bukcets
		 * 		b. fear of big linked list( can effect performance big time )
		 * 
		 * 2. Open Addressing: 
		 * 		a. Easy implementation
		 * 		b. fear of exhausing hash table buckets.
		 * 
		 * 
		 * * If input size is known than always use "open addressing", else can use any of the two.
		 * * if deletion is very high then we should always go for "direct chaining"
		 * 
		 * */
		
		
		
		
	}
}
