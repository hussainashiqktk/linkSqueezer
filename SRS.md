# URL Shortener App - Software Requirements Specification

## Introduction
The purpose of this document is to provide a detailed description of the requirements for the development of a Java GUI application that shortens URLs. This application will allow users to input a long URL and generate a shorter, more manageable URL that can be easily shared with others. The application will be developed from scratch and the database for the original links and shortened URLs will be hosted on a local network, which can be hosted on AWS for free.

## Functional Requirements
### 2.1 User Interface
The application shall have a user-friendly GUI that allows users to enter a long URL and click a button to generate a shortened URL.

### 2.2 URL Shortening Algorithm
The application shall implement a custom URL shortening algorithm to generate the shortened URLs.

### 2.3 URL Validity
The application shall validate the entered URL to ensure that it is a valid URL before attempting to generate a shortened URL.

### 2.4 URL Customization
The application shall allow users to customize the shortened URL by providing a user-defined alias or keyword.

### 2.5 URL Storage
The application shall store the original and shortened URLs in a local database hosted on a local network, which can be hosted on AWS for free.

### 2.6 URL Retrieval
The application shall allow users to retrieve the original URL by entering the shortened URL or the user-defined alias.

## Non-Functional Requirements
### 3.1 Performance
The application shall be able to generate shortened URLs within a few seconds even when handling a large volume of requests.

### 3.2 Security
The application shall use secure connections when accessing the local database hosted on the local network or on AWS.

### 3.3 Reliability
The application shall be available for use at all times except during scheduled maintenance periods.

## Constraints
### 4.1 Technology
The application shall be developed using Java and the Java Swing library for the GUI.

### 4.2 Database
The application shall use a local database hosted on a local network, which can be hosted on AWS for free.

### 4.3 Hosting
The application shall be hosted on a machine with sufficient resources to handle a large volume of requests and to store the database.

## Assumptions and Dependencies
### 5.1 Assumptions
The application assumes that users will enter valid URLs that can be successfully shortened.

### 5.2 Dependencies
The application depends on the availability and performance of the hosting machine, the local network or AWS, and the local database.
