package com.harry.heat.models

import org.springframework.data.annotation.Id

class Author {
    @Id
    var id: String? = null
    var name: String? = null

    constructor()
    constructor(name: String) {
        this.name = name
    }

    override fun toString(): String {
        return String.format(
            "Author[id=%s, name='%s']",
            id, name
        )
    }

}