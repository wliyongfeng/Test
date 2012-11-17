package li.test.examples.json.expense;

import java.util.Calendar;

public class ExpenseDto {
    public String author;
    public double amount;
    public String reason;
    public Calendar date;

    public ExpenseDto() {
        // TODO Auto-generated constructor stub
    }

    public ExpenseDto(String author, double amount, String reason, Calendar date) {
        this.author = author;
        this.amount = amount;
        this.reason = reason;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ExpenseDto [author=" + author + ", amount=" + amount
                + ", reason=" + reason + ", date=" + date + "]";
    }

}
