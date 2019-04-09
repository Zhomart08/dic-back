package com.example.demo.dictionary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DictionaryController {

    @GetMapping("/words")
    public List<Word> getUsers() {
        return null;
    }


}
