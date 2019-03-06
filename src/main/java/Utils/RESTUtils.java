/**
 * @author gabriel.gomes
 */
package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RESTUtils {

	public RESTUtils() {
	
	} 
   
    public String sendGet(String requestUrl) throws IOException {
        HttpURLConnection connection = null;
        String output = "";
        String saida = "";
        try {
            URL url = new URL(requestUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setRequestProperty("Accept", "application/json");
            BufferedReader br =
                    new BufferedReader(new InputStreamReader((connection.getInputStream())));
            while ((output = br.readLine()) != null) {
                saida += output;
            }
            connection.disconnect();
        } catch (Exception e) {
            return "";
        }
        return saida;
    }
}
