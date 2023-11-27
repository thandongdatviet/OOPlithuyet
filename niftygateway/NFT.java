package niftygateway;

public class NFT{
	private String niftyTitle;
	private float floorPrice;
	private float oneDayTotalVolume;
	private float sevenDayTotalVolume;
	private float thirtyDayTotalVolume;
	private float totalVolume;
	private float avgSalePrice;
	
	//getter and setter...
	public String getNiftyTitle() {
		return niftyTitle;
	}
	public float getFloorPrice() {
		return floorPrice;
	}
	public float getOneDayTotalVolume() {
		return oneDayTotalVolume;
	}
	public float getSevenDayTotalVolume() {
		return sevenDayTotalVolume;
	}
	public float getThirtyDayTotalVolume() {
		return thirtyDayTotalVolume;
	}
	public float getTotalVolume() {
		return totalVolume;
	}
	public float getAvgSalePrice() {
		return avgSalePrice;
	}
	
	// Constructor
	public NFT(String niftyTitle, float floorPrice, float oneDayTotalVolume, float sevenDayTotalVolume,
			float thirtyDayTotalVolume, float totalVolume, float avgSalePrice) {
		super();
		this.niftyTitle = niftyTitle;
		this.floorPrice = floorPrice;
		this.oneDayTotalVolume = oneDayTotalVolume;
		this.sevenDayTotalVolume = sevenDayTotalVolume;
		this.thirtyDayTotalVolume = thirtyDayTotalVolume;
		this.totalVolume = totalVolume;
		this.avgSalePrice = avgSalePrice;
	}
	
	// Print information of item NFT
	public String PrintInfor(){
		return "Title" + getNiftyTitle() + " - " + "Floor price" + getFloorPrice() + " - " 
	+ "Total volume" + totalVolume ; 
	}
	

}