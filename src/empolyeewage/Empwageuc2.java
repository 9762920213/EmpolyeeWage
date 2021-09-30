package empolyeewage;

public class Empwageuc2 {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int empRatePerhr = 20;
		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random()*10 %2);
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * empRatePerhr;
		System.out.println("emp wage:" +empWage);
	}

}
