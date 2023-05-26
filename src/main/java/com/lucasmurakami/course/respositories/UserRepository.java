package com.lucasmurakami.course.respositories;

import com.lucasmurakami.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
