/*
Управление генератором случайных чисел.
Генератор случайных чисел сгенерирует 10 000 случайных целых чисел от 1 до 100.
(лимиты включены).
Покажите на экране, сколько раз было сгенерировано каждое число.
*/
/*
Control of the random generator.
Have the random generator generate 10,000 random integers between 1 and 100
(limits included).
Show on the screen how many times each number has been generated.
*/

package be.vdab.array;

public class RandomGenrator {
    public static void main(String[] args) {

        var numbers = new int[100];
        for(var i=0; i< 10_000;i++){
            var randomNr = (int)((Math.random()*100)+1);
            numbers[randomNr-1]++;
        }
        for (int j = 0; j < numbers.length; j++) {
            System.out.println((j+1) + " - "+ numbers[j]);
        }
    }
}
