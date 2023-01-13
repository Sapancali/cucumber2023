@manager_login_test
Feature: Login_manager_kullanici_bilgileriyle_deneme

  Scenario Outline:
    Given kullanici application sayfasindadir
    And kullanici manager id "<kullaniciadi>" girer
    And kullanici manager sifre "<kullanisifre>" girer
    Then kullanici login butonnuna click eder
    Then kullanici "<default_page>" oldugunu verify eder
    Then kullanici application kapatir

    Examples: Test Data
      | kullaniciadi | kullanisifre | default_page |
      | manager      | Manager1!    | Hotel Management |
      | manager5     | Manager5!    | default_page |
      | manager12    | Manager12!   | default_page |