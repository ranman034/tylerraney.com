package com.tylerraney.service;

import java.util.List;

import com.tylerraney.entity.Photograph;

public interface PhotographManager {

	public String getUniqueTags();
	
	public List<Photograph> getPhotographs(String[] tags);
}
