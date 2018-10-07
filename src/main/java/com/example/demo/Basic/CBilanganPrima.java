package com.example.demo.Basic;

public class CBilanganPrima {

    public Integer[] printPrima(Integer range)
    {
//  indexarr1 untuk menentukan jumlah bilangan prima pada range parameter
        int indexArr1 = 0;
        for (int i = 1; i <= range; i ++)
        {
            int inc1 = 0;

            for (int j = 1; j <= i; j++)
            {
                if (i % j ==0 )
                {
                    inc1++;
                }
            }

            if (inc1 == 2)
            {
                indexArr1 += 1;
            }


        }
        Integer res[] = new Integer[indexArr1];
        int indexArr = 0;
        for (int i= 1; i <= range; i ++)
        {
            int inc = 0;

            for (int j=1; j <= i; j ++)
            {
                if (i % j == 0)
                {
                    inc++;

                }
            }
            if (inc == 2)
            {
                res[indexArr] = i;
                indexArr += 1;
            }

        }
        return res;
    }
}
