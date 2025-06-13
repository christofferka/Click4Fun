import java.util.Random;

public class Jokes {
    private static String[] questions = {
            "Why don't scientists trust atoms?",
            "Why did the scarecrow win an award?",
            "Why don't programmers like nature?",
            "Why do bicycles fall over?",
            "What do you call fake spaghetti?",
            "Why did the math book look sad?",
            "Why was the computer cold?",
            "Why did the coffee file a police report?",
            "What do you call cheese that isn't yours?",
            "Why can't your nose be 12 inches long?",
            "What did one ocean say to the other ocean?",
            "Why did the tomato turn red?",
            "What do you call a bear with no teeth?",
            "Why did the golfer bring two pairs of pants?",
            "How does a penguin build its house?",
            "Why did the cookie go to the hospital?",
            "What do you get when you cross a snowman and a vampire?",
            "Why did the skeleton go to the party alone?",
            "What do you call a sleeping bull?",
            "Why did the bicycle fall over?"
    };

    private static String[] answers = {
            "Because they make up everything!",
            "Because he was outstanding in his field!",
            "It has too many bugs.",
            "Because they are two-tired!",
            "An impasta!",
            "Because it had too many problems.",
            "It forgot to close its Windows.",
            "It got mugged.",
            "Nacho cheese!",
            "Because then it would be a foot.",
            "Nothing, they just waved.",
            "Because it saw the salad dressing!",
            "A gummy bear.",
            "In case he got a hole in one.",
            "Igloos it together.",
            "Because he felt crummy.",
            "Frostbite.",
            "Because he had no body to go with him.",
            "A bulldozer.",
            "Because it was two-tired!"
    };
    private static int lastIndex = -1; // Keeps track of the last shown joke

    public static String getRandomJokeQuestion() {
        Random random = new Random();
        lastIndex = random.nextInt(questions.length);
        return questions[lastIndex];
    }

    public static String getJokeAnswer() {
        if (lastIndex == -1) {
            return "No joke has been selected yet!";
        }
        return answers[lastIndex];
    }
}
