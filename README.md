# restController
<h1>vs code project</h1>

<h4> modals folder</h4> <br>
in modals  folder i have two entity name as Email.java and users.java for the storing the value .
in users entity and these entity has differnet attributes like "first name,last name phone number email".
Email entity  "email from ,to ,subject, body"
for adding the data i am using jpa and h2 database for run time adding the data in memory.


<h4> repository folder</h4> <br>
project have repository folder in which we have two repo which is emailrepo and userRepo which is userd for dao operations,
both the repo extends the crudRepository .
<h4> service folder</h4> <br>
 then we have Service folder which is used for the dao service like save update findbyid etc.
in the service folder we have EmailService.java for email email service , iam using getById for finding email by id and add email for saving the send email data,
user service also have different methods like 
 get all user(fetch all the user), get user by id(fetch user by id), add user(for storing the user info)
<h4> controller folder</h4> <br>
and last  i am making a controller, in which we have different handlers which handle different http request,<br>
1.for POST request "/user"(which store user data) handler name "create user"
{
     with the help of user service i am calling add user method and pass the user object for storing the user.   
} <br>
2.GET request "/users" (which is fatch all the users) handler name "all users"
{
    with the help of user service i am calling allusers method whict returns  list of user
}<br>
2. GET "/user/{id}" (return user by id)
{
   for resolving {id} i am using path variable annotation .
and then simply call get user by id method with the help of user service.
get user by id takes id which is resolve by @PathVariable
}<br>
3. POST "/email" (add sending email data)
{
   hander name is getAllEmail 
 with the help if @RequestBody i am storing email data. (email object have "to ,from,body,subject")
with the help of emailService i am call a method create email and pass the email object to save it,
<h5>note</h5> <br>
and in these handler i am also fetch the user whose  email id is same as the email of user whoc is sending the data and just we increse the user email sent count by 1;
and update the user:
<h4>note***</h4> <br>
another aproch is that  i can use one to many relation ship to store the data which is
one user can send many email-------- and just count the number of email sent by user.
these is best approch.....
but due to lack of time i am not using it...
}<br>
<br>
4. GET "/emails/count?user={id}"(return number of email send by user){

i am using a hander name "getNumberOfEmailSend" and by getting the value of user id by @Request param of simply define int data type of user
,
with the help of userService i am calling a method getuserbyid and return the user1.getcount(); which return nmber of email sent by user which is already handle by hander "addEmail".
}
<h3> thankyou</h3>
for any query you can message me at [email](sachinmishra9218@gmail.com)

<h2>for executing the program </h2>
<h3>download project</h3>
1. dowload zip folder rest controller in your computer and then extract it.
<h3>download vs code</h3>
step 1. download vs code for window
<h3>dowload vs code extension</h3>
step 2. you have to just download the extension
<br>
1.springboot extension pack
<br>
2.java extension pack<br>

<h3> choose project</h3>
1.go to the project path where you unzip the restcontroller folder.
<br>
2.and then select demo folder which is inside the restcontroller folder.
<h3>run file</h3>
in vs code if you are selected project then click demo folder>src>main>>java>DemoApplication.java and run it.
<h3> see result</h3>
open browser write  url
<br>
localhost:2020/
<h3>  result</h3>
browser shows "these is test" then your application is run successfully 
<br>
else you have to try again or email me
<h3>test Rest Controller</h3>
step -1. open postman app
<br>
step-2. type url localhost:2020
step-3 .test /user for (POST) 
<br>
/users for get users (GET)
<br>
/user/{id} (GET)
and many more read above


  


