package selenium.Props;

import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostProps {

	public class Typicode {

		Properties prop = new Properties();

		@BeforeTest
		public void getData() throws IOException {
			System.out.println("welcome to restassured...");

			FileInputStream fis = new FileInputStream(
					"C:\\cucumber\\Rest\\rest\\src\\test\\java\\Files\\environment.properties");
			prop.load(fis);
			String url = prop.getProperty("HOST");
			System.out.println(url);
		}

		@Test
		public void I_execute_post_call_to_register_the_account_in_registrationpage_and_pass_it_to_delete_method()
				throws Throwable {

			String b = "{\r\n" + "    \"userId\": \"21\",\r\n" + "    \"id\": \"18\",\r\n"
					+ "    \"title\": \"this is projectdebug.com\",\r\n" + "    \"body\": \"this is REST-Assured\"\r\n"
					+ "   }";

			// grab the response

			RestAssured.baseURI = prop.getProperty("HOST");
			Response res = given().header("Content-Type", "application/json").body(b).when().post("/posts/").then()
					.assertThat().statusCode(201).and().contentType(ContentType.JSON)
					.body("body", equalTo("this is REST-Assured")).extract().response();

			// grab the id
			String responsestring = res.asString();
			System.out.println(responsestring);
			JsonPath js = new JsonPath(responsestring);

			int ids = js.get("id");
			System.out.println(ids);

			// place the id in delete call

			Response resp = given().header("Content-Type", "application/json")
					// .body("{\"id\" : \"id\"}")
					.when().delete("/posts/" + ids).then().assertThat().statusCode(200).and()
					.contentType(ContentType.JSON).extract().response();

			String str = resp.asString();
			System.out.println(str);

		}
	}

}
