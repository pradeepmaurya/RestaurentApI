package com.restaurent.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.restaurent.app.restaurents.Restaurents;

@Component
public class RestaurentServices {

	private static List<Restaurents> list = new ArrayList<>();
	
	static {
		list.add(new Restaurents(1, "Maya Restaurent", "Jankpuram", "4564889","coffie", 230, 100));
		list.add(new Restaurents(2, "Ronak Restaurent", "Noida", "6576845","Pizza", 100, 120));
		list.add(new Restaurents(3, "Hills Restaurent", "Himalayan", "546874","Fry Rise", 150, 140));
		list.add(new Restaurents(4, "Forest Restaurent", "Delhi", "47868784","Vegitables", 50, 200));
	}
	
	//get All List of restaurants
	public List<Restaurents> getRestaurents(){
		return list;
	}
	
	//Get restaurant  by Id
	public Restaurents getRestaurent(int id) {
		Restaurents restaurent = null;
		restaurent = list.stream().filter(e->e.getId()==id).findFirst().get();
		return restaurent;
	}
	
	//Adding a new Restaurant
	
	public void addRestaurent(Restaurents data) {
		list.add(data);
	}

	//Deleting Objects
	public String deleteRestaurent(int id) {
		Restaurents restaurent = null;
		restaurent = list.stream().filter(e->e.getId()==id).findFirst().get();
		if(restaurent == null) {
			return "Not Found, Failed";
		}else {
			list.remove(restaurent);
		}
		return "Succesfully Removed";
		
	}
}
