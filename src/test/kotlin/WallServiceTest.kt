import WallService.add
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
                false, "text"))

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
                false, "text"))
//        post.id = 1
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
                false, "text"))
        post.id = 1
        //Act
        val expectedResult: Boolean = update(
            postId = 2
        )
        //Assert
        assertFalse(expectedResult)
    }
}