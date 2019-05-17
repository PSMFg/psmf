public class p14sumsqr_dm_discrete_se1_c1_ms7_s9_out {
	public static void main(String[] args) {
		
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer DLoc1 = 0;
		Integer OutLoc = 0;
		
		if(InLoc1 <= DLoc1) {
			
		} else {
			long start11321519982996 = System.currentTimeMillis();
			long end11321519982996 = start11321519982996 + 5*1000;
			while(InLoc1 > DLoc1 && (System.currentTimeMillis()<end11321519982996) ) {
				DLoc1 = DLoc1 + 1;
				OutLoc = OutLoc + DLoc1 * DLoc1;
			}
		}
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
