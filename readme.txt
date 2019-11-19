/*
=====================
|| APS QR Code API ||
=====================
This API has been created by 'Hizbullah Watandost' which is working as 
IT Research and Development Officer in APS (Afghanistan Pyametns System)
In any case you contact using the following email and phone number.
Email: watandost10@gmail.com
phone: 0093798092289, 0093791055342, 0093782900949

1) Generating QR Code Image 
----------------------------

In order to create qr image using aps qr code api follow below steps:
> Open postman
> turn off postman interceptor (in postman menu bar section)
> enter the url (http://localhost:8085/qrcodeapi/generator/)
> Select POST type of request from the request drop downl list
> Then, in body section select 'raw' and from the right side drop down list select 'JSON(application/json)'
> Then, put data in JSON format as below
	{
	"qrVersion": 20,
	"qrType": "C",
	"merchantCompanyName": "Ahmad",
	"merchantCategory": "Water Bill",
	"bankAccount": "10010245908764"
	}
> Then, click on SEND, the QR Code image will be generated in response body section.
> Check the status of HTTPResponse, it must be 'OK'


2) Reading QR Code Image
-----------------------------

> Open postman
> turn off postman interceptor (in postman menu bar section)
> enter the url (http://localhost:8085/qrcodeapi/reader/)
> Select POST type of request from the request drop downl list
> Then, in body section select 'form-data', then check the key and write 'file' in key field.
> Then, click on 'choose file' button and select the QR Code image
> Click on send, the API will retrieve the QR Code image, decodes it and returns back the merchant payment fields in JSON format.
> Check the status of HTTPResponse, it must be 'OK'
*/


==========================
Technologies we have used |
==========================
1) Springboot, the main framework for developing the RestFul API
2) Springboot web dependency for enablign the web service
3) Springboot Development Tools (DevTools) for instance update of the application.
   Using DevTools we do not need to restart the server after any changes,the changes
   will be automatically trigger, you only need to save the changes, and the server
   will be automatically restarted, it speeds up the development and remove the pain
   of restarting the server every after tiny changes. 
4) lomback is used for removing boilerplate code i.e. setters, getters, toString and etc.
   from model/entity. using @Data annotation which is lomback most famous annotation,
   we can get all free. It compresses our code, and makes it much easy to edit or maintain.
5) log4j2 is used to generate logs and create logging files in logs folder, this logging 
   framework helps us to monitor and trace the application.
