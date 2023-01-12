package examples.StringOps;

public class StringBasicOps {

	public boolean pallindrome(String str)
	{
		int size = str.length();
		if (size == 1 || size ==0)
			return true;
		else {
			String firstLetter = str.substring(0,1);
			String lastLetter = str.substring(size-1);
			if(firstLetter.equalsIgnoreCase(lastLetter)) {
				pallindrome(str.substring(1,size-1));
			}
			else
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
//		String s1 = "Java";
//		String s2 = null;
//		String s3 = new String("Atul");
//		float f1 = 564.232f;
//		System.out.println(String.format("Welcome to %s", s1));
//		System.out.println(String.format("Floating with 4 precision %32.10f",f1));
//		Pallindrome
		StringBasicOps sb = new StringBasicOps();
		System.out.println(sb.pallindrome("NavVan"));
		
//		Contanis Method
		String[] name = {"shubham Singh", "aman Patil", "yuvraj Singh", "harbhhajan singh", "atul wagh"};

		for (String i:name) {
			if((i.contains("singh")||i.contains("Singh")))
				System.out.println(i);
		}
	}
}
