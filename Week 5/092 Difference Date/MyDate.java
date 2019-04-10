public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
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

    public int differenceInYears(MyDate compared){
        
        int thisDate = (this.day + (this.month * 30) + (this.year * 365));
        int comparedDate = (compared.day + (compared.month * 30) + (compared.year * 365));
        
        int difference = (thisDate - comparedDate) / 365;
        
        return Math.abs(difference);
    }

}
