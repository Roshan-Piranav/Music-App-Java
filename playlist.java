
import java.util.*;

public class playlist {

    static Set<song> pl = new LinkedHashSet<>();

    static {

        song s1 = new song("Vijay", "Master", "2021", "Vaathi Coming", "Dance");
        song s2 = new song("Vijay", "Leo", "2023", "Naa Ready", "Mass");
        song s3 = new song("Vijay", "Beast", "2022", "Arabic Kuthu", "Dance");
        song s4 = new song("Suriya", "Singam", "2010", "Naane Indhiran", "Mass");
        song s5 = new song("Dhanush", "VIP", "2014", "Why This Kolaveri", "Comedy");

        pl.add(s1);
        pl.add(s2);
        pl.add(s3);
        pl.add(s4);
        pl.add(s5);

    }

}
