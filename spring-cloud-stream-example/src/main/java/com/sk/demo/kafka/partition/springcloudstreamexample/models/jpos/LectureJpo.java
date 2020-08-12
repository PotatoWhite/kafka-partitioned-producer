package com.sk.demo.kafka.partition.springcloudstreamexample.models.jpos;

import com.sk.demo.kafka.partition.springcloudstreamexample.models.dtos.LectureDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@Entity
public class LectureJpo {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    @OneToMany(mappedBy = "lecture")
    private List<StudyJpo> studies;

    public static LectureJpo of(LectureDto lecture) {
        return LectureJpo.builder()
                .title(lecture.getTitle())
                .build();
    }
}
