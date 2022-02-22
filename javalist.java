package Basic_codes;
import java.util.*;
public class javalist {
	public static void main(String args[]) {
		ArrayList arrl=new ArrayList();
		arrl.add("Dog");
		arrl.add("Wolf");
		arrl.add("Fox");
		arrl.add("Bear");
		arrl.add("Jackal");
		arrl.add("Coyote");
		
		Iterator itr=arrl.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
