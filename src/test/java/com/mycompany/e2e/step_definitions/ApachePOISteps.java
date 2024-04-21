package com.mycompany.e2e.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ApachePOISteps {

    private String username;
    private String password;

    @Given("I have the data from the Excel file")
    public void i_have_the_data_from_the_excel_file() throws IOException {
        String filePath = "src/test/resources/data/ApachePOI.xlsx";
        FileInputStream file = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0); // assuming first row has data
        username = row.getCell(0).getStringCellValue(); // assuming first cell is username
        password = row.getCell(1).getStringCellValue(); // assuming second cell is password
        workbook.close();
        file.close();
    }

    @When("I perform the login")
    public void i_perform_the_login() {
        System.out.println("Logging in with Username: " + username + " and Password: " + password);
    }

    @Then("I verify the login results")
    public void i_verify_the_login_results() {
        System.out.println("Login should be verified here.");
    }
}
