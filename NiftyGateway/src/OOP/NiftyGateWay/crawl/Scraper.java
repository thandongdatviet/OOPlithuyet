package OOP.NiftyGateWay.crawl;

import java.io.IOException;
import java.util.Map;

import org.json.JSONObject;

public interface Scraper {
	Map<String, JSONObject> scrape() throws IOException;
}
