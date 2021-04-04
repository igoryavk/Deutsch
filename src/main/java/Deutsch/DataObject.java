package Deutsch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DataObject {
    private DictionaryInterface dictionary;
    @Autowired
    public void setDictionary(DictionaryInterface dictionary) {
        this.dictionary = dictionary;
    }
    public void saveWord(DeutschWort wort)
    {
        dictionary.save(wort);
    }
}
