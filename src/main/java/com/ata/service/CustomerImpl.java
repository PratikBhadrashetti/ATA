package com.ata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ata.bean.ReservationBean;
import com.ata.bean.RouteBean;
import com.ata.bean.VehicleBean;
import com.ata.dao.xyzDAOImpl;

@Service
public class CustomerImpl {
	
	@Autowired
	xyzDAOImpl dao;
	
	public ArrayList<VehicleBean> viewVehiclesByType(String vehicleType)
	{
		ArrayList<VehicleBean> vehicleList = null;
		
		try
		{
			if((vehicleType != null))
			{			
				vehicleList = dao.viewVehiclesByType(vehicleType);
				
				if(!(vehicleList.isEmpty()))
				{
					return vehicleList;
				}
				else
				{
					return null;	
				}
			}
			else
			{
				return null;
			}
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
			return null;
		}	
	}
	
	public ArrayList<VehicleBean> viewVehicleBySeats(int noOfSeats)
	{
		ArrayList<VehicleBean> vehicleList = new ArrayList<VehicleBean>();
		
		try
		{
			if(noOfSeats > 0)
			{
				vehicleList = dao.viewVehicleBySeats(noOfSeats);
				
				if(!(vehicleList.isEmpty()))
				{
					return vehicleList;
				}
				else
				{
					return null;	
				}
			}
			else
			{
				return null;
			}
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<RouteBean> viewAllRoutes()
	{
		ArrayList<RouteBean> routeList = new ArrayList<RouteBean>();
		
		try
		{
			routeList = dao.viewAllRoutes();
			
			if(!(routeList.isEmpty()))
			{
				return routeList;
			}
			else
			{
			  return null;	
			}
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
			return null;
		}	
	}
	
	public String bookVehicle(ReservationBean reservationBean)
	{
		VehicleBean vehicle = null;
		
		String result = null;
		
		try
		{
		   if((reservationBean != null) 
			   && ((reservationBean.getBoardingPoint() != null) && (reservationBean.getBoardingPoint().length() >= 2))
			   && ((reservationBean.getDropPoint() != null) && (reservationBean.getDropPoint().length() >= 2))
			   && (reservationBean.getBookingDate() != null)
			   )
		   {
			   result = dao.bookVehicle(reservationBean);
			   return result;
		   }
		   else
		   {
			   return " Please Provide Valid Details... ";
		   }
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
			return "FAIL";
		}
	}
	
	public boolean cancelBooking(String userID, String reservationID)
	{
		boolean result = false;
		
		try
		{
		   if(((userID != null) && (userID.length() >= 6))
			  && ((reservationID != null) && (reservationID.length() >= 6))
			  )
		   {
			   result = dao.cancelBooking(userID , reservationID);
			   return result;
		   }
		   else
		   {
			   return result;
		   }
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
			return result;
		}
	}
	
	public ReservationBean viewBookingDetails(String reservationID)
	{
		ReservationBean reservation = null;
		
		try
		{
		   if((reservationID != null) && (reservationID.length() >= 6))
		   {
			   reservation = dao.viewBookingDetails(reservationID);
			   
			   if(!(reservation != null))
			   {
				   return reservation;
			   }
			   else
			   {
				return reservation;   
			   }
		   }
		   else
		   {
			 return reservation;   
		   }
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
			return reservation;
		}
	}
	
	public ReservationBean printBookingDetails(String reservationID)
	{
      ReservationBean reservation = null;
		
      try
		{
		   if((reservationID != null) && (reservationID.length() >= 6))
		   {
			   reservation = dao.printBookingDetails(reservationID);
			   
			   if(reservation!= null)
			   {
				   return reservation; 
			   }
			   else
			   {
				   return reservation;
			   }
		   }
		   else
		   {
			   return reservation;
		   }
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
			return reservation;
		}
	}

}
