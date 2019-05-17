public class p09fib_dm_discrete_se1_c1_ms8_s2_out {
	public static void main(String[] args) {
		
		Integer InLoc1 = Integer.parseInt(args[1]);
		Integer OutLoc = 0;
		Integer InLoc2 = Integer.parseInt(args[2]);
		
		Integer DLoc3 = 0;
		
		OutLoc = OutLoc - InLoc2;
		long start73538547600554 = System.currentTimeMillis();
		long end73538547600554 = start73538547600554 + 5*1000;
		while(InLoc1 > DLoc3 && (System.currentTimeMillis()<end73538547600554) ) {
			OutLoc = OutLoc + InLoc2;
			DLoc3 = DLoc3 + 1;
		}
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
