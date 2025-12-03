package com.padmalaya;

public class PrimitiveDataTypes {
/* Primitive -
Data Type	Size	Range
byte	1 byte (8 bits)	-128 to 127
short	2 bytes (16 bits)	-32,768 to 32,767
int	    4 bytes (32 bits)	-2,147,483,648 to 2,147,483,647
long	8 bytes (64 bits)	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes (32-bit IEEE 754)	~ ±3.4E38 (6–7 decimal digits precision)
double	8 bytes (64-bit IEEE 754)	~ ±1.7E308 (15 decimal digits precision)
char	2 bytes (16 bits Unicode)	0 to 65,535 (represents characters)
boolean	1 bit (JVM-dependent)	true or false
 */
    public static void main(String[] args) {
        /* Numeric - Integer*/
        byte num = 10;
        short nums = 32767;
        int numIn = 2147483647;
        long numLo = 214748364789L;
        /*Number - Floating Pont */
        float numFl = 125678.5F;
        double numDbl = 27896.99999998;
        /*Non Numeric*/
        char alpha = 'S';
        boolean bool = true;
        System.out.println("Byte value is" +" "+ num);
        System.out.println("Short value is" +" "+nums);
        System.out.println("Integer value is" +" "+numIn);
        System.out.println("Long value is" +" "+numLo);
        System.out.println("Float value is" +" "+numFl);
        System.out.println("Double value is" +" "+numDbl);
        System.out.println("Character value is" +" "+alpha);
        System.out.println("Boolean value is" +" "+bool);
        System.out.println("Primitive data types - Training");
//Fixed value cant be changed
        final int ageOfPerson = 60;
        System.out.println("Final value is" +" "+ageOfPerson);
        //ageOfPerson = 50;

    }

}
