package com.tka.jwtUtil;

import java.util.Date;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {

	private String SECRET = "mysecretkey";

	public String generateToken(UserDetails userDetails) {

		return Jwts.builder().setSubject(userDetails.getUsername()).setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
				.signWith(SignatureAlgorithm.HS256, SECRET).compact();
	}

	public String extractUsername(String token) {
		return Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody().getSubject();
	}
}