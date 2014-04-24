ALTER TABLE "myfirstmodule$e1" ALTER COLUMN "e1_attr1" RENAME TO "e1_key";
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
"attribute_name" = 'E1_key', 
"column_name" = 'e1_key', 
"type" = 30, 
"length" = 200, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '3f85de1c-d47c-4dbe-b263-b6a17ef823e9';
ALTER TABLE "myfirstmodule$e11" ALTER COLUMN "e11_attr1" RENAME TO "e11_key";
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '10b85c26-4be1-4147-a033-7d0a69c386e9', 
"attribute_name" = 'E11_key', 
"column_name" = 'e11_key', 
"type" = 30, 
"length" = 200, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'a60a12a8-2b41-4b9b-bd1b-7f2bc2d1d25c';
ALTER TABLE "myfirstmodule$e12" ALTER COLUMN "e12_attr1" RENAME TO "e12_key";
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '6fd28bf5-402a-4a26-9f54-e0b333ec6780', 
"attribute_name" = 'E12_key', 
"column_name" = 'e12_key', 
"type" = 30, 
"length" = 200, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '3d74c135-b39a-42bd-8c4b-a086f9d03b2c';
ALTER TABLE "myfirstmodule$e13" ALTER COLUMN "e13_attr1" RENAME TO "e13_key";
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '66282884-7d7a-4b2c-94e8-72afe7179141', 
"attribute_name" = 'E13_key', 
"column_name" = 'e13_key', 
"type" = 30, 
"length" = 200, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '6c79bd2f-f65f-4da2-a53b-4dbf5d82a38d';
ALTER TABLE "myfirstmodule$e14" ALTER COLUMN "e14_attr1" RENAME TO "e14_key";
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '80b935bb-27f4-4d21-9a24-eecdf1c4f889', 
"attribute_name" = 'E14_key', 
"column_name" = 'e14_key', 
"type" = 30, 
"length" = 200, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = '3a12ca9e-bff9-4d56-a447-fc0a69acdfd3';
ALTER TABLE "myfirstmodule$e15" ALTER COLUMN "e15_attr1" RENAME TO "e15_key";
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '9da8c347-a3e7-40f1-92d9-fe0526056f44', 
"attribute_name" = 'E15_key', 
"column_name" = 'e15_key', 
"type" = 30, 
"length" = 200, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'db29ae62-cf23-4705-b385-a27ffc5d6bf6';
ALTER TABLE "myfirstmodule$e16" ALTER COLUMN "e16_attr1" RENAME TO "e16_key";
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'fd2d4e00-5cf8-4d3a-a889-28fb6179814e', 
"attribute_name" = 'E16_key', 
"column_name" = 'e16_key', 
"type" = 30, 
"length" = 200, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'cb7a28b4-3b2a-422e-8ab9-672af2f35965';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.0.6', 
"lastsyncdate" = '20140104 15:04:48';
