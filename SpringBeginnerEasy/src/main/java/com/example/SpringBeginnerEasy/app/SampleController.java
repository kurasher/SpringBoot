package com.example.SpringBeginnerEasy.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/sample")
public class SampleController {
    //h2に接続できないエラーはjdbcTemplateをimportすることで解消
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SampleController(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/test")
    public String test(Model model){
        String sql = "SELECT id, name, email "
                + "FROM inquiry WHERE id = 1";
        Map<String, Object> map = jdbcTemplate.queryForMap(sql);

        model.addAttribute("title", "Spring SAMPLE!");
        model.addAttribute("body", "Spring SAMPLE! BODY!");

        model.addAttribute("title", map.get("Inquiry Form"));
        model.addAttribute("name", map.get("name"));
        model.addAttribute("email", map.get("email"));
        model.addAttribute("contents", map.get("contents"));
        model.addAttribute("created", map.get("created"));

        return "test";
    }

}
