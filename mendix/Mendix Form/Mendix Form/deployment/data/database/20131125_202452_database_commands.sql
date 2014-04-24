ALTER TABLE "myfirstmodule$demouser"
	ADD "demouser_att2" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "myfirstmodule$demouser"
	ADD "demouser_att1" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('46820baa-c231-47db-b511-09f1f01022ac', 
'0ae2a4db-5636-4db4-8cf0-02e7cb479dd8', 
'DemoUser_Att2', 
'demouser_att2', 
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
 VALUES ('10171e10-db7c-4c80-8bdc-29f9dbe359b2', 
'0ae2a4db-5636-4db4-8cf0-02e7cb479dd8', 
'DemoUser_Att1', 
'demouser_att1', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.0.6', 
"lastsyncdate" = '20131125 20:24:50';
