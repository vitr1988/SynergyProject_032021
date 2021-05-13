package ru.synergyitacademy.lesson10;

import ru.synergyitacademy.lesson6.Account;

import java.util.Arrays;

public class WrapperRunner {

    public static void main(String[] args) {
        Byte b = Byte.valueOf("1");
        Short sh = 1; //
        Character c = 1;
        Integer number = Integer.valueOf(127);
        Long l = 100l;
        Float result = 1f;
        Double d = 100.0;
        Boolean flag = true;

        int i = number;
        System.out.println(i);

//        Account account = new Account();
//        Account anotherAccount = new Account();
//        System.out.println(account == anotherAccount);

        Integer anotherNumber = Integer.valueOf(127);
        System.out.println(number == anotherNumber);

        String example = "     Hello  gfsgfs  world             ";
        String hELLO_world = "hELLO WORLD";
        System.out.println("hELLO WORLD".equals(example));
        System.out.println(example.equalsIgnoreCase(hELLO_world));
        System.out.println(Arrays.toString(example.split("\\s+")));
        System.out.println(example.trim());
        String s = example + "gfsg";
//      String s = new StringBuilder().append(example).append("gfsg").toString()

    }
}
