package com.peluqueria.lourdes.configurations;

import com.peluqueria.lourdes.models.Cliente;
import com.peluqueria.lourdes.repositories.ClienteRepository;
import com.peluqueria.lourdes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebAuthentication extends GlobalAuthenticationConfigurerAdapter {



    @Autowired
    ClienteService clienteService;



    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(email-> {

            Cliente cliente = clienteService.getClientByEmail(email);
            if (cliente != null) {

                if (cliente.getEmail().contains("@admin")) {
                    return new User(cliente.getEmail(), cliente.getPassword(),
                            AuthorityUtils.createAuthorityList("ADMIN"));
                } else {
                    return new User(cliente.getEmail(), cliente.getPassword(),
                            AuthorityUtils.createAuthorityList("CLIENT"));
                }

            } else {

                throw new UsernameNotFoundException("Unknown user: " + email);

            }

        });

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

}