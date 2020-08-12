package com.sk.demo.kafka.partition.springcloudstreamexample.models.jpos;

import com.sk.demo.kafka.partition.springcloudstreamexample.models.dtos.StudentDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@Entity
public class StudentJpo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String name;

    @OneToMany(mappedBy = "student")
    private List<StudyJpo> studies = new ArrayList<>();

    public static StudentJpo of(StudentDto student) {
        return StudentJpo.builder()
                .email(student.getEmail())
                .name(student.getName())
                .build();
    }
}
