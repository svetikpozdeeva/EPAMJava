package ClassesMainTask;

import javax.security.auth.Subject;

/* Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль.
В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.

Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.

Создать массив объектов. Вывести:

a) список покупателей в алфавитном порядке;

b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.*/
public class SubjectCustomer {
    private String surname, name, famname, address;
    private int id, numcard, numbank;

    public SubjectCustomer() {

    }
    public SubjectCustomer(int id, String name, String surname, String famname, int numbank, int numcard) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.famname = famname;
        this.address = address;
        this.numbank = numbank;
        this.numcard = numcard;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamname() {
        return famname;
    }

    public void setFamname(String famname) {
        this.famname = famname;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public int getNumcard() {
        return numcard;
    }

    public void setNumcard(int numcard) {
        this.numcard = numcard;
    }

    public int getNumbank() {
        return numbank;
    }

    public void setNumbank(int numbank) {
        this.numbank = numbank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return String.format("ID: %d\t name: %s\t surname: %s\t famname %s \t from: %s\t credit card %d\t bank number %d",
                id, name, surname, famname, address, numbank, numcard);
    }
}
