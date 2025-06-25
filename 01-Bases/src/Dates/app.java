package Dates;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;


public class app {
    public static void main(String[] args) {
        /*
        Avant Java 8: java.util.Date
         */
        Date d1 = new Date();

        /*
        Classes liées à la manipulation des dtes concernant une base de données
        java.sql.date - java.sql.time - java.sql.timestamp
         */

        /*
        A partir de Java 8: ajout du package: java.time: LocalDateTime, LocalDate, LocalTime
         */

        System.out.println(">>>> LocalDateTime:");
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("LocalDateTime.now(): "+ldt1);

        LocalDateTime ldt2 = LocalDateTime.of(2019,12,15,14,35,25);
        System.out.println("LocalDateTime.of(): "+ldt2);

        LocalDateTime ldt3 = LocalDateTime.parse("2023-11-25T13:15:33");
        System.out.println("LocalDateTime.pars(): "+ldt3);

        System.out.println(">>>>> LocalDate:");
        LocalDate ld1 = LocalDate.now();
        System.out.println("LocalDate.now(): "+ld1);

        LocalDate ld2 = LocalDate.of(2025,10,12);
        System.out.println("LocalDate.of(): "+ld2);

        LocalDate ld3 = LocalDate.parse("2015-09-15");
        System.out.println("LocalDate.parse(): "+ld3);

        System.out.println(">>>>> LocalTime:");

        LocalTime lt1 = LocalTime.now();
        System.out.println("LocalTime.now(): "+lt1);

        LocalTime lt2 = LocalTime.of(15,25,59);
        System.out.println("LocalTime.of(): "+lt2);

        LocalTime lt3 = LocalTime.parse("06:30");
        System.out.println("LocalTime.parse(): "+lt3);

        //Il existe dans java.time, un ensemble d'enums réportiants les jours et les mois
        Month janvier =Month.JANUARY;

        LocalDate localDate = LocalDate.of(2015, Month.APRIL, 15);

        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        DayOfWeek dayOfWeek1 = DayOfWeek.of(2);

        System.out.println(">>>>>>>>>> Formattage de dates:");

        LocalDateTime localDateTime = LocalDateTime.of(2025, Month.APRIL, 15, 12,30,55);
        String dateFormatee = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE); //soit choisir un format prédéfini dans l'enum DateTimeFormatter

        System.out.println(dateFormatee);

        String dateFormatPerso = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyy")); // soit appliquer un format personnalisé

        System.out.println(dateFormatPerso);

        //Possibilité d'appliquer d'autres formats: long, moyen ou court
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(localDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(localDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(localDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(localDateTime));

        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.minusDays(2));
        System.out.println(localDateTime.plusMonths(1));
        System.out.println(localDateTime.isAfter(ldt1));
        System.out.println(localDateTime.isBefore(ldt3));

        localDateTime.toLocalDate(); //conversion en LocalDate
        localDateTime.toLocalTime(); //converson en LocalTime


    }
}
