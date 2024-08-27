# Rest Apis behind jwt token
This document provides step-by-step instructions on how build and run 
this project using maven.

## Prerequisites
Make sure you have the following installed on your system:

- Java Development Kit (JDK) 17
- Maven (Optional)
- Postgres

1. *Clone the Repository:*
   bash
   git clone https://github.com/Numan24/RestApiJwt.git
2. *Build the Project:*
   bash
    ./mvnw package
**Run the Application:**
   bash
   java -jar package-name

## Instructions to use the project once it is running
two api are given to register and login the user if already not part system so he can easily register using this raw json.
{
    "nameofuser": "Ali",
    "password": "a#123",
    "email": "ali@gmail.com",
    "gender": "male",
    "status": "active"
}

once registered he can login using same credentials
{
    "nameofuser": "Ali",
    "password": "a#123"
}
after logged in he will get a jwt token on login success response which can be used to retrieve all the rest apis 
http://localhost:8080/comments
http://localhost:8080/posts
http://localhost:8080/users

##open postman colection is also provided for better understanding and ready to go.
https://app.getpostman.com/join-team?invite_code=b7c7a0d193eff2d1fe4bb2943591735c&target_code=3962a6cee757da85d75b0795725228da
