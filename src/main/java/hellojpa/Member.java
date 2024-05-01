package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Member {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE) // db에 시퀀스 오브젝트 생성해줌(Integer는 10몇억이상은 안되니.. Long이 낫다)
    private Long id;

    @Column(name = "name", nullable = false) // DB 컬럼명, NN
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    private LocalDate testLocalDate; // 최신버전에서는 Temporal 안 쓰고 이렇게 쓰면 db에 date 타입으로 들ㅇㅓ감
    private LocalDateTime testLocalDateTime; // 이렇게 쓰면 timestamp 타입으로 들어감

    @Lob
    private String description;

    @Transient // DB랑 관련없이 메모리에서만 사용하고 싶을 때
    private int temp;


    public Member() {
    }

//    public Member(Long id, String name) {
//        this.id = id;
//        this.username = name;
//    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return username;
//    }
//
//    public void setName(String name) {
//        this.username = name;
//    }
}
