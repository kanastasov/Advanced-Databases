ALTER TABLE "myfirstmodule$e11" RENAME TO "5a081a41a6f24edc9dab30f6fd7ff942";
DROP INDEX "idx_myfirstmodule$r1_myfirstmodule$internetsales_myfirstmodule$e11";
ALTER TABLE "myfirstmodule$r1" RENAME TO "55cbebe686824e2a879db94c790e992e";
ALTER TABLE "myfirstmodule$e12" RENAME TO "4f84cba3f9cb404e91fc772b0729daf6";
DROP INDEX "idx_myfirstmodule$r2_myfirstmodule$internetsales_myfirstmodule$e12";
ALTER TABLE "myfirstmodule$r2" RENAME TO "dffa493492e54195808b99aa4677d3ff";
ALTER TABLE "myfirstmodule$e13" RENAME TO "213a29cee405452784d323440736b6b9";
DROP INDEX "idx_myfirstmodule$r3_myfirstmodule$internetsales_myfirstmodule$e13";
ALTER TABLE "myfirstmodule$r3" RENAME TO "6ff24fbe0bf34ab8af4fb09d99de7699";
ALTER TABLE "myfirstmodule$e14" RENAME TO "02bf09c9db1f427db59132a98ff62c71";
DROP INDEX "idx_myfirstmodule$r4_myfirstmodule$internetsales_myfirstmodule$e14";
ALTER TABLE "myfirstmodule$r4" RENAME TO "8127848b9688400fba55ffd42d1d12b1";
ALTER TABLE "myfirstmodule$e15" RENAME TO "f66ad7ab34c140afb77e8c11a477f756";
ALTER TABLE "myfirstmodule$e16" RENAME TO "d8f61dd2fc1c418ea3f66256281eacb0";
DROP INDEX "idx_myfirstmodule$r6_myfirstmodule$e16_myfirstmodule$internetsales";
ALTER TABLE "myfirstmodule$r6" RENAME TO "0f0068a532c74ce09ed5f2443c9512ec";
DROP INDEX "idx_myfirstmodule$r5_myfirstmodule$e15_myfirstmodule$internetsales";
ALTER TABLE "myfirstmodule$r5" RENAME TO "6774ecc081244eaa9cdf4f2e3a7949b8";
DROP INDEX "idx_myfirstmodule$e1_demouser_myfirstmodule$customer_myfirstmodule$internetsales";
ALTER TABLE "myfirstmodule$e1_demouser" RENAME TO "myfirstmodule$is_customer";
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = '10b85c26-4be1-4147-a033-7d0a69c386e9';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = '10b85c26-4be1-4147-a033-7d0a69c386e9');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = '10b85c26-4be1-4147-a033-7d0a69c386e9';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = 'b774189c-a1db-4234-857b-0fd39965f675';
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = '6fd28bf5-402a-4a26-9f54-e0b333ec6780';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = '6fd28bf5-402a-4a26-9f54-e0b333ec6780');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = '6fd28bf5-402a-4a26-9f54-e0b333ec6780';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = 'be660533-f3e5-4ab8-82fe-786909248fe4';
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = '66282884-7d7a-4b2c-94e8-72afe7179141';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = '66282884-7d7a-4b2c-94e8-72afe7179141');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = '66282884-7d7a-4b2c-94e8-72afe7179141';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '0e936465-05da-42ef-b00a-b132d8c0e70d';
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = '80b935bb-27f4-4d21-9a24-eecdf1c4f889';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = '80b935bb-27f4-4d21-9a24-eecdf1c4f889');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = '80b935bb-27f4-4d21-9a24-eecdf1c4f889';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '2f96808c-bdd2-4aa7-84e0-e83bb33ee68b';
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = '9da8c347-a3e7-40f1-92d9-fe0526056f44';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = '9da8c347-a3e7-40f1-92d9-fe0526056f44');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = '9da8c347-a3e7-40f1-92d9-fe0526056f44';
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = 'fd2d4e00-5cf8-4d3a-a889-28fb6179814e';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = 'fd2d4e00-5cf8-4d3a-a889-28fb6179814e');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = 'fd2d4e00-5cf8-4d3a-a889-28fb6179814e';
ALTER TABLE "myfirstmodule$internetsales"
	DROP COLUMN "iskey";
