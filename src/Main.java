//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Homework While/Do-While

        System.out.println("Task 1");
        int firstFriday = 4; // Первая пятница
        int day = 1;         // Первый день месяца
        for (; day <= 31; day++){
            if(day==firstFriday || day - firstFriday==7){
                System.out.println("Сегодня пятница " + day + "-е число. Необходимо подготовить отчет");
                firstFriday = firstFriday +7;
            }
        }
        System.out.println("Task 2.1");
        int distance = 0;
        int total = 42195;
        do {
            int distanceLeft = total - distance;
            distance = distance + 1;
            if ( distance % 500 ==0 ){
                System.out.println("Держитесь! Осталось "+ distanceLeft + " метров");
            }
        }
        while (distance < total);

        System.out.println("Task 2.2");

        for( int distance2 = 0; distance2 < total; distance2= distance2 + 500){
            int distanceLeft = total - distance2;
                System.out.println("Держитесь! Осталось "+ distanceLeft + " метров");
            }

        System.out.println("Task 3.1");
        int budget = 975;
        int pay = 100;
        int parkingDays = 1;
        while (budget >= pay) {

            if (parkingDays % 5 == 0) {
                System.out.println(parkingDays + "-й день парковки. Остаток средств - " + budget);
                System.out.println("Беспалатный день парковки");
                parkingDays++;
                continue;
            }
            budget = budget - pay;
            System.out.println(parkingDays + "-й день парковки. Остаток средств - " + budget);

            if (budget - pay < 0) {
                break;
            }
            parkingDays++;
        }
        System.out.println("Бюджета хватит на " + parkingDays + " дней стоянки на парковке");


        System.out.println("Task 3.2");
        int budget2 = 1050;
        int days = 1;
        for(int i = 100; budget2 >= i; days++){
            if(days % 5 ==0){
                System.out.println("Беспалатный день парковки");
            }else{
                budget2 = budget2 - i;
                System.out.println(days + "-й день парковки. Остаток средств - " + budget2);
            }
        }
        System.out.println("Бюджета хватит на " + (days -1) + " дней стоянки на парковке");

        System.out.println("Task 4");
        int month = 0;
        int monthlyAddition = 15_000;
        int totalNow = 0; // назвал переееменную totalNow потому, что выше уже есть переменная total
        int needMoney = 12_000_000;
        while(true){
            month++;
            totalNow = totalNow + monthlyAddition;
            System.out.println(month + "-й месяц. Сумма накоплений - " + totalNow);
            if(month % 6 == 0){
                totalNow = totalNow + totalNow*7/100;
                System.out.println(month + "-й месяц после начисления процентов. Сумма накоплений - " + totalNow);
            }else{
                continue;
            }
            if(totalNow >= needMoney){
                break;
            }
        }
        float years = month/12f;
        System.out.println("Всего понадобиться - " + month + " месяца для накопления 12млн. Или " + years + " лет");

        System.out.println("Task 5");
        int charge = 20;
        int minutes = 0;
        int overheats = 0;
        int chargeInMinute = 2;
        while(charge < 100){
            minutes++;
            charge = charge + chargeInMinute;
            if(minutes % 10 == 0){
                overheats++;
                System.out.println("Перегрев устройства. Зарядка приостановлена " + charge + "%");
                continue;
            }
            if(overheats == 3){
                System.out.println("Достигнут лимит колличества перегревов. Зарядка устройства досрочно отключена");
                break;
            }
            System.out.println("Текущий заряд батареи - " + charge + "%");
        }
        System.out.println("Время зарядки составило - " + minutes + " минут");




        }

    }













