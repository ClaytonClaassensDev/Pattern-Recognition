
import java.util.Arrays;
import java.util.Date;

public class LottoDraw {

    String day;
    Date date;
    int[] numbers;
    int jackpot;
    boolean outcome;

    public LottoDraw(String day, Date date, int[] numbers, int jackpot, boolean outcome) {
        this.day = day;
        this.date = date;
        this.numbers = numbers;
        this.jackpot = jackpot;
        this.outcome = outcome;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getJackpot() {
        return jackpot;
    }

    public void setJackpot(int jackpot) {
        this.jackpot = jackpot;
    }

    public boolean isOutcome() {
        return outcome;
    }

    public void setOutcome(boolean outcome) {
        this.outcome = outcome;
    }

    @Override
    public String toString() {
        return "LottoDraw{" +
                "day='" + day + '\'' +
                ", date=" + date +
                ", numbers=" + Arrays.toString(numbers) +
                ", jackpot=" + jackpot +
                ", outcome=" + outcome +
                '}';
    }
}
