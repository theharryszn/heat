package com.harry.heat.controllers

import com.harry.heat.models.Post
import com.harry.heat.repositories.PostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody

data class PostInput(val content: String)

@Controller
class App {

    @Autowired
    private val repository: PostRepository? = null

    @GetMapping("/")
    fun entry(model: Model): String {
        val posts: List<Post>? = repository?.findAll()

        model.addAttribute("posts", posts)

        return "index"
    }

    @GetMapping("/addPost")
    fun addPostGet(): String {
        return "addPost"
    }

    @PostMapping("/becomeAuthor")
    fun becomeAuthor() {

    }

    @PostMapping("/addPost")
    @ResponseBody
    fun addPostPost(): String {
        val newPost = Post("Lorem", "1")
        repository?.insert(newPost)

        return "Added"
    }
}