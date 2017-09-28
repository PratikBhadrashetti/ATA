package com.ata.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "RESERVATION_BEAN")
@Table(name = "RESERVATION_TABLE")
public class ReservationBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RESERVATION_ID" , nullable = false , length = 512)
	private String reservationID;
	
	@Column(name = "USER_ID" , nullable = false , length = 512 )
	private String userID;
	
	@Column(name = "ROUTE_ID" , nullable = false , length = 512 )
	private String routeID;
	
	@Column(name = "BOOKING_DATE" , nullable = false)
	private Date bookingDate;
	
	@Column(name = "JOURNEY_DATE" , nullable = false )
	private Date journeyDate;
	
	@Column(name = "VEHICLE_ID" , nullable = false , length = 512 )
	private String vehicleID;
	
	@Column(name = "DRIVER_ID" , nullable = false , length = 512 )
	private String driverID;
	
	@Column(name = "BOOKING_STATUS" , nullable = false )
	private String bookingStatus;
	
	@Column(name = "TOTAL_FARE" , nullable = false )
	private double totalFare;
	
	@Column(name = "BOARDING_POINT" , nullable = false , length = 512 )
	private String boardingPoint;
	
	@Column(name = "DROP_POINT" , nullable = false , length = 512 )
	private String dropPoint;

	public String getReservationID() {
		return reservationID;
	}

	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getRouteID() {
		return routeID;
	}

	public void setRouteID(String routeID) {
		this.routeID = routeID;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getDriverID() {
		return driverID;
	}

	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}

	public String getDropPoint() {
		return dropPoint;
	}

	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}

	@Override
	public String toString() {
		return "ReservationBean [reservationID=" + reservationID + ", userID=" + userID + ", routeID=" + routeID
				+ ", bookingDate=" + bookingDate + ", journeyDate=" + journeyDate + ", vehicleID=" + vehicleID
				+ ", driverID=" + driverID + ", bookingStatus=" + bookingStatus + ", totalFare=" + totalFare
				+ ", boardingPoint=" + boardingPoint + ", dropPoint=" + dropPoint + "]";
	}
	
}
