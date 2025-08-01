package com.kyh.system.controller;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kyh.system.model.Syain;
import com.kyh.system.service.ManagementService;
import com.kyh.system.service.SyainService;


@Controller
public class SyainController {
	
	@Autowired
	private SyainService syainService;
	
	@Autowired
	private ManagementService managementService;
	
	@GetMapping("/delete/{id}")
	public String deleteSyain(@PathVariable("id") Integer syainId) {
	    syainService.deleteSyainById(syainId);
	    return "redirect:/syainmanagement";
	}
	
	
	@GetMapping("/update/{syainId}")
	public String updateUser(@PathVariable int syainId, Model model) {
	    Syain syain = syainService.getSyainById(syainId);
	    model.addAttribute("syain", syain);
	    return "common/update";
	}

	@RequestMapping(value = "/syainRegist", method=RequestMethod.GET)
	public String RegistUser(){
		
		return "common/regist";
	}
	
	@RequestMapping(value = "/syainmanagement", method=RequestMethod.GET)
	public String searchSyain(
	        @RequestParam(required = false) Integer syozokuKaisya,
	        @RequestParam(required = false) Integer syokugyoKind,
	        @RequestParam(required = false) String syainName,
	        @RequestParam(required = false, defaultValue = "false") Boolean zaiseki,
	        @RequestParam(required = false, defaultValue = "false") Boolean hizaiseki,
	        Model model) {
		Integer zaisekiNum;
		
		if (zaiseki == false && hizaiseki == false) {
			zaisekiNum = 0;
		}else if (zaiseki == true && hizaiseki == false) {
			zaisekiNum = 1;
		}else if (zaiseki == false && hizaiseki == true) {
			zaisekiNum = 2;
		}else {
			zaisekiNum = 0;
		}
		
		List<Syain> syainList = syainService.getFilteredSyainList(syokugyoKind,syozokuKaisya,syainName, zaisekiNum); 
	    syainList.sort(
	            Comparator.comparing(Syain::getLastNameKanji)
	                      .thenComparing(Syain::getFirstNameKanji)
	        );
		

		model.addAttribute("syainList",syainList);
		model.addAttribute("syainListSize",syainList.size());
		
		model.addAttribute("kaisha1", managementService.getManagementById(1,1,1).getValue1());
		model.addAttribute("kaisha2", managementService.getManagementById(1,2,1).getValue1());
		model.addAttribute("shokugyo1", managementService.getManagementById(3,4,1).getValue1());
		model.addAttribute("shokugyo2", managementService.getManagementById(3,4,2).getValue1());
		model.addAttribute("shokugyo3", managementService.getManagementById(3,4,3).getValue1());
		model.addAttribute("shokugyo4", managementService.getManagementById(3,4,4).getValue1());
		model.addAttribute("shokugyo5", managementService.getManagementById(3,4,5).getValue1());
		model.addAttribute("shokugyo6", managementService.getManagementById(3,4,6).getValue1());
		
		
//		System.out.println(syainService.getSyainById(param));
//		System.out.println(managementService.getManagementById(1,2,1));
		return "common/search";
	}

	
}
