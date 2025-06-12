# Spring-Boot-Microservices-One-to-many
Spring Boot Application Using feign client we have to create the one to many relationship implementation to send and receive thr data and check using the postman.

#Postman Data 
Product-service
1.GET : http://localhost:8081/products
2.GET : Get product by id : http://localhost:8081/products/2
3.POST : Create product : http://localhost:8081/products
Body :  raw : JSON
 {  
       "name": "Water Bottle",
       "price": 123.99
 }
4.PUT : update product by id :http://localhost:8081/products/1
{
  "name": "WHeel",
  "price": 139.99
}
5.DELETE : delete product by id : http://localhost:8081/products/3
-----------------------------------------------------------------------------------------------------------
Order-service
1.GET : http://localhost:8082/orders
2.GET : Get order by product id : http://localhost:8082/orders/product/1
3.POST : Create product : http://localhost:8082/orders
{
  "orderDate": "2025-06-15",
  "customerName": "Pooja Gupta",
  "productId": 2
}
4.GET : Get order by order id : http://localhost:8082/orders/2
5.PUT : Update product by order id : http://localhost:8082/orders/1
{
        "orderDate": "2025-06-20",
        "customerName": "Ram singh",
        "productId": 2
}


