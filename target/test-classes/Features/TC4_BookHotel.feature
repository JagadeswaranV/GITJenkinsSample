@BookHotel
Feature: Verify Adactin Book hotel page details

  Scenario Outline: Verify Adactin Book hotel page by entering all fields in the page
    Given User is on the Adactin page
    When User should perform Login "<userName>","<password>"
    Then User should verify after login Success message "Hello jagades11!"
    When User should enter all fields "<location>","<hotelName>","<hotelType>","<roomCount>","<checkIn>","<checkOut>","<persons>" and "<child>"
    Then User should verify after search success message "Select Hotel"
    And User should select a specific hotel and click continue
    Then User should verify after clicking continue success message "Book A Hotel"
    When User should enter all fields "<firstName>","<lastName>" and "<address>"
      | cardNo           | cardType         | month   | year | CVVNo |
      | 5236425987624539 | American Express | January | 2018 |   175 |
      | 8567942698531475 | VISA             | March   | 2019 |   146 |
      | 1258637195846795 | Master Card      | May     | 2022 |   856 |
      | 1257968432591495 | Other            | August  | 2015 |   957 |
    Then User should verify after booking hotel success message "Booking Confirmation" and save the generated order Id

    Examples: 
      | userName  | password | location | hotelName   | hotelType | roomCount | checkIn    | checkOut   | persons | child   | firstName | lastName | address    |
      | jagades11 | jaga123  | Sydney   | Hotel Creek | Standard  | 2 - Two   | 28/12/2022 | 30/12/2022 | 2 - Two | 1 - One | Jagades   | Venkat   | Coimbatore |

  Scenario Outline: Verify Adactin Book hotel page by without entering all fields in the page
    Given User is on the Adactin page
    When User should perform Login "<userName>","<password>"
    Then User should verify after login Success message "Hello jagades11!"
    When User should enter all fields "<location>","<hotelName>","<hotelType>","<roomCount>","<checkIn>","<checkOut>","<persons>" and "<child>"
    Then User should verify after search success message "Select Hotel"
    And User should select a specific hotel and click continue
    Then User should verify after clicking continue success message "Book A Hotel"
    When User should Book hotel without entering any fields
    Then User should verify error message after book hotel "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | userName  | password | location | hotelName   | hotelType | roomCount | checkIn    | checkOut   | persons | child   |
      | jagades11 | jaga123  | Sydney   | Hotel Creek | Standard  | 2 - Two   | 28/12/2022 | 30/12/2022 | 2 - Two | 1 - One |
