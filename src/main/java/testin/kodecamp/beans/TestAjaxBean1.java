package testin.kodecamp.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestAjaxBean1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String selectedCity;
	private String selectedState;

	private List<SelectItem> states = new ArrayList<>();
	private Map<String, List<SelectItem>> citiesMap = new HashMap<>();
	private List<SelectItem> cities = new ArrayList<>();

	@PostConstruct
	public void init() {
		System.out.println("Post construct Called :::====");
		this.states.add(new SelectItem("up", "Uttar Pradesh"));
		this.states.add(new SelectItem("mp", "Madhya Pradesh"));

		List<SelectItem> upCitites = new ArrayList<>();

		upCitites.add(new SelectItem("lucknow", "Lucknow"));
		upCitites.add(new SelectItem("kanpur", "Kanpur"));
		upCitites.add(new SelectItem("allahabd", "Allahabad"));

		this.citiesMap.put("up", upCitites);

		List<SelectItem> mpCities = new ArrayList<>();

		mpCities.add(new SelectItem("indore", "Indore"));
		mpCities.add(new SelectItem("bhopal", "Bhopal"));
		mpCities.add(new SelectItem("Chambal", "Chambal"));
		this.citiesMap.put("mp", mpCities);

		this.selectedState = "mp";
		this.cities.clear();
		this.cities.addAll(this.citiesMap.get("mp"));
	}

	public String getSelectedCity() {
		return selectedCity;
	}

	public void setSelectedCity(String selectedCity) {
		this.selectedCity = selectedCity;
	}

	public String getSelectedState() {
		return selectedState;
	}

	public void setSelectedState(String selectedState) {
		this.selectedState = selectedState;
	}

	public List<SelectItem> getStates() {
		return states;
	}

	public void setStates(List<SelectItem> states) {
		this.states = states;
	}

	public List<SelectItem> getCities() {
		return cities;
	}

	public void setCities(List<SelectItem> cities) {
		this.cities = cities;
	}

	public void fetchCities() {
		System.out.println("fetch cities called...");
		System.out.println(this.selectedState);
		List<SelectItem> currentCities = this.citiesMap.get(this.selectedState);
		System.out.println("current citites : " + currentCities);
		this.cities.clear();
		this.cities.addAll(currentCities);
	}

	public void doSomething() {
		System.out.println("do something");
	}

}
