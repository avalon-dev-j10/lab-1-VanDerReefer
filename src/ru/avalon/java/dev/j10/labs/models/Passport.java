package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    private String passSeriesNum;        // серия, номер паспорта
    private String perName;              // имя
    private String perSurname;           // фамилия
    private String perMiddleName;        // отчество
    private String perSecondName;        // второе имя
    private short perBirthDay;           // день рождения
    private short perBirthMonth;         // месяц рождения
    private short perBirthYear;          // год рождения
    private short passIssuedDay;         // день выдачи
    private short passIssuedMonth;       // месяц выдачи
    private short passIssuedYear;        // год выдачи
    private String passIssuedDepartment; // орган, выдавший документ

    public Passport(String passSeriesNum, String perSurname, String perName, String perMiddleName) {
        this.passSeriesNum = passSeriesNum;
        this.perName = perName;
        this.perSurname = perSurname;
        this.perMiddleName = perMiddleName;
    }

    public Passport(String passSeriesNum, String perName, String perSecondName, String perSurname, String perMiddleName) {
        this(passSeriesNum, perName, perSurname, perMiddleName);
        this.perSecondName = perSecondName;
    }
        
    public String getPassSeriesNum() {
        return passSeriesNum;
    }

    public void setPassSeriesNum(String passSeriesNum) {
        this.passSeriesNum = passSeriesNum;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public void setPerSurname(String perSurname) {
        this.perSurname = perSurname;
    }

    public void setPerMiddleName(String perMiddleName) {
        this.perMiddleName = perMiddleName;
    }

    public void setPerSecondName(String perSecondName) {
        this.perSecondName = perSecondName;
    }

    public void setPerBirthDay(short perBirthDay) {
        this.perBirthDay = perBirthDay;
    }

    public void setPerBirthMonth(short perBirthMonth) {
        this.perBirthMonth = perBirthMonth;
    }

    public void setPerBirthYear(short perBirthYear) {
        this.perBirthYear = perBirthYear;
    }

    public void setPassIssuedDay(short passIssuedDay) {
        this.passIssuedDay = passIssuedDay;
    }

    public void setPassIssuedMonth(short passIssuedMonth) {
        this.passIssuedMonth = passIssuedMonth;
    }

    public void setPassIssuedYear(short passIssuedYear) {
        this.passIssuedYear = passIssuedYear;
    }

    public void setPassIssuedDepartment(String passIssuedDepartment) {
        this.passIssuedDepartment = passIssuedDepartment;
    }

    public String getPerName() {
        return perName;
    }

    public String getPerSurname() {
        return perSurname;
    }

    public String getPerMiddleName() {
        return perMiddleName;
    }

    public String getPerSecondName() {
        return perSecondName;
    }

    public short getPerBirthDay() {
        return perBirthDay;
    }

    public short getPerBirthMonth() {
        return perBirthMonth;
    }

    public short getPerBirthYear() {
        return perBirthYear;
    }

    public short getPassIssuedDay() {
        return passIssuedDay;
    }

    public short getPassIssuedMonth() {
        return passIssuedMonth;
    }

    public short getPassIssuedYear() {
        return passIssuedYear;
    }

    public String getPassIssuedDepartment() {
        return passIssuedDepartment;
    }
        
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * +1. Объявить атрибуты класса.
     *
     * 2. +Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. +Создайте все необходимые конструкторы класса.
     *
     * 4. +Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * +5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
        
}
