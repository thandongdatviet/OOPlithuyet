package OOP.NiftyGateWay.crawl;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import OOP.NiftyGateWay.data.NftGatewayNft;

public class JsonReader {
	public static List<NftGatewayNft> readNiftyGatewayJson(String filePath) {
        List<NftGatewayNft> niftyGatewayList = new ArrayList<>();

        try {
            // Sử dụng Gson để đọc file JSON
            Gson gson = new Gson();
            JsonArray jsonArray = gson.fromJson(new FileReader(filePath), JsonArray.class);

            // Duyệt qua mảng JSON và tạo đối tượng từ mỗi phần tử
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonObject jsonObject = jsonArray.get(i).getAsJsonObject();
                NftGatewayNft niftyGatewayNft = gson.fromJson(jsonObject, NftGatewayNft.class);
                niftyGatewayList.add(niftyGatewayNft);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Trả về danh sách niftyGatewayNft
        return niftyGatewayList;
    }
}
