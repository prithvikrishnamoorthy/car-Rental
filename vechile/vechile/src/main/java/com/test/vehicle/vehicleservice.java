package com.test.vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class vehicleservice {


@Autowired
private vehiclerepo vrepo;
		List<vehiclepojo> wcservice1 =new ArrayList<vehiclepojo>();
		
		
		//adding vehicle
		public void add(vehiclepojo wcservice1) {
			vrepo.save(wcservice1);
		}

		
		//vechile  by id
		public Optional<vehiclepojo> getvalue(int idv) {
			
			return vrepo.findAllById(idv);
		}
		
		
		//updating editing
		public void update(int idv, vehiclepojo wcservice1) {
		vrepo.save(wcservice1);
		}
		
		//deleting by id
		public void dele(int idv) {
			vrepo.deleteById(idv);
			
		}

		
		//vechile by type
		public List<vehiclepojo> getvechilebytype(String type) {
			
			return vrepo.findByType(type);
		}
		
		
		
		//vechile list
		public List<vehiclepojo> vehicle() {
			return (List<com.test.vehicle.vehiclepojo>) vrepo.findAll();
		}

	
		
}
