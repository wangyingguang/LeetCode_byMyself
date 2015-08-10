package leetCode.wyg.oj;

import java.util.HashMap;

public class No12_IntegerToRoman {
	public static void main(String[] args) {
		System.out.println(intToRoman(1989));
	}
	public static String intToRoman(int num) {
		HashMap<Integer, String> dict = new HashMap<Integer, String>();
        dict.put(1, "I");	dict.put(10, "X");	dict.put(100, "C");
        dict.put(2, "II");	dict.put(20, "XX");	dict.put(200, "CC");
        dict.put(3, "III");	dict.put(30, "XXX");dict.put(300, "CCC");
        dict.put(4, "IV");	dict.put(40, "XL");	dict.put(400, "CD");
        dict.put(5, "V");	dict.put(50, "L");	dict.put(500, "D");
        dict.put(6, "VI");	dict.put(60, "LX");	dict.put(600, "DC");
        dict.put(7, "VII");	dict.put(70, "LXX");dict.put(700, "DCC");
        dict.put(8, "VIII");dict.put(80, "LXXX");dict.put(800, "DCCC");
        dict.put(9, "IX");	dict.put(90, "XC");	dict.put(900, "CM");
      
        dict.put(1000, "M");
        dict.put(2000, "MM");
        dict.put(3000, "MMM");
        dict.put(0, "");
        
        //StringBuilder sb = new StringBuilder("");
        String ret = "";
        int flag = 1;
        int mod;
        while(num != 0){
        	mod = num % 10;
        	ret = dict.get(mod*flag)+ret;
        	flag *= 10;
        	num = num / 10;
        }
        return ret;
       
    }
}
