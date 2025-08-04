package com.kyh.system.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kyh.system.model.Management;
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
	

//	更新画面
	@GetMapping("/update/{syainId}")
	public String showUpdateSyain(@PathVariable int syainId, Model model) {
	    Syain syain = syainService.getSyainById(syainId);
	    
	    model.addAttribute("syain", syain);
	    
	    Map<Integer, Integer> osSelectionMap = new HashMap<>();

	    if(syain.getItOs() != null && !syain.getItOs().isEmpty()) {
	        String[] parts = syain.getItOs().split(",");
	        for(String part : parts) {
	            String[] split = part.split("-");
	            if(split.length == 2) {
	                try {
	                    int osId = Integer.parseInt(split[0]);
	                    int selection = Integer.parseInt(split[1]);
	                    osSelectionMap.put(osId, selection);
	                } catch(NumberFormatException e) {
	                }
	            }
	        }
	    }

	    // 모델에 추가
	    model.addAttribute("osSelectionMap", osSelectionMap);
	    
		Map<String, String> attributes = new LinkedHashMap<>();

		attributes.put("kaisha1", managementService.getManagementById(1, 1, 1).getValue1());
		attributes.put("kaisha2", managementService.getManagementById(1, 2, 1).getValue1());

		for (int i = 1; i <= 6; i++) {
		    attributes.put("shokugyo" + i, managementService.getManagementById(3, 4, i).getValue1());
		}
		model.addAllAttributes(attributes);
		List<Map<String, Object>> osList = new ArrayList<>();
		int i = 1;
		while (true) {
		    Management m = managementService.getManagementById(3, 6, i);
		    if (m == null || m.getValue1() == null) break;

		    Map<String, Object> osMap = new HashMap<>();
		    osMap.put("id", i);  
		    osMap.put("name", m.getValue1());
		    osList.add(osMap);
		    i++;
		}
		model.addAttribute("osList", osList);
		return "common/update";
	}
	
    @PostMapping("/syainUpdate")
    public String pdateSyain(@ModelAttribute Syain form) {
        syainService.update(form);
	    return "redirect:/syainmanagement";
    }
	

//	登録画面
    @GetMapping("/syainRegist")
    public String showRegistPage(Model model) {

		Map<String, String> attributes = new LinkedHashMap<>();

		attributes.put("kaisha1", managementService.getManagementById(1, 1, 1).getValue1());
		attributes.put("kaisha2", managementService.getManagementById(1, 2, 1).getValue1());

		for (int i = 1; i <= 6; i++) {
		    attributes.put("shokugyo" + i, managementService.getManagementById(3, 4, i).getValue1());
		}
		
		List<Map<String, Object>> osList = new ArrayList<>();
		int i = 1;
		while (true) {
		    Management m = managementService.getManagementById(3, 6, i);
		    if (m == null || m.getValue1() == null) break;

		    Map<String, Object> osMap = new HashMap<>();
		    osMap.put("id", i);  
		    osMap.put("name", m.getValue1());
		    osList.add(osMap);
		    i++;
		}
		model.addAttribute("osList", osList);
		model.addAllAttributes(attributes);

    	
		return "common/regist";
    }


    @PostMapping("/syainRegist")
    public String registerSyain(@ModelAttribute Syain form) {
        syainService.save(form);
	    return "redirect:/syainmanagement";
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
		
		Map<String, String> attributes = new LinkedHashMap<>();

		attributes.put("kaisha1", managementService.getManagementById(1, 1, 1).getValue1());
		attributes.put("kaisha2", managementService.getManagementById(1, 2, 1).getValue1());

		for (int i = 1; i <= 6; i++) {
		    attributes.put("shokugyo" + i, managementService.getManagementById(3, 4, i).getValue1());
		}

		model.addAllAttributes(attributes);

		return "common/search";
	}

	
}
