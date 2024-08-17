package org.classreviewsite.auth.service;

import org.classreviewsite.user.data.User;
import org.classreviewsite.user.infrastructure.UserDataRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * BadCredentialException : 자격 증명이 없습니다. -> username을 확인해야되는데 email을 확인하는 오류
 * 코드는 끝까지 따라쳐라
 * 메서드 파헤치다가 안보이면 소스 다운받기 누르면 설명도 추가됨
 * 에러 해결 : https://yoonsys.tistory.com/33
 */

@Component("userDetailService")
public class CustomUserDetailsService implements UserDetailsService {

    private final UserDataRepository userRepository;


    public CustomUserDetailsService(UserDataRepository userRepository) {
        this.userRepository = userRepository;
    }

    // username으로 검사 변경 메소드
    @Override
    @Transactional
    public UserDetails loadUserByUsername(final String username){
        return userRepository.findOneWithAuthoritiesByUserNumber(Integer.parseInt(username))
                .map(user -> createUser(username, user))
                .orElseThrow(() -> new UsernameNotFoundException(username + " -> 데이터베이스에서 찾을 수 없습니다."));
    }

    // user 객체 생성 메소드
    private org.springframework.security.core.userdetails.User createUser(String username, User user){

        List<GrantedAuthority> grantedAuthorities = user.getAuthorities().stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getAuthority()))
                .collect(Collectors.toList());
        return new org.springframework.security.core.userdetails.User(String.valueOf(user.getUserNumber()),
                user.getPassword(),
                grantedAuthorities);
    }
}
