# What is this project about?
This is a Covid-19 software application that supports:
- Contact tracing
- Vaccine certification
- Alerting
- Generating reports

There are 4 stakeholders in this project:
- Health Organization (Admin)
- Health Staff
- Business Owner
- Public User

There are 4 datasets that the application interacts with:
> they can be found in CovidTrackingDemo/dataset
- UserProfiles.csv
- HealthRecords.csv
- AlertRecords.csv
- VisitRecords.csv

Insert simple UML class diagram

## Continuous Integration/Continuous Delivery

- The implementation can be found in the YAML file (.gitlab-ci.yml)

## How are we going to do it?

The development of the application follows the Boundary-Controller-Entity (BCE) framework:
1. Create a java file "Main.java"
- This file will run the application

2. Create these java files to perform read/write on the text files
- UserProfiles.java
- HealthRecords.java
- AlertRecords.java
- VisitRecords.java

3. Create the relevant Boundary classes
- These files will act as the GUI

4. Create the relevant Controller classes
- These files will act as the intermediary between Boundary and Entity classes

5. Create the relevant Entity Classes
- These files will act as the representation of the datasets

## How to execute the file?

> Windows operating system only

You need to have the following on your machine:
- Apache Ant(TM) version 1.10.10
- OpenJDK8

1. Open the command prompt
2. Change directory to the location of the repository with `cd`
3. Once you reach this folder "CovidTrackingDemo"
4. Enter this line of command `ant runjar`	

*More Ant commands can be found in CovidTrackingDemo/Build.xml*

## How to use the application?

### Admin Page
![Image of Admin Page](/Images/AdminPage.png)

Username: admin1
Password: admin

In this page you can:
- Create an account
- Update an account
- Suspend an account
- Generate the number of infection & vaccination for the past 7 days report
- Log out from the account

### Health Staff Page
![Image of Health Staff Page](/Images/HealthStaffPage.png)

Username: AM1035@example.com
Password: password

In this page you can:
- Update a health record's vaccination status
- Update a health record's vaccination date
- Update a health record's infection status
- Update a health record's infection date 
- Send a vaccination alert
- Send an infection alert
- Send an exposure alert 
- Log out from the account

### Business Owner Page
![Image of Business Owner Page](/Images/BusinessOwnerPage.png)

Username: MK1025@example.com
Password: password

In this page you can:
- Choose a date to view the visitor history
- Acknowledge exposure alerts
- Log out from the account

### Public User Page
![Image of Public User Page 1](/Images/PublicUserPage_part1.png)
![Image of Public User Page 2](/Images/PublicUserPage_part2.png)

Username: EG999@example.com
Password: password

In this page you can:
- Specify a business owner to check-in with
- Acknowledge exposure alerts
- View the account information
- Choose a date to view the visited history
- Log out from the account