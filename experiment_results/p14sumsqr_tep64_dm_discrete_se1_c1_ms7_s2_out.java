public class p14sumsqr_dm_discrete_se1_c1_ms7_s2_out {
	public static void main(String[] args) {
		
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer DLoc1 = 0;
		Integer OutLoc = 0;
		
		long start10971096639923 = System.currentTimeMillis();
		long end10971096639923 = start10971096639923 + 5*1000;
		while(InLoc1 > DLoc1 && (System.currentTimeMillis()<end10971096639923) ) {
			if(DLoc1 <= OutLoc) {
				DLoc1 = DLoc1 + 1;
			} else {
				OutLoc = OutLoc + DLoc1 * DLoc1;
			}
		}
		if(DLoc1 <= OutLoc) {
			DLoc1 = DLoc1 + 1;
		} else {
			OutLoc = OutLoc + DLoc1 * DLoc1;
		}
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
