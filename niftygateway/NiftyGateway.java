package niftygateway;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class NiftyGateway {

	// Get data
	public static void main() {
		Gson gson = new Gson();
		try {
			File file = new File("C:\\Users\\Administrator\\OneDrive - Hanoi University of Science and Technology\\Desktop\\OOP-lithuyet\\data_NGateway.json");
			FileReader fileReader = new FileReader(file);
			NFT[] itemNFT = gson.fromJson(fileReader, NFT[].class);
			for(NFT item : itemNFT) {
				System.out.println(item.getNiftyTitle());
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
		
}

