package com.xworkz.shop.service;

import com.xworkz.shop.dto.ShopMergingDTO;

public class ShopMergingServiceImpl implements ShopMergingService {

	@Override
	public boolean validateAndSave(ShopMergingDTO shopMergingDTO) {

		boolean valid=true;
		if(shopMergingDTO!=null) 
		{
			String name=shopMergingDTO.getName();
			if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<30)
			{
				System.out.println("Valid name");
			}
			else
			{
				System.out.println("In-Valid name");
				valid=false;
			}
			
			String email=shopMergingDTO.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@")
					&& (email.endsWith(".com") || email.endsWith(".in"))) 
			{
				System.out.println("Given email is valid....");
			} else 
			{
				System.err.println("Given email is Invalid....");
				valid=false;
			}

			
			int age = shopMergingDTO.getAge();
			if (age > 18)
			{
				System.out.println("Age is valid");
			} else {
				System.err.println("age is invalid");
				valid=false;
			}
			
			String city=shopMergingDTO.getCity();
			if(city!=null && !city.isEmpty() && city.length()>3 && city.length()<30)
			{
				System.out.println("Valid City");
			}
			else
			{
				System.out.println("In-Valid City");
				valid=false;
			}
			
			String state=shopMergingDTO.getState();
			if(state!=null && !state.isEmpty() && state.length()>3 && state.length()<30)
			{
				System.out.println("Valid state");
			}
			else
			{
				System.out.println("In-Valid state");
				valid=false;
			}

			String country=shopMergingDTO.getCountry();
			if(country!=null && !country.isEmpty() && country.length()>3 && country.length()<30)
			{
				System.out.println("Valid country");
			}
			else
			{
				System.out.println("In-Valid country");
				valid=false;
			}

			
		}		
		
		return valid;
	}

}
