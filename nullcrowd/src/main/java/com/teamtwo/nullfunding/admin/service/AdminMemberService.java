package com.teamtwo.nullfunding.admin.service;

import com.teamtwo.nullfunding.admin.model.dto.AdminInquiry;
import com.teamtwo.nullfunding.common.paging.SelectCriteria;
import com.teamtwo.nullfunding.member.dto.MemberDTO;
import org.springframework.stereotype.Service;
import com.teamtwo.nullfunding.project.model.dto.ProjectDTO;

import java.util.List;
import java.util.Map;

@Service
public interface AdminMemberService {

    List<ProjectDTO> selectAllProject();

    int confirmProject(int projectNo, int decision);
}
