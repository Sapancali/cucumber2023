
@google_search
Feature: Google_Search_Functionality

  Scenario: TC01_iPhone_search
    Given kullanici google sayfasindadir
    And kullanici iPhone'u arar
    Then kullanici sonuclarda iPhone oldugunu verify eder
    Then kullanici application i kapatir

  Scenario: TC02_caydanlik_search
    Given kullanici google sayfasindadir
    And kullanici caydanlik arar
    Then kullanici sonuclarda caydanlik oldugunu verify eder
    Then kullanici application i kapatir

  Scenario: TC03_cicek_search
    Given kullanici google sayfasindadir
    And kullanici cicek arar
    Then kullanici sonuclarda cicek oldugunu verify eder
    Then kullanici application i kapatir

  Scenario: TC04_volkswagen_search
    Given kullanici google sayfasindadir
    And kullanici volkswagen arar
    Then kullanici sonuclarda volkswagen oldugunu verify eder
    Then kullanici application i kapatir