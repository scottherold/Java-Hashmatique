import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        // Create a HashMap for track list
        HashMap<String, String> trackList = new HashMap<String, String>();

        // Add songs to the trackList
        trackList.put(
            "Smokin' In the Boy's Room", 
            "How you doin' out there? Ya ever seem to have one of those days where it just seems like everybody's gettin' on your case..."
            );
        trackList.put(
            "Beast and the Harlot",
            "This shining city built of gold, a far cry from innocence, there's more than meets the eye round here look to the waters of the deep, a city of evil..."
        );
        trackList.put(
            "Enter Sandman",
            "Say your prayers little one, don't forget my son, to include everyone..."
        );
        trackList.put(
            "Welcome to the Jungle",
            "Welcome to the jungle, we've got fun and games, we got everything you want honey, we know the names..."
        );

        // Extract one song by the title
        String song = trackList.get("Beast and the Harlot");
        // Logs lyrics
        System.out.println(song);

        // Create Key set to iterate
        Set<String> keys = trackList.keySet();

        // Iterate Key / Value pair
        for (String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}