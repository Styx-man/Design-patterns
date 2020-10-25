package ru.styxman.patterns.hw.three;

/**
 * Main.
 *
 * @author Denis_Lukashov
 */
public class Main {

    public static void main(String[] args) {
        EMailBuilder builder = new EMailBuilder();

        // Не увидел смысла создавать билдер для двух полей для Content'a.
        // Можно было бы в EMail-билдере собирать Контент по полям, но в постановке было, что в билдер передаем объект Контанта
        Content content = new Content();
        content.setBody("Somebody once told me the world is gonna roll me");
        content.setSignature("Best regards");

        // проверяем, что отправитель заполняется по-дефолту
        EMail eMailOne = builder
                .subject("All star")
                .to("Iliya")
                .copyTo("Ignat")
                .content(content)
                .build();

        System.out.println(eMailOne);

        // проверяем, что значения получателей остаются уникальными
        EMail eMailTwo = builder
                .subject("To all")
                .from("Ted")
                .to("Jake")
                .to("Tom")
                .to("Tom")
                .toAll("Jon", "Bill", "Tom", "Tom")
                .copyTo("Pit")
                .copyTo("Jerry")
                .copyTo("Jerry")
                .copyToAll("Mike", "Sam", "Jerry", "Jerry")
                .content(content)
                .build();

        System.out.println(eMailTwo);
    }
}
