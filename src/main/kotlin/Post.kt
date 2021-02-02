import org.jetbrains.annotations.Nullable

data class Post(
        @Nullable
    var id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val postType: String,
    val signerId: Int?,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedIid: Int?,
    val comments: Comments,
    val copyright: Copyright?,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val donut: Donut,
    val postSource: PostSource?,
    var geo: Geo?,
    var copyHistory: Array<Any?>,
    var attachment: Array<InterfaceAttach?>
)

class Comments(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)

class Copyright(
    val id: Int,
    val link: String,
    val name: String,
    val type: String
)

class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
)

class Reposts(
    val count: Int,
    val userReposted: Boolean
)

class Views(
    val count: Int
)

class Donut(
    val isDonut: Boolean,
    val paidDuration: Int,
    val placeholder: Placeholder,
    val canPublishFreeCopy: Boolean,
    val editMode: String
)

class Placeholder(
    val placeholder: Boolean
)

class PostSource(
    val type: String,
    val platform: String,
    val data: String,
    val url: String
)

class Geo(
    val type: String,
    var coordinates: String,
    val place: Place
)

class Place(
    val id: Int,
    val title: String,
    val latitude: Int,
    val longitude: Int,
    val created: Int,
    val icon: String,
    val checkins: Int,
    val updated: Int,
    val type: Int,
    val country: Int,
    val city: Int,
    val address: String
)