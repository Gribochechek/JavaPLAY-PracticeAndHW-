package sakhroman.lection17Practice;


public class PlainKryptograph {

	public static String krypto(String testString, int key){
		
		char [] string = new char[testString.length()];
		
		string = testString.toCharArray();
		
		for (int i = 0; i< string.length; i++){
			string[i] = (char) (string[i] + key);
		}
		
		return String.copyValueOf(string);
	}
	
}
