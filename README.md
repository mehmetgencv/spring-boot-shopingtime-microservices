
# Spring Boot Microservices Project

## Overview
This project is a microservices-based system built using Spring Boot. It consists of several services including an API Gateway, Discovery Server, and three microservices: Inventory Service, Order Service, and Product Service.

## Services

### API Gateway
- The entry point for all the microservices.
- Manages routing and load balancing.

### Discovery Server
- Service registry for registering all microservices.

### Inventory Service
- Manages inventory details.

### Order Service
- Handles order processing.
- **POST** method to create an order:
```
    POST http://localhost:8081/api/order
    Content-Type: application/json
    
    {
    "orderLineItemsDtoList": [
    {
    "skuCode": "iphone_15",
    "price": 69999,
    "quantity": 1
    }
    ]
    }
  ```

### Product Service
- Manages product information.
- **GET** method to retrieve all products:
  ```
    GET http://localhost:8080/api/product
  ```

## Getting Started

To run this project, you need to have Java and Maven installed on your system.

1. Clone the repository:
   ```
    git clone https://github.com/mehmetgencv/spring-boot-shoppingtime-microservices
   ```

2. Navigate to each service directory and run:
   ```
    mvn spring-boot:run
   ```


## Authors

- **Mehmet Genc** - *Initial work* - [GithubProfile](https://github.com/mehmetgencv/)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

