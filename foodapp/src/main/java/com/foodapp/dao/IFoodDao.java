package com.foodapp.dao;
import java.util.List;

import org.springframework.core.annotation.Order;

import com.foodapp.exceptions.FoodNotFoundException;
import com.foodapp.model.Food;



public interface IFoodDao {
	void addFood(Food Food);
	String updateFood(String CuisineType,double price, int Order, String Reviews);
	void deleteFood(int Order);
	Food findByFoodName(String FoodName);
	List<Food> findAllFood();
	List<Food> findCuisineType(String CuisineType) throws FoodNotFoundException;
	List<Food> findByFoodNameandReviews(String FoodName,String Reviews ) throws FoodNotFoundException;
	List<Food> findBypriceandFoodName(double price,String FoodName)throws FoodNotFoundException;
	String updateFood(String CuisineType, String FoodName);
	List<Food> findByReviews(String Reviews) throws FoodNotFoundException;
	List<Order> findByOrder(int Order);
	

}
