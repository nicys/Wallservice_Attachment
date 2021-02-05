object WallService {
    var posts = emptyArray<Post>()
    var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        posts += post.copy(id = posts.size)
        return posts.last()
    }

    fun update(postId: Int): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                val newPost = post.copy(id = post.id, date = post.date)
                posts[index] = newPost
                return true
            }
        }
        return false
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        for ((index, post) in posts.withIndex()) {
            if (post.id == comment.postId) {
                comments += comment.copy(message = comment.message)
                return comments.last()
            }
        }
        throw PostNotFoundException("Поста с таким ID не существует!")
    }
}

class PostNotFoundException(message: String) : RuntimeException()
