**Purpose** 
This is docker based application which have some crud operations. We have three Rest API in this employee application, one API is to get all employees, second API is for adding or creating employees and third Api is for finding employee by id. When we run this application by default some employee records will be inserted in table, we can easily get these records, when we invoke get all employees API.

**Setup**
This application image is pushed on docker, so to run application, we just need to write one command i.e "docker compose up" in the cmd at location inside employee folder where docker-compose.yml is situated. After running this command we can easily test our application on postman.

**Endpoints**
The three API urls are specified below, they can be tested on postman or any other platform.

For get all employees
http://localhost:8080/employee/get
Method: Get

for get Employee By its employeeId
http://localhost:8080/employee/{empId} 
Method: Get

for creating employee
http://localhost:8080/employee/add
Method: Post
Payload : {
    "name": "ram",
    "email": "ram1@gmail.com"
}
