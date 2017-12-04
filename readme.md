## This project contains a couple of dummy stock price indicators.

It's created for developing my skills with:

    * SOAP
    * REST
    * Jenkins multibranch pipelines
    * Docker

### The idea is the following:

   I push my local changes to the git repo which triggers a jenkins pipeline build which does:

   * build
   * test
   * deploy couple instances to a Docker containers + NGINX as a load balancer


Example Run:

```
localhost:8080/getStockInfo?name=AAPL
```

### Docker setup

I created a fatJar out of my service using the "bootRepackage" Spring boot gradle task.

I wanted to use docker so I can run multiple instances of my service and attach a load balancer - NGINX to them.

    cd docker
    docker build -t stock_indicator
    docker run -d -p 8081:8080 stock_indicator
    docker run -d -p 8082:8080 stock_indicator

Now I have 2 instances of my service running on 2 containers.

### NGINX - TBD
