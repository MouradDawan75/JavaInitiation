package src;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {

        /*
        Avant Java < 8:
        utilisation du package java.util.date
        Les objets dates à conserver en BD:
        java.sql.Date
        java.sql.Time
        java.sql.Timestamp

        A partir de Java 8: ajout du package java.time
        3 classes principales et 2 enums:
        LocalTime
        LocalDate
        LocalDateTime
        plus un ensemble d'enum pour les jours et les mois: DayOfWeek - Month
         */


        System.out.println(">>>> LocalTime:");
        LocalTime lt1 = LocalTime.now();
        System.out.println("now(): "+lt1);

        LocalTime lt2 = LocalTime.of(12,15,45);
        System.out.println("of(): "+lt2);

        LocalTime lt3 = LocalTime.parse("06:30"); //conversion d'une chaine en LocalTime
        System.out.println("parse(): "+lt3);

        lt3.plusHours(2);
        System.out.println(lt3);

        System.out.println(">>>> LocalDate:");

        LocalDate ld1 = LocalDate.now();
        System.out.println("now(): "+ld1);

        LocalDate ld2 = LocalDate.of(2020,11,5);
        System.out.println("of(): "+ld2); //format angais par défaut: yyyy-MM-dd

        LocalDate ld3 = LocalDate.parse("2015-06-04"); //conversion d'une chaine en date
        System.out.println("parse(): "+ld3);

        System.out.println(">>>> LocalDateTime:");

        DayOfWeek dok = DayOfWeek.MONDAY;
        DayOfWeek dok2 = DayOfWeek.of(1); // Lundi: premier jour de la semaine

        Month month = Month.APRIL;

        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("now(): "+ldt1);

        LocalDateTime ldt2 = LocalDateTime.of(2011,Month.DECEMBER,5,14,35,12);
        System.out.println("of(): "+ldt2);

        LocalDateTime ldt3 = LocalDateTime.parse("2015-02-20T06:15:35"); //conversion d'une chaine en LocalDateTime
        System.out.println("parse(): "+ldt3);

        System.out.println(">>>>>>>>>>>>>> Formattage des dates:");

        LocalDateTime localDateTime = LocalDateTime.now();

        //soit choisir un format prédéfini dans l'enum DateTimeFormatter
        String dateFormatted = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(dateFormatted);

        //soit définir son propre format (pattern)

        String result = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(result);

        //lien doc formattage de dates: https://www.baeldung.com/java-datetimeformatter





    }
}
