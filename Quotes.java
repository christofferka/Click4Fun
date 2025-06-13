import java.util.Random;

public class Quotes {
    private static String[] quotes = {
            // Array containing a collection of interesting quotes.
            "“Be yourself; everyone else is already taken.” – Oscar Wilde",
            "“In the middle of every difficulty lies opportunity.” – Albert Einstein",
            "“Don’t count the days, make the days count.” – Muhammad Ali",
            "“Success is not final, failure is not fatal: it is the courage to continue that counts.” – Winston Churchill",
            "“The only way to do great work is to love what you do.” – Steve Jobs",
            "“The best among you are those who have the best manners and character.” – Prophet Muhammad",
            "“Whether you think you can, or you think you can’t – you’re right.” – Henry Ford",
            "“Do what you can, with what you have, where you are.” – Theodore Roosevelt",
            "“The best way to predict the future is to invent it.” – Alan Kay",
            "“You miss 100% of the shots you don’t take.” – Wayne Gretzky",
            "“Simplicity is the ultimate sophistication.” – Leonardo da Vinci",
            "“Strive not to be a success, but rather to be of value.” – Albert Einstein",
            "“Act as if what you do makes a difference. It does.” – William James",
            "“Happiness is not something ready-made. It comes from your own actions.” – Dalai Lama",
            "“Life is what happens when you're busy making other plans.” – John Lennon",
            "“If you’re going through hell, keep going.” – Winston Churchill",
            "“The strong is not the one who overcomes people by strength, but the one who controls himself while in anger.” – Prophet Muhammad",
            "“The future belongs to those who prepare for it today.” – Malcolm X",
            "“Believe you can and you’re halfway there.” – Theodore Roosevelt",
            "“What lies behind us and what lies before us are tiny matters compared to what lies within us.” – Ralph Waldo Emerson",
            "“Imagination is more important than knowledge.” – Albert Einstein", "“He who does not show mercy to others will not be shown mercy.” – Prophet Muhammad",
            "“Taking pains to remove the pains of others is the true essence of generosity.” – Abu Bakr as-Siddiq"
    };
    /**
     * Selects and returns a random quote from the jokes array.
     *
     * @return a randomly chosen quote as a String
     */
    public static String getRandomQuote() {
        Random random = new Random();
        int index = random.nextInt(quotes.length);
        return quotes[index];
    }
}
