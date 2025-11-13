    package com.shop.miecomerce.model;

    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

    import java.time.LocalDateTime;

    @Entity
    @Table(name="categories")
    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public class Category {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(length = 50, nullable = false)
        private String name;
        private LocalDateTime createDate;

        @PrePersist
        protected void onCreate() {
            this.createDate = LocalDateTime.now();
        }
    }
