package com.usa.misiontic.reto5.repository.crudRepository;

import com.usa.misiontic.reto5.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
}
