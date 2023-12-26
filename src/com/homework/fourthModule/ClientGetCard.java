package com.homework.fourthModule;
import java.util.Calendar;

public class ClientGetCard {
    private String clientName;
    private Calendar birthDate;
    private Calendar cardIssueDate;

    public ClientGetCard(String clientName, Calendar birthDate, Calendar cardIssueDate) {
        this.clientName = clientName;
        this.birthDate = birthDate;
        this.cardIssueDate = cardIssueDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public Calendar getCardIssueDate() {
        return cardIssueDate;
    }

    public void setCardIssueDate(Calendar cardIssueDate) {
        this.cardIssueDate = cardIssueDate;
    }

    public Calendar calculateExpirationDate() {
        Calendar expirationDate = Calendar.getInstance();
        expirationDate.setTime(cardIssueDate.getTime());
        expirationDate.add(Calendar.YEAR, 2);
        return expirationDate;
    }

}
