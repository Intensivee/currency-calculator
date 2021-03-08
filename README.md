# currency-calculator
Simple Calculator application that uses Feign client to get current exchange rate.
There is global exception handling with customized JSON error response. Project has UI that use Thymeleaf.

## Installation
1. Clone git repository, open project with ide (like Intellij) and load maven dependencies
2. run application and type url: http://localhost:8080

Make sure you are connected to the internet,
otherwise it will return proper error.

## calculating  accuracy
I decided to calculate values in JavaScript because i wanted dynamic UI. Java probably is better place to do such math,
but i added BigDecimal library to provide better accuracy with JS.

## Preview
- User interface
<img src="https://user-images.githubusercontent.com/64193740/110367680-50692200-8048-11eb-9552-94429c773710.png" width=300>

- Exception
<img src="https://user-images.githubusercontent.com/64193740/110368025-c077a800-8048-11eb-836d-39009424dead.png">
