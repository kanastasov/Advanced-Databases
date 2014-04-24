CREATE TABLE "myfirstmodule$e1_demouser" (
	"myfirstmodule$e1id" BIGINT NOT NULL,
	"myfirstmodule$demouserid" BIGINT NOT NULL,
	PRIMARY KEY("myfirstmodule$e1id","myfirstmodule$demouserid"));
CREATE INDEX "idx_myfirstmodule$e1_demouser_myfirstmodule$demouser_myfirstmodule$e1" ON "myfirstmodule$e1_demouser"
	("myfirstmodule$demouserid","myfirstmodule$e1id");
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('b34b6066-d872-4745-bbca-86912f096f81', 
'MyFirstModule.E1_DemoUser', 
'myfirstmodule$e1_demouser', 
'c34bdc1b-af67-4e20-8172-cd10a2b238b8', 
'0ae2a4db-5636-4db4-8cf0-02e7cb479dd8', 
'myfirstmodule$e1id', 
'myfirstmodule$demouserid', 
'idx_myfirstmodule$e1_demouser_myfirstmodule$demouser_myfirstmodule$e1');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.0.6', 
"lastsyncdate" = '20131126 08:25:50';
