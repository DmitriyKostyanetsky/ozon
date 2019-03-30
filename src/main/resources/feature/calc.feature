#language: ru
Функционал: Рассчитать доходность по вкладу

  @web
  Структура сценария: "Добавление и удаление товаров в корзине"

    * переход на страницу с корзиной
    * нажимаем кнопку Войдите
    * нажимаем кнопку Войти по почте
    * заполняем логин "onlywarinfarfuture@gmail.com"
    * заполняем пароль "tutu147AA"
    * нажимаем кнопку Войти после введенных логин пароль
    * выбираем в главном поиске значения "iPhone 7 Plus/8 Plus Black"
    * нажимаем кнопку поиска
    * выбираем 5 товаров и нажимаем купить
    * переход на страницу с корзиной
    * проверяем что 5 выбранных товаров в корзине "<first>", "<second>", "<third>", "<fourth>", "<fifth>"
    * удаляем все товары из корзины
    * разлогиниваемся
    * нажимаем кнопку Войдите
    * нажимаем кнопку Войти по почте
    * заполняем логин "onlywarinfarfuture@gmail.com"
    * заполняем пароль "tutu147AA"
    * нажимаем кнопку Войти после введенных логин пароль
    * проверяем что корзина пустая

    Примеры:
      |first                                                    |second                                                   |third                                                                                       |fourth                                                            |fifth                                                          |
      |Apple Silicone Case чехол для iPhone 7 Plus/8 Plus, Black|Apple Leather Case чехол для iPhone 7 Plus/8 Plus, Black |Чехол Black Rock Flex Carbon Case для Apple iPhone 8 Plus / 7 Plus / 6/6S Plus, цвет: черный|Celly Gelskin чехол-накладка для Apple iPhone 7 Plus/8 Plus, Black|Deppa Gel Plus Case чехол для Apple iPhone 7 Plus/8 Plus, Black|