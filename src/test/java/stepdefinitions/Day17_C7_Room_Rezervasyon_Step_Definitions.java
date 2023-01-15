package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.Select;
import pages.DefaultPage;
import pages.LoginPage;
import pages.RoomRezervasyonPage;

import java.util.List;

public class Day17_C7_Room_Rezervasyon_Step_Definitions {

    LoginPage loginPage=new LoginPage();
    DefaultPage defaultPage=new DefaultPage();
    RoomRezervasyonPage roomRezervasyonPage=new RoomRezervasyonPage();

    @Given("kullanici manager kullanici bilgilerini girer")
    public void kullanici_manager_kullanici_bilgilerini_girer(DataTable kullaniciBilgileri) {
        List<String> managerKullaniciBilgileri= kullaniciBilgileri.row(1);
        System.out.println(managerKullaniciBilgileri);
        System.out.println(managerKullaniciBilgileri.get(0));
        System.out.println(managerKullaniciBilgileri.get(1));

        loginPage.username.sendKeys(managerKullaniciBilgileri.get(0));
        loginPage.password.sendKeys(managerKullaniciBilgileri.get(1));
    }
    @Given("kullanıcı oda rezervasyon sayfasını yönlendirilir")
    public void kullanıcı_oda_rezervasyon_sayfasını_yönlendirilir() {
        defaultPage.hotelManagementLink.click();
        defaultPage.roomReservationsLink.click();
        roomRezervasyonPage.addRoomReservationButton.click();
    }
    @Given("kullanici tüm zorunlu alanları girer")
    public void kullanici_tüm_zorunlu_alanları_girer(DataTable roomData) {
        List<String>testData=roomData.row(1);
        System.out.println(testData);

        //idUser bir dropdown
        Select selectIdUser=new Select(roomRezervasyonPage.idUser);
        selectIdUser.selectByVisibleText(testData.get(0));

        // idHotel bir dropdown
        Select selectIdHotel=new Select(roomRezervasyonPage.idHotelRoom);
        selectIdHotel.selectByVisibleText(testData.get(1));

        roomRezervasyonPage.price.sendKeys(testData.get(2));

        roomRezervasyonPage.dateStart.sendKeys(testData.get(3));

        roomRezervasyonPage.dateEnd.sendKeys(testData.get(4));

        roomRezervasyonPage.adultAmount.sendKeys(testData.get(5));

        roomRezervasyonPage.childrenAmount.sendKeys(testData.get(6));

        roomRezervasyonPage.contactNameSurname.sendKeys(testData.get(7));

        roomRezervasyonPage.contactPhone.sendKeys(testData.get(8));

        roomRezervasyonPage.contactEmail.sendKeys(testData.get(9));

        roomRezervasyonPage.notes.sendKeys(testData.get(10));
    }
    @Given("kullanıcı approved checkbox’a click eder")
    public void kullanıcı_approved_checkbox_a_click_eder() {
       roomRezervasyonPage.isApproved.click();
    }
    @Given("kullanıcı paid check box’a click eder")
    public void kullanıcı_paid_check_box_a_click_eder() {
        roomRezervasyonPage.isPaid.click();
    }
    @Given("kullanıcı save button’una click eder")
    public void kullanıcı_save_button_una_click_eder() {
        roomRezervasyonPage.saveButton.click();
    }
    @Then("kullanıcı success mesajını verify eder")
    public void kullanıcı_success_mesajını_verify_eder() {
        roomRezervasyonPage.okButton.click();

    }

}
