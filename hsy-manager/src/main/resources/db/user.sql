DROP TABLE IF EXISTS user;
CREATE TABLE user
(
    id          BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    username    VARCHAR(50) NOT NULL COMMENT '用户名',
    password    VARCHAR(255) NOT NULL COMMENT '密码',
    create_time DATETIME NOT NULL COMMENT '创建时间',
    update_time DATETIME NOT NULL  COMMENT '更新时间',
    PRIMARY KEY (id)
) ENGINE=INNODB DEFAULT charset = 'utf8'