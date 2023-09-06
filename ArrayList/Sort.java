package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(5);
        ans.add(4);
        ans.add(3);
        ans.add(2);
        ans.add(1);

        Collections.sort(ans);
        System.out.println(ans);

        Collections.sort( ans , Collections.reverseOrder());
        System.out.println(ans);
    }
}
