package Rest_Assure;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_POST {
	public class Tests_POST {
		@Test
		public void test_1_post()
		{
			Map<String,Object> map= new HashMap<String, Object>();
			map.put("name", "Naveen");
			map.put("job", "Quality_Engineer");
			System.out.println(map);	
			JSONObject request = new JSONObject(map);
			System.out.println(request);
		}
}
