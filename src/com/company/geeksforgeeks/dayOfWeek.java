package com.company.geeksforgeeks;

public class dayOfWeek {
    public static String findDay(int month, int day, int year) {
        if(year>2000 && year<3000){
            int[] t = {0,3,2,5,0,3,5,1,4,6,2,4};
            int s=0;
            year -= (month<3)? 1: 0;
            s=(year+year/4-year/100+year/400+t[month-1]+day)%7;
            String[] str = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THRUSDAY","FRIDAY","SATURDAY"};
            return str[s];
        }else{
            return "";
        }
    }

    public static void main(String[] args) {
        String str = findDay(12,25,2059);
        System.out.println(str);
    }
}
