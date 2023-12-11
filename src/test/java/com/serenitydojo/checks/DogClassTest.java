package com.serenitydojo.checks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DogClassTest {
    @Test
    public void theDogClassShouldExist() throws ClassNotFoundException {
        assertThat(Class.forName("com.serenitydojo.WhenCreatingDog")).isNotNull();
    }

    @Test
    public void theDogClassShouldHaveAName() throws Exception {
        assertThat(Class.forName("com.serenitydojo.WhenCreatingDog").getDeclaredField("name").getGenericType()).isEqualTo(String.class);
    }

    @Test
    public void theDogClassShouldHaveAFavoriteToy() throws Exception {
        assertThat(Class.forName("com.serenitydojo.WhenCreatingDog").getDeclaredField("favoriteToy").getGenericType()).isEqualTo(String.class);
    }

    @Test
    public void theDogClassShouldHaveAnAge() throws Exception {
        assertThat(Class.forName("com.serenitydojo.WhenCreatingDog").getDeclaredField("age").getGenericType()).isEqualTo(int.class);
    }
}
