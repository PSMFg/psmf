public class p02max3_dm_manhattan_se1_c1_ms6_s1_out {
	public static void main(String[] args) {
		
		Integer InLoc3 = Integer.parseInt(args[3]);
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer InLoc2 = Integer.parseInt(args[2]);
		Integer OutLoc = 0;
		
		if(InLoc1 <= InLoc2) {
			if(InLoc2 <= InLoc3) {
				OutLoc = InLoc3;
			} else {
				OutLoc = InLoc2;
			}
		} else {
			if(InLoc1 <= InLoc3) {
				if(InLoc2 <= InLoc3) {
					OutLoc = InLoc3;
				} else {
					OutLoc = InLoc2;
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
