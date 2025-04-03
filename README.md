# File Sharing App - Test Summary and Automation

## Project Overview

This project involved testing the quality of a file-sharing web application. The primary objectives were to verify the application's functionality and identify any defects.

**Product Name:** File Sharing App

**Product Description:** A file-sharing app used to manage and upload files safely.

**Project Description:**

* **Mission of Project:** Conducted testing to verify the quality of the website.
* **Project Output:**
    * Test Summary Report & Evaluation (This README serves partially as this)
    * Bug/Defect Report (See below for findings)
* **Project Type:** Testing/Verification
* **Author:** Navya Garikina
* **Test Case Status:**
    * Passed: 16 (Hypothetical - Adjust based on actual test results)
    * Failed: 5 (Hypothetical - Adjust based on actual test results)
* **Project Duration:**
    * Start Date: 02-April-2025
    * End Date: 02-April-2025

## Test Automation

This repository contains the automated test scripts using Selenium and TestNG for the file-sharing application.

### Code Description

The provided Java code (`decs.java`) includes the following test cases:

* **`testLogin()`:** Verifies the user login functionality.
    * Locates email and password fields and the login button.
    * Enters credentials and clicks the login button.
    * Asserts that the dashboard is displayed after successful login.
* **`testFileUpload()`:** Verifies the file upload functionality.
    * Locates the file input field and upload button.
    * Selects a file for upload.
    * Clicks the upload button.
    * Asserts that a success message is displayed after the upload.
* **`testFileDownload()`:** Verifies the file download functionality.
    * Locates the download link for a file.
    * Clicks the download link.
    * **Note:** The code currently lacks the actual download validation (e.g., checking for file existence). This needs to be implemented based on the specific requirements and environment.

### Prerequisites

* Java Development Kit (JDK) installed.
* Selenium WebDriver (ChromeDriver) downloaded and the path set correctly in the code.
* TestNG library added to the project.
* Chrome browser installed.

### Setup

1.  **Install JDK:** Ensure you have a compatible JDK installed on your system.
2.  **Download ChromeDriver:** Download the appropriate ChromeDriver version for your Chrome browser from the Selenium website ([https://chromedriver.chromium.org/downloads](https://chromedriver.chromium.org/downloads)).
3.  **Configure ChromeDriver Path:** Update the following line in the `decs.java` file with the correct path to your ChromeDriver executable:

    ```java
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    ```

4.  **Add TestNG:** If you are using an IDE like IntelliJ IDEA or Eclipse, add the TestNG library to your project.
5.  **Project Setup:** Ensure your project is set up correctly in your IDE with the necessary dependencies.

### Execution

1.  Compile the Java code (`decs.java`).
2.  Run the TestNG test suite. Your IDE should provide options to run TestNG tests.
3.  Observe the test execution and results.

### Test Results Summary

**Note:** The following results are hypothetical and need to be replaced with the actual results from your test execution.

| Test Case          | Status   | Notes                                                              |
| :----------------- | :------- | :----------------------------------------------------------------- |
| `testLogin()`        | Passed   | User login functionality verified successfully.                    |
| `testFileUpload()`     | Failed   | Issue with file upload - Error message displayed.                   |
| `testFileDownload()`   | Failed   | Download link not working.                                        |
| ... (Other tests)    |          |                                                                   |
| **Overall Summary** |          | Passed: 16 (Hypothetical), Failed: 5 (Hypothetical)                  |

### Bug/Defect Report (Example)

**Note:** This is an example. A real bug report should be more detailed.

| Defect ID | Test Case          | Description                                    | Severity | Priority | Status   |
| :-------- | :----------------- | :--------------------------------------------- | :------- | :------- | :------- |
| BUG-001   | `testFileUpload()`     | File upload fails with "Upload Error" message. | High     | High     | Open     |
| BUG-002   | `testFileDownload()`   | Download link is broken.                       | High     | High     | Open     |
| ...       | ...                | ...                                            | ...      | ...      | ...      |

### Future Improvements

* **Enhanced Download Validation:** Implement robust validation for file downloads, such as verifying file existence, size, and content.
* **Data-Driven Testing:** Parameterize test data (e.g., login credentials, file paths) to increase test coverage.
* **Reporting:** Integrate with a reporting framework to generate detailed test reports.
* **Continuous Integration:** Integrate the tests into a CI/CD pipeline for automated testing on code changes.
* **Error Handling:** Implement more robust error handling in the test scripts.
* **Test Data Management:** Implement a strategy for managing test data effectively.
* **Cross-Browser Testing:** Expand the tests to cover multiple browsers (e.g., Firefox, Safari, Edge).

* Video Link for Explanation of File Sharing App - 
