public class p15median_dm_discrete_se1_c1_ms8_s1_out {
	public static void main(String[] args) {
		
		Integer InLoc3 = Integer.parseInt(args[3]);
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer InLoc2 = Integer.parseInt(args[2]);
		Integer OutLoc = 0;
		
		if(InLoc1 > InLoc2) {
			if(InLoc3 >= InLoc2) {
				if(InLoc3 > InLoc1) {
					OutLoc = InLoc1;
				} else {
					OutLoc = InLoc3;
				}
			} else {
				OutLoc = InLoc2;
			}
		} else {
			if(InLoc3 > InLoc1) {
				if(InLoc3 >= InLoc2) {
					OutLoc = InLoc2;
				} else {
					OutLoc = InLoc3;
				}
			} else {
				OutLoc = InLoc1;
			}
		}
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
