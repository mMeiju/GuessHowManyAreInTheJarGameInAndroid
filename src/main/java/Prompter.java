import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Prompter {
    private int answeredNum = -1;

    public void setName(Jar jar) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What type of item?: ");
        try {
            jar.setName(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setMax_num(Jar jar) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is the maximum amount of " + jar.getName() + "?: ");
        try {
            jar.setMax_num(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setRandom_num(Jar jar) {
        Random random = new Random();
        int maxItemsAllowed = jar.getMax_num();
        int someNumber = random.nextInt(maxItemsAllowed);
        jar.setRandom_num(someNumber + 1);
    }

    public void setAnsweredNum(Jar jar) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Guess: ");
        try {
            answeredNum = Integer.parseInt(br.readLine());
            if (answeredNum < 0) {
                System.out.printf("Your guess must be more than 0.%n");
            } else if (answeredNum > jar.getMax_num()) {
                System.out.printf("Your guess must be less than %d.%n", jar.getMax_num());
            } else if (answeredNum > jar.getRandom_num()){
                System.out.printf("Your guess is too high.%n");
            } else if (answeredNum < jar.getRandom_num()){
                System.out.printf("Your guess is too low.%n");
            } else { }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getAnsweredNum() {
        return answeredNum;
    }


}
