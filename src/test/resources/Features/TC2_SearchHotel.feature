@SearchHotel
Feature: Verifying Adactin Search Hotel page details

  Scenario Outline: Verifying Adactin Search Hotel page by entering all fields in the page
    Given User is on the Adactin page
    When User should perform Login "<userName>","<password>"
    Then User should verify after login Success message "Hello jagades11!"
    When User should enter all fields "<location>","<hotelName>","<hotelType>","<roomCount>","<checkIn>","<checkOut>","<persons>" and "<child>"
    Then User should verify after search success message "Select Hotel"

    Examples: 
      | userName  | password | location | hotelName   | hotelType | roomCount | checkIn    | checkOut   | persons | child    |
      | jagades11 | jaga123  | Sydney   | Hotel Creek | Standard  | 2 - Two   | 28/12/2022 | 30/12/2022 | 2 - Two |1 - One|

  Scenario Outline: Verifying Adactin Search Hotel page by entering only mandatory fields in the page
    Given User is on the Adactin page
    When User should perform Login "<userName>","<password>"
    Then User should verify after login Success message "Hello jagades11!"
    When User should enter only mandatory fields "<location>","<roomCount>","<checkIn>","<checkOut>" and "<persons>"
    Then User should verify after search success message "Select Hotel"

    Examples: 
      | userName  | password | location | roomCount | checkIn    | checkOut   | persons |
      | jagades11 | jaga123  | Sydney  | 2 - Two   | 28/12/2022 | 30/12/2022 |1 - One|

  Scenario Outline: Verifying Adactin Search Hotel page by entering invalid CheckIn and CheckOut Date fields in the page
    Given User is on the Adactin page
    When User should perform Login "<userName>","<password>"
    Then User should verify after login Success message "Hello jagades11!"
    When User should enter all fields "<location>","<hotelName>","<hotelType>","<roomCount>","<checkIn>","<checkOut>","<persons>" and "<child>"
    Then User should verify after Search appearance of the date error message "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName  | password | location | hotelName   | hotelType | roomCount | checkIn    | checkOut   | persons | child    |
      | jagades11 | jaga123  | Sydney   | Hotel Creek | Standard  | 2 - Two   | 30/12/2023 | 21/12/2022 | 2 - Two |1 - One|

  Scenario Outline: Verifying Adactin Search Hotel page by Without entering all fields in the page
    Given User is on the Adactin page
    When User should perform Login "<userName>","<password>"
    Then User should verify after login Success message "Hello jagades11!"
    When User should go for Search without entering any of the fields
    Then User should verify after Search error message "Please Select a Location"

    Examples: 
      | userName  | password |
      | jagades11 | jaga123  |
