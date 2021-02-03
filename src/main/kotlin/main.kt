fun main(args: Array<String>) {

    val photo: Photo = Photo()

    val photo_1: Photo = PhotoAttach(1, 1, "1_dfs", "1_we")
    val photo_2: Photo = PhotoAttach(2, 2, "2_dfs", "2_we")

    // Проверка вывода в консоль
    println(photo_1 is InterfaceAttach)
    println(photo_1 is PhotoAttach)


    println("**********************")
    var attachments = arrayOf(photo_1, photo_2)
//    println(attachments.contentToString())
    for(attach in attachments) {
        if(attach is PhotoAttach)
            println(attach)
    }
}