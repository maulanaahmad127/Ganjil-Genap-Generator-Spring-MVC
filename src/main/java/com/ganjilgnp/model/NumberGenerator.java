package com.ganjilgnp.model;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {

    private int num1;
    private int num2;
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public List<String> cetak(){
        List<String> buffer = new ArrayList<String>();
        while(num1 <= num2){
        	if(num1 % 2 == 0){
            	buffer.add("angka " + num1 + " adalah genap" ) ;
        	}else if(num1 % 2 == 1){
            	buffer.add("angka " + num1 + " adalah ganjil" ) ;
        	}
        	num1++;
    	}
        return buffer;
    }
    
}
