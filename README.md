## **Monitor**
### **Описание проекта**
Монитор для парсинга веб страниц и отслеживания объявлений о продаже товаров с таких площадок, как Avito, TheMarket, Ebay.
+ Общение бота с сервисом монитора происходит по REST API
+ Возможность отслеживать несколько ссылок в многопоточном режиме
+ Минимальная задержка
+ Возможность парсить защищенные сайты
+ Интеграция с телеграм ботом (https://github.com/alexeyrand/MonitorItemsBot)
+ Интеграция с Дискрод сервером
+ База данных фейк продавцов
### **Общая структурная схема архитектуры**
[Monitor telegram bot](https://github.com/alexeyrand/MonitorTelegramBot/blob/main/README.md) - представляет из себя spring boot приложение, отвечающее за функционирование телеграм бота.  
Monitor - spring boot приложение, в котором сосредаточена основная бизнес логика парсинга и мониторинга страниц.  
![Structure schema](/images/schema.png)

### **Технологии**
+ Java 17
+ Spring Boot 3
+ H2 database
+ Selenium framework
+ Telegram api
+ Discord api
+ REST
+ Multithreading
+ Junit
+ Mockito
### **Как использовать**
```
sudo java -jar
```
### **Deploy и CI/CD**
### **TODO**
+ :white_check_mark: Create a black list of sellers
+ :white_check_mark: Fix NoSuchElementException for image
+ :white_check_mark: Fix Out of Memery Chrome driver
+ :white_check_mark: Add Datebase H2
+ Add autotest (in progress)
+ Add 3-5 urls monitoring (rollback)
