import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class genrerate_parentheses {

    public List<String> generate(int n) {

        // DP array jisme har index i par i pairs ke parentheses combinations store honge
        List<String>[] sb = new List[n + 1];

        // 0 pairs ke liye sirf empty string "" hoti hai
        sb[0] = Arrays.asList("");

        // 1 pair ke liye sirf "()" hota hai
        sb[1] = Arrays.asList("()");

        // 2 se n tak DP fill karna hai
        for (int i = 2; i <= n; i++) {

            // sb[i] ko initialize kiya jisse hum isme result add kar saken
            sb[i] = new ArrayList<>();

            // inner = parentheses andar wale, outer = parentheses baahar wale
            // Total pairs = i → split hoga inner + outer = i-1
            int inner = i - 1;
            int outer = 0;

            // Jab tak saare possible inner-outer splits check nahi ho jate
            while (inner >= 0 && outer <= i - 1) {

                // sb[inner] = jo parentheses "(" + inner + ")" banega
                for (String in : sb[inner]) {

                    // sb[outer] = jo iske baahar append hoga
                    for (String out : sb[outer]) {

                        // Final string: "(" + inner + ")" + outer
                        // Example: (())()  → "( " + "()" + " )" + "()"
                        StringBuilder sp = new StringBuilder();

                        sp.append("(");   // opening bracket
                        sp.append(in);    // inner part
                        sp.append(")");   // closing bracket
                        sp.append(out);   // outer part

                        // sb[i] me add kar rahe hain i pairs ka result
                        sb[i].add(sp.toString());
                    }
                }

                // Next split:
                // inner-- → andar ke parentheses kam
                // outer++ → baahar ke parentheses badh
                inner--;
                outer++;
            }
        }

        // n pairs ke saare combinations return
        return sb[n];
    }

    public static void main(String[] args) {
        genrerate_parentheses t1 = new genrerate_parentheses();
        System.out.println(t1.generate(2));   // test
    }
}
