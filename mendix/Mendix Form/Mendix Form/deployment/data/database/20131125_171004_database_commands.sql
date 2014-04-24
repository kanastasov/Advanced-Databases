ALTER TABLE "administration$account"
	ADD "submetaobjectname" VARCHAR_IGNORECASE(255) NULL;
UPDATE "administration$account"
 SET "submetaobjectname" = 'Administration.Account';
CREATE INDEX "idx_administration$account_submetaobjectname" ON "administration$account"
	("submetaobjectname","id");
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('0b457a57-9371-35ad-b275-64c69698df0c', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'submetaobjectname', 
'submetaobjectname', 
30, 
255, 
'Administration.Account', 
false);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('9215fea0-5577-3eea-a703-0db568b50bea', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'idx_administration$account_submetaobjectname');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('9215fea0-5577-3eea-a703-0db568b50bea', 
'0b457a57-9371-35ad-b275-64c69698df0c', 
false, 
0);
UPDATE "mendixsystem$entity"
 SET "entity_name" = 'MyFirstModule.E1', 
"table_name" = 'myfirstmodule$e1', 
"superentity_id" = NULL
 WHERE "id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8';
CREATE TABLE "myfirstmodule$demouser" (
	"id" BIGINT NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"superentity_id")
 VALUES ('0ae2a4db-5636-4db4-8cf0-02e7cb479dd8', 
'MyFirstModule.DemoUser', 
'myfirstmodule$demouser', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6');
DELETE FROM "system$user" 
 WHERE "id" IN (SELECT "id"
 FROM "myfirstmodule$e1");
DELETE FROM "system$user_language" 
 WHERE "system$userid" IN (SELECT "id"
 FROM "myfirstmodule$e1");
DELETE FROM "system$userroles" 
 WHERE "system$userid" IN (SELECT "id"
 FROM "myfirstmodule$e1");
DELETE FROM "system$user_timezone" 
 WHERE "system$userid" IN (SELECT "id"
 FROM "myfirstmodule$e1");
UPDATE "system$filedocument"
 SET "system$owner" = NULL
 WHERE "system$owner" IN (SELECT "id"
 FROM "myfirstmodule$e1");
DELETE FROM "system$session_user" 
 WHERE "system$userid" IN (SELECT "id"
 FROM "myfirstmodule$e1");
UPDATE "system$filedocument"
 SET "system$changedby" = NULL
 WHERE "system$changedby" IN (SELECT "id"
 FROM "myfirstmodule$e1");
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.0.6', 
"lastsyncdate" = '20131125 17:10:00';
