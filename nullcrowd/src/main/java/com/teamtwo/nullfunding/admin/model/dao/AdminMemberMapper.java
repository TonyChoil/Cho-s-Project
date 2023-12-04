package com.teamtwo.nullfunding.admin.model.dao;

import com.teamtwo.nullfunding.admin.model.dto.AdminInquiry;
import com.teamtwo.nullfunding.common.paging.SelectCriteria;
import com.teamtwo.nullfunding.member.dto.MemberDTO;
import com.teamtwo.nullfunding.project.model.dto.ProjectDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdminMemberMapper {

    List<ProjectDTO> selectAllProject();
    
    int confirmProject(int projectNo, int decision);
}
