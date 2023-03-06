package com.harry.heat.models

import org.springframework.data.annotation.Id
import java.util.Date

class Post {
    @Id
    var id: String? = null
    var content: String? = null
    var authorId: String? = null
    var dateAdded: Date? = null

    constructor()
    constructor(content: String?, authorId: String?) {
        this.content = content
        this.authorId = authorId
    }

    override fun toString(): String {
        return String.format(
            "Post[id=%s, content='%s', authorId='%s', dateAdded='%s']",
            id, content, authorId, dateAdded
        )
    }
}