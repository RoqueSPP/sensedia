package testApi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ApiTest {
	// KEY-------------------------------//
	String key = "25457a572e044cb6c87590a29102b6a7";
	// TOKEN---------------------------------------------------//
	String token = "735b0a34720094cac35691499e350a5f0db05a3300048c3b248deba8ef1efcaa";
	// NOMES----------------------------------------------------------------------------------//
	String name_Board = "Board Sensedia";
	String name_List = "List Sensedia";
	String name_Label = "Sensedia_teste de edição";
	// IDS---------------------------------------------------------------------------------//
	
	String idboard = "62368578877ef61d3f344ebd";	// \\
	String idlist = "62368c52d0641c21f3005931"; 	//  \\-->os IDsdevem ser substituidos após a criação de um novo<
	String idcard = "62368c86dfe2f517c171d61d"; 	//  //
	String idlabel = "6236832e3d4cb067c4313197";	// //
	// STATUS DE RETORNO----------------------------------------------------------------------//
	int status = 200;

	@Test
	public void CriarBoard() {

		HttpResponse<String> response;
		try {
			response = Unirest.post("https://api.trello.com/1/boards/")
			.header("Accept", "application/json")
			.queryString("name", name_Board)
			.queryString("key", key)
			.queryString("token", token)
            .asString();
			int statuscode = response.getStatus();
			assertEquals(status, statuscode);
			System.out.println(response.getBody());
		} catch (UnirestException e) {

			System.out.println(e.getCause());
		}

	}

	@Test
	public void CriarList() {
		HttpResponse<String> response;
		try {
			response = Unirest.post("https://api.trello.com/1/lists")
			.queryString("key", key)
			.queryString("token", token)
			.queryString("name", name_List)
			.queryString("idBoard", idboard)
			.asString();
			System.out.println(response.getBody().toString());
			int statuscode = response.getStatus();
			assertEquals(status, statuscode);
			
		} catch (UnirestException e) {
			System.out.println(e.getCause());
		}
	}

	@Test
	public void criarCard() {
		HttpResponse<JsonNode> response;
		try {
			response = Unirest.post("https://api.trello.com/1/cards/")
			.queryString("key", key)
			.queryString("token", token)
			.header("Accept", "application/json")
			.queryString("idList", idlist)
			.asJson();
			System.out.println(response.getBody());
			int statuscode = response.getStatus();
			assertEquals(status, statuscode);
		} catch (UnirestException e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void CardUpdate() {
		HttpResponse<JsonNode> response;
		try {
			response = Unirest.put("https://api.trello.com/1/cards/"+idcard)
					.queryString("key", key)
					.queryString("token", token)
					.header("Accept", "application/json")
					.queryString("name","👋 What? Why? How?")
					.queryString("desc", "Automação da API Trello feito!")
					.queryString("color", "yellow")
					.asJson();
					  
			System.out.println(response.getBody());
			int statuscode = response.getStatus();
			assertEquals(status, statuscode);
			
		} catch (UnirestException e) {
			System.out.println(e.getCause());
		}
	}
	@Test
	public void DeliteBoard() {
	HttpResponse<String> response;
	try {
		response = Unirest.delete("https://api.trello.com/1/boards/"+idboard)
				.queryString("key", key)
				.queryString("token", token)
				  .asString();
		System.out.println(response.getBody());
		int statuscode = response.getStatus();
		assertEquals(status, statuscode);
		
	} catch (UnirestException e) {
		System.out.println(e.getCause());
	}
	}
}

