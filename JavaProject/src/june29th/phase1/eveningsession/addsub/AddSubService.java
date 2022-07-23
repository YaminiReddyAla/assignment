package june29th.phase1.eveningsession.addsub;

public class AddSubService {

	public Result addMinus(int num1, int num2) {
		// TODO Auto-generated method stub

		System.out.println(num1 +  ""  + num2);
		Result result =new Result();
		result.setAdding(num1+num2);
		result.setSubtract(num1-num2);
		return result;
	}

}
