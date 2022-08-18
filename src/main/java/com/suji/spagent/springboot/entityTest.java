package com.suji.spagent.springboot;

import org.springframework.stereotype.Repository;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "mst_memo")

@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class entityTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @Column
    private String memoText;
}
