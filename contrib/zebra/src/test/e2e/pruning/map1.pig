register /grid/0/dev/hadoopqa/jars/zebra.jar;
a = load '1.txt' as (a:int, b:float,c:long,d:double,e:chararray,f:bytearray,r1(f1:chararray,f2:chararray),m1:map[]);

--user has to have as xxx, otherwise the later store will fail. since there is no name and only type passed to zebra.
b =  foreach a generate m1#'a' as ms1;
describe b;

--this store will pass, in table map1 will only have m1#'a'
store b into 'map1' using org.apache.hadoop.zebra.pig.TableStorer('');
--this also pass
--store b into 'map2' using org.apache.hadoop.zebra.pig.TableStorer('[ms1]');


