package com.harry.heat.repositories

import com.harry.heat.models.Post
import org.springframework.data.mongodb.repository.MongoRepository

interface PostRepository: MongoRepository<Post, String>