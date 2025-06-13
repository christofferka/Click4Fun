import java.util.Random;

public class Riddles {
    private static String[] questions = {
            "What has keys but can't open locks?",
            "What has a heart that doesn’t beat?",
            "What comes once in a minute, twice in a moment, but never in a thousand years?",
            "What can travel around the world while staying in the same spot?",
            "What has to be broken before you can use it?",
            "I speak without a mouth and hear without ears. What am I?",
            "The more of this there is, the less you see. What is it?",
            "What has one eye but can’t see?",
            "I’m tall when I’m young, and I’m short when I’m old. What am I?",
            "What has hands but can’t clap?",
            "What gets wetter the more it dries?",
            "What has many teeth but can’t bite?",
            "I shave every day, but my beard stays the same. What am I?",
            "What begins with T, ends with T, and has T in it?",
            "What can you catch but not throw?",
            "What has legs but doesn’t walk?",
            "What has a neck but no head?",
            "What goes up but never comes down?",
            "What has a head and a tail but no body?",
            "I’m full of holes but still holds water. What am I?"
    };

    private static String[] answers = {
            "A piano.",
            "An artichoke.",
            "The letter 'M'.",
            "A stamp.",
            "An egg.",
            "An echo.",
            "Darkness.",
            "A needle.",
            "A candle.",
            "A clock.",
            "A towel.",
            "A comb.",
            "A barber.",
            "A teapot.",
            "A cold.",
            "A table.",
            "A bottle.",
            "Your age.",
            "A coin.",
            "A sponge."
    };
    private static int lastIndex = -1;

    public static String getRandomRiddleQuestion() {
        Random random = new Random();
        lastIndex = random.nextInt(questions.length);
        return questions[lastIndex];
    }

    public static String getRiddleAnswer() {
        if (lastIndex == -1) {
            return "No riddle has been selected yet!";
        }
        return answers[lastIndex];
    }
}
