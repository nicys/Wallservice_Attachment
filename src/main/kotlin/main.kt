fun main(args: Array<String>) {

    val attach = AttachmentType(Attachment.Video(12, 20, "title", "description", 150))
    println(attach.type)

}