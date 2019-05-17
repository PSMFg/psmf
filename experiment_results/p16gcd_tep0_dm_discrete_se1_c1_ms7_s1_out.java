public class p16gcd_dm_discrete_se1_c1_ms7_s1_out {
	public static void main(String[] args) {
		
		Integer OutLoc = 0;
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer InLoc2 = Integer.parseInt(args[2]);
		
		long start11958403818347 = System.currentTimeMillis();
		long end11958403818347 = start11958403818347 + 5*1000;
		while(InLoc1 != InLoc2 && (System.currentTimeMillis()<end11958403818347) ) {
			if(InLoc1 <= InLoc2) {
				InLoc2 = InLoc2 - InLoc1;
			} else {
				InLoc1 = InLoc1 - InLoc2;
			}
			OutLoc = InLoc1;
		}
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
