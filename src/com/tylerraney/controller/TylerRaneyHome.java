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
		model.addAttribute("tags", photoManager.getUniqueTags());
		
		return "home";
	}
	
	/* this is the conroller's part of the magic; I'm just using a simple GET but you
     * could just as easily do a POST here, obviously
     */
    @RequestMapping( method=RequestMethod.GET, value="/photos" )
    public String getSubView( Model model, @RequestParam(value="myTags[]") String[] myTags) {
    	PhotographManager photoManager = new HomePhotographManager();
    	
    	if(myTags.length == photoManager.getUniqueTags().split(",").length)
    	{
    		myTags = null;
    	}
    	
    	model.addAttribute("photos", photoManager.getPhotographs(myTags));
    	
        return "photos";
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