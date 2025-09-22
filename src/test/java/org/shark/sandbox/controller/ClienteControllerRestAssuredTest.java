package org.shark.sandbox.controller;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ClienteControllerRestAssuredTest {

    @LocalServerPort
    private int port;

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "http://localhost";
    }

    @Test
    public void testGetAllClientes() {
        given()
            .port(port)
        .when()
            .get("/clientes")
        .then()
            .statusCode(200)
            .contentType(ContentType.JSON);
    }

    @Test
    public void testCreateCliente() {
        String clienteJson = "{\"nombre\":\"Juan Perez\",\"email\":\"juan@mail.com\"}";
        given()
            .port(port)
            .contentType(ContentType.JSON)
            .body(clienteJson)
        .when()
            .post("/clientes")
        .then()
            .statusCode(anyOf(is(200), is(201)))
            .body("nombre", equalTo("Juan Perez"))
            .body("email", equalTo("juan@mail.com"));
    }

    @Test
    public void testGetClienteById() {
        // Primero creamos un cliente
        String clienteJson = "{\"nombre\":\"Ana Gomez\",\"email\":\"ana@mail.com\"}";
        Response response = given()
            .port(port)
            .contentType(ContentType.JSON)
            .body(clienteJson)
        .when()
            .post("/clientes");
        int id = response.jsonPath().getInt("id");

        // Ahora lo consultamos
        given()
            .port(port)
        .when()
            .get("/clientes/" + id)
        .then()
            .statusCode(200)
            .body("nombre", equalTo("Ana Gomez"))
            .body("email", equalTo("ana@mail.com"));
    }

    @Test
    public void testDeleteCliente() {
        // Crear cliente
        String clienteJson = "{\"nombre\":\"Carlos Ruiz\",\"email\":\"carlos@mail.com\"}";
        Response response = given()
            .port(port)
            .contentType(ContentType.JSON)
            .body(clienteJson)
        .when()
            .post("/clientes");
        int id = response.jsonPath().getInt("id");

        // Eliminar cliente
        given()
            .port(port)
        .when()
            .delete("/clientes/" + id)
        .then()
            .statusCode(anyOf(is(200), is(204)));
    }
}

