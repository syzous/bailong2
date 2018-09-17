package com.example.phuocdat.bailong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int returnMax(int a,int b)
    {
        if (a>=b)
            return a;
        else
            return b;
    }
    public boolean adj(int i,int j)
    {
        if (i == j+1 || i==j-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //// chay tu 0 -> 4
        //   0 1 2 3 4

        //// 0 + 2, 0 + 3, 0 + 4,  // 0 + 2 = 7
        //// 1 + 3, 1 + 4,         // 1 + 4 = 9
        //// 2 + 0, 2 + 4,         // 2 + 0 = 7
        //// 3 + 0, 3 + 1,         // 3 + 1 = 6
        //// 4 + 0, 4 + 1, 4 + 2,  // 4 + 2 = 11

        ////
        ////adsfsdafasdfsa
        ///fadsfdsfsdafsdf
        ///ljjkjkkkkk
        //jbjhchdhjj
            int[] a;
            int lengthTemp=a.length;
            a= new int[]{1,4,6,2,5};
            int[] max=new int[a.length];
            int[] maxI=new int[a.length];
            int[] maxJ=new  int[a.length];
            int n=a.length;
            while (n!=0) {
                for (int i = 0; i < a.length; i++) {
                    //i = 0
                    for (int j = i; j < a.length; j++) // so lon hon i
                    {
                        if (i != j) {
                            if (i != (j + 1)) {
                                int sum = a[i] + a[j];
                                if (max[i] < sum) {
                                    max[i] = sum;
                                    maxI[i] = i;
                                    maxJ[i] = j;
                                }
                            }

                        }
                    }
                    for (int j = i; j > 0; j--) // so be hon i
                    {
                        if (i != j) {

                            if (i != (j - 1)) {
                                int sum = a[i] + a[j];
                                if (max[i] < sum) {
                                    max[i] = sum;
                                    maxI[i] = i;
                                    maxJ[i] = j;
                                }
                            }

                        }
                    }
                }
                for (int h=0;h<a.length;h++)
                {

                }
            }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s="";
        for (int i=0;i<a.length;i++)
        {
         s=s+a[i]+" ";
        }
        editText=findViewById(R.id.et_array);
        editText.setText(s);
        textView=findViewById(R.id.tv_result);

    }
}
