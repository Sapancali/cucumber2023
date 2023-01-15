package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day15_C1_GoogleSearchStepDefinitions {
    // Java kodlari step definition kismina gelecek

    GooglePage googlePage=new GooglePage();

    @Given("kullanici google sayfasindadir")
    public void kullanici_google_sayfasindadir() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        googlePage.cerezOnayi.click();
    }
    @Given("kullanici iPhone'u arar")
    public void kullanici_i_phone_u_arar() {
        googlePage.googleSearchBox.sendKeys("iPhone"+ Keys.ENTER);
    }
    @Then("kullanici sonuclarda iPhone oldugunu verify eder")
    public void kullanici_sonuclarda_i_phone_oldugunu_verify_eder() {
        boolean title= Driver.getDriver().getPageSource().contains("iPhone");
        Assert.assertTrue(title);
    }
    @Then("kullanici application i kapatir")
    public void kullanici_application_i_kapatir() {
        Driver.closeDriver();
    }
    @Given("kullanici caydanlik arar")
    public void kullanici_caydanlik_arar() {
        googlePage.googleSearchBox.sendKeys("caydanlik"+Keys.ENTER);
    }
    @Then("kullanici sonuclarda caydanlik oldugunu verify eder")
    public void kullanici_sonuclarda_caydanlik_oldugunu_verify_eder() {
        String title= Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("caydanlik"));
    }
    @Given("kullanici cicek arar")
    public void kullanici_cicek_arar() {
        googlePage.googleSearchBox.sendKeys("cicek"+Keys.ENTER);
    }
    @Then("kullanici sonuclarda cicek oldugunu verify eder")
    public void kullanici_sonuclarda_cicek_oldugunu_verify_eder() {
       Assert.assertTrue("cicek",Driver.getDriver().getTitle().contains("cicek"));
    }
    @Given("kullanici volkswagen arar")
    public void kullanici_volkswagen_arar() {
        googlePage.googleSearchBox.sendKeys("volkswagen"+Keys.ENTER);
    }
    @Then("kullanici sonuclarda volkswagen oldugunu verify eder")
    public void kullanici_sonuclarda_volkswagen_oldugunu_verify_eder() {
        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("volkswagen"));
    }

    // paramatirized kullanıldı
    @Given("kullanici {string} arar")
    public void kullanici_arar(String string) {
        googlePage.googleSearchBox.sendKeys(string+Keys.ENTER);

    }

    @Then("kullanici sonuclarda {string}  oldugunu verify eder")
    public void kullanici_sonuclarda_oldugunu_verify_eder(String string) {
       String title= Driver.getDriver().getTitle();
       Assert.assertTrue(title.contains(string));
    }

    @Then("kullanici application kapatir")
    public void kullanici_application_kapatir() {
       Driver.closeDriver();
    }

}
