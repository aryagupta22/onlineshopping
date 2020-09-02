package net.kzn.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")

public class CategoryDAOImpl implements CategoryDAO {
	public static List<Category> categories = new ArrayList<>();
	
	
	static {
		Category category = new Category();
		//Adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescrption("This is some description of television");
		category.setImageurl("CAT_1.png");
		categories.add(category);
		
		category = new Category();
		//Adding second category
		category.setId(2);
		category.setName("Mobile");
		category.setDescrption("This is some description of mobile");
		category.setImageurl("CAT_2.png");
		categories.add(category);
		
		category = new Category();
		//Adding Third category
		category.setId(3);
		category.setName("Laptop");
		category.setDescrption("This is some description of Laptop");
		category.setImageurl("CAT_3.png");
		categories.add(category);
	}

	
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		//enhanced for loop
		for(Category category : categories) {
			if(category.getId()== id) return category;
		}
		return null;
	}

}
