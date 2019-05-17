public class p10mult_dm_discrete_se1_c1_ms7_s1_out {
	public static void main(String[] args) {
		
		Integer InLoc2 = Integer.parseInt(args[2]);
		Integer DLoc1 = 0;
		Integer InLoc1 = Integer.parseInt(args[1]);
		
		Integer OutLoc = 0;
		
		long start6951296204407 = System.currentTimeMillis();
		long end6951296204407 = start6951296204407 + 5*1000;
		while(InLoc2 > DLoc1 && (System.currentTimeMillis()<end6951296204407) ) {
			OutLoc = OutLoc + InLoc1;
			DLoc1 = DLoc1 + 1;
		}
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
