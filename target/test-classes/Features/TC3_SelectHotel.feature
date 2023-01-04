@SelectHotel
Feature: Verify Adactin Select hotel page details

  Scenario Outline: Verify Adactin Select hotel page by selcting a hotel
    Given User is on the Adactin page
    When User should perform Login "<userName>","<password>"
    Then User should verify after login Success message "Hello jagades11!"
    When User should enter all fields "<location>","<hotelName>","<hotelType>","<roomCount>","<checkIn>","<checkOut>","<persons>" and "<child>"
    Then User should verify after search success message "Select Hotel"
    And User should select a specific hotel and click continue
    Then User should verify after clicking continue success message "Book A Hotel"

    Examples: 
      | userName  | password | location | hotelName   | hotelType | roomCount | checkIn    | checkOut   | persons | child   |
      | jagades11 | jaga123  | Sydney   | Hotel Creek | Standard  | 2 - Two   | 28/12/2022 | 30/12/2022 | 2 - Two | 1 - One |

  Scenario Outline: Verify Adactin Select hotel page by not selcting a hotel
    Given User is on the Adactin page
    When User should perform Login "<userName>","<password>"
    Then User should verify after login Success message "Hello jagades11!"
    When User should enter all fields "<location>","<hotelName>","<hotelType>","<roomCount>","<checkIn>","<checkOut>","<persons>" and "<child>"
    Then User should verify after search success message "Select Hotel"
    And User should not select a specific hotel and click continue
    Then User should verify after continue appearance of the error message "Please Select a Hotel"

    Examples: 
      | userName  | password | location | hotelName   | hotelType | roomCount | checkIn    | checkOut   | persons | child   |
      | jagades11 | jaga123  | Sydney   | Hotel Creek | Standard  | 2 - Two   | 28/12/2022 | 30/12/2022 | 2 - Two | 1 - One |
