public class p12fact_dm_discrete_se1_c1_ms7_s1_out {
	public static void main(String[] args) {
		
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer OutLoc = 0;
		Integer InLoc2 = Integer.parseInt(args[2]);
		Integer DLoc1 = 0;
		
		long start10050839786793 = System.currentTimeMillis();
		long end10050839786793 = start10050839786793 + 5*1000;
		while(InLoc1 > DLoc1 && (System.currentTimeMillis()<end10050839786793) ) {
			DLoc1 = DLoc1 + 1;
			InLoc2 = InLoc2 * DLoc1;
		}
		OutLoc = InLoc2;
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
