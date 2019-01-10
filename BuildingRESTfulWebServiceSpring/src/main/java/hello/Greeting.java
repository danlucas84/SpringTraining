package hello;

/**
 * Created by Dell on 2019-01-09.
 */
public class Greeting {


    private final long id;
    private final String content;

    // konstruktor parametrowy - racja ?
    // this  wskazuje ze chodzi na o pola obiektu racja ? co by sie stalo
    // gdybym sie nie odwolał this.id = id ?

    public Greeting(long id, String content) {

        this.id = id;
        this.content = content;
    }

    // gettery i settery - racja ? ustawiamy je aby miec stan obiektu racja ?
    // co gdybym  stworzym gettery i settery bez return / czy mozna jakos zastapic return ?


    public long getId() {

        return id;
    }

    public String getContent(){

        return content;
    }
}

