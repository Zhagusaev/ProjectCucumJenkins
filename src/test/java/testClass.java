import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testClass {

    public static String reversed(String str){
        String reversed = "";
        for (int i=str.length()-1; i>=0;i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

    @Test
    public void testHelloWorld(){
        System.out.println(reversed("Kanybek"));
//        Assertions.assertEquals("kanybek", "Kanybek");
    }
}
