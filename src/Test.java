import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
public static void main(String[] args) {
		
		Map<String,String> m = new HashMap<String,String>();
		m.put("name", "cc");
		m.put("age", "18");

	 List<String> keys = new ArrayList<String>(m.values());
		for (String key : keys) {
			System.out.println(key);
		}
	}


}
