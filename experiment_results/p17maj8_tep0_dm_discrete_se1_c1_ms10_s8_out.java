public class p17maj8_dm_discrete_se1_c1_ms10_s8_out {
	public static void main(String[] args) {
		
		Integer InLoc3 = Integer.parseInt(args[3]);
		Integer InLoc2 = Integer.parseInt(args[2]);
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer InLoc7 = Integer.parseInt(args[7]);
		Integer InLoc8 = Integer.parseInt(args[8]);
		Integer InLoc4 = Integer.parseInt(args[4]);
		Integer InLoc6 = Integer.parseInt(args[6]);
		Integer InLoc5 = Integer.parseInt(args[5]);
		Integer InLoc11 = Integer.parseInt(args[11]);
		Integer OutLoc = 0;
		Integer InLoc9 = Integer.parseInt(args[9]);
		Integer InLoc10 = Integer.parseInt(args[10]);
		
		OutLoc = InLoc4 + InLoc5 + InLoc6 + InLoc7 + InLoc8 + InLoc9 + InLoc10 + InLoc11;
		if(OutLoc > InLoc3) {
			OutLoc = InLoc2;
		} else {
			OutLoc = InLoc1;
		}
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
