package com.atguigu.webrestfulcrud.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class LinkLocaleResolver implements LocaleResolver {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        log.info("resolveLocale.........................");
        String language = httpServletRequest.getParameter("language");
        Locale locale = Locale.getDefault();
        if (!StringUtils.isEmpty(language)) {
            String[] split = language.split("_");
            locale = new Locale(split[0], split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {
        log.info("setLocale.........................");
    }
}
