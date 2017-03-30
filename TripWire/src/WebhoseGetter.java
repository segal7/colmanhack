import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonElement;
import com.webhoseio.sdk.WebhoseIOClient;


public class WebhoseGetter {

	
	private WebhoseIOClient webhoseClient = null;

	public WebhoseGetter()
	{
	
		// Create a WebhoseIOClient instance
		 webhoseClient = WebhoseIOClient.getInstance("61c7f56d-b122-4946-ba6e-c3b5dacf8572");
		
	}

	public JsonElement getQuery(Criteria criteria)
	{
		
		String words = criteria.words;
		String non = criteria.non;
		String list = criteria.list;
		String lang = criteria.lang;
		String country = criteria.country;
		String category = criteria.category;
		String site = criteria.site;
		String exact_phrase = criteria.exact_phrase;
		
		
		Map queries = new HashMap();
		queries.put("q",""
				+ (words == null ? "" : words)
				+ (exact_phrase == null ? "" :"\"" + exact_phrase+ "\" ")
				+ (list == null ? "" : (" ("+list+")")) 
				+ (non == null ? "" : (" -("+"non"+") " ) ) 
				+ (lang == null ? "" : (" language:("+ lang + ")" ) ) 
				+ (country == null ? "" : ( " thread.country:" +country ) )
				+ " site_category:" + category
				+ (site == null ? "" :(" site:"+ site ) )
				);
			
		// Fetch query result
		

		JsonElement result;
		try {
			result = webhoseClient.query("filterWebData", queries);
			return result;
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(result.getAsJsonObject().get("totalResults"));
		return null;

	}



}
