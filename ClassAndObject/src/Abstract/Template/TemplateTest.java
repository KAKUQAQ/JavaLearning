package Abstract.Template;

public class TemplateTest {
    public static void main(String[] args) {
        PrintPrimeNumber p = new PrintPrimeNumber();

        p.spendTime();
    }
}

abstract class Template {

    public void spendTime(){
        long start = System.currentTimeMillis();

        code();

        long end = System.currentTimeMillis();

        System.out.println((end - start));
    }

    public abstract void code();
}
class PrintPrimeNumber extends Template{
    public void code(){

        for(int i = 2; i <= 100000; i++){
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}