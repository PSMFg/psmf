public class p07add3_dm_discrete_se1_c1_ms7_s1_out {
	public static void main(String[] args) {
		
		Integer OutLoc = 0;
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer InLoc3 = Integer.parseInt(args[3]);
		
		
		Integer InLoc2 = Integer.parseInt(args[2]);
		
		
		
		
		OutLoc = InLoc1 + InLoc2 + InLoc3;
		
		
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
