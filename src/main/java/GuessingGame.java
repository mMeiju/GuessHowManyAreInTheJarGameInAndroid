public class GuessingGame {
    public static void main(String[] args) {
        int counter = 0;

        Prompter prompter = new Prompter();
        Jar jar = new Jar();

        prompter.setName(jar);
        prompter.setMax_num(jar);
        prompter.setRandom_num(jar);

        System.out.printf("How many %ss are in the jar? Pick a number between 1 and %d.%n", jar.getName(), jar.getMax_num());

        while (prompter.getAnsweredNum() != jar.getRandom_num()) {
            prompter.setAnsweredNum(jar);
            counter ++;
        }

        System.out.printf("You got it in %d attempt(s).%n", counter);
    }
}
