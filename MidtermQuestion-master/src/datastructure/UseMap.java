package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        List<String> songsofBritney = new ArrayList<>();
        songsofBritney.add("Sometimes");
        songsofBritney.add("Crazy");
        songsofBritney.add("Soda Pop");
        songsofBritney.add("Born to Make You Happy");
        songsofBritney.add("The Beat Goes On");

        List<String> songsoftheSpiceGirls = new ArrayList<>();
        songsoftheSpiceGirls.add("Spice Up Your Life");
        songsoftheSpiceGirls.add("Stop");
        songsoftheSpiceGirls.add("Too Much");
        songsoftheSpiceGirls.add("Viva Forever");
        songsoftheSpiceGirls.add("Wannabe");

        List<String>  songsofNsync = new ArrayList<>();
        songsofNsync.add("Tearin Up My Heart");
        songsofNsync.add("Here We Go");
        songsofNsync.add("I Want You Back");
        songsofNsync.add("I Drive Myself Crazy");
        songsofNsync.add("Music of My Heart");

        Map<String, List<String>> list = new HashMap<>();
        list.put("Britney songs", songsofBritney);
        list.put("Spice Girls songs", songsoftheSpiceGirls);
        list.put("Nsync songs", songsofNsync);

        for (Map.Entry<String, List<String>> entry : list.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
