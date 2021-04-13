package guru.springframework.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryTest {

    Category category;

//    @Before
//    public void setUp(){
//        category = new Category();
//    }

    @Test
    void getId() {
        Long id = 4L;

        category = new Category();
        category.setId(id);
        assertEquals(id, category.getId());
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}