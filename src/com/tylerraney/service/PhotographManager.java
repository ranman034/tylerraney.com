package com.tylerraney.service;

import java.util.List;

import com.tylerraney.entity.Photograph;
import com.tylerraney.entity.Tag;

public interface PhotographManager {

	public List<Photograph> getAllPhotographs();
	
	public List<Photograph> getPhotographsByTags(String[] tags);
	
	public List<Tag> getUniqueTags();
	
	public String getUniqueTagsAsString();
	
}
