package Lesson_5_Class;

public class MainWorker {

    public static void main(String[] args) {

    Worker[] persMass = new Worker[5];

        persMass[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mail.ru",
            "892312312", 30000, 30);

        persMass[1] = new Worker("Sidorov Maksim", "Top manager", "maks2@gmail.com",
            "89453878787", 60000, 54);

        persMass[2] = new Worker("Petrov Vasiliy", "Engineer", "petrov@gmail.com",
                "89235456887", 30000, 41);

        persMass[3] = new Worker("Savin Kirill", "manager", "ksavin@mail.ru",
                "89773695432", 20000, 23);

        persMass[4] = new Worker("Nikolaeva Olga", "manager", "olnic@gmail.com",
                "89239733825", 20000, 27);

        for (Worker w : persMass) {
            if(w.getAge() > 40){
                w.getdisplayInfo();
            }

        }




    }
}
