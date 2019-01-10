package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    // tutaj sa pola pola sa prywatne bo chodzi o dostep do klasy tak ?
    private Long id;
    private String quote;

    public Value() {
    }
// ustawienie gettera oraz settera - racja ?
    public Long getId() {
        return this.id;
    }

    public String getQuote(){
        return this.quote;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;

    }
// co my tutaj nadpisujemy metode toString czyli ma ona inne działanie niz pierwotna metoda ale dlaczego?
    @Override

    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }


}
