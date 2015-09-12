/*
Given an array of integers, every element appears three times except for one. Find that single one.

*/


// Come back later.



class SingerNumberII{
	public static int singleNumber(int[] A) {
     int x1 = 0;   
     int x2 = 0; 
     int mask = 0;

     for (int i : A) {
        x2 ^= x1 & i;
        x1 ^= i;
        System.out.println("First Time x2: "+x2);
        System.out.println("First Time x1: "+x1);
        mask = ~(x1 & x2);
        System.out.println("Mask: "+ mask);
        x2 &= mask;
        x1 &= mask;
        System.out.println("Second Time x2: "+x2);
        System.out.println("Second Time x1: "+x1);
        System.out.println();
     }

     return x1;  // p = 1, in binary form p = '01', then p1 = 1, so we should return x1; 
                 // if p = 2, in binary form p = '10', then p2 = 1, so we should return x2.
	}



	public static void main (String[] args){
		int[] nums = new int[] {3,3,4,3};

		System.out.println(singleNumber(nums));
	}




}