package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$x;

public class TransferPage {
    private SelenideElement amountInput = $x(".//span[@data-test-id=\"amount\"]//input");
    private SelenideElement fromInput = $x(".//span[@data-test-id=\"from\"]//input");
    private SelenideElement transferButton = $x(".//button[@data-test-id=\"action-transfer\"]");
    private SelenideElement cancelButton = $x(".//button[@data-test-id=\"action-cancel\"]");
    private SelenideElement errorNotification = $x(".//div[@data-test-id=\"error-notification\"]");
    private SelenideElement errorButton = $x(".//div[@data-test-id=\"error-notification\"]/button");

    public void transfer(DataHelper user, int amount, int indexCardFrom) {
        amountInput.val(String.valueOf(amount));
        fromInput.val(user.getCard(indexCardFrom));
        transferButton.click();
        errorNotification.should(hidden);
    }
}
