package zlogger.integration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import zlogger.logic.dal.PostDao;
import zlogger.logic.models.Post;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:testApplicationContext.xml"})
public class PostDaoTest {

    @Autowired
    private PostDao postDao;

    @Test
    @Transactional
    public void shouldGetPosts() throws Exception {
        List<Post> posts = postDao.getPosts();
        Assert.assertNotNull(posts);
        Assert.assertFalse(posts.isEmpty());
    }
}