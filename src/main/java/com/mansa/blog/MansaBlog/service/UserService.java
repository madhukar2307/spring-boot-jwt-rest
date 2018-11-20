package com.mansa.blog.MansaBlog.service;

import com.mansa.blog.MansaBlog.models.User;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    public String signin(String s1, String s2);
    public String signup(User user);
    public void delete(String username);
    public User whoami(HttpServletRequest req);
    public User search(String username);

}
