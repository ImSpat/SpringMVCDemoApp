package pl.ImSpat.springMVC.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favouriteLanguageOptions;
	

	public Student() {
		
		// fill with country options
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("PL", "Poland");
		countryOptions.put("DE", "Germany");
		countryOptions.put("CZ", "Czech Rep");
		countryOptions.put("SK", "Slovakia");
		
		// fill fav lang options
		favouriteLanguageOptions = new LinkedHashMap<>();
		
		//params
		favouriteLanguageOptions.put("Java", "Java");
		favouriteLanguageOptions.put("C#", "C#");
		favouriteLanguageOptions.put("C++", "C++");
		favouriteLanguageOptions.put("PHP", "PHP");
				
		
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	
	
}
