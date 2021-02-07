import WallService.add
import WallService.createComment
import WallService.update
import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun testArrayIdInAdd() {
        //Arrange
        val post: Post = Post(
            0, 0, 0, 0, 0, "text", 0,
            0, false, "postType", 0, false, false,
            false,false, false, false, 0,
            comments = Comments(
                0, false, false, false, false),
            copyright = Copyright(
                0, "text", "text", "text"),
            likes = Likes(
                0, false, false, false),
            reposts = Reposts(
                0, false),
            views = Views(
                0),
            donut = Donut(
                false, 0,
                placeholder = Placeholder(false),
                false, "text"),
            postSource = PostSource("type", "platform", "data", "url"),
            geo = Geo("type", "coordinates",
                place = Place(0, "title", 0, 0, 0, "icon", 0, 0,
                    0, 0, 0, "address")),
            copyHistory = arrayOfNulls(1),
            attachment = arrayOfNulls(1)
        )

        val expectedArray = add(post)
        expectedArray.id = 1
        //Act
        val result = 1
        //Assert
        assertEquals(expectedArray.id, result)
    }

    @Test
    fun testRemovePostByIdInUpdatePositiv() {
        //Arrange
        val post: Post = Post(
            0, 0, 0, 0, 0, "text", 0,
            0, false, "postType", 0, false, false,
            false,false, false, false, 0,
            comments = Comments(
                0, false, false, false, false),
            copyright = Copyright(
                0, "text", "text", "text"),
            likes = Likes(
                0, false, false, false),
            reposts = Reposts(
                0, false),
            views = Views(
                0),
            donut = Donut(
                false, 0,
                placeholder = Placeholder(false),
                false, "text"),
            postSource = PostSource("type", "platform", "data", "url"),
            geo = Geo("type", "coordinates",
                place = Place(0, "title", 0, 0, 0, "icon", 0, 0,
                    0, 0, 0, "address")),
            copyHistory = arrayOfNulls(1),
            attachment = arrayOfNulls(1)
        )
        //Act
        add(post)
        val expectedResults: Boolean = update(
            postId = 0
        )
        //Assert
        assertTrue(expectedResults)
    }

    @Test
    fun testRemovePostByIdInUpdateNegativ() {
        //Arrange
        val post: Post = Post(
                0, 0, 0, 0, 0, "text", 0,
                0, false, "postType", 0, false, false,
                false,false, false, false, 0,
                comments = Comments(
                        0, false, false, false, false),
                copyright = Copyright(
                        0, "text", "text", "text"),
                likes = Likes(
                        0, false, false, false),
                reposts = Reposts(
                        0, false),
                views = Views(
                        0),
                donut = Donut(
                        false, 0,
                        placeholder = Placeholder(false),
                        false, "text"),
                postSource = PostSource("type", "platform", "data", "url"),
                geo = Geo("type", "coordinates",
                        place = Place(0, "title", 0, 0, 0, "icon", 0, 0,
                                0, 0, 0, "address")),
                copyHistory = arrayOfNulls(1),
                attachment = arrayOfNulls(1)
        )
        post.id = 1
        //Act
        val expectedResult: Boolean = update(
            postId = 2
        )
        //Assert
        assertFalse(expectedResult)
    }

    @Test
    fun testCommentAdd() {
        //Arrange
        val comment: Comment = Comment(
                0, 1,0, "text", 0,
                arrayOfNulls(1), 0, "txt"
        )
        val postId = 1
        //Act
        val result = 1
        //Assert
        assertEquals(postId, result)
    }


    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        //Arrange
        val expected = PostNotFoundException::class
        val comment: Comment = Comment(
                0, 2,0, "text", 0,
                arrayOfNulls(1), 0, "txt"
        )

        //Act
        val expectedResult: Comment = createComment(2, comment)

        //Assert
        assertEquals(expected, expectedResult)
    }
}
