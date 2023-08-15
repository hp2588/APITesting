package Basics;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAllStudents {

    @Test
    public void getAllStudents(){

        RestAssured.baseURI="http://localhost";
        RestAssured.port=8888;
        RestAssured.basePath="/student/list";

        RequestSpecification req= given();
        req = req.contentType(ContentType.JSON);

        req = req.header("X","Y");

        Response response = req.get();
        response.prettyPrint();

    }
}
