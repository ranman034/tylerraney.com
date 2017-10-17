package com.tylerraney.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tylerraney.service.HomePhotographManager;
import com.tylerraney.service.PhotographManager;

/**
 * 
 * @author Tyler Raney
 *
 */

@Controller
public class TylerRaneyHome {
			
	@RequestMapping(value={"","/","/home"})
	public String goToHome(HttpServletRequest request, Model model) {
		PhotographManager photoManager = new HomePhotographManager();

		// add tags to the model
		model.addAttribute("tags", photoManager.getUniqueTagsAsString());
		
		return "home";
	}
	
	/**
	 * 
	 * Gets the photographs with the specified tags otherwise returna all photos
	 * 
	 * @param model
	 * @param myTags
	 * @return view
	 */
    @RequestMapping( method=RequestMethod.GET, value="/photos" )
    public String getSubView( Model model, @RequestParam(value="myTags[]") String[] myTags) {
    	PhotographManager photoManager = new HomePhotographManager();
    	
    	if(myTags.length == photoManager.getUniqueTags().size())
    	{
    		myTags = null;
    		model.addAttribute("photos", photoManager.getAllPhotographs());
    	} else {
    		model.addAttribute("photos", photoManager.getPhotographsByTags(myTags));
    	}
    	
        return "photos";
    }
    
    @RequestMapping("/sirearmsProject")
    public String goToSirearmsProject() {
    	return "sirearmsProject";
    }
    
    @RequestMapping("/gmaProject")
	public String goToGmaProject() {
		return "gmaProject";
	}
    
	@RequestMapping("/tylerRaneyProject")
	public String goToTylerRaneyProject() {
		return "tylerRaneyProject";
	}
	
	@RequestMapping("/vcciccProject")
	public String goToVcciccProject() {
		return "vcciccProject";
	}
	
	@RequestMapping("/seniorProject")
	public String goToSeniorProject() {
		return "seniorProject";
	}
	
}