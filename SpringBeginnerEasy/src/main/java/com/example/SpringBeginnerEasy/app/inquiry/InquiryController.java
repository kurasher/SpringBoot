package com.example.SpringBeginnerEasy.app.inquiry;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/inquiry")
public class InquiryController {

    @GetMapping("/form")
    public String form(InquiryForm inquiryForm,
                       Model model,
                       @ModelAttribute("complete") String complete){
        model.addAttribute("title", "Inquiry Form");
        return "inquiry/form";
    }

    @PostMapping("/form")
    public String formGoBack(InquiryForm inquiryForm, Model model){
        model.addAttribute("title", "Inquiry Form");
        return "inquiry/form";
    }

    @PostMapping("/confirm.html")
    public String confirm(@Validated InquiryForm inquiryForm,
                          BindingResult bindingResult,
                          Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("title", "Inquiry Form");
            return "inquiry/form";
        }

        model.addAttribute("title", "Confirm Page");
        return "inquiry/confirm.html";
    }

    @PostMapping("/complete")
    public String complete(@Validated InquiryForm inquiryForm,
                           BindingResult bindingResult,
                           Model model,
                           RedirectAttributes redirectAttributes){

        //　なぜ確認ページ(confirm.html)後にまたValidationが必要か
        //　ブラウザによっては検証によって内容を書き換えることが可能であるため、
        //　それを防ぐ意味でValidationを書いている
        if(bindingResult.hasErrors()){
            model.addAttribute("title", "InquiryForm");
            return "inquiry/form";
        }

        //TODO: DBへの登録処理

        redirectAttributes.addFlashAttribute("complete", "Registered");
        return "redirect:/inquiry/form";

    }
}
