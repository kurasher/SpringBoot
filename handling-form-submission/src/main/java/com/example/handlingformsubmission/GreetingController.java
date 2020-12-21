package com.example.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Controllerと@RestControllerの違い
 * @Controllerは、Viewに遷移してHTMLを作成するため、メソッドの戻り値に
 * Viewを指定する
 * @RestControllerは、Viewに遷移せず、メソッドの戻り値が
 * レスポンスのコンテンツになる
 */
@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greetingForm(Model model){
        // ModelはView側に渡すデータを設定するもの
        // addAttribute(第一引数、第二引数)でViewにデータを渡していて、
        // 第二引数にデータを設定して、第一引数の名前でView側でそのデータを
        // 使用することができる。
        model.addAttribute("greeting", new Greeting());
        //戻り値がgreetingなので、greeting.htmlが必要
        return  "greeting";
    }

    //@ModelAttribute
    //メソッドの引数にあるこのアノテーションは指定したクラスにPostで送られてきた
    //値をセットするためのもの
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting){
        //戻り値がresultなので、result.htmlが必要
        return "result";
    }
}
