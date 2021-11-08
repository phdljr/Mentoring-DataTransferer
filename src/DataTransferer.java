import java.util.HashMap;

public class DataTransferer {
	private static HashMap<String, String> map = new HashMap<>();
	
	private DataTransferer() {}
	
	public static void setData(String key, String value) {
		map.put(key, value);
	}
	
	public static String getData(String key) {
		return map.get(key);
	}
}
