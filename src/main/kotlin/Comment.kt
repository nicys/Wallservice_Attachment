class Comment(
        var id: Int,
        val fromId: Int,
        val date: Int,
        val text: String,
        val replyToUser: Int?,
        val replyToComment: Int?,
        var attachmentOfComment: Array<InterfaceAttach?>,
        var parentsStack: Array<Any>,
        val donut: DonutOfComment,
        val thread: Thread
)

class DonutOfComment(
        val isDon: Boolean,
        val placeholder: String
)

class Thread(
        val count: Int,
        var items: Array<Any>,
        val canPost: Boolean,
        val showReplyButton: Boolean,
        val groupsCanPost: Boolean
)