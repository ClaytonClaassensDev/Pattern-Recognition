import java.io.File;
import java.nio.file.FileSystem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Tools {

    public void readLottoTextFile(){

        boolean isDone = false;
        LottoDraw lottoDraw;
        File lottoNumbers = new File("src/main/LottoNumbers.txt");

        try {

            Scanner reader = new Scanner(lottoNumbers);

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

            if(isDone = false) {

                while (reader.hasNextLine()) {

                    int[] numbersArray = new int[7];
                    int i = 0;

                    String day = reader.nextLine();
                    Date date = dateFormat.parse(reader.nextLine());
                    String numbers = reader.nextLine();
                    StringTokenizer tokenizer = new StringTokenizer(numbers, " ");

                    while (tokenizer.hasMoreTokens()) {

                        numbersArray[i] = Integer.parseInt(tokenizer.nextToken());
                        i++;
                    }

                    StringTokenizer jackpotOutcomeTokenizer = new StringTokenizer(reader.nextLine().replaceFirst("R", "").replaceAll(",", "").replaceAll("\t", " "), " ");
                    String outcome;
                    int jackpot = 0;
                    boolean outcomeBool = false;

                    while (jackpotOutcomeTokenizer.hasMoreTokens()) {

                        jackpot = Integer.parseInt(jackpotOutcomeTokenizer.nextToken());

                        outcome = jackpotOutcomeTokenizer.nextToken();

                        if (outcome.contains("Won")) {
                            outcomeBool = true;
                        } else outcomeBool = false;

                    }

                    lottoDraw = new LottoDraw(day, date, numbersArray, jackpot, outcomeBool);
                    System.out.println(lottoDraw.toString());

                } isDone = true;

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
