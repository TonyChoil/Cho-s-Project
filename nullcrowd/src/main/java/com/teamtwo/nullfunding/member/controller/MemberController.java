package com.teamtwo.nullfunding.member.controller;

import com.teamtwo.nullfunding.member.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/member")
public class MemberController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final PasswordEncoder passwordEncoder;
    private MemberService memberService;
    private EmailController emailController;
    private int nickResult;

    public MemberController(PasswordEncoder passwordEncoder, MemberService memberService, EmailController emailController) {
        this.passwordEncoder = passwordEncoder;
        this.memberService = memberService;
        this.emailController = emailController;
    }

    @GetMapping("/login")
    public String goLogIn(){
        return "content/member/login";
    }

    @GetMapping("myPage")
    public String goMyPage(){

        return "content/member/myPage";
    }


}

