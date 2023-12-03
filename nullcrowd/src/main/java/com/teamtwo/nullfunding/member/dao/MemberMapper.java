package com.teamtwo.nullfunding.member.dao;

import com.teamtwo.nullfunding.member.dto.FundRaiserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    MemberDTO findMemberById(String memEmail);

    int insertFundRaiser(FundRaiserDTO fundRaiserDTO);

}

