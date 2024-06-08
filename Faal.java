import com.fasterxml.jackson.annotation.JsonProperty;

public class Faal {
    @JsonProperty("Poem")
    private String Poem;

    @JsonProperty("Interpretation")
    private String Interpretation;


    public String getPoem() {
        return Poem;
    }

    public void setPoem(String poem) {
        this.Poem = poem;
    }

    public String getInterpretation() {
        return Interpretation;
    }

    public void setInterpretation(String interpretation) {
        this.Interpretation = interpretation;
    }
}
