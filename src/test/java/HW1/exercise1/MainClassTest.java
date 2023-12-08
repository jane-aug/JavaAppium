package HW1.exercise1;

import org.junit.Test;

public class MainClassTest {
    MainClass MainC = new MainClass();

    @Test
    public void testGetLocalNumber () {
        int a = MainC.getLocalNumber();
        if (a == 14) {
            System.out.println("Number from function getLocalNumber = 14");

        } else {
            System.out.println("Number from function getLocalNumber != 14");

        }
    }
    @Test
    public void testGetClassNumber () {
        int b = MainC.getClass_number();
        if (b > 45) {
            System.out.println("Number from function GetClassNumber > 45");
        } else {
            System.out.println("Number from function GetClassNumber < 45");
        }
    }
    @Test
    public void  testGetlassStringSub () {
        String e = MainC.getClass_string();
        String Str = e.substring(0,5);
        if (Str.equals("hello")) {
            System.out.println("String from function GetClassString starts with the word \'hello\'");
        } else if (Str.equals("Hello")) {
            System.out.println("String from function GetClassString starts with the word \'Hello\'");
        } else {
         throw new RuntimeException("String from function GetClassString does not start with the word \'hello\' or \'Hello\'");
        }
    }


}
