package jp.co.sevenandinm.kenshuu.cvsue000;

/**
 * JavaSample.
 * @author eithi2
 */
public class JavaSample {

	/**
	 * main.
	 * @param args String[]
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JavaSample my = new JavaSample();
		my.execute();
	}
	
	/**
	 * execute.
	 */
	private void execute() {
		// TODO 自動生成されたメソッド・スタブ
		double dA = 1.0;
		double dB = 0.1;
		int intNine = 9;
		double ret_1 = method1(dA, dB, intNine);
		System.out.println(ret_1);
	}

	/**
	 * method1.
	 * @param dA dA
	 * @param dB dB
	 * @param intNine intNine
	 * @return double ret
	 */
	private double method1(
			final double dA, final double dB, final int intNine) {
		// TODO 自動生成されたメソッド・スタブ
		double ret = 0.0;
		ret = dA - (dB * intNine);
		return ret;
	}

}
