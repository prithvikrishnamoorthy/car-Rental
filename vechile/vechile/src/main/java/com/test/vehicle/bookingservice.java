package com.test.vehicle;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookingservice {

	@Autowired
	private bookingrepo booking;

	@Autowired
	private vehiclerepo vehiclerepo;

	public  List<BookingVehicle> bookingvehicle1(){
//		List<bookingvehicle> bookingvehicle1 =new ArrayList<bookingvehicle>();
//		 booking.findall().
//		forEach(bookingvehicle1::add);
//		
//		
		return (List<BookingVehicle>) booking.findAll();		
	

}
	//to book a car
	public void bookingcar(BookingVehicle bookingvehicle2, int idv) {

		vehiclepojo vehiclepojo = vehiclerepo.findByIdv(idv);	
		bookingvehicle2.setVehiclepojo(vehiclepojo);
		booking.save(bookingvehicle2);
	}

	//view booking by id
	public Optional<BookingVehicle> getbookedcar(int id) {
		
		return booking.findById(id);
	}



	//editing the booking 
	public void editbooking(int id, BookingVehicle bookingvehicle2) {
		booking.save(bookingvehicle2);
		
	}

	
	//cancel booking
	public void cancelbooking(int id) {
		booking.deleteById(id);
		
	}



	//view available car
	public List<vehiclepojo> notbooked(Date startdate, Date enddate) {
		return vehiclerepo.notbooked(startdate,enddate);
	}
	
	

}
