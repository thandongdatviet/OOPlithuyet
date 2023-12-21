package OOP.NiftyGateWay.storge;

import java.util.List;

import OOP.NiftyGateWay.crawl.JsonReader;
import OOP.NiftyGateWay.data.NftGatewayNft;

public class Storge {
    String filepath = "C:\\Users\\Administrator\\eclipse-workspace\\NiftyGateway\\src\\OOP\\data\\NiftyGateway.json";
    JsonReader reader = new JsonReader();
	List<NftGatewayNft> nftList = reader.readNiftyGatewayJson(filepath);
	
	public NftGatewayNft searchByTitle(String title) {
		for(NftGatewayNft nft : nftList) {
			if(nft.getName().equals(title)) {
				return nft;
			}
		}
		return null;
	}
}
