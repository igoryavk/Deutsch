package Deutsch;

import org.springframework.data.repository.CrudRepository;

public interface DictionaryInterface extends CrudRepository<DeutschWort,Long> {
}
