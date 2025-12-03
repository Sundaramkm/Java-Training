package com.padmalaya;

public class ReferenceStringDataType {

    public static void main(String[] args){

        String firstname ="Meenakshi Sundaram ";
        String lastname ="Kathiresan";
        System.out.println(firstname);
        System.out.println(lastname);

        System.out.println(firstname.length());
        System.out.println(firstname.concat(lastname));
//Reverse a String
        String reversedfname = new StringBuilder(firstname).reverse().toString();
        System.out.println(reversedfname);
        String reversedlname = new StringBuffer(lastname).reverse().toString();
        System.out.println(reversedlname);


        String revfnam = new StringBuilder(firstname).reverse().toString();
        System.out.println("Reverse the Firstname"+" "+revfnam);

    }

}

/*
Precedence Level | Operators                                        | Associativity
-----------------|--------------------------------------------------|---------------
16               | () [] . new ::                                   | Left-to-Right
15               | ++ (postfix) -- (postfix)                        | Left-to-Right
14               | ++ (prefix) -- (prefix) + - ! ~ (type)           | Right-to-Left
13               | (cast)                                           | Right-to-Left
12               | * / %                                            | Left-to-Right
11               | + -                                              | Left-to-Right
10               | << >> >>>                                        | Left-to-Right
9                | < <= > >= instanceof                             | Left-to-Right
8                | == !=                                            | Left-to-Right
7                | & (bitwise AND)                                  | Left-to-Right
6                | ^ (bitwise XOR)                                  | Left-to-Right
5                | | (bitwise OR)                                   | Left-to-Right
4                | && (logical AND)                                 | Left-to-Right
3                | || (logical OR)                                  | Left-to-Right
2                | ?: (ternary conditional)                         | Right-to-Left
1                | = += -= *= /= %= &= ^= |= <<= >>= >>>= -> (lambda) | Right-to-Left
 */
