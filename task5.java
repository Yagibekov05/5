public class Main
{
	public static void main (String[] args) {
		Person[] persArray = new Person[5];
        persArray[0] = new Person("Третьяков Алексей Мирославович", "Верстальщик", "mirarik-560@mail.ru", +7(777)922-09-38, 20.000, 30); 
        persArray[1] = new Person("Кулагина Алиса Тимофеевна", "Сценарист", "gujaxigredo-4814@mail.ru", +7(777)380-82-38, 30.000, 28);
        persArray[2] = new Person("Панкратова Ксения Дамировна", "Ихтиолог", "yullikotequa-7873@mail.ru", +7(777)257-19-29, 40.000, 34);
        persArray[3] = new Person("Жданов Кирилл Маркович", "Риелтор", "tofrunalouye-9741@mail.ru", +7(777)760-94-23, 50.000, 43);
        persArray[4] = new Person("Кузнецов Демид Глебович", "Директор", "quocradagreugri-2122@mail.ru", +7(777)455-39-43, 60.000, 23);
        for (int i = 0; i < persArray.length; i++){
            persArray[i].age();
	}
}
}
class Person
{ String FIO;
    String ;
    String email;
    int phone;
    int salary;
    int age;
    public  (String FIO, String position,  Stringemail, int  phone, intsalary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    
    public void print(){
        System.out.println (FIO + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
    }
    public void age(){
        if (age> 40){
            System.out.println (FIO + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
        }
    }
}
