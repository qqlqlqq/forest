package com.rymcu.vertical.service;

import com.rymcu.vertical.core.service.Service;
import com.rymcu.vertical.dto.ArticleDTO;
import com.rymcu.vertical.entity.Article;
import com.rymcu.vertical.web.api.exception.MallApiException;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

public interface ArticleService extends Service<Article> {
    List<ArticleDTO> findArticles(String searchText, String tag);

    Map postArticle(Integer idArticle, String articleTitle, String articleContent, String articleContentHtml, String articleTags, HttpServletRequest request) throws MallApiException, UnsupportedEncodingException;

    ArticleDTO findArticleDTOById(Integer id, int i);

    List<ArticleDTO> findArticlesByTopicName(String name);

    List<ArticleDTO> findArticlesByTagName(String name);

    List<ArticleDTO> findUserArticlesByIdUser(Integer idUser);
}
