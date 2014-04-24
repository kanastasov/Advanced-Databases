ALTER TABLE "myfirstmodule$entity1" RENAME TO "64a4ff32b199440b99fb73efd1e253fd";
ALTER TABLE "myfirstmodule$entity2" RENAME TO "e0d0ccf5babf441e912c6c0c071f44e9";
DROP INDEX "idx_myfirstmodule$entity2_entity1_myfirstmodule$entity1_myfirstmodule$entity2";
ALTER TABLE "myfirstmodule$entity2_entity1" RENAME TO "51f51238a42a469db7f00101e27b5345";
DROP INDEX "idx_myfirstmodule$e1_demouser_myfirstmodule$demouser_myfirstmodule$e1";
ALTER TABLE "myfirstmodule$demouser" RENAME TO "myfirstmodule$customer";
UPDATE "administration$account"
 SET "submetaobjectname" = 'MyFirstModule.Customer'
 WHERE "submetaobjectname" = 'MyFirstModule.DemoUser';
UPDATE "system$user"
 SET "submetaobjectname" = 'MyFirstModule.Customer'
 WHERE "submetaobjectname" = 'MyFirstModule.DemoUser';
ALTER TABLE "myfirstmodule$customer"
	DROP COLUMN "demouser_att1";
ALTER TABLE "myfirstmodule$customer" ALTER COLUMN "demouser_att2" RENAME TO "lastname";
ALTER TABLE "myfirstmodule$customer"
	ADD "customerkey" BIGINT NULL;
UPDATE "myfirstmodule$customer"
 SET "customerkey" = BITAND("id", 281474976710655);
CREATE SEQUENCE "myfirstmodule$customer_customerkey_mxseq" AS BIGINT START WITH 502;
UPDATE "mendixsystem$entity"
 SET "entity_name" = 'MyFirstModule.Customer', 
"table_name" = 'myfirstmodule$customer', 
"superentity_id" = '3078a23e-13b2-4a9b-84e4-2881fdee53c6'
 WHERE "id" = '0ae2a4db-5636-4db4-8cf0-02e7cb479dd8';
INSERT INTO "mendixsystem$sequence" ("attribute_id", 
"name", 
"start_value", 
"current_value")
 VALUES ('10171e10-db7c-4c80-8bdc-29f9dbe359b2', 
'myfirstmodule$customer_customerkey_mxseq', 
1, 
501);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '0ae2a4db-5636-4db4-8cf0-02e7cb479dd8', 
"attribute_name" = 'Customerkey', 
"column_name" = 'customerkey', 
"type" = 0, 
"length" = 200, 
"default_value" = '1', 
"is_auto_number" = true
 WHERE "id" = '10171e10-db7c-4c80-8bdc-29f9dbe359b2';
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '0ae2a4db-5636-4db4-8cf0-02e7cb479dd8', 
"attribute_name" = 'LastName', 
"column_name" = 'lastname', 
"type" = 30, 
"length" = 200, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '46820baa-c231-47db-b511-09f1f01022ac';
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = '0223afb8-d68d-415b-89f6-c1f329ed0484';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = '0223afb8-d68d-415b-89f6-c1f329ed0484');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = '0223afb8-d68d-415b-89f6-c1f329ed0484';
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = 'a1632c48-905f-41c1-86ae-460839969e84';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = 'a1632c48-905f-41c1-86ae-460839969e84');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = 'a1632c48-905f-41c1-86ae-460839969e84';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '29addb59-9cc0-4b15-9e3f-a24305cbc2fe';
ALTER TABLE "myfirstmodule$e1_demouser" ALTER COLUMN "myfirstmodule$demouserid" RENAME TO "myfirstmodule$customerid";
CREATE INDEX "idx_myfirstmodule$e1_demouser_myfirstmodule$customer_myfirstmodule$e1" ON "myfirstmodule$e1_demouser"
	("myfirstmodule$customerid","myfirstmodule$e1id");
UPDATE "mendixsystem$association"
 SET "association_name" = 'MyFirstModule.E1_DemoUser', 
"table_name" = 'myfirstmodule$e1_demouser', 
"parent_entity_id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
"child_entity_id" = '0ae2a4db-5636-4db4-8cf0-02e7cb479dd8', 
"parent_column_name" = 'myfirstmodule$e1id', 
"child_column_name" = 'myfirstmodule$customerid', 
"index_name" = 'idx_myfirstmodule$e1_demouser_myfirstmodule$customer_myfirstmodule$e1'
 WHERE "id" = 'b34b6066-d872-4745-bbca-86912f096f81';
DROP TABLE "64a4ff32b199440b99fb73efd1e253fd";
DROP TABLE "e0d0ccf5babf441e912c6c0c071f44e9";
DROP TABLE "51f51238a42a469db7f00101e27b5345";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.0.6', 
"lastsyncdate" = '20140114 13:24:28';
