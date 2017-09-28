package com.ata.dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ata.bean.DriverBean;
import com.ata.bean.ReservationBean;
import com.ata.bean.RouteBean;
import com.ata.bean.VehicleBean;

@Component
public class xyzDAOImpl {

	@Autowired
	SessionFactory sf ;
	
	@Transactional
	public String addVehicle(VehicleBean vehicleBean)
	{
		String result = null;
		
		try
		{
			 
			return result;
		}
		catch(HibernateException error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
			return result;
		}
	}
	
	@Transactional
	public int deleteVehicle(ArrayList<String> vehicleID)
	{
		int answer = 0;
		return answer;
	}
	
	@Transactional
	public VehicleBean viewVehicle(String vehicleID)
	{
		VehicleBean vehicle = null;
		return vehicle;
		
	}
	
	@Transactional
	public boolean modifyVehicle(VehicleBean vehicleBean)
	{
		boolean result = false;
		return result;
	}
	
	@Transactional
	public String addDriver(DriverBean driverBean)
	{
		String result = null;
		return result;
	}
	
	@Transactional
	public int deleteDriver(ArrayList<String> driverID)
	{
		int answer = 0;
		return answer;
	}
	
	@Transactional
	public boolean allotDriver(String reservationID, String driverID)
	{
		boolean result = false;
		return result;
		
	}
	
	@Transactional
	public boolean modifyDriver(DriverBean driverBean)
	{
		boolean result = false;
		return result;
		
	}
	
	@Transactional
	public String addRoute(RouteBean routeBean)
	{
		String result = null;
		return result;
	}
	
	@Transactional
	public int deleteRoute(ArrayList<String> routeID)
	{
		int answer = 0;
		return answer;
	}
	
	@Transactional
	public RouteBean viewRoute(String routeID)
	{
		RouteBean route = null;
		return route;
	}
	
	@Transactional
	public ArrayList<VehicleBean> viewVehiclesByType(String vehicleType)
	{
		ArrayList<VehicleBean> vehicleList = null;
		return vehicleList;
	}
	
	@Transactional
	public ArrayList<VehicleBean> viewVehicleBySeats(int noOfSeats)
	{
		ArrayList<VehicleBean> vehicleList = null;
		return vehicleList;
	}
	
	@Transactional
	public ArrayList<RouteBean> viewAllRoutes()
	{
		ArrayList<RouteBean> routeList = null;
		return routeList;
	}
	
	@Transactional
	public String bookVehicle(ReservationBean reservationBean)
	{
		String result = null;
		return result;
	}
	
	@Transactional
	public boolean cancelBooking(String userID, String reservationID)
	{
		boolean result = false;
		return result;
		
	}
	
	@Transactional
	public ReservationBean viewBookingDetails(String reservationID)
	{
		ReservationBean reservation = null;
		return reservation;
	}
	
	@Transactional
	public ReservationBean printBookingDetails(String reservationID)
	{
		ReservationBean reservation = null;
		return reservation;
	}

}
