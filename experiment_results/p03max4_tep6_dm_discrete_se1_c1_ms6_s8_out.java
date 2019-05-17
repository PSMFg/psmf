public class p03max4_dm_discrete_se1_c1_ms6_s8_out {
	public static void main(String[] args) {
		
		Integer InLoc4 = Integer.parseInt(args[4]);
		Integer InLoc2 = Integer.parseInt(args[2]);
		Integer InLoc3 = Integer.parseInt(args[3]);
		Integer OutLoc = 0;
		Integer InLoc1 = Integer.parseInt(args[1]);
		
		if(InLoc3 > InLoc4) {
			if(InLoc1 > InLoc2) {
				if(InLoc1 > InLoc3) {
					OutLoc = InLoc1;
				} else {
					if(InLoc2 > InLoc3) {
						OutLoc = InLoc4;
					} else {
						OutLoc = InLoc3;
					}
				}
			} else {
				if(InLoc1 > InLoc4) {
					if(InLoc1 > InLoc3) {
						OutLoc = InLoc1;
					} else {
						if(InLoc2 > InLoc3) {
							OutLoc = InLoc4;
						} else {
							OutLoc = InLoc3;
						}
					}
				} else {
					if(InLoc2 > InLoc3) {
						OutLoc = InLoc4;
					} else {
						OutLoc = InLoc3;
					}
				}
			}
		} else {
			if(InLoc2 > InLoc4) {
				OutLoc = InLoc2;
			} else {
				OutLoc = InLoc4;
			}
		}
		
		if(OutLoc==Integer.parseInt(args[0])) {
			System.out.println("Passed :) Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		} else {
			System.out.println("Failed :( Expected: "+args[0]+". Returned: "+ OutLoc +". ");
		}
	}
}
