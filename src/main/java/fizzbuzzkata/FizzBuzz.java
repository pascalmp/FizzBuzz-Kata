package fizzbuzzkata;

public class FizzBuzz {

	public static void main(String[] args) {

	}

	public String fizzBuzz(Integer inputNum) {
		
		if(inputNum % 3 == 0){
			return "Fizz";
		}
		return inputNum.toString();
	}

}
