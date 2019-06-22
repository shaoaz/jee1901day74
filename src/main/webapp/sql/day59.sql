/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     2019/6/1 14:23:16                            */
/*==============================================================*/


DROP TABLE ADDRESS CASCADE CONSTRAINTS;

DROP TABLE COLLECTIONPROJECT CASCADE CONSTRAINTS;

DROP TABLE ORDERS CASCADE CONSTRAINTS;

/*==============================================================*/
/* Table: ADDRESS                                               */
/*==============================================================*/
CREATE TABLE ADDRESS 
(
   AID                  NUMBER               NOT NULL,
   UUID                 NUMBER,
   ANAME                VARCHAR(20),
   APHONE               VARCHAR(20),
   AADDRESS             VARCHAR(20),
   CONSTRAINT PK_ADDRESS PRIMARY KEY (AID)
);

/*==============================================================*/
/* Table: COLLECTIONPROJECT                                     */
/*==============================================================*/
CREATE TABLE COLLECTIONPROJECT 
(
   PID                  CHAR(10)             NOT NULL,
   PNAME                CHAR(10),
   PMONEY               CHAR(10),
   PDAY                 CHAR(10),
   PCREATETIME          CHAR(10),
   PDACHENGLV           CHAR(10),
   PMIAOSHU             CHAR(10),
   PTOUTU               CHAR(10),
   PXIANGTU             CHAR(10),
   PJIESHAO             CHAR(10),
   PPHONE               CHAR(10),
   PDIANHUA             CHAR(10),
   PZHANGHAO            CHAR(10),
   PSHENFENZHENG        CHAR(10),
   PHONE1               CHAR(10),
   PHONE2               CHAR(10),
   PHONE3               CHAR(10),
   PFENLEI              CHAR(10),
   CONSTRAINT PK_COLLECTIONPROJECT PRIMARY KEY (PID)
);

/*==============================================================*/
/* Table: ORDERS                                                */
/*==============================================================*/
CREATE TABLE ORDERS 
(
   OID                  NUMBER               NOT NULL,
   UUID                 NUMBER,
   OREALID              VARCHAR(20),
   ONAME                VARCHAR(50),
   OTIME                DATE,
   OMONEY               VARCHAR(20),
   ONUMBER              VARCHAR(20),
   OSTSTUS              VARCHAR(20),
   CONSTRAINT PK_ORDERS PRIMARY KEY (OID)
);

