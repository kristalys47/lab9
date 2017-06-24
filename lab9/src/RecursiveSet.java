import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveSet {

	public static void main(){
		Scanner input = new Scanner(System.in);
		System.out.print("ENter a short string of different letters:");
		String s = input.nextLine();
		ArrayList<String> ss = subsets(s);
		System.out.println("Subset of set formed by letter in" + s + "are:");
		for (String r: ss){
			System.out.println(" \"" + r +"\"");
		}
	}
		private static ArrayList<String> subsets(String s){
			ArrayList<String> ss = new ArrayList<String>();
			if (s.length() == 0){
				ss.add(s);
			}
			else {
				String st;
				st = s.substring(1);
				ArrayList<String> tSS = subsets(st);
				for (String r : tSS)
					ss.add(__________);
				for (String r : tSS)
					ss.addAll(__________ +r);
			}
			return ss;
			
		}
		
		

}
