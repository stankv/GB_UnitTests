package Numbers;
public class Numbers {

    /**
     * 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
     * переданное число четным или нечетным:
     * public boolean evenOddNumber(int n) {
     *     if (n % 2 == 0) {
     *         return true;
     *     } else {
     *         return false;
     *         }
     *     }
     */
    public boolean evenOddNumber(int number){
        return number % 2 ==0;
    }


    /*
     * 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
     * переданное число в интервал (25;100)
     */
    public boolean numberInInterval(int number){
        return (number < 100 && number > 25);
    }
    
}
