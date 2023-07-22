# Проект по автоматизации тестирования hh.ru

### Технологии и инструменты:
<p align="center">
<img src="images/logos/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/>
<img src="images/logos/Java.svg" width="50" height="50"  alt="Java"/>
<img src="images/logos/Github.svg" width="50" height="50"  alt="Github"/>
<img src="images/logos/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/>
<img src="images/logos/Gradle.svg" width="50" height="50"  alt="Gradle"/>
<img src="images/logos/Selenide.svg" width="50" height="50"  alt="Selenide"/>
<img src="images/logos/Selenoid.svg" width="50" height="50"  alt="Selenoid"/>
<img src="images/logos/Allure_Report.svg" width="50" height="50"  alt="Allure_Report"/>
<img src="images/logos/Allure_TO.svg" width="50" height="50"  alt="Allure_TO"/>
<img src="images/logos/Jenkins.svg" width="50" height="50"  alt="Jenkins"/>
<img src="images/logos/Jira.svg" width="50" height="50"  alt="Jira"/>
</p>

### Реализованные проверки:
* Отображение строки поиска на главной странице
* Проверка плейсхолдера строки поиска на главной странице
* Переход на страницу результатов поиска при выполнении поиска с главной страницы
* Переход на страницу расширенного поиска с главной страницы
* Отображение поисковых подсказок на главной странице
* Проверка заголовка строки поиска на главной странице
* Отображение popup подтверждения региона на главной странице
* Отсутствие ошибок в логах консоли

### Запуск тестов из терминала
#### Локальный запуск тестов с параметрами из конфигурационного файла:
```bash
gradle test -Denv=local
```
#### Удаленный запуск тестов с параметрами из конфигурационного файла:
```shell
gradle test -Denv=remote
```

#### Удаленный запуск тестов с передачей параметров:

```bash
gradle clean test 
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DremoteDriverUrl=https://user1:1234@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${VIDEO_STORAGE}/video/
```
где: 

- <code>BROWSER</code> – браузер, в котором будут выполняться тесты.
- <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты.
- <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты.
- <code>REMOTE_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.
- <code>VIDEO_STORAGE</code> - адрес удаленного сервера, по которому можно получить видео.

### Сборка в Jenkins
<p align="center">
<img title="Jenkins Build" src="images/screens/Jenkins.png">
</p>

### Отчет в Allure report
#### Основная страница отчета
<p align="center">
<img title="Jenkins Build" src="images/screens/Allure-report.png">
</p>

#### Тест-кейсы
<p align="center">
<img title="Jenkins Build" src="images/screens/Allure-tests.png">
</p>

### Интеграция с Allure TestOps
#### Dashboard
<p align="center">
<img title="Jenkins Build" src="images/screens/Allure-TestOps-dashboard.png">
</p>

#### Тест-кейсы
<p align="center">
<img title="Jenkins Build" src="images/screens/Allure-TestOps-tests.png">
</p>

### Интеграция с Jira
<p align="center">
<img title="Jenkins Build" src="images/screens/Jira.png">
</p>

### Уведомления в Telegram с использованием бота
<p align="center">
<img title="Jenkins Build" src="images/screens/tg.png">
</p>

### Пример видео выполнения теста на Selenoid
<p align="center">
  <img title="Selenoid Video" src="images/screens/video.gif">
</p>