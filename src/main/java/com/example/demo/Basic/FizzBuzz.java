package com.example.demo.Basic;

public class FizzBuzz {

    public String[] printValFizzBuzz()
    {
        String res[] = new String[100];
        Integer inc = 0;
        for(int i = 1; i <= 100;i++)
        {

            if (i % 3 ==0)
            {
                if (i % 5 ==0)
                {
                    res[inc] = i +" adalah bilangan : FIZZBUZZ";
                }
                else
                {
                    res[inc] = i +" adalah bilangan : FIZZ";
                }

            }
            else if (i % 5 ==0)
            {
                res[inc] = i +" adalah bilangan : BUZZ";
            }
            else
            {
                res[inc] = i +" adalah bilangan : NOTHING";
            }
            inc++;
        }
        return res;
    }
}
