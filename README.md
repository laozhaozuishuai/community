## zch社区

## 资料
[Spring 文档](https://spring.io/guides)
[Spring Web](https://spring.io/guides/gs/serving-web-content/)
[es](https://elasticsearch.cn/explore)
[Github Oauth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

## 工具
git安装
[Git](https://git-scm/download)
[Visual Paradigm](https://www.visual-paradigm.com)

## 脚本
```
create table USER
(
	ID INTEGER default auto_increment,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN CHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT,
	constraint USER_PK
		primary key (ID)
);

```