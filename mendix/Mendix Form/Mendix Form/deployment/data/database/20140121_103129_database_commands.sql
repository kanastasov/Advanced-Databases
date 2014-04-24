DROP INDEX "idx_myfirstmodule$e1_demouser_myfirstmodule$customer_myfirstmodule$e1";
DROP INDEX "idx_myfirstmodule$r5_myfirstmodule$e15_myfirstmodule$e1";
DROP INDEX "idx_myfirstmodule$r6_myfirstmodule$e16_myfirstmodule$e1";
DROP INDEX "idx_myfirstmodule$r4_myfirstmodule$e1_myfirstmodule$e14";
DROP INDEX "idx_myfirstmodule$r2_myfirstmodule$e1_myfirstmodule$e12";
DROP INDEX "idx_myfirstmodule$r3_myfirstmodule$e1_myfirstmodule$e13";
DROP INDEX "idx_myfirstmodule$r1_myfirstmodule$e1_myfirstmodule$e11";
ALTER TABLE "myfirstmodule$e1" RENAME TO "myfirstmodule$internetsales";
ALTER TABLE "myfirstmodule$customer"
	ADD "firstname" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('8a6fb9c9-2bb3-49e2-8b5d-a5c4ca833bfc', 
'0ae2a4db-5636-4db4-8cf0-02e7cb479dd8', 
'FirstName', 
'firstname', 
30, 
200, 
'', 
false);
ALTER TABLE "myfirstmodule$internetsales"
	DROP COLUMN "e1_key";
ALTER TABLE "myfirstmodule$internetsales" ALTER COLUMN "e1_attr2" RENAME TO "kuiuyik8gvoilkjgv";
ALTER TABLE "myfirstmodule$internetsales"
	ADD "iskey" BIGINT NULL;
UPDATE "myfirstmodule$internetsales"
 SET "iskey" = BITAND("id", 281474976710655);
CREATE SEQUENCE "myfirstmodule$internetsales_iskey_mxseq" AS BIGINT START WITH 2303;
UPDATE "mendixsystem$entity"
 SET "entity_name" = 'MyFirstModule.InternetSales', 
"table_name" = 'myfirstmodule$internetsales', 
"superentity_id" = NULL
 WHERE "id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8';
INSERT INTO "mendixsystem$sequence" ("attribute_id", 
"name", 
"start_value", 
"current_value")
 VALUES ('3f85de1c-d47c-4dbe-b263-b6a17ef823e9', 
'myfirstmodule$internetsales_iskey_mxseq', 
1, 
2302);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
"attribute_name" = 'ISKey', 
"column_name" = 'iskey', 
"type" = 0, 
"length" = 200, 
"default_value" = '1', 
"is_auto_number" = true
 WHERE "id" = '3f85de1c-d47c-4dbe-b263-b6a17ef823e9';
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
"attribute_name" = 'kuiuyik8gvoilkjgv', 
"column_name" = 'kuiuyik8gvoilkjgv', 
"type" = 30, 
"length" = 200, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'db748083-8a31-48d5-b5fd-7a1cf0a9d6aa';
ALTER TABLE "myfirstmodule$e1_demouser" ALTER COLUMN "myfirstmodule$e1id" RENAME TO "myfirstmodule$internetsalesid";
CREATE INDEX "idx_myfirstmodule$e1_demouser_myfirstmodule$customer_myfirstmodule$internetsales" ON "myfirstmodule$e1_demouser"
	("myfirstmodule$customerid","myfirstmodule$internetsalesid");
UPDATE "mendixsystem$association"
 SET "association_name" = 'MyFirstModule.E1_DemoUser', 
"table_name" = 'myfirstmodule$e1_demouser', 
"parent_entity_id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
"child_entity_id" = '0ae2a4db-5636-4db4-8cf0-02e7cb479dd8', 
"parent_column_name" = 'myfirstmodule$internetsalesid', 
"child_column_name" = 'myfirstmodule$customerid', 
"index_name" = 'idx_myfirstmodule$e1_demouser_myfirstmodule$customer_myfirstmodule$internetsales'
 WHERE "id" = 'b34b6066-d872-4745-bbca-86912f096f81';
ALTER TABLE "myfirstmodule$r5" ALTER COLUMN "myfirstmodule$e1id" RENAME TO "myfirstmodule$internetsalesid";
CREATE INDEX "idx_myfirstmodule$r5_myfirstmodule$e15_myfirstmodule$internetsales" ON "myfirstmodule$r5"
	("myfirstmodule$e15id","myfirstmodule$internetsalesid");
UPDATE "mendixsystem$association"
 SET "association_name" = 'MyFirstModule.R5', 
"table_name" = 'myfirstmodule$r5', 
"parent_entity_id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
"child_entity_id" = '9da8c347-a3e7-40f1-92d9-fe0526056f44', 
"parent_column_name" = 'myfirstmodule$internetsalesid', 
"child_column_name" = 'myfirstmodule$e15id', 
"index_name" = 'idx_myfirstmodule$r5_myfirstmodule$e15_myfirstmodule$internetsales'
 WHERE "id" = 'b06d956e-7539-456a-9967-6df5ed191e87';
