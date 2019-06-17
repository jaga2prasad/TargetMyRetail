# MyRetail

API: /products/13860428 - GET </br>
/products/{id}: Is GET Request, accepts productId as path variable and return JSON response.</br>
For Invalid URL: we get JSON response with null Values. </br>

Example: <br/>
API: http://127.0.0.1:8080/products/13860428 </br>
Respone: {"id":13860428,"name":"The Big Lebowski (Blu-ray)","current_price":{"value":74.0,"curreny_code":"USD"}} <br/>

API: http://127.0.0.1:8080/products/15117729 <br/>
Response: {"id":15117729,"name":null,"current_price":null} <br/>

# Process to run Application

Go to TargetApplication.java, click as run as Java Application.

