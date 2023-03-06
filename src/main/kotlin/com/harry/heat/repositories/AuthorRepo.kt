package com.harry.heat.repositories

import com.harry.heat.models.Author
import org.springframework.data.mongodb.repository.MongoRepository

interface AuthorRepo: MongoRepository<Author, String> {

}