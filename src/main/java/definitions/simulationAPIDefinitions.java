/**
 * @author gabriel.gomes
 */
package definitions;


import java.io.IOException;

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

	public boolean validateGETResponse() {
		if (response.equals("{\"id\":1,\"meses\":[\"112\",\"124\",\"136\",\"148\"],\"valor\":[\"2.802\",\"3.174\",\"3.564\",\"3.971\"]}")) {
			return true;
		} else {
			return false;
		}
	}
}

