public class p13divrem_dm_discrete_se1_c1_ms7_s3_out {
	public static void main(String[] args) {
		
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer OutLoc = 0;
		Integer DLoc1 = 0;
		Integer DLoc2 = 0;
		Integer InLoc2 = Integer.parseInt(args[2]);
		
		long start10788970004961 = System.currentTimeMillis();
		long end10788970004961 = start10788970004961 + 5*1000;
		while(DLoc1 <= InLoc1 && (System.currentTimeMillis()<end10788970004961) ) {
			DLoc2 = DLoc2 + 1;
			DLoc1 = InLoc2 * DLoc2;
		}
		OutLoc = InLoc2 + InLoc1 - DLoc1;
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
