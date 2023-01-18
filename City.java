/**
 *	City data - the city name, state name, location designation,
 *				and population est. 2017
 *
 *	@author	Megan Wang
 *	@since	January 9, 2022
 */
public class City implements Comparable<City> {
	
	// fields
	private String name;
	private String state;
	private String designation;
	private int population;
	
	// constructor
	public City(String nameIn, String stateIn, String designationIn, int populationIn){
		name = nameIn;
		state = stateIn;
		designation = designationIn;
		population = populationIn;
	}
	
	/**	Compare two cities populations
	 *	@param other		the other City to compare
	 *	@return				the following value:
	 *		If populations are different, then returns (this.population - other.population)
	 *		else if states are different, then returns (this.state - other.state)
	 *		else returns (this.name - other.name)
	 */
	public int compareTo(City other){
		if(population != other.population){
			return this.population - other.population;
		}
		else if(!state.equalsIgnoreCase(other.state)){
			return this.state.compareTo(other.state); ////////////////
		}
		else{
			return this.name.compareTo(other.name); //////////////////
		}
	}
	
	/**	Equal city name and state name
	 *	@param other		the other City to compare
	 *	@return				true if city name and state name equal; false otherwise
	 */
	public boolean equals(Object other){
		if(other != null && other instanceof City){
			City otherCity = (City)other;
			return name.equals(otherCity.name) && state.equals(otherCity.state);
		}
		return false;
	}
	
	/**	Accessor methods */
	public String getCityName(){
		return name;
	}
	
	public String getState(){
		return state;
	}
	
	public String getType(){
		return designation;
	}
	
	public int getPopulation(){
		return population;
	}
	
	/**	toString */
	@Override
	public String toString() {
		return String.format("%-22s %-22s %-12s %,12d", state, name, designation,
						population);
	}
}
