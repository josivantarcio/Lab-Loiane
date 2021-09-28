package BasicoExceptions;

public class TratandoExercoes {
	public static void main(String[] args) throws Exception{
		
		int[] numeral = {5,3,9,01,7};
		int[] divend = {4,2,3,0};
		
		for(int i = 0; i < numeral.length; i++) {
			try {
				System.out.println("numero "+numeral[i]+"/"+divend[i]+"= "+ numeral[i]/divend[i]);
			}catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				
			}
		}
		
		
	}
}
