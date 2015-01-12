package fitInnsbruck;

public class Facility {
	
	private Point coordinates;
	private Address address;
	private Sport sport;
//	Öffnungszeiten
	private boolean roofed;
//	private boolean light;
	
	public Facility(Point coordinates, Address address, Sport sport,
			boolean roofed) {
		super();
		this.coordinates = coordinates;
		this.address = address;
		this.sport = sport;
		this.roofed = roofed;
	}
	
//	/**
//	 * @return the address
//	 */
//	public Address getAddress() {
//		return address;
//	}
//	/**
//	 * @param address the address to set
//	 */
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	/**
//	 * @return the sport
//	 */
//	public Sport getSport() {
//		return sport;
//	}
//	/**
//	 * @param sport the sport to set
//	 */
//	public void setSport(Sport sport) {
//		this.sport = sport;
//	}
//	/**
//	 * @return the roofed
//	 */
//	public boolean isRoofed() {
//		return roofed;
//	}
//	/**
//	 * @param roofed the roofed to set
//	 */
//	public void setRoofed(boolean roofed) {
//		this.roofed = roofed;
//	}
//	
//	

}
