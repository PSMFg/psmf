public class p09fib_dm_discrete_se1_c1_ms8_s8_out {
	public static void main(String[] args) {
		
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer OutLoc = 0;
		Integer InLoc2 = Integer.parseInt(args[2]);
		
		Integer DLoc3 = 0;
		
		long start76023564268986 = System.currentTimeMillis();
		long end76023564268986 = start76023564268986 + 5*1000;
		while(InLoc1 > DLoc3 && (System.currentTimeMillis()<end76023564268986) ) {
			OutLoc = OutLoc + InLoc2;
			DLoc3 = DLoc3 + 1;
			InLoc2 = OutLoc - InLoc2;
		}
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
