package com.foodapp.service;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.foodapp.dao.FoodDaoImpl;
import com.foodapp.dao.IFoodDao;
import com.foodapp.exceptions.FoodNotFoundException;
import com.foodapp.model.Food;

public class FoodServiceImpl implements IFoodService{
	IFoodDao foodDao = (IFoodDao) new FoodServiceImpl();
	
@Override
	public void addFood(Food Food) {
		foodDao.addFood(Food);
		
	}
@Override
	public Food findByFoodName(String FoodName) {
		return null;
	}

	@Override
	public List<Food> findAllFood() {
		return null;
	}

	@Override
	public List<Food> findCuisineType(String CuisineType) throws FoodNotFoundException {
		return null;
	}

	@Override
	public List<Food> findByFoodNameandReviews(String FoodName, String Reviews) throws FoodNotFoundException {
		return null;
	}

@Override
	public List<Food> findBypriceandFoodName(double price, String FoodName) throws FoodNotFoundException {
		List<Food> foods= foodDao.findBypriceandFoodName(price,FoodName);
		return foods;
	}
    
 @Override
	public void deleteFood(int Order) {
	
	}
		

@Override
public String updateFood(String CuisineType, double price, int Order, String Reviews) {
	// TODO Auto-generated method stub
	return null;
}
public void getById(String reviews) {
	// TODO Auto-generated method stub
	
}
@Override
public void deleteFood() {
	// TODO Auto-generated method stub
	
}
@Override
public void getById(Integer animalId) {
	// TODO Auto-generated method stub
	
}
@Override
public void getByTypeAndAge(String animalType, int age) {
	// TODO Auto-generated method stub
	
}
@Override
public void findByFoodNameandReviews(Object foodName, Object reviews) {
	// TODO Auto-generated method stub
	
}
@Override
public void getByCuisineTypeAndFoodName(String cuisineType, Object foodName) {
	// TODO Auto-generated method stub
	
}
	}

		
	