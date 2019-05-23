package es.vuejsazure.workshop.demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.vuejsazure.workshop.demo.entities.Todo;

@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
interface TodosRepository extends CrudRepository<Todo, Long> {
}