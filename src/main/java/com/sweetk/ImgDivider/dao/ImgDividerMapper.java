package com.sweetk.ImgDivider.dao;

import com.sweetk.ImgDivider.domain.ImgDividerDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ImgDividerMapper {

    @Select("SELECT * FROM img")
    public List<ImgDividerDomain> findAll();

    @Select("SELECT * FROM img WHERE person_nm=#{person_nm}")
    public List<ImgDividerDomain> findByPerson_nm(@Param("person_nm") String person_nm);

    @Select("SELECT * FROM img WHERE img_no = #{img_no}")
    public ImgDividerDomain findByImg_no(@Param("img_no") int img_no);

    @Update("UPDATE img SET is_use=#{is_use} where img_no=#{img_no}")
    public void updateImg_no(ImgDividerDomain domain);
}
