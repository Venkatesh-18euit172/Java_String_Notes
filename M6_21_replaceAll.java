package stringclass;

public class M6_21_replaceAll {

	public static void main(String[] args) {

		String s1="v3nkat5sh";
		System.out.println("Replacing using Regex \"v3nkat5sh\".replaceAll(\"\\d\", \"e\") :- "+s1.replaceAll("\\d", "e")+"\n");

		System.out.println("Replacing using Regex \"v3nkat5sh\".replaceFirst(\"\\d\", \"e\") :- "+s1.replaceFirst("\\d", "e"));
	}

}
