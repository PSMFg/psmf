public class p11intSQRT_dm_discrete_se1_c1_ms7_s1_out {
	public static void main(String[] args) {
		
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer DLoc2 = 0;
		Integer OutLoc = 0;
		
		
		Integer DLoc1 = 0;
		
		long start1373289200706 = System.currentTimeMillis();
		long end1373289200706 = start1373289200706 + 5*1000;
		while(DLoc1 <= InLoc1 && (System.currentTimeMillis()<end1373289200706) ) {
			DLoc1 = DLoc1 + 2 * DLoc2 + 1;
			DLoc2 = DLoc2 + 1;
		}
		OutLoc = DLoc2 - 1;
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
