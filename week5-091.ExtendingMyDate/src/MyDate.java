
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (this.day == 30) {
            this.day = 0;
            if (this.month == 12) {
                this.month = 0;
                this.year++;
            }
            this.month++;
        }
        this.day++;
    }

    public void advance(int numberOfDays) {
        for (int i = 0; i < numberOfDays; i++) {
            advance();
        }
    }

    public MyDate afterNumberOfDays(int days) {
        MyDate retDate = new MyDate(this.day, this.month, this.year);
        retDate.advance(days);
        return retDate;
    }

}
