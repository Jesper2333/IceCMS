package com.ttice.icewkment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ttice.icewkment.commin.vo.ArticlePageVO;
import com.ttice.icewkment.entity.Article;
import com.ttice.icewkment.entity.PlanetComment;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2022-02-19
 */
@Repository
public interface PlanetCommentService extends IService<PlanetComment> {

    Integer GetCommentNum(Integer planetId);



}