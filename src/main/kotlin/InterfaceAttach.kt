interface InterfaceAttach {
    val type: String
}

class Photo(val id: Int,
            val ownId: Int,
            val urlPreview: String,
            val urlFullSize: String) : InterfaceAttach {

    override val type = "photo"
    override fun toString(): String {
        return """|
            |Формат вложения: $type 
            |   id: $id
            |   ownId: $ownId
            |   urlPreview: $urlPreview
            |   urlFullSize: $urlFullSize""".trimMargin()
    }
}

class Audio(val id: Int,
            val ownId: Int,
            val artist: String,
            val title: String,
            val duration: Int,
            val urlMp3: String) : InterfaceAttach {

    override val type = "audio"
    override fun toString(): String {
        return """|
            |Формат вложения: $type 
            |   id: $id
            |   ownId: $ownId
            |   artist: $artist
            |   title: $title
            |   duration: $duration
            |   urlMp3: $urlMp3""".trimMargin()
    }
}

class Video(val id: Int,
            val ownId: Int,
            val title: String,
            val description: String,
            val duration: Int) : InterfaceAttach {
    override val type = "video"
    override fun toString(): String {
        return """|
            |Формат вложения: $type 
            |   id: $id
            |   ownId: $ownId
            |   title: $title
            |   description: $description
            |   duration: $duration""".trimMargin()
    }
}

class Document(val id: Int,
            val ownId: Int,
            val title: String,
            val size: Int,
            val ext: Int,
            val date: Int,
            val types: Int) : InterfaceAttach {
    override val type = "document"
    override fun toString(): String {
        return """|
            |Формат вложения: $type 
            |   id: $id
            |   ownId: $ownId
            |   title: $title
            |   size: $size
            |   ext: $ext
            |   date: $date
            |   types: $types""".trimMargin()
    }
}

class Graffiti(val id: Int,
             val ownId: Int,
             val urlPreview: String,
             val urlFullSize: String) : InterfaceAttach {
    override val type = "graffiti"
    override fun toString(): String {
        return """|
            |Формат вложения: $type 
            |   id: $id
            |   ownId: $ownId
            |   urlPreview: $urlPreview
            |   urlFullSize: $urlFullSize""".trimMargin()
    }
}