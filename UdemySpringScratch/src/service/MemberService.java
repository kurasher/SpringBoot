package service;

import entity.Member;

import java.util.ArrayList;

public interface MemberService {

    public abstract String greet(int i);

    ArrayList<Member> getAll();
}
