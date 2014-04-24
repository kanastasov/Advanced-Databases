CREATE TABLE "myfirstmodule$entity2" (
	"id" BIGINT NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name")
 VALUES ('a1632c48-905f-41c1-86ae-460839969e84', 
'MyFirstModule.Entity2', 
'myfirstmodule$entity2');
CREATE TABLE "myfirstmodule$entity2_entity1" (
	"myfirstmodule$entity2id" BIGINT NOT NULL,
	"myfirstmodule$entity1id" BIGINT NOT NULL,
	PRIMARY KEY("myfirstmodule$entity2id","myfirstmodule$entity1id"));
CREATE INDEX "idx_myfirstmodule$entity2_entity1_myfirstmodule$entity1_myfirstmodule$entity2" ON "myfirstmodule$entity2_entity1"
	("myfirstmodule$entity1id","myfirstmodule$entity2id");
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('29addb59-9cc0-4b15-9e3f-a24305cbc2fe', 
'MyFirstModule.Entity2_Entity1', 
'myfirstmodule$entity2_entity1', 
'a1632c48-905f-41c1-86ae-460839969e84', 
'0223afb8-d68d-415b-89f6-c1f329ed0484', 
'myfirstmodule$entity2id', 
'myfirstmodule$entity1id', 
'idx_myfirstmodule$entity2_entity1_myfirstmodule$entity1_myfirstmodule$entity2');
CREATE TABLE "myfirstmodule$entity1" (
	"id" BIGINT NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name")
 VALUES ('0223afb8-d68d-415b-89f6-c1f329ed0484', 
'MyFirstModule.Entity1', 
'myfirstmodule$entity1');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.0.6', 
"lastsyncdate" = '20140114 10:35:20';
