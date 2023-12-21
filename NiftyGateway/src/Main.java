import java.util.List;

import OOP.NiftyGateWay.crawl.JsonReader;
import OOP.NiftyGateWay.data.NftGatewayNft;

public class Main {

	public static void main(String[] args) {
	    //TEST OPENSEA
	        String filePath = "C:\\Users\\Administrator\\eclipse-workspace\\NiftyGateway\\src\\OOP\\data\\NiftyGateway.json";
	        JsonReader op = new JsonReader();
	        // Gọi phương thức để đọc dữ liệu và nhận danh sách OpenSeaNft
	        List<NftGatewayNft> openSeaNftList = op.readOpenSeaJson(filePath);
	        for (NftGatewayNft nft: openSeaNftList
	             ) {
	            System.out.println(nft.getName());
	            System.out.println(nft.getFloorPrice());
	        }
	}
}
