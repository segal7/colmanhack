
public class Quiz {

	private String country =null;
	private String style = null;
	private String other_keywords = null;
	private String season = null;


	// getters,setters
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getOther_keywords() {
		return other_keywords;
	}
	public void setOther_keywords(String other_keywords) {
		this.other_keywords = other_keywords;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	// getters,setters

	public Criteria getQuery()
	{
		Criteria criteria = new Criteria();

		criteria.category = "travel";

		if(country!=null){
			criteria.words = country;
		}

		criteria.list = "hotels ";

		if(style!=null){
			if(this.style.equals("camping") )
				criteria.list += "OR camping OR sports OR hiking OR active OR fun OR sightseeing OR forest OR lake";
			else if(this.style.equals("culture") )
				criteria.list += "OR museum OR sightseeing OR theater OR history OR culture OR tour OR forest";
			else if(this.style.equals("relaxing") )
				criteria.list += "OR luxuty OR beach OR shopping OR relaxing OR parties OR tour OR restaurants ";
			else criteria.list += "OR camping OR sports OR hiking OR fun OR forest OR lake "
					+ "OR museum OR sightseeing OR theater OR history OR culture OR tour " 
					+ "OR luxuty OR beach OR shopping OR relaxing OR parties OR restaurants";

		}
		return criteria;
	}


}

