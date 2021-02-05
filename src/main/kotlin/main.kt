fun main(args: Array<String>) {

    val photo_1: PhotoAttach = PhotoAttach(Photo(1, 1, "1_", "1_"))
    val photo_2: PhotoAttach = PhotoAttach(Photo(2, 2, "2_", "2_"))
    val audio_1 = AudioAttach(Audio(1, 2, "artist", "title", 23, "mp3"))
    val graffiti = GraffitiAttach(Graffiti(3, 7, "rew", "wre"))

    // Проверка вывода в консоль
    println(photo_1 is InterfaceAttach)
    println(photo_2 is PhotoAttach)


    println("**********************")
    var attachments = arrayOf(photo_1, photo_2, audio_1, graffiti)

    for(attach in attachments) {
            println(attach)
    }
}