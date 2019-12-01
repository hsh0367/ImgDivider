package com.sweetk.ImgDivider.service;

import com.sweetk.ImgDivider.domain.ImgDividerDomain;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ImgDividerService {
    public List<ImgDividerDomain> findAll();
    public List<ImgDividerDomain> findByPerson_nm(String person_nm);
    public ImgDividerDomain findByImg_no(int img_no);
    public void updateImg_no(ImgDividerDomain ImgDividerDomain);
}
