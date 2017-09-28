package com.ata.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ata.bean.DriverBean;
import com.ata.bean.RouteBean;
import com.ata.bean.VehicleBean;
import com.ata.dao.xyzDAOImpl;

@Service
public class AdministratorImpl {

	@Autowired
	xyzDAOImpl dao;
	
	public String addVehicle(VehicleBean vehicleBean)
	{
		try
		{
			if(vehicleBean != null 
					&& ((vehicleBean.getName() != null) && (vehicleBean.getName().length() >= 2))
					&& ( (vehicleBean.getType() != null ) && (vehicleBean.getType().length() >= 2))
					&& ((vehicleBean.getRegistrationNumber() != null ) && (vehicleBean.getRegistrationNumber().length() >= 6))
					&& ((vehicleBean.getSeatingCapacity() > 0))
					&& ((vehicleBean.getFarePerKM() > 0))
			  )
			   {
				 
				 String result = dao.addVehicle(vehicleBean);
				 return result;
			   }
			   else
			   {
				 return "FAIL";
			   }
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
		    return "FAIL";
	   }
	}
	
	public int deleteVehicle(ArrayList<String> vehicleID)
	{
		try
		{
			if((vehicleID != null ) && ((vehicleID).size() > 0))
			{
				int result = dao.deleteVehicle(vehicleID);
				
			    return result;
			}
			else
			{
				return 0;
			}
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
		    return 0;
	   }
	}
	
	public VehicleBean viewVehicle(String vehicleID)
	{
		VehicleBean vehicleBean = null;
		try
		{
			if((vehicleID != null ) && ((vehicleID).length() >= 6))
			{
				vehicleBean = dao.viewVehicle(vehicleID);
			    return vehicleBean;
			}
			else
			{
				return vehicleBean;
			}
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
		    return vehicleBean;
	   }
	}
	
	public boolean modifyVehicle(VehicleBean vehicleBean)
	{
		boolean result = false;
		
		try
		{
			if(vehicleBean != null 
					&& ((vehicleBean.getName() != null) && (vehicleBean.getName().length() >= 2))
					&& ( (vehicleBean.getType() != null ) && (vehicleBean.getType().length() >= 2))
					&& ((vehicleBean.getRegistrationNumber() != null ) && (vehicleBean.getRegistrationNumber().length() >= 6))
					&& ((vehicleBean.getSeatingCapacity() > 0))
					&& ((vehicleBean.getFarePerKM() > 0))
			  )
			   {
				 result = dao.modifyVehicle(vehicleBean);
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
	
	public String addDriver(DriverBean driverBean)
	{
		try
		{
			if((driverBean != null)
				 && ((driverBean.getName() != null) && (driverBean.getName().length() >= 2))
				 && ((driverBean.getStreet() != null ) && (driverBean.getStreet().length() >= 2))
				 && ((driverBean.getLocation() != null) && (driverBean.getLocation().length() >= 2))
				 && ((driverBean.getCity() != null ) && (driverBean.getCity().length() >= 2))
				 && ((driverBean.getState() != null ) && (driverBean.getState().length() >= 2))
				 && ((driverBean.getPincode() != null ) && (driverBean.getPincode().length() >= 6))
				 && ((driverBean.getMobileNo() != null ) && (driverBean.getMobileNo().length() >= 10))
				 && ((driverBean.getLicenseNumber() != null ) && (driverBean.getLicenseNumber().length() >= 10))
			  )
			{
				String result = dao.addDriver(driverBean);
				return result;
			}
			else
			{
			  return "FAIL";
			}
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
		    return "FAIL";
	   }
	}
	
	public int deleteDriver(ArrayList<String> driverID)
	{
		try
		{
			if((driverID != null ) && ((driverID).size() > 0))
			{
				int result = dao.deleteDriver(driverID);
				
			    return result;
			}
			else
			{
				return 0;
			}
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
		    return 0;
	   }
	}
	
	public boolean allotDriver(String reservationID, String driverID)
	{
		boolean result = false;
		try
		{
			if(
			       ((reservationID != null ) && (reservationID.length() >= 6))
				&& ((driverID != null ) && (driverID.length() >= 6))	
			   )
			{
			    result = dao.allotDriver(reservationID , driverID);
			    return true;
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
	
	public boolean modifyDriver(DriverBean driverBean)
	{
		boolean result = false;
		
		try
		{
			if((driverBean != null)
					 && ((driverBean.getName() != null) && (driverBean.getName().length() >= 2))
					 && ((driverBean.getStreet() != null ) && (driverBean.getStreet().length() >= 2))
					 && ((driverBean.getLocation() != null) && (driverBean.getLocation().length() >= 2))
					 && ((driverBean.getCity() != null ) && (driverBean.getCity().length() >= 2))
					 && ((driverBean.getState() != null ) && (driverBean.getState().length() >= 2))
					 && ((driverBean.getPincode() != null ) && (driverBean.getPincode().length() >= 6))
					 && ((driverBean.getMobileNo() != null ) && (driverBean.getMobileNo().length() >= 10))
					 && ((driverBean.getLicenseNumber() != null ) && (driverBean.getLicenseNumber().length() >= 10))
			  )
			   {
				 result = dao.modifyDriver(driverBean);
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
	
	public String addRoute(RouteBean routeBean)
	{
		try
		{
			if((routeBean != null) 
				 &&((routeBean.getSource() != null) && (routeBean.getSource().length() >= 2))
				 &&((routeBean.getDestination() != null ) && (routeBean.getDestination().length() >= 2))
				 &&(routeBean.getDistance() > 0)
				 && (routeBean.getTravelDuration() > 0)
				 )
			{
				String result = dao.addRoute(routeBean);
				return result;
			}
			else
			{
				return "FAIL";
			}
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
		    return "FAIL";
	   }
	}
	
	public int deleteRoute(ArrayList<String> routeID)
	{
		try
		{
			if((routeID != null ) && ((routeID).size() > 0))
			{
				int result = dao.deleteRoute(routeID);
				
			    return result;
			}
			else
			{
				return 0;
			}
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
		    return 0;
	   }
	}
	
	public RouteBean viewRoute(String routeID)
	{
		RouteBean routeBean = null;
		try
		{
			if((routeID != null ) && ((routeID).length() >= 6))
			{
				routeBean = dao.viewRoute(routeID);
			    return routeBean;
			}
			else
			{
				return routeBean;
			}
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
		    return routeBean;
	   }
	}
	
	
}
