UPDATE "mendixsystem$entity"
 SET "entity_name" = 'MyFirstModule.E1', 
"table_name" = 'myfirstmodule$e1', 
"superentity_id" = '282e2e60-88a5-469d-84a5-ba8d9151644f'
 WHERE "id" = 'c34bdc1b-af67-4e20-8172-cd10a2b238b8';
INSERT INTO "system$user" ("id", 
"submetaobjectname", 
"isanonymous", 
"active", 
"failedlogins", 
"blocked", 
"webserviceuser")
SELECT "id", 
'MyFirstModule.E1', 
false, 
true, 
0, 
false, 
false
 FROM "myfirstmodule$e1"
 ORDER BY "id" ASC;
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.0.6', 
"lastsyncdate" = '20131104 09:51:00';
