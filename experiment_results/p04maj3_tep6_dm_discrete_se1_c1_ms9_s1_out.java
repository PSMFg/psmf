public class p04maj3_dm_discrete_se1_c1_ms9_s1_out {
	public static void main(String[] args) {
		
		Integer InLoc3 = Integer.parseInt(args[3]);
		Integer InLoc2 = Integer.parseInt(args[2]);
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer InLoc6 = Integer.parseInt(args[6]);
		Integer OutLoc = 0;
		Integer InLoc4 = Integer.parseInt(args[4]);
		Integer InLoc5 = Integer.parseInt(args[5]);
		
		if(InLoc5 > InLoc1) {
			OutLoc = InLoc4 + InLoc5 + InLoc6;
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
