package org.classreviewsite.lecture.infrastructure;

import org.classreviewsite.classlist.data.ImageUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageUrlDataRepository extends JpaRepository<ImageUrl, Long> {
}
