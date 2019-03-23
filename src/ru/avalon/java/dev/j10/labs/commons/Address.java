package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    
    private String adrStreet; // улица
    private int adrHouseNum;  // номер дома
    private int adrFlat;      // номер квартиры
    
    // конструктор с входными параметрами
    public Address (String aStr, int aHn, int aFl) { 
        adrStreet = aStr;
        adrHouseNum = aHn;
        adrFlat = aFl;
        }
    
    // задать улицу
    public void setStreet (String str) { 
        this.adrStreet = str;
    }
    
    // задать дом
    public void setHouseNum (int hn) {
        this.adrHouseNum = hn;
    }
    
    // задать квартиру
    public void setFlat (int fl) {
        this.adrFlat = fl;
    }
    
    // получить улицу
    public String getStreet() {
        return adrStreet;
    }
    
    // получить дом
    public int getHouseNum() {
        return adrHouseNum;
    }
    
    // получить квартиру
    public int getFlat() {
        return adrFlat;
    }

    @Override
    public String toString() {
        return "Адрес - " + "Улица:" + adrStreet + " Дом:" + adrHouseNum + "  Квартира:" + adrFlat;
    }
  
    
}