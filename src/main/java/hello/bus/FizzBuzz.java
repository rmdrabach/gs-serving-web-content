package hello.bus;

public class FizzBuzz {
	public static final String MESSSAGE_INVALID_NUMBER = "Number should be greater than zero.";
	public static final String FIZZ = "Fizz";
	public static final String BUZZ = "Buzz";
	
	private static boolean isValid(int number) {
		return number > 0;
	}
	
	private static boolean isFizz(int number) {
		return (number % 3) == 0;
	}
	
	private static boolean isBuzz(int number) {
		return (number % 5) == 0;
	}
	
	public static String answerTo(int number) {
		if (!isValid(number)) {
			return MESSSAGE_INVALID_NUMBER;
		}
		
		if (!isFizz(number) && !isBuzz(number)) {
			return String.valueOf(number);
		}
		
		StringBuilder builder = new StringBuilder();
		
		if (isFizz(number)) {
			builder.append(FIZZ);
		}
		
		if (isBuzz(number)) {
			builder.append(BUZZ);
		}
		
		return builder.toString();
	}
}
