package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if(first == second){
            if(first > third){
                System.out.println(first);
            }else{
                System.out.println(third);
            }
        }else if(second == third){
            if(second > first){
                System.out.println(second);
            }else{
                System.out.println(first);
            }
        }else if(first == third){
            if(first > second){
                System.out.println(first);
            }else{
                System.out.println(second);
            }
        }else{

        }
    }
}
