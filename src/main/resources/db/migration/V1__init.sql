CREATE TABLE category
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    created_at VARCHAR(255) NULL,
    title      VARCHAR(255) NULL,
    CONSTRAINT pk_category PRIMARY KEY (id)
);

CREATE TABLE `jt-it`
(
    id             BIGINT NOT NULL,
    specialization VARCHAR(255) NULL,
    CONSTRAINT `pk_jt-it` PRIMARY KEY (id)
);

CREATE TABLE `jt-mentor`
(
    id           BIGINT NOT NULL,
    company_name VARCHAR(255) NULL,
    avg_rating DOUBLE NOT NULL,
    CONSTRAINT `pk_jt-mentor` PRIMARY KEY (id)
);

CREATE TABLE `jt-users`
(
    id       BIGINT NOT NULL,
    name     VARCHAR(255) NULL,
    email    VARCHAR(255) NULL,
    password VARCHAR(255) NULL,
    CONSTRAINT `pk_jt-users` PRIMARY KEY (id)
);

CREATE TABLE jt_ta
(
    id                BIGINT NOT NULL,
    number_of_session INT    NOT NULL,
    avg_rating DOUBLE NOT NULL,
    CONSTRAINT pk_jt_ta PRIMARY KEY (id)
);

CREATE TABLE `mps-it`
(
    id             BIGINT NOT NULL,
    name           VARCHAR(255) NULL,
    email          VARCHAR(255) NULL,
    password       VARCHAR(255) NULL,
    specialization VARCHAR(255) NULL,
    CONSTRAINT `pk_mps-it` PRIMARY KEY (id)
);

CREATE TABLE `mps-mentor`
(
    id           BIGINT NOT NULL,
    name         VARCHAR(255) NULL,
    email        VARCHAR(255) NULL,
    password     VARCHAR(255) NULL,
    company_name VARCHAR(255) NULL,
    avg_rating DOUBLE NOT NULL,
    CONSTRAINT `pk_mps-mentor` PRIMARY KEY (id)
);

CREATE TABLE mps_ta
(
    id                BIGINT NOT NULL,
    name              VARCHAR(255) NULL,
    email             VARCHAR(255) NULL,
    password          VARCHAR(255) NULL,
    number_of_session INT    NOT NULL,
    avg_rating DOUBLE NOT NULL,
    CONSTRAINT pk_mps_ta PRIMARY KEY (id)
);

CREATE TABLE product
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    created_at    VARCHAR(255) NULL,
    title         VARCHAR(255) NULL,
    price DOUBLE NOT NULL,
    category_id   BIGINT NULL,
    `description` VARCHAR(255) NULL,
    CONSTRAINT pk_product PRIMARY KEY (id)
);

CREATE TABLE `st-users`
(
    id                BIGINT NOT NULL,
    user_type         INT NULL,
    name              VARCHAR(255) NULL,
    email             VARCHAR(255) NULL,
    password          VARCHAR(255) NULL,
    number_of_session INT    NOT NULL,
    avg_rating DOUBLE NOT NULL,
    company_name      VARCHAR(255) NULL,
    specialization    VARCHAR(255) NULL,
    CONSTRAINT `pk_st-users` PRIMARY KEY (id)
);

CREATE TABLE `tpc-it`
(
    id             BIGINT NOT NULL,
    name           VARCHAR(255) NULL,
    email          VARCHAR(255) NULL,
    password       VARCHAR(255) NULL,
    specialization VARCHAR(255) NULL,
    CONSTRAINT `pk_tpc-it` PRIMARY KEY (id)
);

CREATE TABLE `tpc-mentor`
(
    id           BIGINT NOT NULL,
    name         VARCHAR(255) NULL,
    email        VARCHAR(255) NULL,
    password     VARCHAR(255) NULL,
    company_name VARCHAR(255) NULL,
    avg_rating DOUBLE NOT NULL,
    CONSTRAINT `pk_tpc-mentor` PRIMARY KEY (id)
);

CREATE TABLE `tpc-users`
(
    id       BIGINT NOT NULL,
    name     VARCHAR(255) NULL,
    email    VARCHAR(255) NULL,
    password VARCHAR(255) NULL,
    CONSTRAINT `pk_tpc-users` PRIMARY KEY (id)
);

CREATE TABLE tpc_ta
(
    id                BIGINT NOT NULL,
    name              VARCHAR(255) NULL,
    email             VARCHAR(255) NULL,
    password          VARCHAR(255) NULL,
    number_of_session INT    NOT NULL,
    avg_rating DOUBLE NOT NULL,
    CONSTRAINT pk_tpc_ta PRIMARY KEY (id)
);

ALTER TABLE `jt-it`
    ADD CONSTRAINT `FK_JT-IT_ON_ID` FOREIGN KEY (id) REFERENCES `jt-users` (id);

ALTER TABLE `jt-mentor`
    ADD CONSTRAINT `FK_JT-MENTOR_ON_ID` FOREIGN KEY (id) REFERENCES `jt-users` (id);

ALTER TABLE jt_ta
    ADD CONSTRAINT FK_JT_TA_ON_ID FOREIGN KEY (id) REFERENCES `jt-users` (id);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_CATEGORY FOREIGN KEY (category_id) REFERENCES category (id);