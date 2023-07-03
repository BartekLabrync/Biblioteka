//package com.example.biblioteka.security;
//
//import com.example.biblioteka.repository.UserRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//@AllArgsConstructor
//public class LibraryUserDetailsService implements UserDetailsService {
//    private final UserRepository userRepository;
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return userRepository
//                .findByUsernameIgnoreCase(username)
//                .map(UserEntityDetails::new)
//                .orElseThrow(() -> new UsernameNotFoundException(username));
//
//    }
//}
