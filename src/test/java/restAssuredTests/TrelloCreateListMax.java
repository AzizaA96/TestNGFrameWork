package restAssuredTests;

public class TrelloCreateListMax {

	public static void main(String[] args) {
	String key = "91a83a1e0cd06f87d600e9eaef5062f2"; 
	String token = "ATTA2bf30b39cc690ece923e98a32c540671352f9e1b2e145cb0a7ad7994b2333c761B378C03"; 
	String boardId = "6514b98e8af8c1df73c3b056"; 
		int numList = 0 ; 
		// res assured base url 
		RestAssured.baseURI = ""; 
		// CREATE REQUEST OBJECT 
		RequestSpecification httpRequest = RestAssured.given(); 
		httpRequest.header("Contentt-Type", "application/jason");
		
		
		// create list untill the maximum limit is reached 
		 
while(true) {
	JSONObject requestBody = new JSONObject(); 
	requestBody.put("name", "LoneWolf" + (numList + 1)); 
	requestBody.put("isBoard", boardId); 
	requestBody.put("key", key); 
	requestBody.put("token", token); 
	
	Response myResponse = httpRequest.body(requestBody.toString()).post(); 
	
	int statusCode = myResponse.getStatusCode(); 
	if(statusCode == 200) {
		numLists++; 
		System.out.println("List" + numLists + "created");
	}else {
		System.out.println("Failed to create list");
		myResponse.prettyPrint(); // print the response for the further  inspection 
		break; // stop creating lists if an error occurs 
	}
} 
	}

}
