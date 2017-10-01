import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jar {
    private String name;
    private int max_num;
    private int random_num;

    public int getRandom_num() {
        return random_num;
    }

    public void setRandom_num(int random_num) {
        this.random_num = random_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMax_num() {
        return max_num;
    }

    public void setMax_num(int max_num) {
        this.max_num = max_num;
    }
}
