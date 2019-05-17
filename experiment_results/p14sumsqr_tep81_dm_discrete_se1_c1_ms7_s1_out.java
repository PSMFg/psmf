public class p14sumsqr_dm_discrete_se1_c1_ms7_s1_out {
	public static void main(String[] args) {
		
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer DLoc1 = 0;
		Integer OutLoc = 0;
		
		DLoc1 = DLoc1 + 1;
		long start10923604291473 = System.currentTimeMillis();
		long end10923604291473 = start10923604291473 + 5*1000;
		while(OutLoc <= InLoc1 && (System.currentTimeMillis()<end10923604291473) ) {
			if(DLoc1 > OutLoc) {
				OutLoc = OutLoc + DLoc1 * DLoc1;
			} else {
				DLoc1 = DLoc1 + 1;
			}
		}
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
