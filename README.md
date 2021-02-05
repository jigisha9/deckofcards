<h1>Deck of Cards API Test Automation</h1>
## Current version:
    1.0.0
    
## Objective:
RestAPI Test automation for Deck of Cards

## Capabilities:
* RESTApi Automate Deck of cards APIs
* Crisp & Clear folder structures
* Language Used: Java
* Design Pattern: Page Objects
* Loggin using Log4J
* TDD Framework - TestNG execution
* Test Data - JSON
* Environment driven - Params can be added as required to avoid hard coding
* Extensive hooks implemented for BeforeAll, After, etc.
* Screenshots on failure feature scenarios
* 

## Pre-requisites

Install and configure JDK for your OS platform guidelines: https://docs.oracle.com/javase/10/install/

## How to verify installation of Java?

Type below commands on your terminal. It will return with version.
   ``` 
   java -version
       
  For example:
   C:\deckofcards>java -version
   java version "1.8.0_161"
   Java(TM) SE Runtime Environment (build 1.8.0_161-b12)
   Java HotSpot(TM) 64-Bit Server VM (build 25.161-b12, mixed mode)

 ```  
 
## How to Setup deckofcards Test automation project

* Clone the repository into a folder

```
git clone <ENTER GIT PROJECT LINK HERE>.git
``` 


## How to run deckofcards Test Automation ?
You can play video to follow steps on HowtoRun this automation project.
```
Go to project directory and click: \\HowtoRun.mp4
```

### Run command from terminal 
Go to project directory from terminal - IntelliJ or any IDE tool that you are using.

```
mvn clean test -Durl=https://deckofcardsapi.com -Ddraw=2 -DsuiteFile=testng-deckofcards.xml 
```


### Report in HTML 

```
Find report at: <project directory>/target/surefile-report/emailable-report.html

Note: customized reports is TO DO
```  

## Author/Contributor
 
Jigisha Shah 

```
