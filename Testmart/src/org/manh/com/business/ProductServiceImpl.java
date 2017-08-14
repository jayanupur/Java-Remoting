package org.manh.com.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	
	
	List<String> booklist =new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	ArrayList<String> movieList = new ArrayList<String>();
	
	
	public ProductServiceImpl() {
		
		booklist.add("Inferno");
		booklist.add("Law of attraction");
		booklist.add("Sucide Boy");
		
		musicList.add("All is well");
		musicList.add("Once upon a time");
		musicList.add("hello can you hear me");
		
		movieList.add("Avenger");
		movieList.add("Stonelady");
		movieList.add("RedHood");
		
		
	}
	
		
	public List<String>  getProductCategories(){
		
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
		
	}
	
	
	
	public List<String> getProducts(String category) {
	
		switch(category) {
		case "books":
			return booklist;
		case "music":
			return musicList;
		case "movie":
			return movieList;
		}
		return null;
	}
	
	
	public boolean addProduct(String category, String Product ) {
		
		switch(category) {
		case "books":
			booklist.add(Product);
			break;
		case "music":
			musicList.add(Product);
			break;
		case "movie":
			movieList.add(Product);
			break;
		default:
			return false;
		}
		return true;
		
		
	}

}
