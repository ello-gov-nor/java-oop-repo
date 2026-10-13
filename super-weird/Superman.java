import java.util.*;

public class Superman {
    enum BehaviorCategory {INTROVERT, EXTROVERT, HEROIC, CAUTIOUS, UNDETERMINED}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide scores 0-100 for these behaviors (integers).\n");
        int sociability = ask(input, "Sociability (0-100): ");
        int riskTaking  = ask(input, "Risk-taking (0-100): ");
        int altruism    = ask(input, "Altruism (0-100): ");
        int curiosity   = ask(input, "Curiosity (0-100): ");

        Map<String,Integer> factors = new LinkedHashMap<>();
        factors.put("sociability", sociability);
        factors.put("riskTaking", riskTaking);
        factors.put("altruism", altruism);
        factors.put("curiosity", curiosity);

        System.out.println("\nBehavior factors: " + factors);
        BehaviorCategory category = categorize(sociability, riskTaking, altruism, curiosity);
        System.out.println("Inferred behavior category: " + category);
    }

    static int ask(Scanner in, String prompt) {
        System.out.print(prompt);
        int v = in.nextInt();
        return Math.max(0, Math.min(100, v));
    }

    static BehaviorCategory categorize(int s, int r, int a, int c) {
        if (a > 70 && r > 60) return BehaviorCategory.HEROIC;
        if (s > 60 && r > 50) return BehaviorCategory.EXTROVERT;
        if (s < 40 && c > 60) return BehaviorCategory.INTROVERT;
        if (r < 30 && a < 50) return BehaviorCategory.CAUTIOUS;
        return BehaviorCategory.UNDETERMINED;
    }
}
