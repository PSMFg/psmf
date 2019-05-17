public class p09fib_dm_discrete_se1_c1_ms8_s1_out {
	public static void main(String[] args) {
		
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer OutLoc = 0;
		Integer InLoc2 = Integer.parseInt(args[2]);
		
		Integer DLoc3 = 0;
		
		DLoc3 = OutLoc - InLoc2;
		long start73093110809986 = System.currentTimeMillis();
		long end73093110809986 = start73093110809986 + 5*1000;
		while(InLoc1 > DLoc3 && (System.currentTimeMillis()<end73093110809986) ) {
			OutLoc = DLoc3 + 1;
			DLoc3 = OutLoc + InLoc2;
		}
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
