package com.senla.hoteldb.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.senla.hoteldb.models.Service;;

public class ConvertToService {
	SimpleDateFormat sdf = new SimpleDateFormat("yyy,mm,dd");
	public List<Service> convertToService(String[] list, List<Service> services){
		for (int i=0; i<list.length; i++){
			Service service = new Service();
			String[] info = list[i].split("-");
			for (int j=9; j < info.length; j++){
				if (j % 3 == 0){
					service.setName(info[j]);
				} else if (j % 3 == 1){
					service.setPrice(Integer.parseInt(info[j]));
				} else if (j % 3 == 2){
					try {
						service.setDate(sdf.parse(info[j]));
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (service.getName().equalsIgnoreCase("null")){
						continue;
					} else {
						services.add(service);
				} 
			}
//			if (service.getName().equalsIgnoreCase("null")){
//				continue;
//			} else {
//				services.add(service);
//			}
		}
			
		}
		return services;
	}
}
