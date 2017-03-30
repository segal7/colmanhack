
public class Criteria {
	
	public String words = null;
	public String non = null;
	public String list = null;
	public String lang = "english";
	public String country = null;
	public String category = null;
	public String site = null;
	public String exact_phrase = null; 

	public Criteria(
			String must_words,
			String no_list,
			String oneOf_list,
			String country,
			String category
			) 
	{
		
		this.words = must_words;
		this.non = no_list;
		this.list = oneOf_list;
		this.country = country;
		this.category =category;
		this.lang = "english";
		site = null;
		exact_phrase = null; 
	}

	public Criteria() {
		 words = null;
		 non = null;
		 list = null;
		 lang = "english";
		 country = null;
		 category = null;
		 site = null;
		 exact_phrase = null; 
	}

}
