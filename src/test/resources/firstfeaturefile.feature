
@google_search
Feature: Google_Search_Functionality

  Background: application_sayfasina_git
    Given kullanici google sayfasindadir

    @smoke @tesla
  Scenario: TC01_iPhone_search
    And kullanici iPhone'u arar
    Then kullanici sonuclarda iPhone oldugunu verify eder
    Then kullanici application i kapatir

    @regression @caydanlik
  Scenario: TC02_caydanlik_search
    And kullanici caydanlik arar
    Then kullanici sonuclarda caydanlik oldugunu verify eder
    Then kullanici application i kapatir

    @smoke @bmw @tesla
  Scenario: TC03_cicek_search
    And kullanici cicek arar
    Then kullanici sonuclarda cicek oldugunu verify eder
    Then kullanici application i kapatir

      @kahve @smoke
  Scenario: TC04_volkswagen_search
    And kullanici volkswagen arar
    Then kullanici sonuclarda volkswagen oldugunu verify eder
    Then kullanici application i kapatir