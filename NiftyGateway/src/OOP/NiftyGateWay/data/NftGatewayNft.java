package OOP.NiftyGateWay.data;

public class NftGatewayNft {

	private String id;
	private String name;
	private String image;
	private double floorPrice;
	private double numOfSales;
	private double numOwners;
	private double volume;
	private double volumeChange;
	private double totalSupply;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getImage() {
		return image;
	}
	public double getFloorPrice() {
		return floorPrice;
	}
	public double getNumOfSales() {
		return numOfSales;
	}
	public double getNumOwners() {
		return numOwners;
	}
	public double getVolume() {
		return volume;
	}
	public double getVolumeChange() {
		return volumeChange;
	}
	public double getTotalSupply() {
		return totalSupply;
	}
	public NftGatewayNft(String id, String name, String image, double floorPrice, double numOfSales, double numOwners,
			double volume, double volumeChange, double totalSupply) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.floorPrice = floorPrice;
		this.numOfSales = numOfSales;
		this.numOwners = numOwners;
		this.volume = volume;
		this.volumeChange = volumeChange;
		this.totalSupply = totalSupply;
	}
	public NftGatewayNft() {
		super();
	}
	
	
}
