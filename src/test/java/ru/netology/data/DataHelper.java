package ru.netology.data;

import lombok.Data;
import lombok.Value;

@Data
public class DataHelper {

    private final String login = "vasya";
    private final String password = "qwerty123";
    private final String verificationCode = "12345";
    private final String[] cards = new String[]{"5559 0000 0000 0001", "5559 0000 0000 0002"};

    public String getCard(int index) {
        String card = cards[index];
        return card;
    }
}
