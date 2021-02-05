interface InterfaceAttachComment {
    val type: String
}

class PhotoAttachComment(val photo: PhotoComment) : InterfaceAttachComment {
    override val type = "photo"
    override fun toString(): String {
        return "$type $photo"
    }
}

class PhotoComment(val ownerId: Int, val mediaId: Int) {
    override fun toString(): String {
        return "$ownerId _ $mediaId"
    }
}

class AudioAttachComment(val audio: AudioComment) : InterfaceAttachComment {
    override val type = "audio"
    override fun toString(): String {
        return "$type $audio"
    }
}

class AudioComment(val ownerId: Int, val mediaId: Int) {
    override fun toString(): String {
        return "$ownerId _ $mediaId"
    }
}

class VideoAttachComment(val video: VideoComment) : InterfaceAttachComment {
    override val type = "video"
    override fun toString(): String {
        return "$type $video"
    }
}

class VideoComment(val ownerId: Int, val mediaId: Int) {
    override fun toString(): String {
        return "$ownerId _ $mediaId"
    }
}

class DocumentAttachComment(val document: DocumentComment) : InterfaceAttachComment {
    override val type = "document"
    override fun toString(): String {
        return "$type $document"
    }
}

class DocumentComment(val ownerId: Int, val mediaId: Int) {
    override fun toString(): String {
        return "$ownerId _ $mediaId"
    }
}