package bio.terra.blah.dao;

import bio.terra.blah.BaseSpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Rollback
public abstract class BaseDaoTest extends BaseSpringBootTest {}
