fun main(args: Array<String>) {

    val photo: InterfaceAttach = Photo(1, 1, "urlPreview", "urlFullSize")
    val audio: InterfaceAttach = Audio(1, 1, "artist", "title", 100, "urlMp3")

    println(photo)
    println("**********************")
    var attachments = arrayOf(photo, audio)
    println(attachments.contentToString())

}