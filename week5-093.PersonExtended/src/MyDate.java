
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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


    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {
        int y = Math.abs(this.year - comparedDate.year);
        int d1 = this.day + ((this.month - 1) * 30) + 4;
        int d2 = comparedDate.day + ((comparedDate.month - 1) * 30) + 4;
        int res;
        boolean ear = earlier(comparedDate);

        if (this.day == comparedDate.day && this.month == comparedDate.month && this.year == comparedDate.year) {
            return 0;
        } else if (ear) {
            if (y < 2) {
                res = (365 - d1) + d2;
            } else {
                res = ((365 - d1) + d2) + ((y - 1) * 365);
            }
        } else {
            if (y < 2) {
                res = (365 - d2) + d1;
            } else {
                res = ((365 - d2) + d1) + ((y - 1) * 365);
            }
        }

        return res / 365;
    }

}
