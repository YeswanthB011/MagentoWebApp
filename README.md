# Magento Web Application Testing  

## 🚀 About This Project  
This repository contains automation test scripts for the Magento E-commerce web application. These test scripts are written in **Java** with **Selenium WebDriver** using the **Page Object Model (POM)** for better maintainability and code reusability.  

This project follows a **Maven** structure and implements **TestNG** for test management, utilizing a **Data-Driven Framework** approach.  

## 🛠️ Tools & Technologies Used  

- **Programming Language:** Java  
- **Web Automation Tool:** Selenium WebDriver  
- **Test Framework:** TestNG  
- **Design Pattern:** Page Object Model (POM)  
- **Build Tool:** Maven  
- **File Management Tools:** Apache POI (for Excel interactions, optional)  
- **Reporting Tools:** Extent Reports  
- **Version Control:** Git and GitHub  


## 📖 Story Summary  

This project is designed to test the core functionalities of the **Magento E-commerce** web application, ensuring seamless user experiences and bug-free transactions.  
- **US_1** - New Registration and login - Create new user account in application and verify by login
- **US_2** - TAB menu - Functionality of tab menu controls
- **US_3** - Adding products in cart - Check the cart functioloty by adding and removing with new user account
- **US_4** - Advanced Search - Verify the advanced search functionality(price limit search)
- **US_5** - Product order - product purchase and payment

### ✅ Prerequisites  
Before running the tests, ensure you have:  
- **Java 8+** installed and configured  
- **Maven** installed  
- **Git** installed  
- **ChromeDriver** or appropriate WebDriver for the target browser  

### 📝 Writting Tests
- 1.Place your test cases under src/test/java following the naming conventions and structure provided in existing tests.
- 2.Utilize the Page Object Model (POM) by creating page classes under src/main/java/pages.
- 3.Define step definitions under src/test/java/stepDefinitions.
- 4.Feature files should be placed in src/test/resources/features.

### Acknowledgment
   
