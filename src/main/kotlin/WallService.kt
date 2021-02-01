object WallService {
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post.copy(id = posts.size)
        return posts.last()
    }

    fun update(postId: Int): Boolean {
        for((index, post) in posts.withIndex()) {
            if(post.id == postId) {
                val newPost = post.copy(id = post.id, date = post.date)
                posts[index] = newPost
                return true
            }
        }
        return false
    }
}