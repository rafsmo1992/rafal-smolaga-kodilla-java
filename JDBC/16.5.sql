INSERT INTO POSTS(USER_ID, BODY) VALUES (1,'First Post on forum');
INSERT INTO POSTS(USER_ID, BODY) VALUES (2,'Second Post on forum');
INSERT INTO POSTS(USER_ID, BODY) VALUES (3,'Third Post on forum');
SELECT ID,USER_ID,BODY FROM POSTS;

UPDATE POSTS
SET BODY = 'TO DELETE'
WHERE ID = 34;

UPDATE POSTS
SET BODY = 'TO DELETE'
WHERE ID = 35;

DELETE FROM POSTS
WHERE ID = 34;

DELETE FROM POSTS
WHERE ID = 35;

DELETE FROM POSTS
WHERE ID = 36;

Commit;