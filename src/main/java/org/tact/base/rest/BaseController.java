package org.tact.base.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tact.base.mybatis.mapper.TimezoneMapper;

@RestController
@RequestMapping(value = "/base")
public class BaseController {
	
	@Autowired
    private TimezoneMapper timezoneMapper;
	
	/**
	 * 
	 * @return
	 * 
	 * Possible urls:
	 * 		http://localhost:1878/base/
	 */
    @GetMapping(value = "")
    public <T> T testBase() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("one", "two");
        map.put("three", "four");
        map.put("five", "six");
        map.put("seven", "eight");
        
        return (T) map;
    }
    
    
    
    /**
     * 
     * @param timezone
     * @return
     * 
     * Possible urls:
	 * 		http://localhost:1878/base/get/by/timezone
	 * 		http://localhost:1878/base/get/by/timezone?timezone=a
	 * 
	 * Timezones:
	 * 		http://joda-time.sourceforge.net/timezones.html
     * 
     */
    @GetMapping(value = "/get/by/timezone")
    public <T> T getByTimezone(
    		@RequestParam(value = "timezone")String timezone) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        
        map.put("timezone", timezone);
        map.put("timezone_list", timezoneMapper.findByNameLike("%"+timezone+"%"));
        
        return (T) map;
    }
}
