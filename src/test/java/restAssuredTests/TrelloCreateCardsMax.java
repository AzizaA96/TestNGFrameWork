package restAssuredTests;

public class TrelloCreateCardsMax {

	public static void main(String[] args) {
		String key = "91a83a1e0cd06f87d600e9eaef5062f2"; 
		String token = "ATTA2bf30b39cc690ece923e98a32c540671352f9e1b2e145cb0a7ad7994b2333c761B378C03"; 
		String listId = "6514b98e8af8c1df73c3b056"; 
	
			
			RestAssured.baseURI = "https://api.trello.com/1/cards"; 
			// CREATE REQUEST OBJECT 
			RequestSpecification httpRequest = RestAssured.given(); 
			
			httpRequest.header("Contentt-Type", "application/jason");
			
			int maxCards = 10001; 
			int numCards = 0; 
			
			while(numCards < maxCards) {
			JSONObject requestBody = new JSONObject(); 
			requestBody.put("name", " Cards for LoneWolf - " + (numCards + 1)); 
			requestBody.put("idList", idList); 
			requestBody.put("key", key); 
			requestBody.put("token", token); 
			
			Response myResponse = httpRequest.body(requestBody.toString()).post(); 
			
			int statusCode = myRespons.getStatusCode(); 
			if(statusCode ==200) {}
			numCrds++; 
			System.out.println("Cards "+);
	}

}
