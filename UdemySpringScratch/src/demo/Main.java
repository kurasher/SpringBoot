package demo;

import entity.Member;
import service.CalcService;
import service.CalcServiceImpl;
import service.MemberService;
import service.MemberServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//        MemberServiceImpl service = new MemberServiceImpl();
        MemberServiceImpl service = MemberServiceImpl.getInstance();
        
//        implクラスがまだ実装されていなくても一旦試してみたい場合↓
//        MemberService service = MemberServiceImpl.getInstance();

        System.out.println(service.greet(2));

        ArrayList<Member> list = service.getAll();
        for(Member member : list){
            System.out.println(member.getId() + ", " + member.getName() + ", " + member.getEmail());
        }

        CalcServiceImpl object = new CalcServiceImpl();
        int ans = object.sumOf(1, 10);
        System.out.println("ans = " + ans);
    }

}
