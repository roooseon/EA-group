package cs544.carrental.security;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;


@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	private AuthenticationSuccessHandler successHandler;
	
	public SecurityConfig() {
		//userService = new SecurityUserServices();
		successHandler=new UrlHandler();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http 
		.csrf()
		.disable()
		.authorizeRequests()
		.antMatchers("/customer/customers","/carlist", "/cardetails","/addcar", "/updatecar").hasRole("ADMIN")
//		.antMatchers("/carlist").hasRole("")
		.antMatchers("/customer/signup").permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.loginPage("/login").successHandler(successHandler)
		.failureUrl("/loginfailed")
		.permitAll();

	}
	
	@Autowired
	protected void configureAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth
             .inMemoryAuthentication()
                  .withUser("admin")
                       .password("admin")
                       .roles("ADMIN");
		auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery(
				"select username,password,1 from customer where username=?")
		.authoritiesByUsernameQuery(
				"select username, role from customer where username=?");
		/*auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery(
				"select user.name,user.password,1 from finalproject.user where user.name=?")
		.authoritiesByUsernameQuery(
				"select user.name,user.role from finalproject.user where user.name=? ");*/
    }
    	
}
