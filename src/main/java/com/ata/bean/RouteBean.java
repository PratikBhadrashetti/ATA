package com.ata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "ROUTE_BEAN")
@Table(name = "ROUTE_TABLE")
public class RouteBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ROUTE_ID" , nullable = false , length = 512 )
	private String routeID;
	
	@Column(name = "ROUTE_SOURCE" , nullable = false , length = 512 )
	private String source;
	
	@Column(name = "ROUTE_DESTINATION" , nullable = false , length = 512 )
	private String destination;
	
	@Column(name = "ROUTE_DISTANCE" , nullable = false )
	private int distance;
	
	@Column(name = "ROUTE_TRAVEL_DURATION" , nullable = false)
	private int travelDuration;
	
	
	public String getRouteID() {
		return routeID;
	}
	
	
	public void setRouteID(String routeID) {
		this.routeID = routeID;
	}
	
	
	public String getSource() {
		return source;
	}
	
	
	public void setSource(String source) {
		this.source = source;
	}
	
	
	public String getDestination() {
		return destination;
	}
	
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	public int getDistance() {
		return distance;
	}
	
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	public int getTravelDuration() {
		return travelDuration;
	}
	
	
	public void setTravelDuration(int travelDuration) {
		this.travelDuration = travelDuration;
	}
	
	
	@Override
	public String toString() {
		return "RouteBean [routeID=" + routeID + ", source=" + source + ", destination=" + destination + ", distance="
				+ distance + ", travelDuration=" + travelDuration + "]";
	}
	
}
