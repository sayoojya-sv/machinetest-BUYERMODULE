Buyer-Module

The Buyer Module is a web application that allows users to buy and sell products while browsing items across different categories. This module focuses on validating buyer-related functionalities to ensure a smooth and reliable user experience.

Tools & Technologies Used

Selenium WebDriver – UI automation testing
Maven – Build and dependency management
TestNG – Test execution and reporting
Java – Programming language

Framework Structure

src/test/java
|
├── base
│   └── TestBase
├── pages
│   ├── BuyerLoginPage
│   ├── HomePage
│   ├── CartPage
│   └── LogoutPage
│
└── testcases
    └── BuyerTest

Setup Instructions

Prerequisites:

1. Java JDK 8 or higher installed on the system
2. Maven installed and properly configured
3. A supported web browser such as Chrome or Firefox
4. Corresponding WebDriver configured and added to the system path

Installation & Execution

1. Clone the project repository to your local machine
2. Navigate to the project directory
3. Install all required Maven dependencies
4. Configure browser and WebDriver settings if needed
5. Run the TestNG test cases using Maven
6. View test execution reports in the target folder

