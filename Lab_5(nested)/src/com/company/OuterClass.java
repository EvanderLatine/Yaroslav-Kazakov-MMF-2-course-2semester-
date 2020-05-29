package com.company;

class OuterClass
{
    static int outer_x = 10;

    private static int outer_private = 30;

    // static nested class
    static class StaticNestedClass
    {
        void display()
        {
            System.out.println("outer_x = " + outer_x);

            System.out.println("outer_private = " + outer_private);
        }
    }
}