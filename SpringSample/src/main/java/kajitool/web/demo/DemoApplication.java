package kajitool.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// コマンドプロンプトでの実行方法
//C:\workspace\git\JavaWork\SpringBoot\SpringSample配下
// $ gradlew.bat bootRun

@SpringBootApplication
@RestController
public class DemoApplication {

	@RequestMapping("/")
	String index(){
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
