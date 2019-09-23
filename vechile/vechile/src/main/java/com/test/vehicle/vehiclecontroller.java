package com.test.vehicle;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class vehiclecontroller {
	@Autowired 
	private vehicleservice wcservice; 
	
	
	//vechile list
	@RequestMapping(method =RequestMethod.GET,value="/vehicle")
	public   List<vehiclepojo> vehicle(){
		return wcservice.vehicle();
	}
	
	
	//vechile  by id
	@RequestMapping(method =RequestMethod.GET,value ="/vehicle/{idv}")
	public  Optional<vehiclepojo> getvalue(@PathVariable int idv) {
		return wcservice.getvalue(idv);
		
	}
	
	//vechile by type
	@RequestMapping(method =RequestMethod.GET,value ="/vehicle/type/{type}")
	public List<vehiclepojo> getvechilebytype(@PathVariable String type){
		return wcservice.getvechilebytype(type);
		
	}
	
	
	//adding vehicle
	@RequestMapping(method =RequestMethod.POST,value = "/vehicle")
		public void  add(@RequestBody vehiclepojo wcservice1) {
			wcservice.add(wcservice1);
		}
	
	
	
	//updating editing
	@RequestMapping(method =RequestMethod.PUT,value = "/vehicle/{idv}")
	public void  update(@RequestBody vehiclepojo wcservice1,@PathVariable int idv) {
		wcservice.update(idv,wcservice1);
	
	}
	
	
	//deleting by id
	@RequestMapping(method =RequestMethod.DELETE,value = "/vehicle/{idv}")
	public void  dele(@PathVariable int idv) {
		wcservice.dele(idv);
	}
	
	
	
	
	}
