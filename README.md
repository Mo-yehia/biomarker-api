# Biomarker API Microservice

## Overview

This project is a RESTful API microservice built using Spring Boot that serves biomarker data such as heart rate, calories burnt, and sleep quality.

## Prerequisites

Before you begin, ensure you have the following tools installed:

- **Java Development Kit (JDK) 17 or higher**
- **Apache Maven**
- **An Integrated Development Environment (IDE)** (e.g., IntelliJ IDEA, Eclipse)

## Step-by-Step Setup

### 1. Open the Project in Your IDE
For Example IntelliJ IDEA:

- Open IntelliJ IDEA.
- Click on File > Open....
- Select the cloned project folder and click OK.

### 2. Run the Application
- Locate the main application file named BiomarkerApiApplication.java.
- Right-click on the file and select Run 'BiomarkerApiApplication.main()'.

### 3. Access the API
Once the application is running, you can access the API using a web browser or an API client like Postman.

- API Endpoint
- URL: http://localhost:8080/api/biomarkers
- Method: GET

### Expected Response
You should receive a JSON response similar to this:

[
{"name": "Heart Rate", "unit": "bpm", "value": 70},
{"name": "Calories Burnt", "unit": "kcal", "value": 350},
{"name": "Sleep Quality", "unit": "score", "value": 65}
]

### Stopping the Application
In IntelliJ IDEA: Click the stop button in the console.

### Troubleshooting
- Maven Build Errors: Ensure JDK is correctly set up and Maven dependencies are resolved.
- Port Issues: If port 8080 is occupied, change the port in application.properties:

   For Example: server.port=4040  

