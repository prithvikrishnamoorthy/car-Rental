package com.test.vehicle;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookingcontroller {
	@Autowired
	private bookingservice bookingservice;
	
	// booking a car
		
	@RequestMapping(method =RequestMethod.POST, value = "/bookingcar/{idv}")
		public void bookingcar(@RequestBody BookingVehicle bookingvehicle2 ,@PathVariable int idv){
			bookingservice.bookingcar(bookingvehicle2,idv);
		}
	
	//view booking by id
	@RequestMapping(method =RequestMethod.GET,value ="/bookedcar/{id}")
	public  Optional<BookingVehicle> getbookedcar(@PathVariable int id) {
		return bookingservice.getbookedcar(id);
		
	}
	//view available car 
	@RequestMapping(method = RequestMethod.GET,value="/bookedcar/notbooked/{startdate}/{enddate}")
	public List<vehiclepojo> notbooked(@PathVariable Date startdate,Date enddate){
		return bookingservice.notbooked(startdate,enddate);
	}
	
	//editing the booking
	@RequestMapping(method =RequestMethod.PUT,value = "/bookedcar/{id}")
	public void  editbooking(@RequestBody BookingVehicle bookingvehicle2,@PathVariable int id) {
		bookingservice.editbooking(id,bookingvehicle2);
	
	}
	
	//cancel booking
	@RequestMapping(method =RequestMethod.DELETE,value = "/bookedcar/{id}")
	public void  cancelbooking(@PathVariable int id) {
		bookingservice.cancelbooking(id);
	}
	

}