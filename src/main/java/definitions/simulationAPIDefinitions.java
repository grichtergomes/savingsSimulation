/**
 * @author gabriel.gomes
 */
package definitions;


import java.io.IOException;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import Utils.RESTUtils;

public class simulationAPIDefinitions {
    RESTUtils restUtils = new RESTUtils();
    String response;

	public boolean sendSimulationApiGet() throws IOException {
		String urlString = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";
		response = restUtils.sendGet(urlString);
		
		if (response.equals("")) {
			return false;
		} else {
			return true;
		}		
	}

	public boolean validateGETResponse() throws JSONException {
		
		JSONObject jsonResponse = new JSONObject(response);
		JSONObject jsonExpected = new JSONObject("{\"id\":1,\"meses\":[\"112\",\"124\",\"136\",\"148\"],\"valor\":[\"2.802\",\"3.174\",\"3.564\",\"3.971\"]}");
		
		if (jsonResponse.equals(jsonExpected)) {
			return true;
		} else {
			return false;
		}
	}
}