DROP SEQUENCE "myfirstmodule$internetsales_iskey_mxseq";
ALTER TABLE "myfirstmodule$internetsales" ALTER COLUMN "kuiuyik8gvoilkjgv" RENAME TO "englishproductname";
ALTER TABLE "myfirstmodule$internetsales"
	ADD "englishproductsubcategoryname" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "myfirstmodule$internetsales"
	ADD "sakesordernumber" VARCHAR_IGNORECASE(20) NULL;
ALTER TABLE "myfirstmodule$internetsales"
	ADD "englishproductcategoryname" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "myfirstmodule$internetsales"
	ADD "salesorderlinenumber" INT NULL;
UPDATE "myfirstmodule$internetsales"
 SET "salesorderlinenumber" = 0;
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" = '3f85de1c-d47c-4dbe-b263-b6a17ef823e9';
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = '3f85de1c-d47c-4dbe-b263-b6a17ef823e9';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" = '3f85de1c-d47c-4dbe-b263-b6a17ef823e9';
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
"attribute_name" = 'EnglishProductName', 
"column_name" = 'englishproductname', 
"type" = 30, 
"length" = 200, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'db748083-8a31-48d5-b5fd-7a1cf0a9d6aa';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('2b50dcfc-0e93-4b55-a4e7-374f6ff73129', 
'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
'EnglishProductSubCategoryName', 
'englishproductsubcategoryname', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('3d9c89d3-bcd9-4746-8c42-bda36f59ca53', 
'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
'SalesOrderLineNumber', 
'salesorderlinenumber', 
3, 
200, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('e7e3435b-7030-4bbb-bacc-92687c911a01', 
'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
'EnglishProductCategoryName', 
'englishproductcategoryname', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('e2b962eb-3f4f-4cdd-a7bd-cb277b06c04d', 
'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
'SakesOrderNumber', 
'sakesordernumber', 
30, 
20, 
'', 
false);
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '12290f9d-7c32-45b5-b855-81cabd36e223';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = 'b06d956e-7539-456a-9967-6df5ed191e87';
CREATE INDEX "idx_myfirstmodule$is_customer_myfirstmodule$customer_myfirstmodule$internetsales" ON "myfirstmodule$is_customer"
	("myfirstmodule$customerid","myfirstmodule$internetsalesid");
UPDATE "mendixsystem$association"
 SET "association_name" = 'MyFirstModule.IS_Customer', 
"table_name" = 'myfirstmodule$is_customer', 
"parent_entity_id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
"child_entity_id" = '0ae2a4db-5636-4db4-8cf0-02e7cb479dd8', 
"parent_column_name" = 'myfirstmodule$internetsalesid', 
"child_column_name" = 'myfirstmodule$customerid', 
"index_name" = 'idx_myfirstmodule$is_customer_myfirstmodule$customer_myfirstmodule$internetsales'
 WHERE "id" = 'b34b6066-d872-4745-bbca-86912f096f81';
DROP TABLE "5a081a41a6f24edc9dab30f6fd7ff942";
DROP TABLE "55cbebe686824e2a879db94c790e992e";
DROP TABLE "4f84cba3f9cb404e91fc772b0729daf6";
DROP TABLE "dffa493492e54195808b99aa4677d3ff";
DROP TABLE "213a29cee405452784d323440736b6b9";
DROP TABLE "6ff24fbe0bf34ab8af4fb09d99de7699";
DROP TABLE "02bf09c9db1f427db59132a98ff62c71";
DROP TABLE "8127848b9688400fba55ffd42d1d12b1";
DROP TABLE "f66ad7ab34c140afb77e8c11a477f756";
DROP TABLE "d8f61dd2fc1c418ea3f66256281eacb0";
DROP TABLE "0f0068a532c74ce09ed5f2443c9512ec";
DROP TABLE "6774ecc081244eaa9cdf4f2e3a7949b8";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.0.6', 
"lastsyncdate" = '20140127 14:31:53';
