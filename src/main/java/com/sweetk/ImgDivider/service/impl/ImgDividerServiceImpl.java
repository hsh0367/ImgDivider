package com.sweetk.ImgDivider.service.impl;

import com.sweetk.ImgDivider.domain.ImgDividerDomain;
import com.sweetk.ImgDivider.dao.ImgDividerMapper;
import com.sweetk.ImgDivider.service.ImgDividerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ImgDividerServiceImpl implements ImgDividerService {


    @Autowired
    ImgDividerMapper imgDividerMapper;

    @Override
    public List<ImgDividerDomain> findAll() {
        return imgDividerMapper.findAll();
    }

    @Override
    public List<ImgDividerDomain> findByPerson_nm(String person_nm) {
        return imgDividerMapper.findByPerson_nm(person_nm);
    }

    @Override
    public List<ImgDividerDomain> findPerson_nm() {
        return imgDividerMapper.findPerson_nm();
    }

    @Override
    public ImgDividerDomain findByImg_no(int img_no) {
        return imgDividerMapper.findByImg_no(img_no);
    }

    @Override
    public void updateImg_no(ImgDividerDomain ImgDividerDomain) {
        imgDividerMapper.updateImg_no(ImgDividerDomain);
    }


}