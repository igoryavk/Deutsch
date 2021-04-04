package Deutsch;

import org.springframework.stereotype.Service;

import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.Random;

@Service
public class WordGenerator {
    private List<DeutschWort> words;
    private String russischWord;
    private String deutschWord;
    public void setWords(List<DeutschWort> words) {
        this.words = words;
    }
    public void generate()
    {
        Random random=new Random();
        DeutschWort word=words.get(random.nextInt(words.size()));
        russischWord=word.getRussisch_text();
        deutschWord=word.getDeutsch_text();
    }
    public String  getRussisch()
    {
        return russischWord;
    }
    public String getDeutschWord(){
        return deutschWord;
    }
}
