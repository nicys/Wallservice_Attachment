interface InterfaceAttach {
    val type: String
}

class PhotoAttach(val photo: Photo) : InterfaceAttach {
    override val type = "photo"
    override fun toString(): String {
        return "\nТип вложения: $type \n$photo"
    }
}

class Photo(val id: Int,
            val ownId: Int,
            val urlPreview: String,
            val urlFullSize: String) {
    override fun toString(): String {
        return """|   id: $id
            |   ownId: $ownId
            |   urlPreview: $urlPreview
            |   urlFullSize: $urlFullSize""".trimMargin()
    }
}

class AudioAttach(val audio: Audio) : InterfaceAttach {
    override val type = "audio"
    override fun toString(): String {
        return "\nТип вложения: $type \n$audio"
    }
}

class Audio(val id: Int,
            val ownId: Int,
            val artist: String,
            val title: String,
            val duration: Int,
            val urlMp3: String) {

    override fun toString(): String {
        return """|   id: $id
            |   ownId: $ownId
            |   artist: $artist
            |   title: $title
            |   duration: $duration
            |   urlMp3: $urlMp3""".trimMargin()
    }
}

class VideoAttach(val video: Video) : InterfaceAttach {
    override val type = "video"
    override fun toString(): String {
        return "\nТип вложения: $type \n$video"
    }
}

class Video(val id: Int,
            val ownId: Int,
            val title: String,
            val description: String,
            val duration: Int) {

    override fun toString(): String {
        return """|   id: $id
            |   ownId: $ownId
            |   title: $title
            |   description: $description
            |   duration: $duration""".trimMargin()
    }
}

class DocumentAttach(val document: Document) : InterfaceAttach {
    override val type = "document"
    override fun toString(): String {
        return "\nТип вложения: $type \n$document"
    }
}

class Document(val id: Int,
            val ownId: Int,
            val title: String,
            val size: Int,
            val ext: Int,
            val date: Int,
            val types: Int) {

    override fun toString(): String {
        return """|   id: $id
            |   ownId: $ownId
            |   title: $title
            |   size: $size
            |   ext: $ext
            |   date: $date
            |   types: $types""".trimMargin()
    }
}

class GraffitiAttach(val graffiti: Graffiti) : InterfaceAttach {
    override val type = "graffiti"
    override fun toString(): String {
        return "\nТип вложения: $type \n$graffiti"
    }
}

class Graffiti(val id: Int,
             val ownId: Int,
             val urlPreview: String,
             val urlFullSize: String) {

    override fun toString(): String {
        return """|   id: $id
            |   ownId: $ownId
            |   urlPreview: $urlPreview
            |   urlFullSize: $urlFullSize""".trimMargin()
    }
}