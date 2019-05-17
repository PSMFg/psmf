public class p08add4_dm_discrete_se1_c1_ms8_s1_out {
	public static void main(String[] args) {
		
		Integer OutLoc = 0;
		Integer InLoc2 = Integer.parseInt(args[2]);
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer InLoc4 = Integer.parseInt(args[4]);
		Integer InLoc3 = Integer.parseInt(args[3]);
		
		OutLoc = InLoc3 + InLoc4 + InLoc2 + InLoc1;
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
