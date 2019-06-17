# MyRetail

API: /products/13860428 - GET 
/products/{id}: Is GET Request, accepts productId as path variable and return JSON response.
For Invalid URL: we JSON response with null Values.

#Example
API: http://127.0.0.1:8080/products/13860428
Respone: {"id":13860428,"name":"The Big Lebowski (Blu-ray)","current_price":{"value":74.0,"curreny_code":"USD"}}

API: http://127.0.0.1:8080/products/15117729
Response: {"id":15117729,"name":null,"current_price":null}

# Process to run Application

Go to TargetApplication.java, click as run as Java Application.

