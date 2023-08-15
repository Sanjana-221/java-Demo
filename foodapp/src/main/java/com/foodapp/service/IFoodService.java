package com.foodapp.service;
import java.util.List;
import com.foodapp.exceptions.FoodNotFoundException;
import com.foodapp.model.Food;
public interface IFoodService {
	void addFood(Food Food);
	String updateFood(String CuisineType,double price, int Order, String Reviews);
	void deleteFood(int Order);
	Food findByFoodName(String FoodName);
	List<Food> findAllFood();
	List<Food> findCuisineType(String CuisineType) throws FoodNotFoundException;
	List<Food> findBypriceandFoodName(double price,String FoodName)throws FoodNotFoundException;
	void getById(Integer animalId);
	void deleteFood();
	void getByTypeAndAge(String animalType, int age);
	void findByFoodNameandReviews(Object foodName, Object reviews);
	void getByCuisineTypeAndFoodName(String cuisineType, Object foodName);
	
	

}


