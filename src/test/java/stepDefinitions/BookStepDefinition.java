package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.Customization;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.comparator.CustomComparator;
import entity.Book;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testBase.Utils;

public class BookStepDefinition extends Utils {

	static Book reqBook, respBook;
	Book[] respAllBook;
	static int sectCount;
	CommonStepDefinition cmnStepDef;

	public BookStepDefinition() throws IOException {
		cmnStepDef = new CommonStepDefinition();
	}

	@Given("{string} User {string} Book Payload")
	public void user_Book_Payload(String userRole, String payloadReq) throws IOException {
		if (payloadReq.equalsIgnoreCase("Add"))
			reqBook = data.addBook();
		else if (payloadReq.equalsIgnoreCase("Update"))
			reqBook = data.updateBook(respBook);
		else
			System.out.println("Issue in Payload creation request");

		reqSpec = given().spec(requestSpecification(userRole)).body(reqBook);
	}

	@Then("Verify book_Count result is greater than 0")
	public int get_book_count() {
		sectCount = Integer.parseInt(response.getBody().asString());
		assertTrue("Count is not correct", sectCount > 0);
		return sectCount;
	}

	@Then("Verify response will return Book instance")
	public void verify_response_will_return_Book_instance() {
		respBook = response.getBody().as(Book.class);
		System.out.println("book created === " + respBook.toString());
	}

	@Then("Verify response will return List of Books")
	public void Verify_response_will_return_List_of_Books() {
		respAllBook = response.getBody().as(Book[].class);
	}

	@Then("Total number of Book in List is equal to getBookCount")
	public void total_number_of_Book_in_List_is_equal_to_getBookCount() throws IOException {
		int old_count = sectCount;
		cmnStepDef.user_calls_API_with_http_Request("getBookCount", "Get");
		assertEquals(old_count, get_book_count());
	}

	@Then("Book added exist in returned Book List")
	public void Book_added_exist_in_returned_BookList() {
		List<Book> bookList = Arrays.asList(respAllBook);
		assertThat(bookList, hasItem(respBook));
	}

	@Given("{string} User invoke getBookBySearchCriteria with Parameter: {string}")
	public void user_invoke_getBookBySearchCriteria_with_Parameter(String userRole, String param)
			throws IOException {
		if (param.equalsIgnoreCase("bookId")) {
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respBook.getBookId());
		} else if (param.equalsIgnoreCase("bookName")) {
			reqSpec = null;
			reqSpec = given().spec(requestSpecification(userRole)).queryParams(param, respBook.getBookName());
		}
	}

	@Then("Response should be list of Books and size should be one")
	public void response_should_be_list_of_Books_and_size_should_be_one() {
		respAllBook = response.getBody().as(Book[].class);
		assertTrue("Search by bookId do not list one Book", respAllBook.length == 1);
	}

	@Then("Response Book is same which was added")
	public void response_Book_is_same_which_was_added() {
		assertEquals("Wrong Book filtered", respBook, respAllBook[0]);
	}

	@Then("Verify Book fields gets updated")
	public void verify_Book_fields_gets_updated() {
		respBook = response.getBody().as(Book.class);

		JSONAssert.assertEquals(new JSONObject(reqBook).toString(), new JSONObject(respBook).toString(),
				new CustomComparator(JSONCompareMode.LENIENT, new Customization("bookUpdatedAt", (o1, o2) -> true),
						new Customization("bookUpdatedBy", (o1, o2) -> true)));
	}

	@Then("Verify BookStatus of particular Book updated as Passive")
	public void verify_BookStatus_updated_as_Passive() {
		respBook = response.getBody().as(Book.class);
		assertEquals("Book not Deactivated!!!", "Passive", respBook.getBookStatus());
	}

	@Then("Response should be list all Books=getAllBooks")
	public void response_should_be_list_all_Books_getAllBooks() {
		Book[] actAllBooks = response.getBody().as(Book[].class);
		cmnStepDef.user_calls_API_with_http_Request("getAllBooks", "Get");
		Book[] expAllBooks = response.getBody().as(Book[].class);
		assertArrayEquals("All Books not searched in case of no Search Criteria", expAllBooks, actAllBooks);
	}

	@Then("Verify Total book_Count increased by 1")
	public void verify_Total_book_Count_increased_by() {
		int old_count = sectCount;
		cmnStepDef.user_calls_API_with_http_Request("getBookCount", "Get");
		assertEquals(old_count + 1, get_book_count());
	}

	@Given("{string} User invoke deleteBook with Parameter: {string}")
	public void user_invoke_deleteBook_with_Parameter(String userRole, String param) {
		reqSpec.queryParam(param, respBook.getBookId());
	}

	@Then("All Books should have Active Status")
	public void all_Books_should_have_Active_Status() {
		for (Book sec : respAllBook)
			assertEquals("Book with Passive status searched!!!", "Active", sec.getBookStatus());
	}

	@Given("{string} User {string} Book Payload  with no Book Body")
	public void user_book_Payload_with_no_Book_Body_and_Param(String userRole, String payloadReq)
			throws IOException {
		reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole));
	}

	@Given("{string} User invoke getBookBySearchCriteria with Parameter: {string} & {string} & {string}")
	public void user_invoke_getTaskBySearchCriteria_with_Parameter(String userRole, String param1, String param2,
			String param3) throws IOException {
		reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole)).queryParams(param1, respBook.getBookId())
				.queryParam(param2, respBook.getBookName());
				.queryParam(param3, respBook.getBookGeographyName());
		;

	}

	@Then("Verify response will return List of Books with zero records")
	public void verify_response_will_return_List_of_Books_with_zero_records() {
		respAllBook = response.getBody().as(Book[].class);
		assertTrue("Count is not zero in case of invalid search criteria.", respAllBook.length == 0);
	}

	@Given("{string} User {string} Book Payload  with no Param")
	public void user_Book_Payload_with_no_Param(String userRole, String payloadReq) throws IOException {
		reqBook = data.updateBook(respBook);
		reqSpec = null;
		reqSpec = given().spec(requestSpecification(userRole)).body(reqBook);
	}

}