public class p01max2_dm_discrete_se1_c1_ms3_s1_out {
	public static void main(String[] args) {
		
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer OutLoc = 0;
		Integer InLoc2 = Integer.parseInt(args[2]);
		
		if(InLoc2 > InLoc1) {
			OutLoc = InLoc2;
		} else {
			OutLoc = InLoc1;
		}
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
