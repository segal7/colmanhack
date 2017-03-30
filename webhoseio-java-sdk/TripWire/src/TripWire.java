

import com.google.gson.JsonElement;



public class TripWire {

	public static WebhoseGetter wHose;



	public static void main(String[] args) {

		wHose = new WebhoseGetter();

		Quiz quiz = new Quiz();

		quiz.setCountry("france");
		quiz.setStyle("camping");

		Criteria crit = quiz.getQuery();


		JsonElement result = wHose.getQuery(crit);

		System.out.println(result.getAsJsonObject().get("totalResults"));

	}

}
