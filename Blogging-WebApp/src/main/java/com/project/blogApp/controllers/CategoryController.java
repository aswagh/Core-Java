package com.project.blogApp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.blogApp.payloads.ApiResponse;
import com.project.blogApp.payloads.CategoryDto;
import com.project.blogApp.services.impl.CategoryServiceImpl;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
	
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;
	
	@PostMapping("/")
	public ResponseEntity<CategoryDto> createUser(@Valid @RequestBody CategoryDto categoryDto){
		return new ResponseEntity<CategoryDto>(this.categoryServiceImpl.createCategory(categoryDto),HttpStatus.CREATED);
	}
	@GetMapping("/{categoryId}")
	public ResponseEntity<CategoryDto> getUser(@PathVariable long categoryId){
		return new ResponseEntity<CategoryDto>(this.categoryServiceImpl.getCategoryById(categoryId),HttpStatus.OK);
	}
	@GetMapping("/")
	public ResponseEntity<List<CategoryDto>> getAllUsers(){
		return new ResponseEntity<List<CategoryDto>>(this.categoryServiceImpl.getAllCategory(),HttpStatus.OK);
	}
	@PutMapping("/{categoryId}")
	public ResponseEntity<CategoryDto> updateCategory(@Valid @RequestBody CategoryDto categoryDto,@PathVariable long categoryId){
		return new ResponseEntity<CategoryDto>(this.categoryServiceImpl.updateCategory(categoryDto, categoryId),HttpStatus.CREATED);
	}
	@DeleteMapping("/{categoryId}")
	public ResponseEntity<ApiResponse> deleteCategory(@PathVariable long categoryId){
		this.categoryServiceImpl.deleteCategory(categoryId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Category Deleted Successfully",true),HttpStatus.OK);
	}
}
