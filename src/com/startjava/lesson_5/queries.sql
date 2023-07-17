--Вывод всей таблицы с сортировкой по дате создания
--SELECT * FROM jaegers ORDER BY launch;

--Вывод данных где статус у робота не уничтожен
--SELECT * FROM jaegers WHERE status != 'Destroyed';

--Вывод данных где модель Марк-1 или Марк-4 с сортировкой по имени
--SELECT * FROM jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-4' ORDER BY modelname;

--Вывод данных где модели не Марк-1 и Марк-4 с сортировкой по имени
--SELECT * FROM jaegers WHERE mark != 'Mark-1' AND mark != 'Mark-4' ORDER BY modelname;

--Вывод всей таблицы с сортировкой по модели
--SELECT * FROM jaegers ORDER BY mark DESC;

--Вывод данных о самом старом роботе
/*SELECT * FROM jaegers 
WHERE launch = (
			SELECT MIN(launch) 
			FROM jaegers);
*/

--Вывод данных о роботе который уничтожил больше всех каджи
/*SELECT * FROM jaegers
WHERE kaijukill = (
			SELECT MAX(kaijukill)
			FROM jaegers);
*/		

--Отобразите средний вес роботов
--SELECT AVG(weight) AS AVERAGE_WEIGHT FROM jaegers;

--Увеличить на 1 количество уничтоженныех каджи у роботов которые не разрушены
--UPDATE jaegers SET kaijukill = kaijukill + 1 WHERE status != 'Destroyed';
--SELECT * FROM jaegers ORDER BY status;

--Удаление уничтоженых роботов и отображение таблицы
DELETE FROM jaegers WHERE status = 'Destroyed';
SELECT * FROM jaegers;