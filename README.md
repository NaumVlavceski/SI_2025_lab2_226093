# Втора лабораториска вежба по Софтверско инженерство

## Наум Влавчески, бр.на индекс 226093

### Control Flow Graph
![Control Flow Graph.png](Control%20Flow%20Graph.png)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 9, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајов P=8, па цикломатската комплексност изнесува 9.

P+1=8+1=9

### Тест случаи според every statement
1. allItems = null : Се праќа без аргументи и програмата фрла exception
2. allItems = {null,20,0,0} : Се праќаат сите аргументи без Name фрла exception
3. allItems = {("name",300,0,5),("name",30,5,5)}, cardNumber=null : Се праќаат валидни аргументи за items но cardNumber фрла exception
4. allItems = VALID, cardNumber = 12345678901234AB : се праќа cardNumber со букви и фрла exception 
5. allItems = VALID, cardNumber = VALID : се праќаат валидни информации и програмата завршува успешно

### Тест случаи според критериум Multiple Condition
if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)

FXX - ако барем еден од производите има помала или вредност од 300. пример: item = new item("name",200,"","")

TFX - ако цената е поголема од 300 но попустот е помал од 0. пример: item = new item ("name",450,-5,"")

TTF - ако цената е поголема од 300, попустот е поголем од 0 но количината е помала од 10. пример: item = new item ("name",450,10,7)

TTT - ако сите услови се исполнети. пример: item = new item ("name",450,10,15)

