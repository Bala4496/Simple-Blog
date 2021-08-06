package ua.bala.blog.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.bala.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
