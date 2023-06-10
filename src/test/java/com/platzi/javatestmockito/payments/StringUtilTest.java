package com.platzi.javatestmockito.payments;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {
    @Test
    public void test_string_is_not_empty(){
        assertFalse(StringUtil.isEmpaty("Juan"));
    }

    @Test
    public void empaty_goute_is_string_empty(){
        assertTrue(StringUtil.isEmpaty(""));
    }

    @Test
    public void null_is_string_empty(){
        assertTrue(StringUtil.isEmpaty(null));
    }

    @Test
    public void string_spaces_is_string_empty(){
        assertTrue(StringUtil.isEmpaty(" "));
    }

}