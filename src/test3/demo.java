package test3;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String maxHour = "23";
		String maxMinut = "59";
		String temp="";
		String tempMaxHour= "00";
		String tempMaxMint= "00";
		int[] timeArray = { 0, 9, 5, 0};

		int hourIndex =0;
		int hourIndex1 = 0;

		for(int i=0; i<= timeArray.length-1; i++) {
		for (int j=0; j <= timeArray.length-1;j++) {
		if(i !=j ) {
		temp =""+timeArray[i]+timeArray[j];
		if (Integer.parseInt(temp) <= Integer.parseInt(maxHour) && Integer.parseInt(temp) > Integer.parseInt(tempMaxHour)) {
		tempMaxHour = temp;
		hourIndex = i;
		hourIndex1 = j;
		}
		}
		}
		}
		String tempMin="";
		for(int i=0; i<= timeArray.length-1; i++) {
		if( i != hourIndex && i != hourIndex1) {
		tempMin = tempMin + timeArray[i];
		}
		}

		String tempMin1 = new StringBuilder(tempMin).reverse().toString();

		if ( Integer.parseInt(tempMin1) <= Integer.parseInt(maxMinut) ) {
		tempMaxMint = tempMin1;
		System.out.println(tempMaxHour);
		System.out.println(tempMaxMint);
	}}

}