ALTER TABLE "myfirstmodule$r6" ALTER COLUMN "myfirstmodule$e1id" RENAME TO "myfirstmodule$internetsalesid";
CREATE INDEX "idx_myfirstmodule$r6_myfirstmodule$e16_myfirstmodule$internetsales" ON "myfirstmodule$r6"
	("myfirstmodule$e16id","myfirstmodule$internetsalesid");
UPDATE "mendixsystem$association"
 SET "association_name" = 'MyFirstModule.R6', 
"table_name" = 'myfirstmodule$r6', 
"parent_entity_id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
"child_entity_id" = 'fd2d4e00-5cf8-4d3a-a889-28fb6179814e', 
"parent_column_name" = 'myfirstmodule$internetsalesid', 
"child_column_name" = 'myfirstmodule$e16id', 
"index_name" = 'idx_myfirstmodule$r6_myfirstmodule$e16_myfirstmodule$internetsales'
 WHERE "id" = '12290f9d-7c32-45b5-b855-81cabd36e223';
ALTER TABLE "myfirstmodule$r4" ALTER COLUMN "myfirstmodule$e1id" RENAME TO "myfirstmodule$internetsalesid";
CREATE INDEX "idx_myfirstmodule$r4_myfirstmodule$internetsales_myfirstmodule$e14" ON "myfirstmodule$r4"
	("myfirstmodule$internetsalesid","myfirstmodule$e14id");
UPDATE "mendixsystem$association"
 SET "association_name" = 'MyFirstModule.R4', 
"table_name" = 'myfirstmodule$r4', 
"parent_entity_id" = '80b935bb-27f4-4d21-9a24-eecdf1c4f889', 
"child_entity_id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
"parent_column_name" = 'myfirstmodule$e14id', 
"child_column_name" = 'myfirstmodule$internetsalesid', 
"index_name" = 'idx_myfirstmodule$r4_myfirstmodule$internetsales_myfirstmodule$e14'
 WHERE "id" = '2f96808c-bdd2-4aa7-84e0-e83bb33ee68b';
ALTER TABLE "myfirstmodule$r2" ALTER COLUMN "myfirstmodule$e1id" RENAME TO "myfirstmodule$internetsalesid";
CREATE INDEX "idx_myfirstmodule$r2_myfirstmodule$internetsales_myfirstmodule$e12" ON "myfirstmodule$r2"
	("myfirstmodule$internetsalesid","myfirstmodule$e12id");
UPDATE "mendixsystem$association"
 SET "association_name" = 'MyFirstModule.R2', 
"table_name" = 'myfirstmodule$r2', 
"parent_entity_id" = '6fd28bf5-402a-4a26-9f54-e0b333ec6780', 
"child_entity_id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
"parent_column_name" = 'myfirstmodule$e12id', 
"child_column_name" = 'myfirstmodule$internetsalesid', 
"index_name" = 'idx_myfirstmodule$r2_myfirstmodule$internetsales_myfirstmodule$e12'
 WHERE "id" = 'be660533-f3e5-4ab8-82fe-786909248fe4';
ALTER TABLE "myfirstmodule$r3" ALTER COLUMN "myfirstmodule$e1id" RENAME TO "myfirstmodule$internetsalesid";
CREATE INDEX "idx_myfirstmodule$r3_myfirstmodule$internetsales_myfirstmodule$e13" ON "myfirstmodule$r3"
	("myfirstmodule$internetsalesid","myfirstmodule$e13id");
UPDATE "mendixsystem$association"
 SET "association_name" = 'MyFirstModule.R3', 
"table_name" = 'myfirstmodule$r3', 
"parent_entity_id" = '66282884-7d7a-4b2c-94e8-72afe7179141', 
"child_entity_id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
"parent_column_name" = 'myfirstmodule$e13id', 
"child_column_name" = 'myfirstmodule$internetsalesid', 
"index_name" = 'idx_myfirstmodule$r3_myfirstmodule$internetsales_myfirstmodule$e13'
 WHERE "id" = '0e936465-05da-42ef-b00a-b132d8c0e70d';
ALTER TABLE "myfirstmodule$r1" ALTER COLUMN "myfirstmodule$e1id" RENAME TO "myfirstmodule$internetsalesid";
CREATE INDEX "idx_myfirstmodule$r1_myfirstmodule$internetsales_myfirstmodule$e11" ON "myfirstmodule$r1"
	("myfirstmodule$internetsalesid","myfirstmodule$e11id");
UPDATE "mendixsystem$association"
 SET "association_name" = 'MyFirstModule.R1', 
"table_name" = 'myfirstmodule$r1', 
"parent_entity_id" = '10b85c26-4be1-4147-a033-7d0a69c386e9', 
"child_entity_id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
"parent_column_name" = 'myfirstmodule$e11id', 
"child_column_name" = 'myfirstmodule$internetsalesid', 
"index_name" = 'idx_myfirstmodule$r1_myfirstmodule$internetsales_myfirstmodule$e11'
 WHERE "id" = 'b774189c-a1db-4234-857b-0fd39965f675';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.0.6', 
"lastsyncdate" = '20140121 10:31:27';
