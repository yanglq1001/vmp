DROP DATABASE IF EXISTS vmp;
CREATE DATABASE IF NOT EXISTS vmp
  DEFAULT CHARACTER SET utf8;
USE vmp;

#词条
DROP TABLE IF EXISTS word;
CREATE TABLE IF NOT EXISTS word (
  ID       INTEGER(20) PRIMARY KEY UNIQUE KEY NOT NULL AUTO_INCREMENT
  COMMENT '词条Id',
  VALUE    VARCHAR(20)                                 DEFAULT ''
  COMMENT '词条值',
  PINYIN   VARCHAR(50)                                 DEFAULT ''
  COMMENT '拼音',
  SYNONYMS VARCHAR(500)                                DEFAULT ''
  COMMENT '词条的同义词',
  COMMAND  VARCHAR(10)                                 DEFAULT ''
  COMMENT '命令',
  WORDS_ID INTEGER(20) COMMENT '词库Id',
  CONSTRAINT `FK_WORDS_ID` FOREIGN KEY (`WORDS_ID`) REFERENCES `words` (`ID`)

)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8
  COMMENT '词条';

#词库
DROP TABLE IF EXISTS words;
CREATE TABLE IF NOT EXISTS words (
  ID        INTEGER(20) PRIMARY KEY UNIQUE KEY NOT NULL AUTO_INCREMENT
  COMMENT '词库ID',
  NAME      VARCHAR(20)                                 DEFAULT ''
  COMMENT '词库名称',
  TYPE      INTEGER(2)                                  DEFAULT 0
  COMMENT '词库类型: 0-普通类 1-命令类 2-设备类 3-楼层类 4-区域类',
  WORD_LIST VARCHAR(50)                                 DEFAULT ''
  COMMENT '词库所含的词条Id 用,号分隔'

)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8
  COMMENT '词库';

#常用提示语
DROP TABLE IF EXISTS tip;
CREATE TABLE IF NOT EXISTS tip (
  ID   INTEGER(20) PRIMARY KEY UNIQUE KEY NOT NULL AUTO_INCREMENT
  COMMENT '提示语ID',
  CODE VARCHAR(20)                                 DEFAULT ''
  COMMENT '提示语Code',
  TIP  VARCHAR(500)                                DEFAULT ''
  COMMENT '提示语'
)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8
  COMMENT '常用提示语';

#对话回复
DROP TABLE IF EXISTS hint;
CREATE TABLE IF NOT EXISTS hint (
  ID      INTEGER(20) PRIMARY KEY UNIQUE KEY NOT NULL AUTO_INCREMENT,
  TYPE    INTEGER(2)                                  DEFAULT 0
  COMMENT '对话类型: 0-简单对话 1-复杂对话',
  CONTENT VARCHAR(500)                                DEFAULT ''
  COMMENT '对话内容,用","分隔'

)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8
  COMMENT '对话回复';




