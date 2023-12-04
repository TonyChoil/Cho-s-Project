package com.teamtwo.nullfunding.admin.service;

import com.teamtwo.nullfunding.admin.model.dao.AdminMemberMapper;
import com.teamtwo.nullfunding.admin.model.dto.AdminInquiry;
import com.teamtwo.nullfunding.common.paging.SelectCriteria;
import com.teamtwo.nullfunding.member.dto.MemberDTO;
import com.teamtwo.nullfunding.project.model.dto.ProjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdminMemberServiceImpl implements AdminMemberService {

    private AdminMemberMapper mapper;

    @Autowired
    public AdminMemberServiceImpl(AdminMemberMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<ProjectDTO> selectAllProject() {

        List<ProjectDTO> adminProjectList = mapper.selectAllProject();

        return adminProjectList;
    }

    @Override
    public int confirmProject(int projectNo, int decision) {

        int result = mapper.confirmProject(projectNo, decision);

        return 0;
    }


}
