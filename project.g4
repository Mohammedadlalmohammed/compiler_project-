grammar project1;
options {
	caseInsensitive = true;
}

//TEMPTABLE: ATSYMBOL ATSYMBOL IDENTIFIERS;
DATATYPE: (
		BIGINT
		| BIT
		| DATE
		| DATETIME
		| DATETIME2
		| DATETIMEOFFSET
		| FLOAT
		| GEOGRAPHY
		| GEOMETRY
		| HIERARCHYID
		| IMAGE
		| INT
		| MONEY
		| NTEXT
		| REAL
		| SMALLDATETIME
		| SMALLINT
		| SMALLMONEY
		| SQL_VARIANT
		| SYSNAME
		| TEXT
		| TIME
		| TIMESTAMP
		| TINYINT
		| UNIQUEIDENTIFIER
		| CHAR
		| NCHAR
		| VARCHAR
		| NVARCHAR
		| BINARY
		| VARBINARY
		| NUMERIC
		| DECIMAL
	);
NUMBERS: (INTEGERNUMBER | FLOATNUMBER);
BOOLEANTYPE: (TRUE | FALSE);
STRING: (LITERALSTRING | BITSTRING | HEXSTRING);
//USERVARIABLE: ATSYMBOL IDENTIFIER;
COMMENTS: (MULTILINECOMMIT | SINGLELINECOMMIT) -> skip;
WS: [ \t\r\n]+ -> skip;
HIDDEN1 : 'HIDDEN';
DATA_SOURCE : 'DATA_SOURCE';
KEEPNULLS : 'KEEPNULLS';
FIRE_TRIGGERS : 'FIRE_TRIGGERS';
CHECK_CONSTRAINTS : 'CHECK_CONSTRAINTS';
UNDEFINED : 'UNDEFINED';
LOGIN : 'LOGIN';
SINGLE_NCLOB : 'SINGLE_NCLOB';
SINGLE_CLOB : 'SINGLE_CLOB';
SOURCE : 'SOURCE';
TARGET : 'TARGET';
MATCHED :'MATCHED';
USING : 'USING';
SINGLE_BLOB : 'SINGLE_BLOB';
N : 'N';
FORMATFILE_DATA_SOURCE : 'FORMATFILE_DATA_SOURCE';
FORMATFILE : 'FORMATFILE';
CODEPAGE : 'CODEPAGE';
DATAFILETYPE : 'DATAFILETYPE';
ROWTERMINATOR : 'ROWTERMINATOR';
FIELDTERMINATOR : 'FIELDTERMINATOR';
FORMAT : 'FORMAT';
MAXERRORS : 'MAXERRORS';
ERRORFILE : 'ERRORFILE';
ROWS_PER_BATCH : 'ROWS_PER_BATCH';
KILOBYTES_PER_BATCH : 'KILOBYTES_PER_BATCH';
BATCHSIZE : 'BATCHSIZE';
ERRORFILE_DATA_SOURCE : 'ERRORFILE_DATA_SOURCE';
FIELDQUOTE : 'FIELDQUOTE';
FIRSTROW : 'FIRSTROW';
LASTROW : 'LASTROW';
XML : 'XML';
HINT : 'HINT';
SCALEOUTEXECUTION : 'SCALEOUTEXECUTION';
EXTERNALPUSHDOWN : 'EXTERNALPUSHDOWN';
APPLY : 'APPLY';
REPEATABLE : 'REPEATABLE';
SYSTEM_TIME : 'SYSTEM_TIME';
THESAURUS : 'THESAURUS';
INFLECTIONAL : 'INFLECTIONAL';
IGNORE_TRIGGERS : 'IGNORE_TRIGGERS';
TABLOCK : 'TABLOCK';
JSON : 'JSON';
SPATIAL_WINDOW_MAX_CELLS : 'SPATIAL_WINDOW_MAX_CELLS';
SNAPSHOT : 'SNAPSHOT';
SERIALIZABLE : 'SERIALIZABLE';
ROWLOCK : 'ROWLOCK';
REPEATABLEREAD : 'REPEATABLEREAD';
READUNCOMMITTED : 'READUNCOMMITTED';
READPAST : 'READPAST';
READCOMMITTEDLOCK : 'READCOMMITTEDLOCK';
READCOMMITTED : 'READCOMMITTED';
DISABLE : 'DISABLE';
FORCE : 'FORCE';
FAST : 'FAST';
LOOP : 'LOOP';
CONCAT : 'CONCAT';
HASH : 'HASH';
IGNORE_CONSTRAINTS : 'IGNORE_CONSTRAINTS';
KEEPDEFAULTS : 'KEEPDEFAULTS';
KEEPIDENTITY : 'KEEPIDENTITY';
FORCESCAN : 'FORCESCAN';
FORCESEEK : 'FORCESEEK';
NOEXPAND : 'NOEXPAND';
ROBUST : 'ROBUST';
RECOMPILE : 'RECOMPILE';
QUERYTRACEON : 'QUERYTRACEON';
FORCED : 'FORCED';
SIMPLE : 'SIMPLE';
PARAMETERIZATION : 'PARAMETERIZATION';
VIEWS : 'VIEWS';
EXPAND : 'EXPAND';
DISABLE_OPTIMIZED_PLAN_FORCING : 'DISABLE_OPTIMIZED_PLAN_FORCING';
CONTAINED : 'CONTAINED';
OPTIMIZE : 'OPTIMIZE';
NO_PERFORMANCE_SPOOL : 'NO_PERFORMANCE_SPOOL';
MAXRECURSION : 'MAXRECURSION';
MAXDOP : 'MAXDOP';
MIN_GRANT_PERCENT : 'MIN_GRANT_PERCENT';
MAX_GRANT_PERCENT : 'MAX_GRANT_PERCENT';
TABLOCKX : 'TABLOCKX';
UPDLOCK : 'UPDLOCK';
XLOCK : 'XLOCK';
PAGLOCK :'PAGLOCK';
NOWAIT : 'NOWAIT';
NOLOCK : 'NOLOCK';
KEEPFIXED : 'KEEPFIXED';
KEEP : 'KEEP';
IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX : 'IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX';
TEMP : ':';
ROWGUID : 'ROWGUID';
NEAR : 'NEAR';
ISABOUT : 'ISABOUT';
WEIGHT : 'WEIGHT';
MAX : 'MAX';
REMOTE : 'REMOTE';
REDUCE : 'REDUCE';
REPLICATE : 'REPLICATE';
REDISTRIBUTE : 'REDISTRIBUTE';
FORMSOF : 'FORMSOF';
OFFSET : 'OFFSET';
TIES : 'TIES';
DELETED : 'DELETED';
INSERTED : 'INSERTED';
SPARSE : 'SPARSE';
PERSISTED : 'PERSISTED';
MASKED : 'MASKED';
ONLINE : 'ONLINE';
GENERATED : 'GENERATED';
ALWAYS : 'ALWAYS';
TRANSACTION_ID : 'TRANSACTION_ID';
SEQUENCE_NUMBER : 'SEQUENCE_NUMBER';
PERIOD : 'PERIOD';
ENABLE : 'ENABLE';
CHANGE_TRACKING : 'CHANGE_TRACKING';
TRACK_COLUMNS_UPDATED : 'TRACK_COLUMNS_UPDATED';
SWITCH : 'SWITCH';
FILESTREAM_ON : 'FILESTREAM_ON';
SYSTEM_VERSIONING : 'SYSTEM_VERSIONING';
HISTORY_TABLE : 'HISTORY_TABLE';
DATA_CONSISTENCY_CHECK : 'DATA_CONSISTENCY_CHECK';
HISTORY_RETENTION_PERIOD : 'HISTORY_RETENTION_PERIOD';
INFINITE : 'INFINITE';
DAYS : 'DAYS';
WEEK : 'WEEK';
WEEKS : 'WEEKS';
MONTHS : 'MONTHS';
YEARS : 'YEARS';
DATA_DELETION : 'DATA_DELETION';
FILTER_COLUMN : 'FILTER_COLUMN';
RETENTION_PERIOD : 'RETENTION_PERIOD';
REBUILD : 'REBUILD';
COLUMN_SET : 'COLUMN_SET';
ALL_SPARSE_COLUMNS : 'ALL_SPARSE_COLUMNS';
MOVE : 'MOVE';
LOCK_ESCALATION : 'LOCK_ESCALATION';
FILETABLE_NAMESPACE : 'FILETABLE_NAMESPACE';
FILETABLE_DIRECTORY : 'FILETABLE_DIRECTORY';
REMOTE_DATA_ARCHIVE : 'REMOTE_DATA_ARCHIVE';
OFF_WITHOUT_DATA_RECOVERY : 'OFF_WITHOUT_DATA_RECOVERY';
MIGRATION_STATE : 'MIGRATION_STATE';
PAUSED : 'PAUSED';
FILTER_PREDICATE : 'FILTER_PREDICATE';
OUTBOUND : 'OUTBOUND';
INBOUND : 'INBOUND';
SORT_IN_TEMPDB : 'SORT_IN_TEMPDB';
DATA_COMPRESSION : 'DATA_COMPRESSION';
PAGE : 'PAGE';
COLUMNSTORE : 'COLUMNSTORE';
COLUMNSTORE_ARCHIVE : 'COLUMNSTORE_ARCHIVE';
WAIT_AT_LOW_PRIORITY : 'WAIT_AT_LOW_PRIORITY';
MAX_DURATION : 'MAX_DURATION';
MINUTES : 'MINUTES';
ABORT_AFTER_WAIT : 'ABORT_AFTER_WAIT';
SELF : 'SELF';
BLOCKERS : 'BLOCKERS';
FILESTREAM : 'FILESTREAM';
ENCRYPTED : 'ENCRYPTED';
COLUMN_ENCRYPTION_KEY : 'COLUMN_ENCRYPTION_KEY';
ENCRYPTION_TYPE : 'ENCRYPTION_TYPE';
RANDOMIZED : 'RANDOMIZED';
ALGORITHM : 'ALGORITHM';
AEAD_AES_256_CBC_HMAC_SHA_256 : 'AEAD_AES_256_CBC_HMAC_SHA_256';
DOCUMENT : 'DOCUMENT';
CONTENT : 'CONTENT';
PAD_INDEX : 'PAD_INDEX';
IGNORE_DUP_KEY : 'IGNORE_DUP_KEY';
STATISTICS_NORECOMPUTE : 'STATISTICS_NORECOMPUTE';
ALLOW_ROW_LOCKS : 'ALLOW_ROW_LOCKS';
ALLOW_PAGE_LOCKS : 'ALLOW_PAGE_LOCKS';
OPTIMIZE_FOR_SEQUENTIAL_KEY : 'OPTIMIZE_FOR_SEQUENTIAL_KEY';
PARTITIONS : 'PARTITIONS';
XML_COMPRESSION : 'XML_COMPRESSION';
RESUMABLE : 'RESUMABLE';
TEXTIMAGE_ON : 'TEXTIMAGE_ON';
INCLUDE : 'INCLUDE';
LEDGER_VIEW : 'LEDGER_VIEW';
APPEND_ONLY : 'APPEND_ONLY';
SEQUENCE_NUMBER_COLUMN_NAME : 'SEQUENCE_NUMBER_COLUMN_NAME';
OPERATION_TYPE_COLUMN_NAME : 'OPERATION_TYPE_COLUMN_NAME';
OPERATION_TYPE_DESC_COLUMN_NAME : 'OPERATION_TYPE_DESC_COLUMN_NAME';
TRANSACTION_ID_COLUMN_NAME : 'TRANSACTION_ID_COLUMN_NAME';
FORWARD_ONLY : 'FORWARD_ONLY';
FAST_FORWARD : 'FAST_FORWARD';
KEYSET : 'KEYSET';
OPTIMISTIC : 'OPTIMISTIC';
SCROLL_LOCKS : 'SCROLL_LOCKS';
READ_ONLY : 'READ_ONLY';
TYPE_WARNING : 'TYPE_WARNING';
WITHOUT_ARRAY_WRAPPER : 'WITHOUT_ARRAY_WRAPPER';
INCLUDE_NULL_VALUES : 'INCLUDE_NULL_VALUES';
ROOT : 'ROOT';
TYPE : 'TYPE';
BASE64 : 'BASE64';
EXPLICIT : 'EXPLICIT';
ABSENT : 'ABSENT';
XSINIL : 'XSINIL';
ELEMENTS : 'ELEMENTS';
XMLSCHEMA : 'XMLSCHEMA';
XMLDATA : 'XMLDATA';
AUTO : 'AUTO';
ADD : 'ADD';
EXTERNAL : 'EXTERNAL';
PROCEDURE : 'PROCEDURE';
ALL : 'ALL';
FETCH : 'FETCH';
PUBLIC : 'PUBLIC';
ALTER : 'ALTER';
FILE : 'FILE';
RAISERROR : 'RAISERROR';
AND : 'AND';
FILLFACTOR : 'FILLFACTOR';
READ : 'READ';
ANY : 'ANY';
FOR : 'FOR';
READTEXT : 'READTEXT';
AS : 'AS';
FOREIGN : 'FOREIGN';
RECONFIGURE : 'RECONFIGURE';
ASC : 'ASC';
FREETEXT : 'FREETEXT';
REFERENCES : 'REFERENCES';
AUTHORIZATION : 'AUTHORIZATION';
FREETEXTTABLE : 'FREETEXTTABLE';
REPLICATION : 'REPLICATION';
BACKUP : 'BACKUP';
FROM : 'FROM';
RESTORE : 'RESTORE';
BEGIN : 'BEGIN';
FULL : 'FULL';
RESTRICT : 'RESTRICT';
BETWEEN : 'BETWEEN';
FUNCTION : 'FUNCTION';
RETURN : 'RETURN';
BREAK : 'BREAK';
GOTO : 'GOTO';
REVERT : 'REVERT';
BROWSE : 'BROWSE';
GRANT : 'GRANT';
REVOKE : 'REVOKE';
BULK : 'BULK';
GROUP : 'GROUP';
RIGHT : 'RIGHT';
BY : 'BY';
HAVING : 'HAVING';
ROLLBACK : 'ROLLBACK';
CASCADE : 'CASCADE';
HOLDLOCK : 'HOLDLOCK';
ROWCOUNT : 'ROWCOUNT';
CASE : 'CASE';
IDENTITY : 'IDENTITY';
ROWGUIDCOL : 'ROWGUIDCOL';
CHECK : 'CHECK';
IDENTITY_INSERT : 'IDENTITY_INSERT';
RULE : 'RULE';
CHECKPOINT : 'CHECKPOINT';
IDENTITYCOL : 'IDENTITYCOL';
SAVE : 'SAVE';
CLOSE : 'CLOSE';
IF : 'IF';
SCHEMA : 'SCHEMA';
CLUSTERED : 'CLUSTERED';
IN : 'IN';
SECURITYAUDIT : 'SECURITYAUDIT';
COALESCE : 'COALESCE';
INDEX : 'INDEX';
SELECT : 'SELECT';
COLLATE : 'COLLATE';
INNER : 'INNER';
SEMANTICKEYPHRASETABLE : 'SEMANTICKEYPHRASETABLE';
COLUMN : 'COLUMN';
INSERT : 'INSERT';
SEMANTICSIMILARITYDETAILSTABLE : 'SEMANTICSIMILARITYDETAILSTABLE';
COMMIT : 'COMMIT';
INTERSECT : 'INTERSECT';
SEMANTICSIMILARITYTABLE : 'SEMANTICSIMILARITYTABLE';
COMPUTE : 'COMPUTE';
INTO : 'INTO';
SESSION_USER : 'SESSION_USER';
CONSTRAINT : 'CONSTRAINT';
IS : 'IS';
SET : 'SET';
CONTAINS : 'CONTAINS';
JOIN : 'JOIN';
SETUSER : 'SETUSER';
CONTAINSTABLE : 'CONTAINSTABLE';
KEY : 'KEY';
SHUTDOWN : 'SHUTDOWN';
CONTINUE : 'CONTINUE';
KILL : 'KILL';
SOME : 'SOME';
CONVERT : 'CONVERT';
LEFT : 'LEFT';
STATISTICS : 'STATISTICS';
CREATE : 'CREATE';
LIKE : 'LIKE';
SYSTEM_USER : 'SYSTEM_USER';
CROSS : 'CROSS';
LINENO : 'LINENO';
TABLE : 'TABLE';
CURRENT : 'CURRENT';
LOAD : 'LOAD';
TABLESAMPLE : 'TABLESAMPLE';
CURRENT_DATE : 'CURRENT_DATE';
MERGE : 'MERGE';
TEXTSIZE : 'TEXTSIZE';
CURRENT_TIME : 'CURRENT_TIME';
NATIONAL : 'NATIONAL';
THEN : 'THEN';
CURRENT_TIMESTAMP : 'CURRENT_TIMESTAMP';
NOCHECK : 'NOCHECK';
TO : 'TO';
CURRENT_USER : 'CURRENT_USER';
NONCLUSTERED : 'NONCLUSTERED';
TOP : 'TOP';
CURSOR : 'CURSOR';
NOT : 'NOT';
TRAN : 'TRAN';
DATABASE : 'DATABASE';
NULL : 'NULL';
TRANSACTION : 'TRANSACTION';
DBCC : 'DBCC';
NULLIF : 'NULLIF';
TRIGGER : 'TRIGGER';
DEALLOCATE : 'DEALLOCATE';
OF : 'OF';
TRUNCATE : 'TRUNCATE';
DECLARE : 'DECLARE';
OFF : 'OFF';
TRY_CONVERT : 'TRY_CONVERT';
DEFAULT : 'DEFAULT';
OFFSETS : 'OFFSETS';
TSEQUAL : 'TSEQUAL';
DELETE : 'DELETE';
ON : 'ON';
UNION : 'UNION';
DENY : 'DENY';
OPEN : 'OPEN';
UNIQUE : 'UNIQUE';
DESC : 'DESC';
OPENDATASOURCE : 'OPENDATASOURCE';
UNPIVOT : 'UNPIVOT';
DISK : 'DISK';
OPENQUERY : 'OPENQUERY';
UPDATE : 'UPDATE';
DISTINCT : 'DISTINCT';
OPENROWSET : 'OPENROWSET';
UPDATETEXT : 'UPDATETEXT';
DISTRIBUTED : 'DISTRIBUTED';
OPENXML : 'OPENXML';
USE : 'USE';
DOUBLE : 'DOUBLE';
OPTION : 'OPTION';
USER : 'USER';
DROP : 'DROP';
OR : 'OR';
VALUES : 'VALUES';
DUMP : 'DUMP';
ORDER : 'ORDER';
VARYING : 'VARYING';
ELSE : 'ELSE';
OUTER : 'OUTER';
END : 'END';
WAITFOR : 'WAITFOR';
ERRLVL : 'ERRLVL';
PERCENT : 'PERCENT';
WHEN : 'WHEN';
ESCAPE : 'ESCAPE';
PIVOT : 'PIVOT';
WHERE : 'WHERE';
EXCEPT : 'EXCEPT';
PLAN : 'PLAN';
WHILE : 'WHILE';
EXEC : 'EXEC';
PRECISION : 'PRECISION';
WITH : 'WITH';
EXECUTE : 'EXECUTE';
PRIMARY : 'PRIMARY';
EXISTS : 'EXISTS';
PRINT : 'PRINT';
WRITETEXT : 'WRITETEXT';
EXIT : 'EXIT';
PROC : 'PROC';
LEFTPARENTHESIS : '(';
RIGHTPARENTHESIS : ')';
SEMICOLON : ';';
GREATERTHAN : '>';
LESSTHAN : '<';
GREATERTHANOREQUAL : '>=';
LESSTHANOREQUAL : '<=';
NOTEQUAL : '<>' | '!=';
NOTGREATERTHAN : '!>';
NOTLESSTHAN : '!<';
PLUSEQUAL : '+=';
MINUSEQUAL : '-=';
MULTIPLEEQUAL : '*=';
DIVISIONEQUAL : '/=';
MODULEEQUAL : '%=';
ANDEQUAL : '&=';
OREQUAL : '|=';
XOREQUAL : '^=';
EQUAL : '=';
STAR : '*';
MINUS : '-';
PLUS : '+';
DIVISION : '/';
SINGLEQUOTATION : '\'';
DOUBLEQUOTATION : '"';
Tilde : '~';
OROPERATION : '|';
ANDOPERATION : '&';
Exclamation : '!';
ATSYMBOL : '@';
DOT : '.';
DOLLAR : '$';
ZERO : '0';
ABSOLUTE : 'ABSOLUTE';
HOST : 'HOST';
RELATIVE : 'RELATIVE';
ACTION : 'ACTION';
HOUR : 'HOUR';
RELEASE : 'RELEASE';
ADMIN : 'ADMIN';
IGNORE : 'IGNORE';
RESULT : 'RESULT';
AFTER : 'AFTER';
IMMEDIATE : 'IMMEDIATE';
RETURNS : 'RETURNS';
AGGREGATE : 'AGGREGATE';
INDICATOR : 'INDICATOR';
ROLE : 'ROLE';
ALIAS : 'ALIAS';
INITIALIZE : 'INITIALIZE';
ROLLUP : 'ROLLUP';
ALLOCATE : 'ALLOCATE';
INITIALLY : 'INITIALLY';
ROUTINE : 'ROUTINE';
ARE : 'ARE';
INOUT : 'INOUT';
ROW : 'ROW';
ARRAY : 'ARRAY';
INPUT : 'INPUT';
ROWS : 'ROWS';
ASENSITIVE : 'ASENSITIVE';
INT : 'INT';
SAVEPOINT : 'SAVEPOINT';
ASSERTION : 'ASSERTION';
INTEGER : 'INTEGER';
SCROLL : 'SCROLL';
ASYMMETRIC : 'ASYMMETRIC';
INTERSECTION : 'INTERSECTION';
SCOPE : 'SCOPE';
AT : 'AT';
INTERVAL : 'INTERVAL';
SEARCH : 'SEARCH';
ATOMIC : 'ATOMIC';
ISOLATION : 'ISOLATION';
SECOND : 'SECOND';
BEFORE : 'BEFORE';
ITERATE : 'ITERATE';
SECTION : 'SECTION';
BINARY : 'BINARY';
LANGUAGE : 'LANGUAGE';
SENSITIVE : 'SENSITIVE';
BIT : 'BIT';
LARGE : 'LARGE';
SEQUENCE : 'SEQUENCE';
BLOB : 'BLOB';
LAST : 'LAST';
SESSION : 'SESSION';
BOOLEAN : 'BOOLEAN';
LATERAL : 'LATERAL';
SETS : 'SETS';
BOTH : 'BOTH';
LEADING : 'LEADING';
SIMILAR : 'SIMILAR';
BREADTH : 'BREADTH';
LESS : 'LESS';
SIZE : 'SIZE';
CALL : 'CALL';
LEVEL : 'LEVEL';
SMALLINT : 'SMALLINT';
CALLED : 'CALLED';
LIKE_REGEX : 'LIKE_REGEX';
SPACE : 'SPACE';
CARDINALITY : 'CARDINALITY';
LIMIT : 'LIMIT';
SPECIFIC : 'SPECIFIC';
CASCADED : 'CASCADED';
LN : 'LN';
SPECIFICTYPE : 'SPECIFICTYPE';
LOCAL : 'LOCAL';
SQL : 'SQL';
CATALOG : 'CATALOG';
LOCALTIME : 'LOCALTIME';
SQLEXCEPTION : 'SQLEXCEPTION';
CHAR : 'CHAR';
LOCALTIMESTAMP : 'LOCALTIMESTAMP';
SQLSTATE : 'SQLSTATE';
CHARACTER : 'CHARACTER';
LOCATOR : 'LOCATOR';
SQLWARNING : 'SQLWARNING';
CLASS : 'CLASS';
MAP : 'MAP';
START : 'START';
CLOB : 'CLOB';
MATCH : 'MATCH';
COLLATION : 'COLLATION';
MEMBER : 'MEMBER';
STATEMENT : 'STATEMENT';
COLLECT : 'COLLECT';
METHOD : 'METHOD';
STATIC : 'STATIC';
COMPLETION : 'COMPLETION';
MINUTE : 'MINUTE';
STDDEV_POP : 'STDDEV_POP';
CONDITION : 'CONDITION';
MOD : 'MOD';
STDDEV_SAMP : 'STDDEV_SAMP';
CONNECT : 'CONNECT';
MODIFIES : 'MODIFIES';
STRUCTURE : 'STRUCTURE';
CONNECTION : 'CONNECTION';
MODIFY : 'MODIFY';
SUBMULTISET : 'SUBMULTISET';
CONSTRAINTS : 'CONSTRAINTS';
MODULE : 'MODULE';
SUBSTRING_REGEX : 'SUBSTRING_REGEX';
CONSTRUCTOR : 'CONSTRUCTOR';
MONTH : 'MONTH';
SYMMETRIC : 'SYMMETRIC';
CORR : 'CORR';
MULTISET : 'MULTISET';
SYSTEM : 'SYSTEM';
CORRESPONDING : 'CORRESPONDING';
NAMES : 'NAMES';
TEMPORARY : 'TEMPORARY';
COVAR_POP : 'COVAR_POP';
NATURAL : 'NATURAL';
TERMINATE : 'TERMINATE';
COVAR_SAMP : 'COVAR_SAMP';
NCHAR : 'NCHAR';
THAN : 'THAN';
CUBE : 'CUBE';
NCLOB : 'NCLOB';
TIME : 'TIME';
CUME_DIST : 'CUME_DIST';
NEW : 'NEW';
TIMESTAMP : 'TIMESTAMP';
CURRENT_CATALOG : 'CURRENT_CATALOG';
NEXT : 'NEXT';
TIMEZONE_HOUR : 'TIMEZONE_HOUR';
CURRENT_DEFAULT_TRANSFORM_GROUP : 'CURRENT_DEFAULT_TRANSFORM_GROUP';
NO : 'NO';
TIMEZONE_MINUTE : 'TIMEZONE_MINUTE';
CURRENT_PATH : 'CURRENT_PATH';
NONE : 'NONE';
TRAILING : 'TRAILING';
CURRENT_ROLE : 'CURRENT_ROLE';
NORMALIZE : 'NORMALIZE';
TRANSLATE_REGEX : 'TRANSLATE_REGEX';
CURRENT_SCHEMA : 'CURRENT_SCHEMA';
NUMERIC : 'NUMERIC';
TRANSLATION : 'TRANSLATION';
CURRENT_TRANSFORM_GROUP_FOR_TYPE : 'CURRENT_TRANSFORM_GROUP_FOR_TYPE';
OBJECT : 'OBJECT';
TREAT : 'TREAT';
CYCLE : 'CYCLE';
OCCURRENCES_REGEX : 'OCCURRENCES_REGEX';
TRUE : 'TRUE';
DATA : 'DATA';
OLD : 'OLD';
UESCAPE : 'UESCAPE';
DATE : 'DATE';
ONLY : 'ONLY';
UNDER : 'UNDER';
DAY : 'DAY';
OPERATION : 'OPERATION';
UNKNOWN : 'UNKNOWN';
DEC : 'DEC';
ORDINALITY : 'ORDINALITY';
UNNEST : 'UNNEST';
DECIMAL : 'DECIMAL';
OUT : 'OUT';
USAGE : 'USAGE';
DEFERRABLE : 'DEFERRABLE';
OVERLAY : 'OVERLAY';
DEFERRED : 'DEFERRED';
OUTPUT : 'OUTPUT';
DEPTH : 'DEPTH';
PAD : 'PAD';
VAR_POP : 'VAR_POP';
DEREF : 'DEREF';
PARAMETER : 'PARAMETER';
VAR_SAMP : 'VAR_SAMP';
DESCRIBE : 'DESCRIBE';
PARAMETERS : 'PARAMETERS';
VARCHAR : 'VARCHAR';
DESCRIPTOR : 'DESCRIPTOR';
PARTIAL : 'PARTIAL';
VARIABLE : 'VARIABLE';
DESTROY : 'DESTROY';
PARTITION : 'PARTITION';
WHENEVER : 'WHENEVER';
DESTRUCTOR : 'DESTRUCTOR';
PATH : 'PATH';
WIDTH_BUCKET : 'WIDTH_BUCKET';
DETERMINISTIC : 'DETERMINISTIC';
POSTFIX : 'POSTFIX';
WITHOUT : 'WITHOUT';
DICTIONARY : 'DICTIONARY';
PREFIX : 'PREFIX';
WINDOW : 'WINDOW';
DIAGNOSTICS : 'DIAGNOSTICS';
PREORDER : 'PREORDER';
WITHIN : 'WITHIN';
DISCONNECT : 'DISCONNECT';
PREPARE : 'PREPARE';
WORK : 'WORK';
DOMAIN : 'DOMAIN';
PERCENT_RANK : 'PERCENT_RANK';
WRITE : 'WRITE';
DYNAMIC : 'DYNAMIC';
PERCENTILE_CONT : 'PERCENTILE_CONT';
XMLAGG : 'XMLAGG';
EACH : 'EACH';
PERCENTILE_DISC : 'PERCENTILE_DISC';
XMLATTRIBUTES : 'XMLATTRIBUTES';
ELEMENT : 'ELEMENT';
POSITION_REGEX : 'POSITION_REGEX';
XMLBINARY : 'XMLBINARY';
ENDEXEC : 'END-EXEC';
PRESERVE : 'PRESERVE';
XMLCAST : 'XMLCAST';
EQUALS : 'EQUALS';
PRIOR : 'PRIOR';
XMLCOMMENT : 'XMLCOMMENT';
EVERY : 'EVERY';
PRIVILEGES : 'PRIVILEGES';
XMLCONCAT : 'XMLCONCAT';
EXCEPTION : 'EXCEPTION';
RANGE : 'RANGE';
XMLDOCUMENT : 'XMLDOCUMENT';
FALSE : 'FALSE';
READS : 'READS';
XMLELEMENT : 'XMLELEMENT';
FILTER : 'FILTER';
REAL : 'REAL';
XMLEXISTS : 'XMLEXISTS';
FIRST : 'FIRST';
RECURSIVE : 'RECURSIVE';
XMLFOREST : 'XMLFOREST';
FLOAT : 'FLOAT';
REF : 'REF';
XMLITERATE : 'XMLITERATE';
FOUND : 'FOUND';
REFERENCING : 'REFERENCING';
XMLNAMESPACES : 'XMLNAMESPACES';
FREE : 'FREE';
REGR_AVGX : 'REGR_AVGX';
XMLPARSE : 'XMLPARSE';
FULLTEXTTABLE : 'FULLTEXTTABLE';
REGR_AVGY : 'REGR_AVGY';
XMLPI : 'XMLPI';
FUSION : 'FUSION';
REGR_COUNT : 'REGR_COUNT';
XMLQUERY : 'XMLQUERY';
GENERAL : 'GENERAL';
REGR_INTERCEPT : 'REGR_INTERCEPT';
XMLSERIALIZE : 'XMLSERIALIZE';
GET : 'GET';
REGR_R2 : 'REGR_R2';
XMLTABLE : 'XMLTABLE';
GLOBAL : 'GLOBAL';
REGR_SLOPE : 'REGR_SLOPE';
XMLTEXT : 'XMLTEXT';
GO : 'GO';
REGR_SXX : 'REGR_SXX';
XMLVALIDATE : 'XMLVALIDATE';
GROUPING : 'GROUPING';
REGR_SXY : 'REGR_SXY';
YEAR : 'YEAR';
HOLD : 'HOLD';
REGR_SYY : 'REGR_SYY';
ZONE : 'ZONE';
COMMA : ',';
RAW : 'RAW';
BIGINT : 'BIGINT';
DATETIME : 'DATETIME';
DATETIME2 : 'DATETIME2';
DATETIMEOFFSET : 'DATETIMEOFFSET';
GEOGRAPHY : 'GEOGRAPHY';
GEOMETRY : 'GEOMETRY';
HIERARCHYID : 'HIERARCHYID';
IMAGE : 'IMAGE';
MONEY : 'MONEY';
NTEXT : 'NTEXT';
SMALLDATETIME : 'SMALLDATETIME';
SMALLMONEY : 'SMALLMONEY';
SQL_VARIANT : 'SQL_VARIANT';
SYSNAME : 'SYSNAME';
TEXT : 'TEXT';
TINYINT : 'TINYINT';
UNIQUEIDENTIFIER : 'UNIQUEIDENTIFIER';
NVARCHAR : 'NVARCHAR';
VARBINARY : 'VARBINARY';
IDENTIFIERS: IDENTIFIER | KEYWORDIDENTIFIER;
IDENTIFIER : STARTIDENTIFIER ENDIDENTIFIER*;
KEYWORDIDENTIFIER : LEFTSQUAREBRACKET (~']')+ RIGHTSQUAREBRACKET;
STARTIDENTIFIER : [A-Z_#] ;
ENDIDENTIFIER : [A-Z_#$@0-9];
DIGIT: [0-9];
INTEGERNUMBER: MINUS? DIGIT+;
FLOATNUMBER:
MINUS?	INTEGERNUMBER (DOT INTEGERNUMBER)? (E INTEGERNUMBER)?;
E: 'e';
LITERALSTRING:
	N? SINGLEQUOTATION (SINGLEQUOTATION SINGLEQUOTATION | ~('\''))* SINGLEQUOTATION;
BITSTRING: '0b' [01]+;
HEXSTRING: '0x' [0-9A-F]+;
MULTILINECOMMIT:
	STARTMULTILINECOMMIT (MULTILINECOMMIT | (~'*') | STAR ~'/')* ENDMULTILINECOMMIT;
STARTMULTILINECOMMIT: '/*';
ENDMULTILINECOMMIT: '*/';
SINGLELINECOMMIT: MINUS MINUS ~'\n'*;
LEFTSQUAREBRACKET : '[';
RIGHTSQUAREBRACKET : ']';






sELECTstatement :
    ( WITH ( ( XMLNAMESPACES COMMA )? ( common_table_expression (COMMA common_table_expression)*  )? ) )?
    query_expression
    ( order_byCLASUE )?
    ( fORClause )
    ( OPTION  LEFTPARENTHESIS  query_hint (COMMA query_hint )*  RIGHTPARENTHESIS  )?
    (SEMICOLON)?;



query_expression :
    ( query_specification |  LEFTPARENTHESIS  query_expression  RIGHTPARENTHESIS  )
        (( UNION ( ALL )? | EXCEPT | INTERSECT )
        (query_specification |  LEFTPARENTHESIS  query_expression  RIGHTPARENTHESIS))* ;
query_specification :
    SELECT
    ( ALL | DISTINCT )?
    ( TOP  (LEFTPARENTHESIS  expression  RIGHTPARENTHESIS | expression)  ( PERCENT )? ( WITH TIES )? )?
    select_list
    ( INTO object )?
    ( ON filegroup )?
    ( FROM ( table ) (COMMA table)* )?
    ( WHERE search_condition )?
    ( groupby )?
    ( HAVING search_condition )?
(  SEMICOLON  )?;







common_table_expression:
    expression_name (  LEFTPARENTHESIS  column_name (COMMA column_name)*  RIGHTPARENTHESIS  )?
    AS
     LEFTPARENTHESIS  cTE_query_definition  RIGHTPARENTHESIS ;


search_condition :
    MATCH  LEFTPARENTHESIS graph_search_pattern RIGHTPARENTHESIS  | search_condition_without_match | search_condition AND search_condition;
search_condition_without_match :
    ( ( NOT )? predicate |  LEFTPARENTHESIS  search_condition_without_match  RIGHTPARENTHESIS  )
    ( ( AND | OR ) ( NOT )? ( predicate |  LEFTPARENTHESIS  search_condition_without_match  RIGHTPARENTHESIS  ) )?
    ( ( AND | OR ) ( NOT )? ( predicate |  LEFTPARENTHESIS  search_condition_without_match  RIGHTPARENTHESIS  ) )*;
predicate :
    ( expression (  EQUAL  |  NOTEQUAL  |  NOTEQUAL  |  GREATERTHAN  |  GREATERTHANOREQUAL  |  NOTGREATERTHAN  | LESSTHAN |  LESSTHANOREQUAL  |  NOTLESSTHAN  ) expression
    | string_expression ( NOT )? LIKE string_expression
  ( ESCAPE  SINGLEQUOTATION escape_character SINGLEQUOTATION  )?
    | expression ( NOT )? BETWEEN expression AND expression
    | expression IS ( NOT )? NULL
    | expression IS ( NOT )? DISTINCT FROM
    | CONTAINS
   LEFTPARENTHESIS  ( column |  STAR  ) COMMA  SINGLEQUOTATION contains_search_condition SINGLEQUOTATION   RIGHTPARENTHESIS
    | FREETEXT  LEFTPARENTHESIS  ( column |  STAR  ) COMMA  SINGLEQUOTATION freetext_string SINGLEQUOTATION   RIGHTPARENTHESIS
    | expression ( NOT )? IN  LEFTPARENTHESIS  (subquery | expression (COMMA (subquery | expression))*)  RIGHTPARENTHESIS
    | expression (  EQUAL  |  NOTEQUAL  |  NOTEQUAL  |  GREATERTHAN  |  GREATERTHANOREQUAL  |  NOTGREATERTHAN  | LESSTHAN |  LESSTHANOREQUAL  |  NOTLESSTHAN  )
  ( ALL | SOME | ANY )  LEFTPARENTHESIS  subquery  RIGHTPARENTHESIS
    | EXISTS  LEFTPARENTHESIS  subquery  RIGHTPARENTHESIS      );
graph_search_pattern :
    ( node_alias (
                    ( LESSTHAN MINUS  LEFTPARENTHESIS  edge_alias  RIGHTPARENTHESIS  MINUS  )
                    | (  MINUS  LEFTPARENTHESIS  edge_alias  RIGHTPARENTHESIS  MINUS  GREATERTHAN  )
                    node_alias
                   )
    );
node_alias :
    node_table_name | node_table_alias;
edge_alias :
    edge_table_name | edge_table_alias;






order_byCLASUE : ORDER BY order_by_expression
    ( COLLATE collation_name )?
    ( ASC | DESC )?
    (COMMA order_by_expression
    ( COLLATE collation_name )?
    ( ASC | DESC )?)*
( offset_fetch )?;
offset_fetch :
(
    OFFSET ( integer_constant | offset_row_count_expression ) ( ROW | ROWS )
    (
      FETCH ( FIRST | NEXT ) ( integer_constant | fetch_row_count_expression ) ( ROW | ROWS ) ONLY
    )?
);






fORClause : ( FOR ( BROWSE | xML | jSON) )?  ;
xML :
XML
(
    ( RAW (  LEFTPARENTHESIS    elementName    RIGHTPARENTHESIS  )? | AUTO )
    (
        commonDirectivesForXML
        ( COMMA ( XMLDATA | XMLSCHEMA (  LEFTPARENTHESIS   SINGLEQUOTATION targetNameSpaceURI SINGLEQUOTATION   RIGHTPARENTHESIS  )? ) )?
        ( COMMA ELEMENTS ( XSINIL | ABSENT ))??
    )
  | EXPLICIT
    (
        commonDirectivesForXML
        ( COMMA XMLDATA )?
    )
  | PATH (  LEFTPARENTHESIS    elementName    RIGHTPARENTHESIS  )?
    (
        commonDirectivesForXML
        ( COMMA ELEMENTS ( XSINIL | ABSENT )? )?
    )
) ;
commonDirectivesForXML :
( COMMA BINARY BASE64 )?
( COMMA TYPE )?
( COMMA ROOT (  LEFTPARENTHESIS    rootName    RIGHTPARENTHESIS  )? )?;
jSON :
JSON
(
    ( AUTO | PATH )
    (
        ( COMMA ROOT (  LEFTPARENTHESIS   SINGLEQUOTATION rootName SINGLEQUOTATION   RIGHTPARENTHESIS  )? )?
        ( COMMA INCLUDE_NULL_VALUES )?
        ( COMMA WITHOUT_ARRAY_WRAPPER )?
    )

);
contains_search_condition :
  (
      simple_term
    | prefix_term
    | generation_term
    | generic_proximity_term
    | custom_proximity_term
    | weighted_term
    )
  |
    (  LEFTPARENTHESIS  contains_search_condition  RIGHTPARENTHESIS
        ( ( AND | aNDNOT | OR ) )?
        contains_search_condition
        (( ( AND | aNDNOT | OR ) )?
        contains_search_condition)*
  )  ;
simple_term :
     ( word |  DOUBLEQUOTATION phrase DOUBLEQUOTATION  )  ;
  prefixterm :
  (  DOUBLEQUOTATION word STAR  DOUBLEQUOTATION  |  DOUBLEQUOTATION phrase STAR  DOUBLEQUOTATION  );
  generation_term :
  FORMSOF  LEFTPARENTHESIS  ( INFLECTIONAL | THESAURUS ) COMMA simple_term (COMMA simple_term)*  RIGHTPARENTHESIS    ;
  generic_proximity_term :
  ( simple_term | prefix_term   ) ( ( ( NEAR |  Tilde  )
     ( simple_term | prefix_term   ) )
      (( ( NEAR |  Tilde  )
     ( simple_term | prefix_term   ) ))* )  ;
  custom_proximity_term :
  NEAR  LEFTPARENTHESIS
     (
        ( simple_term | prefix_term   ) (COMMA ( simple_term | prefix_term   ))*
     |
         LEFTPARENTHESIS  ( simple_term | prefix_term   ) (COMMA ( simple_term | prefix_term   ))*  RIGHTPARENTHESIS
      (COMMA maximum_distance (COMMA match_order )? )?
     )
        RIGHTPARENTHESIS;
  maximum_distance : ( integer | MAX );
    match_order : ( TRUE | FALSE );
  weighted_term :
  ISABOUT
    LEFTPARENTHESIS  (
        (
          simple_term
        | prefix_term
        | generation_term
        | proximity_term
        )
      ( WEIGHT  LEFTPARENTHESIS  weight_value  RIGHTPARENTHESIS  )?
      )
      (COMMA (
        (
          simple_term
        | prefix_term
        | generation_term
        | proximity_term
        )
      ( WEIGHT  LEFTPARENTHESIS  weight_value  RIGHTPARENTHESIS  )?
      ))*
    RIGHTPARENTHESIS;
  and :
  ( AND |  ANDOPERATION  );
  aNDNOT :
  ( AND NOT |  ANDOPERATION Exclamation );
  or :
  ( OR | OROPERATION );








groupby : GROUP BY (
      column_expression
    | ROLLUP  LEFTPARENTHESIS  group_by_expression (COMMA group_by_expression)*  RIGHTPARENTHESIS
    | CUBE  LEFTPARENTHESIS  group_by_expression (COMMA group_by_expression)*  RIGHTPARENTHESIS
    | GROUPING SETS  LEFTPARENTHESIS  grouping_set (COMMA grouping_set)*   RIGHTPARENTHESIS
    |  LEFTPARENTHESIS  RIGHTPARENTHESIS
)
(COMMA (
      column_expression
    | ROLLUP  LEFTPARENTHESIS  group_by_expression (COMMA group_by_expression)*  RIGHTPARENTHESIS
    | CUBE  LEFTPARENTHESIS  group_by_expression (COMMA group_by_expression)*  RIGHTPARENTHESIS
    | GROUPING SETS  LEFTPARENTHESIS  grouping_set (COMMA grouping_set)*   RIGHTPARENTHESIS
    |  LEFTPARENTHESIS  RIGHTPARENTHESIS
))*;
 group_by_expression :
      column_expression
    |  LEFTPARENTHESIS  column_expression (COMMA column_expression)*  RIGHTPARENTHESIS;
   grouping_set :
       LEFTPARENTHESIS  RIGHTPARENTHESIS
    | grouping_set_item
    |  LEFTPARENTHESIS  grouping_set_item (COMMA grouping_set_item)*  RIGHTPARENTHESIS;
  grouping_set_item :
      group_by_expression
    | ROLLUP  LEFTPARENTHESIS  group_by_expression (COMMA group_by_expression)*  RIGHTPARENTHESIS
    | CUBE  LEFTPARENTHESIS  group_by_expression (COMMA group_by_expression)*  RIGHTPARENTHESIS;






table : table_source  | joined_table | pivoted_table | unpivoted_table ;


table_source :
(
    | object ( FOR SYSTEM_TIME system_time )? ( ( AS )? table_alias )?
        ( tablesample_clause )?
        ( WITH  LEFTPARENTHESIS  table_hint  (COMMA? table_hint)*  RIGHTPARENTHESIS  )?
    | rowset_function ( ( AS )? table_alias )?
        (  LEFTPARENTHESIS  bulk_column_alias (COMMA bulk_column_alias)*  RIGHTPARENTHESIS  )?
    | user_defined_function ( ( AS )? table_alias )?
    | OPENXML openxml_clause
    | derived_table ( ( AS )? table_alias )? (  LEFTPARENTHESIS  column_alias (COMMA column_alias)*  RIGHTPARENTHESIS  )?
    |  ATSYMBOL variable ( ( AS )? table_alias )?
    | '#' variable ( ( AS )? table_alias )?
    |  ATSYMBOL variable DOT function_call  LEFTPARENTHESIS  expression (COMMA expression)*  RIGHTPARENTHESIS
        ( ( AS )? table_alias )? (  LEFTPARENTHESIS column_alias (COMMA column_alias)*  RIGHTPARENTHESIS  )?
);
tablesample_clause :
    TABLESAMPLE ( SYSTEM )?  LEFTPARENTHESIS  sample_number ( PERCENT | ROWS )?  RIGHTPARENTHESIS
        ( REPEATABLE  LEFTPARENTHESIS  repeat_seed  RIGHTPARENTHESIS  )?;
joined_table :
(
    table_source join_type table ON search_condition (join_type table ON search_condition)*
    | table_source CROSS  table (CROSS JOIN table)*
    | left_table_source ( CROSS | OUTER ) APPLY right_table_source
    | LEFTPARENTHESIS   joined_table RIGHTPARENTHESIS
);
join_type :
    ( ( INNER | ( ( LEFT | RIGHT | FULL ) ( OUTER )? ) ) ( join_hint )? )?
    JOIN;
pivoted_table :
    table_source PIVOT pivot_clause ( ( AS )? table_alias )?;
pivot_clause :
         LEFTPARENTHESIS  aggregate_function  LEFTPARENTHESIS  value_column (COMMA? value_column)*  RIGHTPARENTHESIS
        FOR pivot_column
        IN  LEFTPARENTHESIS  column_list  RIGHTPARENTHESIS
     RIGHTPARENTHESIS;
unpivoted_table :
    table_source UNPIVOT unpivot_clause ( ( AS )? table_alias )?;
unpivot_clause :
     LEFTPARENTHESIS  value_column FOR pivot_column IN  LEFTPARENTHESIS  column_list  RIGHTPARENTHESIS   RIGHTPARENTHESIS;
column_list :
    column_name (COMMA column_name)*;
system_time :
(
      AS OF date_time
    | FROM start_date_time TO end_date_time
    | BETWEEN start_date_time AND end_date_time
    | CONTAINED IN  LEFTPARENTHESIS start_date_time COMMA end_date_time RIGHTPARENTHESIS
    | ALL
);
date_time:
        date_time_literal   |  ATSYMBOL date_time_variable;
start_date_time:
        date_time_literal   |  ATSYMBOL date_time_variable;
end_date_time:
        date_time_literal   |  ATSYMBOL date_time_variable;


select_list :
    (
       STAR
      | ( table_name | view_name | table_alias ) DOT  STAR
      | (
          ( ( table_name | view_name | table_alias ) DOT  )?
               ( column_name |   IDENTITY |   ROWGUID )
          | udt_column_name ( (  DOT  | TEMP TEMP ) ( ( property_name | field_name )
            | method_name  LEFTPARENTHESIS  argument (COMMA argument)*  RIGHTPARENTHESIS  ) )?
          | expression
         )
        ( ( AS )? column_alias )?
      | column_alias  EQUAL  expression
    )
    (COMMA (
       STAR
      | ( table_name | view_name | table_alias ) DOT  STAR
      | (
          ( ( table_name | view_name | table_alias ) DOT  )?
               ( column_name |   IDENTITY |   ROWGUID )
          | udt_column_name ( (  DOT  | TEMP TEMP ) ( ( property_name | field_name )
            | method_name  LEFTPARENTHESIS  argument (COMMA argument)*  RIGHTPARENTHESIS  ) )?
          | expression
         )
        ( ( AS )? column_alias )?
      | column_alias  EQUAL  expression
    ) )*;



query_hint :
( ( HASH | ORDER ) GROUP
  | ( CONCAT | HASH | MERGE ) UNION
  | ( LOOP | MERGE | HASH ) JOIN
  | DISABLE_OPTIMIZED_PLAN_FORCING
  | EXPAND VIEWS
  | FAST integer_value
  | FORCE ORDER
  | ( FORCE | DISABLE ) EXTERNALPUSHDOWN
  | ( FORCE | DISABLE ) SCALEOUTEXECUTION
  | IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX
  | KEEP PLAN
  | KEEPFIXED PLAN
  | MAX_GRANT_PERCENT  EQUAL  numeric_value
  | MIN_GRANT_PERCENT  EQUAL  numeric_value
  | MAXDOP integer_value
  | MAXRECURSION integer_value
  | NO_PERFORMANCE_SPOOL
  | OPTIMIZE FOR  LEFTPARENTHESIS   ATSYMBOL variable_name ( UNKNOWN |  EQUAL  literal_constant   ) (COMMA  ATSYMBOL variable_name ( UNKNOWN |  EQUAL  literal_constant   ))*  RIGHTPARENTHESIS
  | OPTIMIZE FOR UNKNOWN
  | PARAMETERIZATION ( SIMPLE | FORCED )
  | QUERYTRACEON integer_value
  | RECOMPILE
  | ROBUST PLAN
  | USE HINT  LEFTPARENTHESIS   SINGLEQUOTATION hint_name SINGLEQUOTATION  (COMMA  SINGLEQUOTATION hint_name SINGLEQUOTATION )*  RIGHTPARENTHESIS
  | USE PLAN N SINGLEQUOTATION xml_plan   SINGLEQUOTATION
  | TABLE HINT  LEFTPARENTHESIS  exposed_object_name   ( COMMA table_hint (COMMA? table_hint)* )?  RIGHTPARENTHESIS
  | FOR TIMESTAMP AS OF  SINGLEQUOTATION point_in_time   SINGLEQUOTATION
);
table_hint :
( NOEXPAND ( COMMA INDEX  LEFTPARENTHESIS  index_value  index_value (COMMA index_value)* RIGHTPARENTHESIS  | INDEX  EQUAL   (LEFTPARENTHESIS  index_value    RIGHTPARENTHESIS | index_value)  )?
  | INDEX  LEFTPARENTHESIS  index_value (COMMA index_value)*  RIGHTPARENTHESIS  | INDEX  EQUAL   (LEFTPARENTHESIS  index_value    RIGHTPARENTHESIS | index_value)
  | FORCESEEK (  LEFTPARENTHESIS  index_value    LEFTPARENTHESIS  index_column_name (COMMA index_column_name)*  RIGHTPARENTHESIS   RIGHTPARENTHESIS  )?
  | FORCESCAN
  | HOLDLOCK
  | NOLOCK
  | NOWAIT
  | PAGLOCK
  | READCOMMITTED
  | READCOMMITTEDLOCK
  | READPAST
  | READUNCOMMITTED
  | REPEATABLEREAD
  | ROWLOCK
  | SERIALIZABLE
  | SNAPSHOT
  | SPATIAL_WINDOW_MAX_CELLS  EQUAL  integer_value
  | TABLOCK
  | TABLOCKX
  | UPDLOCK
  | XLOCK
);







table_hint_limited :
(
    KEEPIDENTITY
  | KEEPDEFAULTS
  | HOLDLOCK
  | IGNORE_CONSTRAINTS
  | IGNORE_TRIGGERS
  | NOLOCK
  | NOWAIT
  | PAGLOCK
  | READCOMMITTED
  | READCOMMITTEDLOCK
  | READPAST
  | REPEATABLEREAD
  | ROWLOCK
  | SERIALIZABLE
  | SNAPSHOT
  | TABLOCK
  | TABLOCKX
  | UPDLOCK
  | XLOCK
);



openxml_clause : OPENXML  LEFTPARENTHESIS  idoc int ( in )?
    COMMA rowpattern nvarchar ( in )?
    COMMA ( flags byte ( in )? )?  RIGHTPARENTHESIS
( WITH  LEFTPARENTHESIS  schemaDeclaration | table_name  RIGHTPARENTHESIS  )?;





join_hint :
     ( LOOP | HASH | MERGE | REMOTE | REDUCE | REPLICATE | REDISTRIBUTE ( LEFTPARENTHESIS columns count RIGHTPARENTHESIS )?);








update : ( WITH common_table_expression (common_table_expression)* )?
UPDATE
    ( TOP  LEFTPARENTHESIS  expression  RIGHTPARENTHESIS  ( PERCENT )? )?
    ( ( (table_alias | object | rowset_function_limited)
         ( WITH  LEFTPARENTHESIS  table_hint_limited (COMMA table_hint_limited)*  RIGHTPARENTHESIS  )?
      )
      |  ATSYMBOL table_variable
    )
    SET
        ( (object DOT )? column_name  EQUAL  ( expression | DEFAULT | NULL )
          | ( udt_column_name DOT ( ( property_name  EQUAL  expression
                                | field_name  EQUAL  expression )
                                | method_name  LEFTPARENTHESIS  argument (COMMA argument)*  RIGHTPARENTHESIS
                              )
          )
          | column_name (  DOT WRITE  LEFTPARENTHESIS  (expression | NULL) COMMA   offset COMMA   length  RIGHTPARENTHESIS  )
          |  ATSYMBOL variable  EQUAL  expression
          |  ATSYMBOL variable  EQUAL  column  EQUAL  expression
          | column_name (  PLUSEQUAL  |  MINUSEQUAL  |  MULTIPLEEQUAL  |  DIVISIONEQUAL  | MODULEEQUAL | ANDEQUAL |  XOREQUAL  |  OREQUAL  ) expression
          |  ATSYMBOL variable (  PLUSEQUAL  |  MINUSEQUAL  |  MULTIPLEEQUAL  |  DIVISIONEQUAL  | MODULEEQUAL | ANDEQUAL |  XOREQUAL  |  OREQUAL  ) expression
          |  ATSYMBOL variable  EQUAL  column (  PLUSEQUAL  |  MINUSEQUAL  |  MULTIPLEEQUAL  |  DIVISIONEQUAL  | MODULEEQUAL | ANDEQUAL |  XOREQUAL  |  OREQUAL  ) expression
        )
         (COMMA ( column_name  EQUAL  ( expression | DEFAULT | NULL )
          | ( udt_column_name DOT ( ( property_name  EQUAL  expression
                                | field_name  EQUAL  expression )
                                | method_name  LEFTPARENTHESIS  argument (COMMA argument)*  RIGHTPARENTHESIS
                              )
          )
          | column_name (  DOT WRITE  LEFTPARENTHESIS  (expression | NULL) COMMA offset COMMA   length  RIGHTPARENTHESIS  )
          |  ATSYMBOL variable  EQUAL  expression
          |  ATSYMBOL variable  EQUAL  column  EQUAL  expression
          | column_name (  PLUSEQUAL  |  MINUSEQUAL  |  MULTIPLEEQUAL  |  DIVISIONEQUAL  | MODULEEQUAL | ANDEQUAL |  XOREQUAL  |  OREQUAL  ) expression
          |  ATSYMBOL variable (  PLUSEQUAL  |  MINUSEQUAL  |  MULTIPLEEQUAL  |  DIVISIONEQUAL  | MODULEEQUAL | ANDEQUAL |  XOREQUAL  |  OREQUAL  ) expression
          |  ATSYMBOL variable  EQUAL  column (  PLUSEQUAL  |  MINUSEQUAL  |  MULTIPLEEQUAL  |  DIVISIONEQUAL  | MODULEEQUAL | ANDEQUAL |  XOREQUAL  |  OREQUAL  ) expression
        ))*

    ( oUTPUT_CLAUSE   )
    ( FROM( table ) (COMMA table)*)?
    ( WHERE ( search_condition
            | ( ( CURRENT OF
                  ( ( ( GLOBAL )? cursor_name )
                      | cursor_variable_name
                  )
                )?
              )
            )
    )?
    ( OPTION  LEFTPARENTHESIS  query_hint (COMMA query_hint )*  RIGHTPARENTHESIS  )?
(  SEMICOLON  )?;
  object :
  (opendatasource DOT)?
(
    ( server_name  DOT  database_name  DOT  schema_name  DOT
    | database_name  DOT ( schema_name )?  DOT
    | schema_name  DOT
    )?
    table_or_view_name)  ;



oUTPUT_CLAUSE :
(
    ( OUTPUT dml_select_list INTO (  ATSYMBOL table_variable | output_table ) (  LEFTPARENTHESIS  column_list  RIGHTPARENTHESIS  )? )?
    ( OUTPUT dml_select_list )?
);
dml_select_list :
( column_name1 | scalar_expression ) ( ( AS )? column_alias_identifier )?
    (COMMA ( column_name1 | scalar_expression ) ( ( AS )? column_alias_identifier )?)*;
column_name1 :
( DELETED | INSERTED | from_table_name )  DOT  (  STAR  | column_name )
    |  DOLLAR ACTION;








delete : ( WITH common_table_expression (COMMA common_table_expression)* )?
DELETE
    ( TOP  LEFTPARENTHESIS  expression  RIGHTPARENTHESIS  ( PERCENT )? )?
    ( FROM )?
    ( ( table_alias
      | object
      | rowset_function_limited
      ( WITH  LEFTPARENTHESIS  table_hint_limited (COMMA table_hint_limited)*  RIGHTPARENTHESIS  )? )
      |  ATSYMBOL table_variable
    )
    ( oUTPUT_CLAUSE   )
    ( FROM table  (COMMA table)*)?
    ( WHERE ( search_condition
            | ( ( CURRENT OF
                   ( ( ( GLOBAL )? cursor_name )
                       | cursor_variable_name
                   )
                )?
              )
            )
    )?
    ( OPTION  LEFTPARENTHESIS  query_hint (COMMA query_hint)*  RIGHTPARENTHESIS  )?
( SEMICOLON  )?;








insert : ( WITH common_table_expression (COMMA common_table_expression)*  )?
INSERT
(
        ( TOP  LEFTPARENTHESIS  expression  RIGHTPARENTHESIS  ( PERCENT )? )?
        ( INTO )?
        ( (table | rowset_function_limited)
          ( WITH  LEFTPARENTHESIS  table_hint_limited (COMMA table_hint_limited)*  RIGHTPARENTHESIS  )?
        | ATSYMBOL variable
        )
    (
        (  LEFTPARENTHESIS  column_list  RIGHTPARENTHESIS  )?
        ( oUTPUT_CLAUSE   )
        ( VALUES  LEFTPARENTHESIS  ( DEFAULT | NULL | expression ) (COMMA  ( DEFAULT | NULL | expression ))*  RIGHTPARENTHESIS (COMMA LEFTPARENTHESIS  ( DEFAULT | NULL | expression ) (COMMA  ( DEFAULT | NULL | expression ))*  RIGHTPARENTHESIS )*
        | derived_table
        | execute_statement
        | dml_table_source
        | DEFAULT VALUES
        )
    )
)
( SEMICOLON )?;

dml_table_source :
    SELECT
    ( TOP  (LEFTPARENTHESIS  expression  RIGHTPARENTHESIS | expression)  ( PERCENT )? ( WITH TIES )? )?
     select_list
    FROM  (LEFTPARENTHESIS  (dml_statement_with_output_clause | merge)    RIGHTPARENTHESIS | (merge | dml_statement_with_output_clause))
      ((AS)? table_alias (  LEFTPARENTHESIS  column_alias (COMMA column_alias)*  RIGHTPARENTHESIS  )?)?
    ( WHERE search_condition )?
    order_byCLASUE?
        ( OPTION  LEFTPARENTHESIS  query_hint (COMMA query_hint )*  RIGHTPARENTHESIS  )?;

merge : ( WITH common_table_expression (COMMA common_table_expression)* )?
MERGE
    ( TOP  LEFTPARENTHESIS  expression  RIGHTPARENTHESIS  ( PERCENT )? )?
    ( INTO )? target_table ( WITH  LEFTPARENTHESIS  merge_hint  RIGHTPARENTHESIS  )? ( ( AS )? table_alias )?
    USING table_source ( ( AS )? table_alias )?
    ON merge_search_condition
     (WHEN MATCHED ( AND clause_search_condition )?
        THEN merge_matched )*
    ( WHEN NOT MATCHED ( BY TARGET )? ( AND clause_search_condition )?
        THEN merge_not_matched )?
    ( WHEN NOT MATCHED BY SOURCE ( AND clause_search_condition )?
        THEN merge_matched )*
    ( oUTPUT_CLAUSE )?
    ( OPTION  LEFTPARENTHESIS  query_hint (COMMA query_hint)*  RIGHTPARENTHESIS  )?;


target_table :
(
    ( database_name DOT schema_name DOT | schema_name DOT )? ( ( AS )? table_or_view_name )?
    | ATSYMBOL variable ( ( AS )? target_table )?
    | common_table_expression_name ( ( AS )? target_table )?
);

merge_hint:
(
    ( ( table_hint_limited (COMMA table_hint_limited)* )?
    ( (  COMMA  )? ( INDEX  LEFTPARENTHESIS  index_value (COMMA index_value)  RIGHTPARENTHESIS  | INDEX  EQUAL  index_value ))?
    )
);

merge_search_condition :
    search_condition;

merge_matched:
    ( UPDATE SET set_clause | DELETE );

merge_not_matched:
(
    INSERT (  LEFTPARENTHESIS  column_list  RIGHTPARENTHESIS  )?
        ( VALUES  LEFTPARENTHESIS  values_list  RIGHTPARENTHESIS
        | DEFAULT VALUES )
);

clause_search_condition :
    search_condition;


drop : DROP TABLE ( IF EXISTS )? ( database_name DOT schema_name DOT table_name | schema_name DOT table_name | table_name ) (COMMA ( database_name DOT schema_name DOT table_name | schema_name DOT table_name | table_name ))*
(  SEMICOLON  )?;




values_list : LEFTPARENTHESIS  ( DEFAULT | NULL | expression ) (COMMA  ( DEFAULT | NULL | expression ))*  RIGHTPARENTHESIS (COMMA LEFTPARENTHESIS  ( DEFAULT | NULL | expression ) (COMMA  ( DEFAULT | NULL | expression ))*  RIGHTPARENTHESIS )*;
set_clause :
                     ( (object DOT )? column_name  EQUAL  ( expression | DEFAULT | NULL )
                       | ( udt_column_name DOT ( ( property_name  EQUAL  expression
                                             | field_name  EQUAL  expression )
                                             | method_name  LEFTPARENTHESIS  argument (COMMA argument)*  RIGHTPARENTHESIS
                                           )
                       )
                       | column_name (  DOT WRITE  LEFTPARENTHESIS  (expression | NULL) COMMA   offset COMMA   length  RIGHTPARENTHESIS  )
                       |  ATSYMBOL variable  EQUAL  expression
                       |  ATSYMBOL variable  EQUAL  column  EQUAL  expression
                       | column_name (  PLUSEQUAL  |  MINUSEQUAL  |  MULTIPLEEQUAL  |  DIVISIONEQUAL  | MODULEEQUAL | ANDEQUAL |  XOREQUAL  |  OREQUAL  ) expression
                       |  ATSYMBOL variable (  PLUSEQUAL  |  MINUSEQUAL  |  MULTIPLEEQUAL  |  DIVISIONEQUAL  | MODULEEQUAL | ANDEQUAL |  XOREQUAL  |  OREQUAL  ) expression
                       |  ATSYMBOL variable  EQUAL  column (  PLUSEQUAL  |  MINUSEQUAL  |  MULTIPLEEQUAL  |  DIVISIONEQUAL  | MODULEEQUAL | ANDEQUAL |  XOREQUAL  |  OREQUAL  ) expression
                     )
                      (COMMA ( column_name  EQUAL  ( expression | DEFAULT | NULL )
                       | ( udt_column_name DOT ( ( property_name  EQUAL  expression
                                             | field_name  EQUAL  expression )
                                             | method_name  LEFTPARENTHESIS  argument (COMMA argument)*  RIGHTPARENTHESIS
                                           )
                       )
                       | column_name (  DOT WRITE  LEFTPARENTHESIS  (expression | NULL) COMMA offset COMMA   length  RIGHTPARENTHESIS  )
                       |  ATSYMBOL variable  EQUAL  expression
                       |  ATSYMBOL variable  EQUAL  column  EQUAL  expression
                       | column_name (  PLUSEQUAL  |  MINUSEQUAL  |  MULTIPLEEQUAL  |  DIVISIONEQUAL  | MODULEEQUAL | ANDEQUAL |  XOREQUAL  |  OREQUAL  ) expression
                       |  ATSYMBOL variable (  PLUSEQUAL  |  MINUSEQUAL  |  MULTIPLEEQUAL  |  DIVISIONEQUAL  | MODULEEQUAL | ANDEQUAL |  XOREQUAL  |  OREQUAL  ) expression
                       |  ATSYMBOL variable  EQUAL  column (  PLUSEQUAL  |  MINUSEQUAL  |  MULTIPLEEQUAL  |  DIVISIONEQUAL  | MODULEEQUAL | ANDEQUAL |  XOREQUAL  |  OREQUAL  ) expression
                     ))*;

alter : ALTER TABLE object
(
    ALTER COLUMN column_name
    (
        ( type_schema_name DOT  )? type_name
            (  LEFTPARENTHESIS
                (
                   precision ( COMMA scale )?
                 | max
                 | xml_schema_collection
                )
             RIGHTPARENTHESIS  )?
        ( COLLATE collation_name )?
        ( NULL | NOT NULL )? ( SPARSE )?
      | ( ADD | DROP )
          ( ROWGUIDCOL | PERSISTED | NOT FOR REPLICATION | SPARSE | HIDDEN1 )
          ( NULL | NOT NULL )?
      | ( ADD | DROP ) MASKED ( WITH  LEFTPARENTHESIS  FUNCTION  EQUAL   SINGLEQUOTATION  mask_function  SINGLEQUOTATION  RIGHTPARENTHESIS  )?
    )
    ( WITH  LEFTPARENTHESIS  ONLINE  EQUAL  ON | OFF  RIGHTPARENTHESIS  )?
    | ( WITH ( CHECK | NOCHECK ) )?

    |ADD
    (
        column_definition
      | computed_column_definition
      | table_constraint
      | column_set_definition
    )
     (COMMA (
        column_definition
      | computed_column_definition
      | table_constraint
      | column_set_definition
    ))*
      | ( system_start_time_column_name datetime2 GENERATED ALWAYS AS ROW START
                ( HIDDEN1 )? ( NOT NULL )? ( CONSTRAINT constraint_name )?
            DEFAULT constant_expression (WITH VALUES)? COMMA
                system_end_time_column_name datetime2 GENERATED ALWAYS AS ROW END
                   ( HIDDEN1 )? ( NOT NULL )?( CONSTRAINT constraint_name )?
            DEFAULT constant_expression (WITH VALUES)? COMMA
                start_transaction_id_column_name bigint GENERATED ALWAYS AS TRANSACTION_ID START
                   ( HIDDEN1 )? NOT NULL ( CONSTRAINT constraint_name )?
            DEFAULT constant_expression (WITH VALUES)?COMMA
                  end_transaction_id_column_name bigint GENERATED ALWAYS AS TRANSACTION_ID END
                   ( HIDDEN1 )? NULL ( CONSTRAINT constraint_name )?
            DEFAULT constant_expression (WITH VALUES)?COMMA
                  start_sequence_number_column_name bigint GENERATED ALWAYS AS SEQUENCE_NUMBER START
                   ( HIDDEN1 )? NOT NULL ( CONSTRAINT constraint_name )?
            DEFAULT constant_expression (WITH VALUES)?COMMA
                  end_sequence_number_column_name bigint GENERATED ALWAYS AS SEQUENCE_NUMBER END
                   ( HIDDEN1 )? NULL ( CONSTRAINT constraint_name )?
            DEFAULT constant_expression (WITH VALUES)?
        )?
       PERIOD FOR SYSTEM_TIME  LEFTPARENTHESIS  system_start_time_column_name COMMA system_end_time_column_name  RIGHTPARENTHESIS
    | DROP
     ( (
         ( CONSTRAINT )?( IF EXISTS )?
         (
              constraint_name
              ( WITH
                LEFTPARENTHESIS  drop_clustered_constraint_option (COMMA drop_clustered_constraint_option)*  RIGHTPARENTHESIS
              )?
          )
          (COMMA  (
              constraint_name
              ( WITH
                LEFTPARENTHESIS  drop_clustered_constraint_option (COMMA drop_clustered_constraint_option)*  RIGHTPARENTHESIS
              )?
          ))*
          | COLUMN ( IF EXISTS )?
          (
              column_name
          )
          (COMMA (
              constraint_name
              ( WITH
                LEFTPARENTHESIS  drop_clustered_constraint_option (COMMA drop_clustered_constraint_option)*  RIGHTPARENTHESIS
              )?
          )
          (COMMA  (
              constraint_name
              ( WITH
                LEFTPARENTHESIS  drop_clustered_constraint_option (COMMA drop_clustered_constraint_option)*  RIGHTPARENTHESIS
              )?
          ))*
          | COLUMN ( IF EXISTS )?
          (
              column_name
          ))*
          | PERIOD FOR SYSTEM_TIME
     )
     (COMMA (
         ( CONSTRAINT )?( IF EXISTS )?
         (
              constraint_name
              ( WITH
                LEFTPARENTHESIS  drop_clustered_constraint_option (COMMA drop_clustered_constraint_option)*  RIGHTPARENTHESIS
              )?
          )
          (COMMA  (
              constraint_name
              ( WITH
                LEFTPARENTHESIS  drop_clustered_constraint_option (COMMA drop_clustered_constraint_option)*  RIGHTPARENTHESIS
              )?
          ))*
          | COLUMN ( IF EXISTS )?
          (
              column_name
          )
          (COMMA (
              constraint_name
              ( WITH
                LEFTPARENTHESIS  drop_clustered_constraint_option (COMMA drop_clustered_constraint_option)*  RIGHTPARENTHESIS
              )?
          )
          (COMMA  (
              constraint_name
              ( WITH
                LEFTPARENTHESIS  drop_clustered_constraint_option (COMMA drop_clustered_constraint_option)*  RIGHTPARENTHESIS
              )?
          ))*
          | COLUMN ( IF EXISTS )?
          (
              column_name
          ))*
          | PERIOD FOR SYSTEM_TIME
     ))*)?
    | ( WITH ( CHECK | NOCHECK ) )? ( CHECK | NOCHECK ) CONSTRAINT
        ( ALL | constraint_name (COMMA (ALL | constraint_name))* )

    | ( ENABLE | DISABLE ) TRIGGER
        ( ALL | trigger_name (COMMA (ALL | trigger_name))* )

    | ( ENABLE | DISABLE ) CHANGE_TRACKING
        ( WITH  LEFTPARENTHESIS  TRACK_COLUMNS_UPDATED  EQUAL  ( ON | OFF )  RIGHTPARENTHESIS  )?

    | SWITCH ( PARTITION source_partition_number_expression )?
        TO target_table
        ( PARTITION target_partition_number_expression )?
        ( WITH  LEFTPARENTHESIS  low_priority_lock_wait  RIGHTPARENTHESIS  )?

    | SET
         LEFTPARENTHESIS
            ( FILESTREAM_ON  EQUAL
                ( partition_scheme_name | filegroup |  DOUBLEQUOTATION default DOUBLEQUOTATION  |  DOUBLEQUOTATION NULL DOUBLEQUOTATION  ) )?
            | SYSTEM_VERSIONING  EQUAL
                  (
                    OFF
                  | ON
                      (  LEFTPARENTHESIS  HISTORY_TABLE  EQUAL  schema_name  DOT  history_table_name
                          (COMMA DATA_CONSISTENCY_CHECK  EQUAL  ( ON | OFF ) )?
                          (COMMA HISTORY_RETENTION_PERIOD  EQUAL
                          (
                              INFINITE | number (DAY | DAYS | WEEK | WEEKS
                  | MONTH | MONTHS | YEAR | YEARS )
                          )
                          )?
                         RIGHTPARENTHESIS
                      )?
                  )
            | DATA_DELETION  EQUAL
                (
                      OFF
                    | ON
                        ( LEFTPARENTHESIS   ( FILTER_COLUMN  EQUAL  column_name )?
                            (COMMA RETENTION_PERIOD  EQUAL  ( INFINITE | number ( DAY | DAYS | WEEK | WEEKS
                                    | MONTH | MONTHS | YEAR | YEARS ) ) )?
                         RIGHTPARENTHESIS )?
                    )  RIGHTPARENTHESIS
    | REBUILD
      ( (PARTITION  EQUAL  ALL)?
        ( WITH  LEFTPARENTHESIS  rebuild_option (COMMA rebuild_option)*  RIGHTPARENTHESIS  )?
      | ( PARTITION  EQUAL  partition_number
           ( WITH  LEFTPARENTHESIS  single_partition_rebuild__option (COMMA single_partition_rebuild__option)*   RIGHTPARENTHESIS  )?
        )?
      )

    | table_option
    | filetable_option
    | stretch_configuration
)
(  SEMICOLON  )?;
column_set_definition :
    column_set_name XML COLUMN_SET FOR ALL_SPARSE_COLUMNS;
drop_clustered_constraint_option :
    (
        MAXDOP  EQUAL  max_degree_of_parallelism
      | ONLINE  EQUAL  ( ON | OFF )
      | MOVE TO
         ( partition_scheme_name  LEFTPARENTHESIS  column_name  RIGHTPARENTHESIS  | filegroup |  DOUBLEQUOTATION default DOUBLEQUOTATION  )
    );
table_option :
    (
        SET  LEFTPARENTHESIS  LOCK_ESCALATION  EQUAL  ( AUTO | TABLE | DISABLE )  RIGHTPARENTHESIS
    );
filetable_option :
    (
       ( ( ENABLE | DISABLE ) FILETABLE_NAMESPACE )?
       ( SET  LEFTPARENTHESIS  FILETABLE_DIRECTORY  EQUAL  directory_name  RIGHTPARENTHESIS  )?
    );
stretch_configuration :
    (
      SET  LEFTPARENTHESIS
        REMOTE_DATA_ARCHIVE
        (
             EQUAL  ON  LEFTPARENTHESIS table_stretch_options RIGHTPARENTHESIS
          |  EQUAL  OFF_WITHOUT_DATA_RECOVERY  LEFTPARENTHESIS  MIGRATION_STATE  EQUAL  PAUSED  RIGHTPARENTHESIS
          |  LEFTPARENTHESIS  table_stretch_options (COMMA table_stretch_options)*  RIGHTPARENTHESIS
        )
             RIGHTPARENTHESIS
    );
table_stretch_options :
    (
     ( FILTER_PREDICATE  EQUAL  ( null | table_predicate_function ) COMMA )?
       MIGRATION_STATE  EQUAL  ( OUTBOUND | INBOUND | PAUSED )
    );
single_partition_rebuild__option :
(
      SORT_IN_TEMPDB  EQUAL  ( ON | OFF )
    | MAXDOP  EQUAL  max_degree_of_parallelism
    | DATA_COMPRESSION  EQUAL  ( NONE | ROW | PAGE | COLUMNSTORE | COLUMNSTORE_ARCHIVE)
    | ONLINE  EQUAL  ( ON ( LEFTPARENTHESIS  low_priority_lock_wait  RIGHTPARENTHESIS  )? | OFF )
);
low_priority_lock_wait:
(
    WAIT_AT_LOW_PRIORITY  LEFTPARENTHESIS  MAX_DURATION  EQUAL  time   ( MINUTES )?COMMA
        ABORT_AFTER_WAIT  EQUAL  ( NONE | SELF | BLOCKERS )  RIGHTPARENTHESIS
);






column_definition :
column_name data_type
    ( FILESTREAM )?
    ( COLLATE collation_name )?
    ( SPARSE )?
    ( MASKED WITH  LEFTPARENTHESIS  FUNCTION EQUAL 'mask_function'  RIGHTPARENTHESIS  )?
    ( ( CONSTRAINT constraint_name )? DEFAULT constant_expression )?
    ( IDENTITY (  LEFTPARENTHESIS  seed COMMA increment  RIGHTPARENTHESIS  )? )?
    ( NOT FOR REPLICATION )?
    ( GENERATED ALWAYS AS ( ROW | TRANSACTION_ID | SEQUENCE_NUMBER ) ( START | END ) ( HIDDEN )? )?
    ( ( CONSTRAINT constraint_name )? (NULL | NOT NULL) )?
    ( ROWGUIDCOL )?
    ( ENCRYPTED WITH
         LEFTPARENTHESIS  COLUMN_ENCRYPTION_KEY EQUAL key_name COMMA
          ENCRYPTION_TYPE EQUAL ( DETERMINISTIC | RANDOMIZED ) COMMA
          ALGORITHM EQUAL SINGLEQUOTATION AEAD_AES_256_CBC_HMAC_SHA_256 SINGLEQUOTATION
         RIGHTPARENTHESIS  )?
    ( column_constraint (COMMA column_constraint)* )?
    ( column_index )?
column_index?;
datatype :
( type_schema_name  DOT  )? type_name
    (  LEFTPARENTHESIS  (precision ( COMMA scale )? | max |
        ( ( CONTENT | DOCUMENT ) )? xml_schema_collection ) RIGHTPARENTHESIS  )?;
column_constraint :
( CONSTRAINT constraint_name )?
(     ( PRIMARY KEY (NOT NULL)? | UNIQUE )
        ( CLUSTERED | NONCLUSTERED )?
        ( LEFTPARENTHESIS column_name1 (COMMA column_name1)* RIGHTPARENTHESIS )?
        (
            WITH FILLFACTOR  EQUAL  fillfactor
          | WITH  LEFTPARENTHESIS  index_option (COMMA index_option)*  RIGHTPARENTHESIS
        )?
        ( ON ( partition_scheme_name  LEFTPARENTHESIS  partition_column_name  RIGHTPARENTHESIS
            | filegroup |  DOUBLEQUOTATION default DOUBLEQUOTATION  ) )?
  | ( FOREIGN KEY )?
        REFERENCES ( schema_name  DOT  )? referenced_table_name (  LEFTPARENTHESIS  ref_column  RIGHTPARENTHESIS  )?
        ( ON DELETE ( NO ACTION | CASCADE | SET NULL | SET DEFAULT ) )?
        ( ON UPDATE ( NO ACTION | CASCADE | SET NULL | SET DEFAULT ) )?
        ( NOT FOR REPLICATION )?
  | CHECK ( NOT FOR REPLICATION )?  LEFTPARENTHESIS  logical_expression  RIGHTPARENTHESIS
);









index_option : (
    PAD_INDEX  EQUAL  ( ON | OFF )
  | FILLFACTOR  EQUAL  fillfactor
  | IGNORE_DUP_KEY  EQUAL  ( ON | OFF )
  | STATISTICS_NORECOMPUTE  EQUAL  ( ON | OFF )
  | ALLOW_ROW_LOCKS  EQUAL  ( ON | OFF )
  | ALLOW_PAGE_LOCKS  EQUAL  ( ON | OFF )
  | OPTIMIZE_FOR_SEQUENTIAL_KEY  EQUAL  ( ON | OFF )
  | SORT_IN_TEMPDB  EQUAL  ( ON | OFF )
  | MAXDOP  EQUAL  max_degree_of_parallelism
  | DATA_COMPRESSION  EQUAL  ( NONE | ROW | PAGE | COLUMNSTORE | COLUMNSTORE_ARCHIVE )
      ( ON PARTITIONS  LEFTPARENTHESIS  ( partition_number_expression | range )
      (COMMA ( partition_number_expression | range ))*  RIGHTPARENTHESIS  )?
  | XML_COMPRESSION  EQUAL  ( ON | OFF )
      ( ON PARTITIONS  LEFTPARENTHESIS  ( partition_number_expression | range )
      (COMMA ( partition_number_expression | range ))* RIGHTPARENTHESIS  )?
  | ONLINE  EQUAL  ( ON | OFF )
  | RESUMABLE  EQUAL  ( ON | OFF )
  | MAX_DURATION  EQUAL  time  ( MINUTES )?
);
range :partition_number_expression TO partition_number_expression;





computed_column_definition : column_name AS computed_column_expression
( PERSISTED ( NOT NULL )? )?
(
    ( CONSTRAINT constraint_name )?
    ( PRIMARY KEY | UNIQUE )
        ( CLUSTERED | NONCLUSTERED )?
        ( WITH FILLFACTOR  EQUAL  fillfactor )?
        ( WITH  LEFTPARENTHESIS  index_option (COMMA index_option)*  RIGHTPARENTHESIS  )?
        ( ON ( partition_scheme_name  LEFTPARENTHESIS  partition_column_name  RIGHTPARENTHESIS  | filegroup
            |  DOUBLEQUOTATION default DOUBLEQUOTATION  ) )?
    | ( FOREIGN KEY )?
        REFERENCES ref_table (  LEFTPARENTHESIS  ref_column  RIGHTPARENTHESIS  )?
        ( ON DELETE ( NO ACTION | CASCADE ) )?
        ( ON UPDATE ( NO ACTION ) )?
        ( NOT FOR REPLICATION )?
    | CHECK ( NOT FOR REPLICATION )?  LEFTPARENTHESIS  logical_expression  RIGHTPARENTHESIS
)?;


single_partition_rebuild_option :
(
    DATA_COMPRESSION  EQUAL  ( COLUMNSTORE | COLUMNSTORE_ARCHIVE )
);





rebuild_option :
(
     DATA_COMPRESSION EQUAL ( NONE | ROW | PAGE | COLUMNSTORE | COLUMNSTORE_ARCHIVE )
        ( ON PARTITIONS  LEFTPARENTHESIS  (partition_number  ( TO partition_number )? ) (COMMA (partition_number  ( TO partition_number )? ))*  RIGHTPARENTHESIS  )?
    | XML_COMPRESSION  EQUAL  ( ON | OFF )
        ( ON PARTITIONS  LEFTPARENTHESIS  (partition_number  ( TO partition_number )? ) (COMMA (partition_number  ( TO partition_number )? ))*  RIGHTPARENTHESIS  )?
);


create : CREATE TABLE
    ( database_name DOT schema_name DOT table_name | schema_name DOT table_name | table_name )
    ( AS fileTable )?
     LEFTPARENTHESIS  ( column_definition
        | computed_column_definition
        | column_set_definition
        | ( table_constraint )? (COMMA table_constraint)*
        | ( table_index )? )
        (COMMA ( column_definition
        | computed_column_definition
        | column_set_definition
        | ( table_constraint )? (COMMA table_constraint)*
        | ( table_index )? ))*
          ( PERIOD FOR SYSTEM_TIME  LEFTPARENTHESIS  system_start_time_column_name
             COMMA system_end_time_column_name  RIGHTPARENTHESIS  )?
       RIGHTPARENTHESIS
    ( ON ( partition_scheme_name  LEFTPARENTHESIS  partition_column_name  RIGHTPARENTHESIS
           | filegroup
           |  DOUBLEQUOTATION default DOUBLEQUOTATION  ) )?
    ( TEXTIMAGE_ON ( filegroup |  DOUBLEQUOTATION default DOUBLEQUOTATION  ) )?
    ( FILESTREAM_ON ( partition_scheme_name
           | filegroup
           |  DOUBLEQUOTATION default DOUBLEQUOTATION  ) )?
    ( WITH  LEFTPARENTHESIS  table_option (COMMA table_option)*  RIGHTPARENTHESIS  )?
(  SEMICOLON  )?;
data_type :
( type_schema_name DOT  )? type_name
    (  LEFTPARENTHESIS  (precision ( COMMA scale )? | max |
        ( ( CONTENT | DOCUMENT ) )? xml_schema_collection)  RIGHTPARENTHESIS  )?;
column_index :
 INDEX index_name ( CLUSTERED | NONCLUSTERED )?
    ( WITH  LEFTPARENTHESIS  index_option (COMMA index_option)* RIGHTPARENTHESIS  )?
    ( ON ( partition_scheme_name  LEFTPARENTHESIS  column_name  RIGHTPARENTHESIS
         | filegroup_name
         | default
         )
    )?
    ( FILESTREAM_ON ( filestream_filegroup_name | partition_scheme_name |  DOUBLEQUOTATION NULL DOUBLEQUOTATION  ) )?;
table_index :
(
    (
      INDEX index_name ( UNIQUE )? ( CLUSTERED | NONCLUSTERED )?
          LEFTPARENTHESIS  column_name ( ASC | DESC )? (COMMA column_name ( ASC | DESC )?)*  RIGHTPARENTHESIS
    | INDEX index_name CLUSTERED COLUMNSTORE ( ORDER  LEFTPARENTHESIS column_name (COMMA column_name)*  RIGHTPARENTHESIS  )?
    | INDEX index_name ( NONCLUSTERED )? COLUMNSTORE  LEFTPARENTHESIS  column_name (COMMA column_name)*  RIGHTPARENTHESIS
    )
    ( INCLUDE  LEFTPARENTHESIS  column_name (COMMA column_name)*  RIGHTPARENTHESIS  )?
    ( WHERE filter_predicate   )?
    ( WITH  LEFTPARENTHESIS  index_option (COMMA index_option)*  RIGHTPARENTHESIS  )?
    ( ON ( partition_scheme_name  LEFTPARENTHESIS  column_name  RIGHTPARENTHESIS
         | filegroup_name
         | default
         )
    )?
    ( FILESTREAM_ON ( filestream_filegroup_name | partition_scheme_name |  DOUBLEQUOTATION NULL DOUBLEQUOTATION  ) )?
);
ledger_option:
(
    ( LEDGER_VIEW  EQUAL  schema_name DOT ledger_view_name (  LEFTPARENTHESIS  ledger_view_option (COMMA ledger_view_option)*  RIGHTPARENTHESIS  )? )?
    ( APPEND_ONLY  EQUAL  ON | OFF )?
);
ledger_view_option:
(
    ( TRANSACTION_ID_COLUMN_NAME  EQUAL  transaction_id_column_name )?
    ( SEQUENCE_NUMBER_COLUMN_NAME  EQUAL  sequence_number_column_name )?
    ( OPERATION_TYPE_COLUMN_NAME  EQUAL  operation_type_id column_name )?
    ( OPERATION_TYPE_DESC_COLUMN_NAME  EQUAL  operation_type_desc_column_name )?
);





close_cursor : CLOSE ( ( ( GLOBAL )? cursor_name ) | cursor_variable_name );








dellocate_cursor : DEALLOCATE ( ( ( GLOBAL )? cursor_name ) |  ATSYMBOL cursor_variable_name );








declare_cursor : DECLARE cursor_name CURSOR ( LOCAL | GLOBAL )?
    ( FORWARD_ONLY | SCROLL )?
    ( STATIC | KEYSET | DYNAMIC | FAST_FORWARD )?
    ( READ_ONLY | SCROLL_LOCKS | OPTIMISTIC )?
    ( TYPE_WARNING )?
    FOR select_statement
    ( FOR UPDATE ( OF column_name (COMMA column_name)*)?)?
(  SEMICOLON  )?;

fetch_cursor : FETCH
          ( ( NEXT | PRIOR | FIRST | LAST
                    | ABSOLUTE ( n |  ATSYMBOL nvar )
                    | RELATIVE ( n |  ATSYMBOL nvar )
               )?
               FROM
          )?
( ( ( GLOBAL )? cursor_name ) |  ATSYMBOL cursor_variable_name )
( INTO  ATSYMBOL variable_name (COMMA  ATSYMBOL variable_name)*)?;
open_cursor : OPEN ( ( ( GLOBAL )? cursor_name ) | cursor_variable_name );





expression : ( constant | scalar_function | ( object DOT )? column | ATSYMBOL? variable
    |  LEFTPARENTHESIS  expression  RIGHTPARENTHESIS  |  LEFTPARENTHESIS  scalar_subquery  RIGHTPARENTHESIS
    | ( unary_operator ) expression
    | ranking_windowed_function | aggregate_windowed_function
) (( binary_operator ) expression)*;

scalar_expression :
(
    constant
    | scalar_function
    | variable
    | LEFTPARENTHESIS expression RIGHTPARENTHESIS
    | LEFTPARENTHESIS scalar_subquery RIGHTPARENTHESIS
    | ( unary_operator ) expression
    | expression ( binary_operator ) expression
)
( COLLATE ( windows_collation_name )? )?;




bulk : BULK INSERT
   ( database_name.schema_name.table_or_view_name | schema_name.table_or_view_name | table_or_view_name )
      FROM data_file
     ( WITH
    LEFTPARENTHESIS
   (( COMMA )? DATA_SOURCE EQUAL data_source_name )?

   (( COMMA )? CODEPAGE EQUAL ( 'RAW' | code_page | 'ACP' | 'OEM' ) )?
   (( COMMA )? DATAFILETYPE EQUAL ( CHAR | 'widechar' | 'native' | 'widenative' ) )?
   (( COMMA )? ROWTERMINATOR EQUAL row_terminator )?
   (( COMMA )? FIELDTERMINATOR EQUAL field_terminator )?
   (( COMMA )? FORMAT EQUAL 'CSV' )?
   (( COMMA )? FIELDQUOTE EQUAL quote_characters )?
   (( COMMA )? FIRSTROW EQUAL first_row )?
   (( COMMA )? LASTROW EQUAL last_row )?

   (( COMMA )? FORMATFILE EQUAL format_file_path )?
   (( COMMA )? FORMATFILE_DATA_SOURCE EQUAL data_source_name )?

   (( COMMA)?MAXERRORS EQUAL max_errors )?
   (( COMMA)?ERRORFILE EQUAL file_name )?
   (( COMMA)?ERRORFILE_DATA_SOURCE EQUAL errorfile_data_source_name )?

   (( COMMA)? KEEPIDENTITY )?
   (( COMMA)? KEEPNULLS )?
   (( COMMA)? FIRE_TRIGGERS )?
   (( COMMA)? CHECK_CONSTRAINTS )?
   (( COMMA)? TABLOCK )?

   (( COMMA )? ORDER LEFTPARENTHESIS ( column ( ASC | DESC )? ) (COMMA column (ASC | DESC)?)* RIGHTPARENTHESIS )?
   (( COMMA )? ROWS_PER_BATCH EQUAL rows_per_batch )?
   (( COMMA )? KILOBYTES_PER_BATCH EQUAL kilobytes_per_batch )?
   (( COMMA )? BATCHSIZE EQUAL batch_size )?

    RIGHTPARENTHESIS )?;
openrowset :  OPENROWSET LEFTPARENTHESIS BULK data_file_path COMMA
            bulk_option ( COMMA bulk_option )*
RIGHTPARENTHESIS
(
    WITH LEFTPARENTHESIS ( column_name sql_datatype ( column_path | column_ordinal)? )+ RIGHTPARENTHESIS
)?;

bulk_option :
   DATA_SOURCE EQUAL data_source_name |

   CODEPAGE EQUAL ( 'ACP' | 'OEM' | 'RAW' | 'code_page' )
   DATAFILETYPE EQUAL ( CHAR | 'widechar' ) |
   FORMAT EQUAL file_format |

   FORMATFILE EQUAL format_file_path |
   FORMATFILE_DATA_SOURCE EQUAL data_source_name |

   SINGLE_BLOB |
   SINGLE_CLOB |
   SINGLE_NCLOB |

   ROWTERMINATOR EQUAL row_terminator |
   FIELDTERMINATOR EQUAL  field_terminator |
   FIELDQUOTE EQUAL quote_character |

   MAXERRORS EQUAL maximum_errors |
   ERRORFILE EQUAL file_name |
   ERRORFILE_DATA_SOURCE EQUAL data_source_name |

   FIRSTROW EQUAL first_row |
   LASTROW EQUAL last_row |

   ORDER LEFTPARENTHESIS ( column ( ASC | DESC )? ) (COMMA column (ASC | DESC)?)* RIGHTPARENTHESIS ( UNIQUE )? |

   ROWS_PER_BATCH EQUAL rows_per_batch;


rows_per_batch : NUMBERS;
maximum_errors : NUMBERS ;
quote_character : STRING;
file_format :STRING ;
column_ordinal : ;
column_path : ;
sql_datatype : ;
data_file_path : STRING;
data_source_name : ;
data_file : ;
field_terminator : ;
row_terminator : ;
code_page : ;
last_row : ;
first_row : ;
quote_characters : ;
errorfile_data_source_name : ;
file_name : ;
max_errors : ;
format_file_path : STRING;
batch_size : ;
kilobytes_per_batch : ;
new_table : (  database_name DOT schema_name DOT table_name | schema_name DOT table_name | table_name ) ;
expression_name : IDENTIFIERS;
string_expression : STRING | ATSYMBOL variable | (object DOT)? column;
escape_character : ADD;
column : IDENTIFIERS | TYPE | YEAR | ACTION;
freetext_string : ADD;
subquery : sELECTstatement;
node_table_alias : ADD;
node_table_name : ADD;
edge_table_alias : ADD;
edge_table_name : ADD;
collation_name : IDENTIFIERS;
offset_row_count_expression :expression;
integer_constant : NUMBERS;
fetch_row_count_expression : expression;
word : ADD;
phrase : ADD;
prefix_term : ADD;
proximity_term : ADD;
integer : ADD;
weight_value : ADD;
column_expression : expression  | LEFTPARENTHESIS column_expression RIGHTPARENTHESIS;
table_or_view_name : IDENTIFIERS | DOCUMENT;
rowset_function : openrowset | openquery | openrowset2;
bulk_column_alias : ADD;
table_alias : IDENTIFIERS;
column_alias : IDENTIFIERS | XMLDATA | STRING | ACTION;
variable : IDENTIFIERS;
function_call : ADD;
repeat_seed : ADD;
left_table_source : table_source;
right_table_source : table_source;
aggregate_function : ADD;
value_column : ADD;
pivot_column : ADD;
date_time_variable : ADD;
date_time_literal : ADD;
view_name : ADD;
table_name : IDENTIFIERS ;
field_name : ADD;
property_name : ADD;
udt_column_name : ADD;
argument : ADD;
method_name : ADD;
integer_value : NUMBERS;
numeric_value : ADD;
literal_constant : STRING | NUMBERS ;
variable_name : IDENTIFIERS;
hint_name : ADD;
xml_plan : ADD;
exposed_object_name : ADD;
point_in_time : ADD;
index_value : NUMBERS ;
index_column_name : ADD;
in : ADD;
int : ADD;
idoc : ADD;
nvarchar : ADD;
rowpattern : ADD;
byte : ADD;
flags : ADD;
count : ADD;
columns : ADD;
openquery :  OPENQUERY LEFTPARENTHESIS linked_server COMMA query RIGHTPARENTHESIS;
openrowset2: OPENROWSET
LEFTPARENTHESIS  provider_name
    COMMA ( datasource  SEMICOLON  user_id  SEMICOLON  password  |  provider_string  )
    COMMA (  ( catalog DOT )? ( schema_name DOT )? object | query  )
RIGHTPARENTHESIS;
provider_string : STRING;
datasource : STRING;
user_id : STRING;
password : STRING;
provider_name : STRING;
catalog : STRING;
query : STRING;
linked_server : IDENTIFIERS;
rowset_function_limited : openquery | openrowset | openrowset2;
table_variable : IDENTIFIERS;
cursor_name :  IDENTIFIERS;
cursor_variable_name : ADD;
schema_name : IDENTIFIERS ;
database_name : IDENTIFIERS ;
server_name : IDENTIFIERS ;
output_table : ADD;
column_alias_identifier : ADD;
from_table_name : IDENTIFIERS;
action : ADD;
derived_table : LEFTPARENTHESIS subquery RIGHTPARENTHESIS ( ( AS )? table_alias )?;
dml_statement_with_output_clause : table;
type_name : DATATYPE | IDENTIFIERS;
type_schema_name : ADD;
scale : NUMBERS;
precision : NUMBERS;
xml_schema_collection : ADD;
max : ADD;
mask_function : ADD;
datetime2 : ADD;
system_start_time_column_name : ADD;
constant_expression : expression;
constraint_name : IDENTIFIERS;
system_end_time_column_name : ADD;
bigint : ADD;
start_transaction_id_column_name : ADD;
end_sequence_number_column_name : ADD;
start_sequence_number_column_name : ADD;
end_transaction_id_column_name : ADD;
trigger_name : ADD;
source_partition_number_expression : NUMBERS;
target_partition_number_expression : ADD;
default : ADD;
filegroup : IDENTIFIERS;
partition_scheme_name : IDENTIFIERS;
number : NUMBERS;
history_table_name : ADD;
partition_number : NUMBERS;
max_degree_of_parallelism : ADD;
column_set_name : IDENTIFIERS;
directory_name : ADD;
null : ADD;
table_predicate_function : ADD;
time : ADD;
key_name : IDENTIFIERS;
increment : NUMBERS;
seed : NUMBERS;
referenced_table_name : IDENTIFIERS;
partition_column_name : IDENTIFIERS;
fillfactor : NUMBERS;
logical_expression : search_condition_without_match;
ref_column : IDENTIFIERS;
partition_number_expression : ADD;
computed_column_expression : expression;
ref_table : ADD;
filegroup_name : ADD;
index_name : ADD;
filestream_filegroup_name : ADD;
table_constraint : ( CONSTRAINT constraint_name )?
                   (
                       ( PRIMARY KEY | UNIQUE )
                           ( CLUSTERED | NONCLUSTERED )?
                            LEFTPARENTHESIS column ( ASC | DESC )? (COMMA column ( ASC | DESC )?)*  RIGHTPARENTHESIS
                           ( WITH FILLFACTOR EQUAL fillfactor)?
                           ( WITH  LEFTPARENTHESIS  index_option (COMMA index_option)*   RIGHTPARENTHESIS  )?
                           ( ON ( partition_scheme_name  LEFTPARENTHESIS  partition_column_name   RIGHTPARENTHESIS
                             | filegroup | DOUBLEQUOTATION default DOUBLEQUOTATION ) )?
                       | FOREIGN KEY
                            LEFTPARENTHESIS  column (COMMA column)*  RIGHTPARENTHESIS
                           REFERENCES referenced_table_name (  LEFTPARENTHESIS  ref_column (COMMA ref_column)*  RIGHTPARENTHESIS  )?
                           ( ON DELETE ( NO ACTION | CASCADE | SET NULL | SET DEFAULT ) )?
                           ( ON UPDATE ( NO ACTION | CASCADE | SET NULL | SET DEFAULT ) )?
                           ( NOT FOR REPLICATION )?
                       | CONNECTION
                            LEFTPARENTHESIS  ( node_table TO node_table )
                             ( COMMA (node_table TO node_table ))*
                            RIGHTPARENTHESIS
                           ( ON DELETE ( NO ACTION | CASCADE ) )?
                       | DEFAULT constant_expression FOR column ( WITH VALUES )?
                       | CHECK ( NOT FOR REPLICATION )?  LEFTPARENTHESIS  logical_expression  RIGHTPARENTHESIS
                   ) ;
node_table : ;
filter_predicate : ADD;
sequence_number_column_name : ADD;
transaction_id_column_name : ADD;
ledger_view_name : ADD;
operation_type_desc_column_name : ADD;
operation_type_id : ADD;
scalar_function:
	(IDENTIFIERS | MAX) LEFTPARENTHESIS ((
		(object DOT)? column
		| STAR
		| scalar_subquery
		|STRING | YEAR
	) (
		COMMA (
			(
				(object DOT)? column
				| STAR
				| scalar_subquery
				|STRING | YEAR
			)
		)
	)*)? ((AS DATATYPE)? LEFTPARENTHESIS (expression* | MAX) RIGHTPARENTHESIS)?  RIGHTPARENTHESIS;


execute_statement : ( ( EXEC | EXECUTE ) )?
    (
      (  ATSYMBOL return_status EQUAL )?
      ( module_name ( SEMICOLON number )? |  ATSYMBOL module_name_var )
        ( (  ATSYMBOL parameter EQUAL )? ( value
                           |  ATSYMBOL variable ( OUTPUT )?
                           | ( DEFAULT )?
                           )
        )?
    ( COMMA ( (  ATSYMBOL parameter EQUAL )? ( value
                           |  ATSYMBOL variable ( OUTPUT )?
                           | ( DEFAULT )?
                           )
        )?)*
      ( WITH execute_option (COMMA execute_option)*  )?
    )
( SEMICOLON )?


|( EXEC | EXECUTE )
     LEFTPARENTHESIS  (   string_variable | ( N )?'tsql_string' ) (PLUS (  ATSYMBOL string_variable | ( N )?'tsql_string' ))* RIGHTPARENTHESIS
    ( AS ( LOGIN | USER ) EQUAL ' name ' )?
( SEMICOLON )?


|( EXEC | EXECUTE )
     LEFTPARENTHESIS  (   string_variable | ( N )? 'command_string ( ? )?' ) (PLUS (  ATSYMBOL string_variable | ( N )? 'command_string ( ? )?' ))*
        ( ( COMMA ( value |  ATSYMBOL variable ( OUTPUT )? ) ) )*
    RIGHTPARENTHESIS
    ( AS ( LOGIN | USER )EQUAL ' name ' )?
    ( AT linked_server_name )?
    ( AT DATA_SOURCE data_source_name )?
( SEMICOLON )?;

execute_option :
(
        RECOMPILE
    | ( RESULT SETS UNDEFINED )
    | ( RESULT SETS NONE )
    | ( RESULT SETS  LEFTPARENTHESIS  result_sets_definition (COMMA result_sets_definition)* RIGHTPARENTHESIS  )
);

result_sets_definition :
(
     LEFTPARENTHESIS
         ( column_name
           data_type
         ( COLLATE collation_name )?
         ( NULL | NOT NULL )? )
         (COMMA ( column_name
           data_type
         ( COLLATE collation_name )?
         ( NULL | NOT NULL )? ))*
    RIGHTPARENTHESIS
    | AS OBJECT
        ( db_name DOT ( schema_name )? DOT | schema_name DOT )?
        (table_name | view_name | table_valued_function_name )
    | AS TYPE ( schema_name DOT)?table_type_name
    | AS FOR XML
);

value : expression;
table_valued_function_name : IDENTIFIERS;
table_type_name : IDENTIFIERS;
linked_server_name : IDENTIFIERS;
module_name : object;
db_name : IDENTIFIERS;
string_variable : STRING | ATSYMBOL variable;
module_name_var : IDENTIFIERS;
return_status : IDENTIFIERS;
parameter : IDENTIFIERS;
constant : STRING | NUMBERS ;
binary_operator : MINUS | STAR | PLUS | DIVISION | MODULE;
unary_operator : ADD;
aggregate_windowed_function : ADD;
ranking_windowed_function : ADD;
scalar_subquery : sELECTstatement | LEFTPARENTHESIS sELECTstatement RIGHTPARENTHESIS;
nvar : ADD;
n : ADD;
select_statement : sELECTstatement;
sample_number : ADD;
user_defined_function : ADD;
option : ADD;
targetNameSpaceURI : ADD;
cTE_query_definition : sELECTstatement;
elementName : STRING;
rootName : ADD;
schemaDeclaration : ADD;
offset : NUMBERS | NULL;
length : NUMBERS | NULL;
fileTable : ADD;
opendatasource :  OPENDATASOURCE LEFTPARENTHESIS provider_name COMMA init_string RIGHTPARENTHESIS;
init_string : STRING;
windows_collation_name : ADD;
order_by_expression : expression (COMMA expression )*;
column_name : (object DOT)? column ;
common_table_expression_name  : IDENTIFIERS;

test : ((insert | update | sELECTstatement | create | declare_cursor| open_cursor | fetch_cursor| close_cursor | dellocate_cursor | delete | drop | alter) GO?)* EOF;


