class CreateComment(
        val ownerId: Int,
        val postId: Int,
        val fromGroup: Int = 0,
        val message: String?,
        val replyToComment: Int?,
        var attachmentOfComment: Array<InterfaceAttachComment?>,
        var stickerId: Int,
        val guid: String
)