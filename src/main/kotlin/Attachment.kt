//sealed class Attachment {
//    val types: String
//        get() = when(this) {
//            is Photo -> "Photo attachment"
//            is Audio -> "Audio attachment"
//            is Video -> "Video attachment"
//            is Document -> "Document attachment"
//            is Graffiti -> "Graffiti attachment"
//        }
//
//    class Photo(val id: Int,
//                val ownId: Int,
//                val urlPreview: String,
//                val urlFullSize: String) : Attachment()
//    class Audio(val id: Int,
//                val ownId: Int,
//                val artist: String,
//                val title: String,
//                val duration: Int,
//                val urlMp3: String) : Attachment()
//    class Video(val id: Int,
//                val ownId: Int,
//                val title: String,
//                val description: String,
//                val duration: Int) : Attachment()
//    class Document(val id: Int,
//                val ownId: Int,
//                val title: String,
//                val size: Int,
//                val ext: Int,
//                val date: Int,
//                val type: Int) : Attachment()
//    class Graffiti(val id: Int,
//                val ownId: Int,
//                val urlPreview: String,
//                val urlFullSize: String) : Attachment()
//
//    override fun toString(): String {
//        return "Формат вложения: $types"
//    }
//}
//
//class AttachmentType(var type: Attachment)
