grammar Sql;
options {
	caseInsensitive = true;
}
@header {
	package antlr; 
}

//TEMPTABLE: ATSYMBOL ATSYMBOL IDENTIFIERS;
TIMEOUT: 'TIMEOUT';
SUM: 'SUM';
COUNT: 'COUNT';
AVG: 'AVG';
MIN: 'MIN';
DELAY: 'DELAY';
OEM: 'OEM';
ACP: 'ACP';
CSV: 'CSV';
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
HIDDEN1: 'HIDDEN';
DATA_SOURCE: 'DATA_SOURCE';
KEEPNULLS: 'KEEPNULLS';
FIRE_TRIGGERS: 'FIRE_TRIGGERS';
CHECK_CONSTRAINTS: 'CHECK_CONSTRAINTS';
UNDEFINED: 'UNDEFINED';
LOGIN: 'LOGIN';
SINGLE_NCLOB: 'SINGLE_NCLOB';
SINGLE_CLOB: 'SINGLE_CLOB';
SOURCE: 'SOURCE';
TARGET: 'TARGET';
MATCHED: 'MATCHED';
USING: 'USING';
SINGLE_BLOB: 'SINGLE_BLOB';
N: 'N';
FORMATFILE_DATA_SOURCE: 'FORMATFILE_DATA_SOURCE';
FORMATFILE: 'FORMATFILE';
CODEPAGE: 'CODEPAGE';
DATAFILETYPE: 'DATAFILETYPE';
ROWTERMINATOR: 'ROWTERMINATOR';
FIELDTERMINATOR: 'FIELDTERMINATOR';
FORMAT: 'FORMAT';
MAXERRORS: 'MAXERRORS';
ERRORFILE: 'ERRORFILE';
ROWS_PER_BATCH: 'ROWS_PER_BATCH';
KILOBYTES_PER_BATCH: 'KILOBYTES_PER_BATCH';
BATCHSIZE: 'BATCHSIZE';
ERRORFILE_DATA_SOURCE: 'ERRORFILE_DATA_SOURCE';
FIELDQUOTE: 'FIELDQUOTE';
FIRSTROW: 'FIRSTROW';
LASTROW: 'LASTROW';
XML: 'XML';
HINT: 'HINT';
SCALEOUTEXECUTION: 'SCALEOUTEXECUTION';
EXTERNALPUSHDOWN: 'EXTERNALPUSHDOWN';
APPLY: 'APPLY';
REPEATABLE: 'REPEATABLE';
SYSTEM_TIME: 'SYSTEM_TIME';
THESAURUS: 'THESAURUS';
INFLECTIONAL: 'INFLECTIONAL';
IGNORE_TRIGGERS: 'IGNORE_TRIGGERS';
TABLOCK: 'TABLOCK';
JSON: 'JSON';
SPATIAL_WINDOW_MAX_CELLS: 'SPATIAL_WINDOW_MAX_CELLS';
SNAPSHOT: 'SNAPSHOT';
SERIALIZABLE: 'SERIALIZABLE';
ROWLOCK: 'ROWLOCK';
REPEATABLEREAD: 'REPEATABLEREAD';
READUNCOMMITTED: 'READUNCOMMITTED';
READPAST: 'READPAST';
READCOMMITTEDLOCK: 'READCOMMITTEDLOCK';
READCOMMITTED: 'READCOMMITTED';
DISABLE: 'DISABLE';
FORCE: 'FORCE';
FAST: 'FAST';
LOOP: 'LOOP';
CONCAT: 'CONCAT';
HASH: 'HASH';
IGNORE_CONSTRAINTS: 'IGNORE_CONSTRAINTS';
KEEPDEFAULTS: 'KEEPDEFAULTS';
KEEPIDENTITY: 'KEEPIDENTITY';
FORCESCAN: 'FORCESCAN';
FORCESEEK: 'FORCESEEK';
NOEXPAND: 'NOEXPAND';
ROBUST: 'ROBUST';
RECOMPILE: 'RECOMPILE';
QUERYTRACEON: 'QUERYTRACEON';
FORCED: 'FORCED';
SIMPLE: 'SIMPLE';
PARAMETERIZATION: 'PARAMETERIZATION';
VIEWS: 'VIEWS';
EXPAND: 'EXPAND';
DISABLE_OPTIMIZED_PLAN_FORCING:
	'DISABLE_OPTIMIZED_PLAN_FORCING';
CONTAINED: 'CONTAINED';
OPTIMIZE: 'OPTIMIZE';
NO_PERFORMANCE_SPOOL: 'NO_PERFORMANCE_SPOOL';
MAXRECURSION: 'MAXRECURSION';
MAXDOP: 'MAXDOP';
MIN_GRANT_PERCENT: 'MIN_GRANT_PERCENT';
MAX_GRANT_PERCENT: 'MAX_GRANT_PERCENT';
TABLOCKX: 'TABLOCKX';
UPDLOCK: 'UPDLOCK';
XLOCK: 'XLOCK';
PAGLOCK: 'PAGLOCK';
NOWAIT: 'NOWAIT';
NOLOCK: 'NOLOCK';
KEEPFIXED: 'KEEPFIXED';
KEEP: 'KEEP';
IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
	'IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX';
TEMP: ':';
ROWGUID: 'ROWGUID';
NEAR: 'NEAR';
ISABOUT: 'ISABOUT';
WEIGHT: 'WEIGHT';
MAX: 'MAX';
REMOTE: 'REMOTE';
REDUCE: 'REDUCE';
REPLICATE: 'REPLICATE';
REDISTRIBUTE: 'REDISTRIBUTE';
FORMSOF: 'FORMSOF';
OFFSET: 'OFFSET';
TIES: 'TIES';
DELETED: 'DELETED';
INSERTED: 'INSERTED';
SPARSE: 'SPARSE';
PERSISTED: 'PERSISTED';
MASKED: 'MASKED';
ONLINE: 'ONLINE';
GENERATED: 'GENERATED';
ALWAYS: 'ALWAYS';
TRANSACTION_ID: 'TRANSACTION_ID';
SEQUENCE_NUMBER: 'SEQUENCE_NUMBER';
PERIOD: 'PERIOD';
ENABLE: 'ENABLE';
CHANGE_TRACKING: 'CHANGE_TRACKING';
TRACK_COLUMNS_UPDATED: 'TRACK_COLUMNS_UPDATED';
SWITCH: 'SWITCH';
FILESTREAM_ON: 'FILESTREAM_ON';
SYSTEM_VERSIONING: 'SYSTEM_VERSIONING';
HISTORY_TABLE: 'HISTORY_TABLE';
DATA_CONSISTENCY_CHECK: 'DATA_CONSISTENCY_CHECK';
HISTORY_RETENTION_PERIOD: 'HISTORY_RETENTION_PERIOD';
INFINITE: 'INFINITE';
DAYS: 'DAYS';
WEEK: 'WEEK';
WEEKS: 'WEEKS';
MONTHS: 'MONTHS';
YEARS: 'YEARS';
DATA_DELETION: 'DATA_DELETION';
FILTER_COLUMN: 'FILTER_COLUMN';
RETENTION_PERIOD: 'RETENTION_PERIOD';
REBUILD: 'REBUILD';
COLUMN_SET: 'COLUMN_SET';
ALL_SPARSE_COLUMNS: 'ALL_SPARSE_COLUMNS';
MOVE: 'MOVE';
LOCK_ESCALATION: 'LOCK_ESCALATION';
FILETABLE_NAMESPACE: 'FILETABLE_NAMESPACE';
FILETABLE_DIRECTORY: 'FILETABLE_DIRECTORY';
REMOTE_DATA_ARCHIVE: 'REMOTE_DATA_ARCHIVE';
OFF_WITHOUT_DATA_RECOVERY: 'OFF_WITHOUT_DATA_RECOVERY';
MIGRATION_STATE: 'MIGRATION_STATE';
PAUSED: 'PAUSED';
FILTER_PREDICATE: 'FILTER_PREDICATE';
OUTBOUND: 'OUTBOUND';
INBOUND: 'INBOUND';
SORT_IN_TEMPDB: 'SORT_IN_TEMPDB';
DATA_COMPRESSION: 'DATA_COMPRESSION';
PAGE: 'PAGE';
COLUMNSTORE: 'COLUMNSTORE';
COLUMNSTORE_ARCHIVE: 'COLUMNSTORE_ARCHIVE';
WAIT_AT_LOW_PRIORITY: 'WAIT_AT_LOW_PRIORITY';
MAX_DURATION: 'MAX_DURATION';
MINUTES: 'MINUTES';
ABORT_AFTER_WAIT: 'ABORT_AFTER_WAIT';
SELF: 'SELF';
BLOCKERS: 'BLOCKERS';
FILESTREAM: 'FILESTREAM';
ENCRYPTED: 'ENCRYPTED';
COLUMN_ENCRYPTION_KEY: 'COLUMN_ENCRYPTION_KEY';
ENCRYPTION_TYPE: 'ENCRYPTION_TYPE';
RANDOMIZED: 'RANDOMIZED';
ALGORITHM: 'ALGORITHM';
AEAD_AES_256_CBC_HMAC_SHA_256: 'AEAD_AES_256_CBC_HMAC_SHA_256';
DOCUMENT: 'DOCUMENT';
CONTENT: 'CONTENT';
PAD_INDEX: 'PAD_INDEX';
IGNORE_DUP_KEY: 'IGNORE_DUP_KEY';
STATISTICS_NORECOMPUTE: 'STATISTICS_NORECOMPUTE';
ALLOW_ROW_LOCKS: 'ALLOW_ROW_LOCKS';
ALLOW_PAGE_LOCKS: 'ALLOW_PAGE_LOCKS';
OPTIMIZE_FOR_SEQUENTIAL_KEY: 'OPTIMIZE_FOR_SEQUENTIAL_KEY';
PARTITIONS: 'PARTITIONS';
XML_COMPRESSION: 'XML_COMPRESSION';
RESUMABLE: 'RESUMABLE';
TEXTIMAGE_ON: 'TEXTIMAGE_ON';
INCLUDE: 'INCLUDE';
LEDGER_VIEW: 'LEDGER_VIEW';
APPEND_ONLY: 'APPEND_ONLY';
SEQUENCE_NUMBER_COLUMN_NAME: 'SEQUENCE_NUMBER_COLUMN_NAME';
OPERATION_TYPE_COLUMN_NAME: 'OPERATION_TYPE_COLUMN_NAME';
OPERATION_TYPE_DESC_COLUMN_NAME:
	'OPERATION_TYPE_DESC_COLUMN_NAME';
TRANSACTION_ID_COLUMN_NAME: 'TRANSACTION_ID_COLUMN_NAME';
FORWARD_ONLY: 'FORWARD_ONLY';
FAST_FORWARD: 'FAST_FORWARD';
KEYSET: 'KEYSET';
OPTIMISTIC: 'OPTIMISTIC';
SCROLL_LOCKS: 'SCROLL_LOCKS';
READ_ONLY: 'READ_ONLY';
TYPE_WARNING: 'TYPE_WARNING';
WITHOUT_ARRAY_WRAPPER: 'WITHOUT_ARRAY_WRAPPER';
INCLUDE_NULL_VALUES: 'INCLUDE_NULL_VALUES';
ROOT: 'ROOT';
TYPE: 'TYPE';
BASE64: 'BASE64';
EXPLICIT: 'EXPLICIT';
ABSENT: 'ABSENT';
XSINIL: 'XSINIL';
ELEMENTS: 'ELEMENTS';
XMLSCHEMA: 'XMLSCHEMA';
XMLDATA: 'XMLDATA';
AUTO: 'AUTO';
ADD: 'ADD';
EXTERNAL: 'EXTERNAL';
PROCEDURE: 'PROCEDURE';
ALL: 'ALL';
FETCH: 'FETCH';
PUBLIC: 'PUBLIC';
ALTER: 'ALTER';
FILE: 'FILE';
RAISERROR: 'RAISERROR';
AND: 'AND';
FILLFACTOR: 'FILLFACTOR';
READ: 'READ';
ANY: 'ANY';
FOR: 'FOR';
READTEXT: 'READTEXT';
AS: 'AS';
FOREIGN: 'FOREIGN';
RECONFIGURE: 'RECONFIGURE';
ASC: 'ASC';
FREETEXT: 'FREETEXT';
REFERENCES: 'REFERENCES';
AUTHORIZATION: 'AUTHORIZATION';
FREETEXTTABLE: 'FREETEXTTABLE';
REPLICATION: 'REPLICATION';
BACKUP: 'BACKUP';
FROM: 'FROM';
RESTORE: 'RESTORE';
BEGIN: 'BEGIN';
FULL: 'FULL';
RESTRICT: 'RESTRICT';
BETWEEN: 'BETWEEN';
FUNCTION: 'FUNCTION';
RETURN: 'RETURN';
BREAK: 'BREAK';
GOTO: 'GOTO';
REVERT: 'REVERT';
BROWSE: 'BROWSE';
GRANT: 'GRANT';
REVOKE: 'REVOKE';
BULK: 'BULK';
GROUP: 'GROUP';
RIGHT: 'RIGHT';
BY: 'BY';
HAVING: 'HAVING';
ROLLBACK: 'ROLLBACK';
CASCADE: 'CASCADE';
HOLDLOCK: 'HOLDLOCK';
ROWCOUNT: 'ROWCOUNT';
CASE: 'CASE';
IDENTITY: 'IDENTITY';
ROWGUIDCOL: 'ROWGUIDCOL';
CHECK: 'CHECK';
IDENTITY_INSERT: 'IDENTITY_INSERT';
RULE: 'RULE';
CHECKPOINT: 'CHECKPOINT';
IDENTITYCOL: 'IDENTITYCOL';
SAVE: 'SAVE';
CLOSE: 'CLOSE';
IF: 'IF';
SCHEMA: 'SCHEMA';
CLUSTERED: 'CLUSTERED';
IN: 'IN';
SECURITYAUDIT: 'SECURITYAUDIT';
COALESCE: 'COALESCE';
INDEX: 'INDEX';
SELECT: 'SELECT';
COLLATE: 'COLLATE';
INNER: 'INNER';
SEMANTICKEYPHRASETABLE: 'SEMANTICKEYPHRASETABLE';
COLUMN: 'COLUMN';
INSERT: 'INSERT';
SEMANTICSIMILARITYDETAILSTABLE:
	'SEMANTICSIMILARITYDETAILSTABLE';
COMMIT: 'COMMIT';
INTERSECT: 'INTERSECT';
SEMANTICSIMILARITYTABLE: 'SEMANTICSIMILARITYTABLE';
COMPUTE: 'COMPUTE';
INTO: 'INTO';
SESSION_USER: 'SESSION_USER';
CONSTRAINT: 'CONSTRAINT';
IS: 'IS';
SET: 'SET';
CONTAINS: 'CONTAINS';
JOIN: 'JOIN';
SETUSER: 'SETUSER';
CONTAINSTABLE: 'CONTAINSTABLE';
KEY: 'KEY';
SHUTDOWN: 'SHUTDOWN';
CONTINUE: 'CONTINUE';
KILL: 'KILL';
SOME: 'SOME';
CONVERT: 'CONVERT';
LEFT: 'LEFT';
STATISTICS: 'STATISTICS';
CREATE: 'CREATE';
LIKE: 'LIKE';
SYSTEM_USER: 'SYSTEM_USER';
CROSS: 'CROSS';
LINENO: 'LINENO';
TABLE: 'TABLE';
CURRENT: 'CURRENT';
LOAD: 'LOAD';
TABLESAMPLE: 'TABLESAMPLE';
CURRENT_DATE: 'CURRENT_DATE';
MERGE: 'MERGE';
TEXTSIZE: 'TEXTSIZE';
CURRENT_TIME: 'CURRENT_TIME';
NATIONAL: 'NATIONAL';
THEN: 'THEN';
CURRENT_TIMESTAMP: 'CURRENT_TIMESTAMP';
NOCHECK: 'NOCHECK';
TO: 'TO';
CURRENT_USER: 'CURRENT_USER';
NONCLUSTERED: 'NONCLUSTERED';
TOP: 'TOP';
CURSOR: 'CURSOR';
NOT: 'NOT';
TRAN: 'TRAN';
DATABASE: 'DATABASE';
NULL: 'NULL';
TRANSACTION: 'TRANSACTION';
DBCC: 'DBCC';
NULLIF: 'NULLIF';
TRIGGER: 'TRIGGER';
DEALLOCATE: 'DEALLOCATE';
OF: 'OF';
TRUNCATE: 'TRUNCATE';
DECLARE: 'DECLARE';
OFF: 'OFF';
TRY_CONVERT: 'TRY_CONVERT';
DEFAULT: 'DEFAULT';
OFFSETS: 'OFFSETS';
TSEQUAL: 'TSEQUAL';
DELETE: 'DELETE';
ON: 'ON';
UNION: 'UNION';
DENY: 'DENY';
OPEN: 'OPEN';
UNIQUE: 'UNIQUE';
DESC: 'DESC';
OPENDATASOURCE: 'OPENDATASOURCE';
UNPIVOT: 'UNPIVOT';
DISK: 'DISK';
OPENQUERY: 'OPENQUERY';
UPDATE: 'UPDATE';
DISTINCT: 'DISTINCT';
OPENROWSET: 'OPENROWSET';
UPDATETEXT: 'UPDATETEXT';
DISTRIBUTED: 'DISTRIBUTED';
OPENXML: 'OPENXML';
USE: 'USE';
DOUBLE: 'DOUBLE';
OPTION: 'OPTION';
USER: 'USER';
DROP: 'DROP';
OR: 'OR';
VALUES: 'VALUES';
DUMP: 'DUMP';
ORDER: 'ORDER';
VARYING: 'VARYING';
ELSE: 'ELSE';
OUTER: 'OUTER';
END: 'END';
WAITFOR: 'WAITFOR';
ERRLVL: 'ERRLVL';
PERCENT: 'PERCENT';
WHEN: 'WHEN';
ESCAPE: 'ESCAPE';
PIVOT: 'PIVOT';
WHERE: 'WHERE';
EXCEPT: 'EXCEPT';
PLAN: 'PLAN';
WHILE: 'WHILE';
EXEC: 'EXEC';
PRECISION: 'PRECISION';
WITH: 'WITH';
EXECUTE: 'EXECUTE';
PRIMARY: 'PRIMARY';
EXISTS: 'EXISTS';
PRINT: 'PRINT';
WRITETEXT: 'WRITETEXT';
EXIT: 'EXIT';
PROC: 'PROC';
LEFTPARENTHESIS: '(';
RIGHTPARENTHESIS: ')';
SEMICOLON: ';';
GREATERTHAN: '>';
LESSTHAN: '<';
GREATERTHANOREQUAL: '>=';
LESSTHANOREQUAL: '<=';
NOTEQUAL: '<>' | '!=';
NOTGREATERTHAN: '!>';
NOTLESSTHAN: '!<';
PLUSEQUAL: '+=';
MINUSEQUAL: '-=';
MULTIPLEEQUAL: '*=';
DIVISIONEQUAL: '/=';
MODULEEQUAL: '%=';
ANDEQUAL: '&=';
OREQUAL: '|=';
XOREQUAL: '^=';
EQUAL: '=';
STAR: '*';
MINUS: '-';
PLUS: '+';
DIVISION: '/';
SINGLEQUOTATION: '\'';
DOUBLEQUOTATION: '"';
TILDE: '~';
OROPERATION: '|';
ANDOPERATION: '&';
Exclamation: '!';
ATSYMBOL: '@';
DOT: '.';
DOLLAR: '$';
ZERO: '0';
ABSOLUTE: 'ABSOLUTE';
HOST: 'HOST';
RELATIVE: 'RELATIVE';
ACTION: 'ACTION';
HOUR: 'HOUR';
RELEASE: 'RELEASE';
ADMIN: 'ADMIN';
IGNORE: 'IGNORE';
RESULT: 'RESULT';
AFTER: 'AFTER';
IMMEDIATE: 'IMMEDIATE';
RETURNS: 'RETURNS';
AGGREGATE: 'AGGREGATE';
INDICATOR: 'INDICATOR';
ROLE: 'ROLE';
ALIAS: 'ALIAS';
INITIALIZE: 'INITIALIZE';
ROLLUP: 'ROLLUP';
ALLOCATE: 'ALLOCATE';
INITIALLY: 'INITIALLY';
ROUTINE: 'ROUTINE';
ARE: 'ARE';
INOUT: 'INOUT';
ROW: 'ROW';
ARRAY: 'ARRAY';
INPUT: 'INPUT';
ROWS: 'ROWS';
ASENSITIVE: 'ASENSITIVE';
INT: 'INT';
SAVEPOINT: 'SAVEPOINT';
ASSERTION: 'ASSERTION';
INTEGER: 'INTEGER';
SCROLL: 'SCROLL';
ASYMMETRIC: 'ASYMMETRIC';
INTERSECTION: 'INTERSECTION';
SCOPE: 'SCOPE';
AT: 'AT';
INTERVAL: 'INTERVAL';
SEARCH: 'SEARCH';
ATOMIC: 'ATOMIC';
ISOLATION: 'ISOLATION';
SECOND: 'SECOND';
BEFORE: 'BEFORE';
ITERATE: 'ITERATE';
SECTION: 'SECTION';
BINARY: 'BINARY';
LANGUAGE: 'LANGUAGE';
SENSITIVE: 'SENSITIVE';
BIT: 'BIT';
LARGE: 'LARGE';
SEQUENCE: 'SEQUENCE';
BLOB: 'BLOB';
LAST: 'LAST';
SESSION: 'SESSION';
BOOLEAN: 'BOOLEAN';
LATERAL: 'LATERAL';
SETS: 'SETS';
BOTH: 'BOTH';
LEADING: 'LEADING';
SIMILAR: 'SIMILAR';
BREADTH: 'BREADTH';
LESS: 'LESS';
SIZE: 'SIZE';
CALL: 'CALL';
LEVEL: 'LEVEL';
SMALLINT: 'SMALLINT';
CALLED: 'CALLED';
LIKE_REGEX: 'LIKE_REGEX';
SPACE: 'SPACE';
CARDINALITY: 'CARDINALITY';
LIMIT: 'LIMIT';
SPECIFIC: 'SPECIFIC';
CASCADED: 'CASCADED';
LN: 'LN';
SPECIFICTYPE: 'SPECIFICTYPE';
LOCAL: 'LOCAL';
SQL: 'SQL';
CATALOG: 'CATALOG';
LOCALTIME: 'LOCALTIME';
SQLEXCEPTION: 'SQLEXCEPTION';
CHAR: 'CHAR';
LOCALTIMESTAMP: 'LOCALTIMESTAMP';
SQLSTATE: 'SQLSTATE';
CHARACTER: 'CHARACTER';
LOCATOR: 'LOCATOR';
SQLWARNING: 'SQLWARNING';
CLASS: 'CLASS';
MAP: 'MAP';
START: 'START';
CLOB: 'CLOB';
MATCH: 'MATCH';
COLLATION: 'COLLATION';
MEMBER: 'MEMBER';
STATEMENT: 'STATEMENT';
COLLECT: 'COLLECT';
METHOD: 'METHOD';
STATIC: 'STATIC';
COMPLETION: 'COMPLETION';
MINUTE: 'MINUTE';
STDDEV_POP: 'STDDEV_POP';
CONDITION: 'CONDITION';
MOD: 'MOD';
STDDEV_SAMP: 'STDDEV_SAMP';
CONNECT: 'CONNECT';
MODIFIES: 'MODIFIES';
STRUCTURE: 'STRUCTURE';
CONNECTION: 'CONNECTION';
MODIFY: 'MODIFY';
SUBMULTISET: 'SUBMULTISET';
CONSTRAINTS: 'CONSTRAINTS';
MODULE: 'MODULE';
SUBSTRING_REGEX: 'SUBSTRING_REGEX';
CONSTRUCTOR: 'CONSTRUCTOR';
MONTH: 'MONTH';
SYMMETRIC: 'SYMMETRIC';
CORR: 'CORR';
MULTISET: 'MULTISET';
SYSTEM: 'SYSTEM';
CORRESPONDING: 'CORRESPONDING';
NAMES: 'NAMES';
TEMPORARY: 'TEMPORARY';
COVAR_POP: 'COVAR_POP';
NATURAL: 'NATURAL';
TERMINATE: 'TERMINATE';
COVAR_SAMP: 'COVAR_SAMP';
NCHAR: 'NCHAR';
THAN: 'THAN';
CUBE: 'CUBE';
NCLOB: 'NCLOB';
TIME: 'TIME';
CUME_DIST: 'CUME_DIST';
NEW: 'NEW';
TIMESTAMP: 'TIMESTAMP';
CURRENT_CATALOG: 'CURRENT_CATALOG';
NEXT: 'NEXT';
TIMEZONE_HOUR: 'TIMEZONE_HOUR';
CURRENT_DEFAULT_TRANSFORM_GROUP:
	'CURRENT_DEFAULT_TRANSFORM_GROUP';
NO: 'NO';
TIMEZONE_MINUTE: 'TIMEZONE_MINUTE';
CURRENT_PATH: 'CURRENT_PATH';
NONE: 'NONE';
TRAILING: 'TRAILING';
CURRENT_ROLE: 'CURRENT_ROLE';
NORMALIZE: 'NORMALIZE';
TRANSLATE_REGEX: 'TRANSLATE_REGEX';
CURRENT_SCHEMA: 'CURRENT_SCHEMA';
NUMERIC: 'NUMERIC';
TRANSLATION: 'TRANSLATION';
CURRENT_TRANSFORM_GROUP_FOR_TYPE:
	'CURRENT_TRANSFORM_GROUP_FOR_TYPE';
OBJECT: 'OBJECT';
TREAT: 'TREAT';
CYCLE: 'CYCLE';
OCCURRENCES_REGEX: 'OCCURRENCES_REGEX';
TRUE: 'TRUE';
DATA: 'DATA';
OLD: 'OLD';
UESCAPE: 'UESCAPE';
DATE: 'DATE';
ONLY: 'ONLY';
UNDER: 'UNDER';
DAY: 'DAY';
OPERATION: 'OPERATION';
UNKNOWN: 'UNKNOWN';
DEC: 'DEC';
ORDINALITY: 'ORDINALITY';
UNNEST: 'UNNEST';
DECIMAL: 'DECIMAL';
OUT: 'OUT';
USAGE: 'USAGE';
DEFERRABLE: 'DEFERRABLE';
OVERLAY: 'OVERLAY';
DEFERRED: 'DEFERRED';
OUTPUT: 'OUTPUT';
DEPTH: 'DEPTH';
PAD: 'PAD';
VAR_POP: 'VAR_POP';
DEREF: 'DEREF';
PARAMETER: 'PARAMETER';
VAR_SAMP: 'VAR_SAMP';
DESCRIBE: 'DESCRIBE';
PARAMETERS: 'PARAMETERS';
VARCHAR: 'VARCHAR';
DESCRIPTOR: 'DESCRIPTOR';
PARTIAL: 'PARTIAL';
VARIABLE: 'VARIABLE';
DESTROY: 'DESTROY';
PARTITION: 'PARTITION';
WHENEVER: 'WHENEVER';
DESTRUCTOR: 'DESTRUCTOR';
PATH: 'PATH';
WIDTH_BUCKET: 'WIDTH_BUCKET';
DETERMINISTIC: 'DETERMINISTIC';
POSTFIX: 'POSTFIX';
WITHOUT: 'WITHOUT';
DICTIONARY: 'DICTIONARY';
PREFIX: 'PREFIX';
WINDOW: 'WINDOW';
DIAGNOSTICS: 'DIAGNOSTICS';
PREORDER: 'PREORDER';
WITHIN: 'WITHIN';
DISCONNECT: 'DISCONNECT';
PREPARE: 'PREPARE';
WORK: 'WORK';
DOMAIN: 'DOMAIN';
PERCENT_RANK: 'PERCENT_RANK';
WRITE: 'WRITE';
DYNAMIC: 'DYNAMIC';
PERCENTILE_CONT: 'PERCENTILE_CONT';
XMLAGG: 'XMLAGG';
EACH: 'EACH';
PERCENTILE_DISC: 'PERCENTILE_DISC';
XMLATTRIBUTES: 'XMLATTRIBUTES';
ELEMENT: 'ELEMENT';
POSITION_REGEX: 'POSITION_REGEX';
XMLBINARY: 'XMLBINARY';
ENDEXEC: 'END-EXEC';
PRESERVE: 'PRESERVE';
XMLCAST: 'XMLCAST';
EQUALS: 'EQUALS';
PRIOR: 'PRIOR';
XMLCOMMENT: 'XMLCOMMENT';
EVERY: 'EVERY';
PRIVILEGES: 'PRIVILEGES';
XMLCONCAT: 'XMLCONCAT';
EXCEPTION: 'EXCEPTION';
RANGE: 'RANGE';
XMLDOCUMENT: 'XMLDOCUMENT';
FALSE: 'FALSE';
READS: 'READS';
XMLELEMENT: 'XMLELEMENT';
FILTER: 'FILTER';
REAL: 'REAL';
XMLEXISTS: 'XMLEXISTS';
FIRST: 'FIRST';
RECURSIVE: 'RECURSIVE';
XMLFOREST: 'XMLFOREST';
FLOAT: 'FLOAT';
REF: 'REF';
XMLITERATE: 'XMLITERATE';
FOUND: 'FOUND';
REFERENCING: 'REFERENCING';
XMLNAMESPACES: 'XMLNAMESPACES';
FREE: 'FREE';
REGR_AVGX: 'REGR_AVGX';
XMLPARSE: 'XMLPARSE';
FULLTEXTTABLE: 'FULLTEXTTABLE';
REGR_AVGY: 'REGR_AVGY';
XMLPI: 'XMLPI';
FUSION: 'FUSION';
REGR_COUNT: 'REGR_COUNT';
XMLQUERY: 'XMLQUERY';
GENERAL: 'GENERAL';
REGR_INTERCEPT: 'REGR_INTERCEPT';
XMLSERIALIZE: 'XMLSERIALIZE';
GET: 'GET';
REGR_R2: 'REGR_R2';
XMLTABLE: 'XMLTABLE';
GLOBAL: 'GLOBAL';
REGR_SLOPE: 'REGR_SLOPE';
XMLTEXT: 'XMLTEXT';
GO: 'GO';
REGR_SXX: 'REGR_SXX';
XMLVALIDATE: 'XMLVALIDATE';
GROUPING: 'GROUPING';
REGR_SXY: 'REGR_SXY';
YEAR: 'YEAR';
HOLD: 'HOLD';
REGR_SYY: 'REGR_SYY';
ZONE: 'ZONE';
COMMA: ',';
RAW: 'RAW';
BIGINT: 'BIGINT';
DATETIME: 'DATETIME';
DATETIME2: 'DATETIME2';
DATETIMEOFFSET: 'DATETIMEOFFSET';
GEOGRAPHY: 'GEOGRAPHY';
GEOMETRY: 'GEOMETRY';
HIERARCHYID: 'HIERARCHYID';
IMAGE: 'IMAGE';
MONEY: 'MONEY';
NTEXT: 'NTEXT';
SMALLDATETIME: 'SMALLDATETIME';
SMALLMONEY: 'SMALLMONEY';
SQL_VARIANT: 'SQL_VARIANT';
SYSNAME: 'SYSNAME';
TEXT: 'TEXT';
TINYINT: 'TINYINT';
UNIQUEIDENTIFIER: 'UNIQUEIDENTIFIER';
NVARCHAR: 'NVARCHAR';
VARBINARY: 'VARBINARY';
IDENTIFIERS: IDENTIFIER | KEYWORDIDENTIFIER;
IDENTIFIER: STARTIDENTIFIER ENDIDENTIFIER*;
KEYWORDIDENTIFIER: LEFTSQUAREBRACKET (~']')+ RIGHTSQUAREBRACKET;
STARTIDENTIFIER: [A-Z_#];
ENDIDENTIFIER: [A-Z_#$@0-9];
DIGIT: [0-9];
INTEGERNUMBER: MINUS? DIGIT+;
FLOATNUMBER:
	MINUS? INTEGERNUMBER (DOT INTEGERNUMBER)? (E INTEGERNUMBER)?;
E: 'e';
LITERALSTRING:
	N? SINGLEQUOTATION (
		SINGLEQUOTATION SINGLEQUOTATION
		| ~('\'')
	)* SINGLEQUOTATION;
BITSTRING: '0b' [01]+;
HEXSTRING: '0x' [0-9A-F]+;
MULTILINECOMMIT:
	STARTMULTILINECOMMIT (MULTILINECOMMIT | (~'*') | STAR ~'/')* ENDMULTILINECOMMIT;
STARTMULTILINECOMMIT: '/*';
ENDMULTILINECOMMIT: '*/';
SINGLELINECOMMIT: MINUS MINUS ~'\n'*;
LEFTSQUAREBRACKET: '[';
RIGHTSQUAREBRACKET: ']';

sELECTstatement:
	(with_common_table_expression)? query_expression (
		order_byCLASUE
	)? (fORClause)? (option_query_hint)? (end)?;

option_query_hint:
	optionKeyword leftparenthesis query_hint (comma query_hint)* rightparenthesis;

query_expression:
	querySpecification (setOperations querySpecification)*;
time_to_pass: string_expression;
time_to_execute: string_expression;
timeout: integer_value;
waitfor:
	waitforkeyword (
		delaykeyword time_to_pass
		| timekeyword time_to_execute
	);

querySpecification:
	query_specification
	| surroundedQuerySpecification;

query_specification:
	select? all? topClause? select_list into? on? fromTable? whereClause? groupby? having? end?;

topClause: top percent? withTies?;

top: topKeyword ( surroundedExpression | expression);

surroundedExpression:
	leftparenthesis expression rightparenthesis;

common_table_expression:
	expression_name surroundedColumnList? cteQueryDefinition;

search_condition:
	(match | search_condition_without_match) andSearchCondetion*;

notPredicate: not? predicate;
not: notKeyword;
surroundedSearchConditionWithoutMatch:
	leftparenthesis search_condition_without_match rightparenthesis;
search_condition_without_match:
	(notPredicate | surroundedSearchConditionWithoutMatch) (
		(and | or) (not)? (
			predicate
			| surroundedSearchConditionWithoutMatch
		)
	)*;

compareOperator: (
		equalKeyword
		| notequalKeyword
		| greaterthanKeyword
		| greaterthanorequalKeyword
		| notgreaterthanKeyword
		| lessthanKeyword
		| lessthanorequalKeyword
		| notlessthanKeyword
	);
between: betweenKeyword;
is: isKeyword;
distinct: distinctKeyword;

predicate:
	expression compareOperator expression
	| likeCondition
	| expression (not)? between expression and expression
	| expression is ( not)? null
	| expression is (not)? distinct fromKeyword
	| containsKeyword leftparenthesisKeyword (
		column
		| starKeyword
	) commaKeyword singlequotationKeyword contains_search_condition singlequotationKeyword
		rightparenthesisKeyword
	| freetextKeyword leftparenthesisKeyword (
		column
		| starKeyword
	) commaKeyword singlequotationKeyword freetext_string singlequotationKeyword
		rightparenthesisKeyword
	| expression (notKeyword)? inKeyword leftparenthesisKeyword (
		subquery
		| expression (commaKeyword (subquery | expression))*
	) rightparenthesisKeyword
	| expression (
		equalKeyword
		| notequalKeyword
		| notequalKeyword
		| greaterthanKeyword
		| greaterthanorequalKeyword
		| notgreaterthanKeyword
		| lessthanKeyword
		| lessthanorequalKeyword
		| notlessthanKeyword
	) (allKeyword | someKeyword | anyKeyword) leftparenthesisKeyword subquery
		rightparenthesisKeyword
	| existsKeyword leftparenthesisKeyword subquery rightparenthesisKeyword;

likeCondition:
	string_expression (notKeyword)? likeKeyword string_expression (
		escapeKeyword singlequotationKeyword escape_character singlequotationKeyword
	)?;

graph_search_pattern:
	(
		node_alias (
			(
				lessthanKeyword minusKeyword leftparenthesisKeyword edge_alias
					rightparenthesisKeyword minusKeyword
			)
			| (
				minusKeyword leftparenthesisKeyword edge_alias rightparenthesisKeyword minusKeyword
					greaterthanKeyword
			) node_alias
		)
	);
node_alias: node_table_name | node_table_alias;
edge_alias: edge_table_name | edge_table_alias;

order_byCLASUE:
	orderKeyword byKeyword order_by_expression (
		collateKeyword collation_name
	)? (ascKeyword | descKeyword)? (
		commaKeyword order_by_expression (
			collateKeyword collation_name
		)? (ascKeyword | descKeyword)?
	)* (offset_fetch)?;
offset_fetch:
	(
		offsetKeyword (
			integer_constant
			| offset_row_count_expression
		) (rowKeyword | rowsKeyword) (
			fetchKeyword (firstKeyword | nextKeyword) (
				integer_constant
				| fetch_row_count_expression
			) (rowKeyword | rowsKeyword) onlyKeyword
		)?
	);

fORClause: forKeyword ( browseKeyword | xML | jSON);
xML:
	xmlKeyword (
		(
			rawKeyword (
				leftparenthesisKeyword elementName rightparenthesisKeyword
			)?
			| autoKeyword
		) (
			commonDirectivesForXML (
				commaKeyword (
					xmldataKeyword
					| xmlschemaKeyword (
						leftparenthesisKeyword singlequotationKeyword targetNameSpaceURI
							singlequotationKeyword rightparenthesisKeyword
					)?
				)
			)? (
				commaKeyword elementsKeyword (
					xsinilKeyword
					| absentKeyword
				)
			)??
		)
		| explicitKeyword (
			commonDirectivesForXML (commaKeyword xmldataKeyword)?
		)
		| pathKeyword (
			leftparenthesisKeyword elementName rightparenthesisKeyword
		)? (
			commonDirectivesForXML (
				commaKeyword elementsKeyword (
					xsinilKeyword
					| absentKeyword
				)?
			)?
		)
	);
commonDirectivesForXML:
	(commaKeyword binaryKeyword BASE64)? (
		commaKeyword typeKeyword
	)? (
		commaKeyword rootKeyword (
			leftparenthesisKeyword rootName rightparenthesisKeyword
		)?
	)?;
jSON:
	jsonKeyword (
		(autoKeyword | pathKeyword) (
			(
				commaKeyword rootKeyword (
					leftparenthesisKeyword singlequotationKeyword rootName singlequotationKeyword
						rightparenthesisKeyword
				)?
			)? (commaKeyword INCLUDE_NULL_VALUES)? (
				commaKeyword WITHOUT_ARRAY_WRAPPER
			)?
		)
	);
contains_search_condition:
	(
		simple_term
		| prefix_term
		| generation_term
		| generic_proximity_term
		| custom_proximity_term
		| weighted_term
	)
	| (
		leftparenthesisKeyword contains_search_condition rightparenthesisKeyword (
			( andKeyword | aNDNOT | orKeyword)
		)? contains_search_condition (
			(( andKeyword | aNDNOT | orKeyword))? contains_search_condition
		)*
	);
simple_term: (
		word
		| doublequotationKeyword phrase doublequotationKeyword
	);
prefixterm:
	(
		doublequotationKeyword word starKeyword doublequotationKeyword
		| doublequotationKeyword phrase starKeyword doublequotationKeyword
	);
generation_term:
	formsofKeyword leftparenthesisKeyword (
		inflectionalKeyword
		| thesaurusKeyword
	) commaKeyword simple_term (commaKeyword simple_term)* rightparenthesisKeyword;
generic_proximity_term:
	(simple_term | prefix_term) (
		(
			(nearKeyword | tildekeyword) (
				simple_term
				| prefix_term
			)
		) (
			(
				(nearKeyword | tildekeyword) (
					simple_term
					| prefix_term
				)
			)
		)*
	);
custom_proximity_term:
	nearKeyword leftparenthesisKeyword (
		(simple_term | prefix_term) (
			commaKeyword (simple_term | prefix_term)
		)*
		| leftparenthesisKeyword (simple_term | prefix_term) (
			commaKeyword (simple_term | prefix_term)
		)* rightparenthesisKeyword (
			commaKeyword maximum_distance (
				commaKeyword match_order
			)?
		)?
	) rightparenthesisKeyword;
maximum_distance: ( integer | maxKeyword);
match_order: ( trueKeyword | falseKeyword);
weighted_term:
	isaboutKeyword leftparenthesisKeyword (
		(
			simple_term
			| prefix_term
			| generation_term
			| proximity_term
		) (
			weightKeyword leftparenthesisKeyword weight_value rightparenthesisKeyword
		)?
	) (
		commaKeyword (
			(
				simple_term
				| prefix_term
				| generation_term
				| proximity_term
			) (
				weightKeyword leftparenthesisKeyword weight_value rightparenthesisKeyword
			)?
		)
	)* rightparenthesisKeyword;
and: ( andKeyword | andoperationKeyword);
aNDNOT: (andKeyword notKeyword | andoperationKeyword Exclamation);
or: ( orKeyword | oroperationKeyword);

groupby:
	groupKeyword byKeyword (
		column_expression
		| rollupKeyword leftparenthesisKeyword group_by_expression (
			commaKeyword group_by_expression
		)* rightparenthesisKeyword
		| cubeKeyword leftparenthesisKeyword group_by_expression (
			commaKeyword group_by_expression
		)* rightparenthesisKeyword
		| groupingKeyword setsKeyword leftparenthesisKeyword grouping_set (
			commaKeyword grouping_set
		)* rightparenthesisKeyword
		| leftparenthesisKeyword rightparenthesisKeyword
	) (
		commaKeyword (
			column_expression
			| rollupKeyword leftparenthesisKeyword group_by_expression (
				commaKeyword group_by_expression
			)* rightparenthesisKeyword
			| cubeKeyword leftparenthesisKeyword group_by_expression (
				commaKeyword group_by_expression
			)* rightparenthesisKeyword
			| groupingKeyword setsKeyword leftparenthesisKeyword grouping_set (
				commaKeyword grouping_set
			)* rightparenthesisKeyword
			| leftparenthesisKeyword rightparenthesisKeyword
		)
	)*;
group_by_expression:
	column_expression
	| leftparenthesisKeyword column_expression (
		commaKeyword column_expression
	)* rightparenthesisKeyword;
grouping_set:
	leftparenthesisKeyword rightparenthesisKeyword
	| grouping_set_item
	| leftparenthesisKeyword grouping_set_item (
		commaKeyword grouping_set_item
	)* rightparenthesisKeyword;
grouping_set_item:
	group_by_expression
	| rollupKeyword leftparenthesisKeyword group_by_expression (
		commaKeyword group_by_expression
	)* rightparenthesisKeyword
	| cubeKeyword leftparenthesisKeyword group_by_expression (
		commaKeyword group_by_expression
	)* rightparenthesisKeyword;

table:
	table_source
	| joined_table
	| pivoted_table
	| unpivoted_table;

table_source:
	(
		object (forKeyword system_timekeyword system_time)? (
			( asKeyword)? table_alias
		)? (tablesample_clause)? (
			withKeyword leftparenthesisKeyword table_hint (
				commaKeyword? table_hint
			)* rightparenthesisKeyword
		)?
		| rowset_function (( asKeyword)? table_alias)? (
			leftparenthesisKeyword bulk_column_alias (
				commaKeyword bulk_column_alias
			)* rightparenthesisKeyword
		)?
		| user_defined_function ( ( asKeyword)? table_alias)?
		| openxmlKeyword openxml_clause
		| derived_table (( asKeyword)? table_alias)? (
			leftparenthesisKeyword column_alias (
				commaKeyword column_alias
			)* rightparenthesisKeyword
		)?
		| atsymbolKeyword variable (( asKeyword)? table_alias)?
		| '#' variable ( ( asKeyword)? table_alias)?
		| atsymbolKeyword variable dotKeyword function_call leftparenthesisKeyword expression (
			commaKeyword expression
		)* rightparenthesisKeyword (( asKeyword)? table_alias)? (
			leftparenthesisKeyword column_alias (
				commaKeyword column_alias
			)* rightparenthesisKeyword
		)?
	);
tablesample_clause:
	tablesampleKeyword (systemKeyword)? leftparenthesisKeyword sample_number (
		percentKeyword
		| rowsKeyword
	)? rightparenthesisKeyword (
		repeatableKeyword leftparenthesisKeyword repeat_seed rightparenthesisKeyword
	)?;
joined_table:
	(
		table_source join_type table onKeyword search_condition (
			join_type table onKeyword search_condition
		)*
		| table_source crossKeyword table (
			crossKeyword joinKeyword table
		)*
		| left_table_source (crossKeyword | outerKeyword) applyKeyword right_table_source
		| leftparenthesisKeyword joined_table rightparenthesisKeyword
	);
join_type:
	(
		(
			innerKeyword
			| (
				(leftKeyword | rightKeyword | fullKeyword) (
					outerKeyword
				)?
			)
		) (join_hint)?
	)? joinKeyword;
pivoted_table:
	table_source pivotKeyword pivot_clause (
		( asKeyword)? table_alias
	)?;
pivot_clause:
	leftparenthesisKeyword aggregate_function leftparenthesisKeyword value_column (
		commaKeyword? value_column
	)* rightparenthesisKeyword forKeyword pivot_column inKeyword leftparenthesisKeyword column_list
		rightparenthesisKeyword rightparenthesisKeyword;
unpivoted_table:
	table_source unpivotKeyword unpivot_clause (
		( asKeyword)? table_alias
	)?;
unpivot_clause:
	leftparenthesisKeyword value_column forKeyword pivot_column inKeyword leftparenthesisKeyword
		column_list rightparenthesisKeyword rightparenthesisKeyword;
column_list: column_name (commaKeyword column_name)*;
system_time:
	(
		asKeyword ofKeyword date_time
		| fromKeyword start_date_time toKeyword end_date_time
		| betweenKeyword start_date_time andKeyword end_date_time
		| containedKeyword inKeyword leftparenthesisKeyword start_date_time commaKeyword
			end_date_time rightparenthesisKeyword
		| allKeyword
	);
date_time:
	date_time_literal
	| atsymbolKeyword date_time_variable;
start_date_time:
	date_time_literal
	| atsymbolKeyword date_time_variable;
end_date_time:
	date_time_literal
	| atsymbolKeyword date_time_variable;

allColumn: starKeyword | object dotKeyword starKeyword;
objectDotAllColumn: object dotKeyword starKeyword;
select_list:
	(
		allColumn
		| column_or_expression
		| column_alias equalKeyword expression
	) (commaKeyword (select_list))*;

column_or_expression: (
		(object dotKeyword)? (
			column_name
			| identityKeyword
			| rowguidKeyword
		)
		| udt_column_name (
			(dotKeyword | tempKeyword tempKeyword) (
				( property_name | field_name)
				| method_name leftparenthesisKeyword argument (
					commaKeyword argument
				)* rightparenthesisKeyword
			)
		)?
		| expression
	) columnAliasRule?;
objectDotColumn: (object dotKeyword)? (
		column_name
		| identityKeyword
		| rowguidKeyword
	);
columnAliasRule: asKeyword? column_alias;

query_hint:
	(
		( hashKeyword | orderKeyword) groupKeyword
		| (concatKeyword | hashKeyword | mergeKeyword) unionKeyword
		| (loopKeyword | mergeKeyword | hashKeyword) joinKeyword
		| DISABLE_OPTIMIZED_PLAN_FORCING
		| expandKeyword viewsKeyword
		| fastKeyword integer_value
		| forceKeyword orderKeyword
		| (forceKeyword | disableKeyword) externalpushdownKeyword
		| (forceKeyword | disableKeyword) scaleoutexecutionKeyword
		| IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX
		| keepKeyword planKeyword
		| keepfixedKeyword planKeyword
		| max_grant_percentkeyword equalKeyword numeric_value
		| min_grant_percentkeyword equalKeyword numeric_value
		| maxdopKeyword integer_value
		| maxrecursionKeyword integer_value
		| NO_PERFORMANCE_SPOOL
		| optimizeKeyword forKeyword leftparenthesisKeyword atsymbolKeyword variable_name (
			unknownKeyword
			| equalKeyword literal_constant
		) (
			commaKeyword atsymbolKeyword variable_name (
				unknownKeyword
				| equalKeyword literal_constant
			)
		)* rightparenthesisKeyword
		| optimizeKeyword forKeyword unknownKeyword
		| parameterizationKeyword (simpleKeyword | forcedKeyword)
		| querytraceonKeyword integer_value
		| recompileKeyword
		| robustKeyword planKeyword
		| useKeyword hintKeyword leftparenthesisKeyword singlequotationKeyword hint_name
			singlequotationKeyword (
			commaKeyword singlequotationKeyword hint_name singlequotationKeyword
		)* rightparenthesisKeyword
		| useKeyword planKeyword nKeyword singlequotationKeyword xml_plan singlequotationKeyword
		| tableKeyword hintKeyword leftparenthesisKeyword exposed_object_name (
			commaKeyword table_hint (commaKeyword? table_hint)*
		)? rightparenthesisKeyword
		| forKeyword timestampKeyword asKeyword ofKeyword singlequotationKeyword point_in_time
			singlequotationKeyword
	);
table_hint:
	(
		noexpandKeyword (
			commaKeyword indexKeyword leftparenthesisKeyword index_value index_value (
				commaKeyword index_value
			)* rightparenthesisKeyword
			| indexKeyword equalKeyword (
				leftparenthesisKeyword index_value rightparenthesisKeyword
				| index_value
			)
		)?
		| indexKeyword leftparenthesisKeyword index_value (
			commaKeyword index_value
		)* rightparenthesisKeyword
		| indexKeyword equalKeyword (
			leftparenthesisKeyword index_value rightparenthesisKeyword
			| index_value
		)
		| forceseekKeyword (
			leftparenthesisKeyword index_value leftparenthesisKeyword index_column_name (
				commaKeyword index_column_name
			)* rightparenthesisKeyword rightparenthesisKeyword
		)?
		| forcescanKeyword
		| holdlockKeyword
		| nolockKeyword
		| nowaitKeyword
		| paglockKeyword
		| readcommittedKeyword
		| readcommittedlockKeyword
		| readpastKeyword
		| readuncommittedKeyword
		| repeatablereadKeyword
		| rowlockKeyword
		| serializableKeyword
		| snapshotKeyword
		| spatial_window_max_cellskeyword equalKeyword integer_value
		| tablockKeyword
		| tablockxKeyword
		| updlockKeyword
		| xlockKeyword
	);

table_hint_limited:
	(
		keepidentityKeyword
		| keepdefaultsKeyword
		| holdlockKeyword
		| IGNORE_CONSTRAINTS
		| IGNORE_TRIGGERS
		| nolockKeyword
		| nowaitKeyword
		| paglockKeyword
		| readcommittedKeyword
		| readcommittedlockKeyword
		| readpastKeyword
		| repeatablereadKeyword
		| rowlockKeyword
		| serializableKeyword
		| snapshotKeyword
		| tablockKeyword
		| tablockxKeyword
		| updlockKeyword
		| xlockKeyword
	);

openxml_clause:
	openxmlKeyword leftparenthesisKeyword idoc commaKeyword rowpattern commaKeyword (
		flags
	)? rightparenthesisKeyword;

join_hint:
	(
		loopKeyword
		| hashKeyword
		| mergeKeyword
		| remoteKeyword
		| reduceKeyword
		| replicateKeyword
		| redistributeKeyword (
			leftparenthesisKeyword columns_count rightparenthesisKeyword
		)?
	);

with_common_table_expression:
	with common_table_expression (comma common_table_expression)*;

with: withKeyword;

update: (with_common_table_expression)? updateKeyword (
		topKeyword leftparenthesisKeyword expression rightparenthesisKeyword (
			percentKeyword
		)?
	)? (
		(
			(table_alias | object | rowset_function_limited) (
				withKeyword leftparenthesisKeyword table_hint_limited (
					commaKeyword table_hint_limited
				)* rightparenthesisKeyword
			)?
		)
		| atsymbolKeyword table_variable
	) setKeyword (
		(object dotKeyword)? column_name equalKeyword (
			expression
			| defaultKeyword
			| nullKeyword
		)
		| (
			udt_column_name dotKeyword (
				(
					property_name equalKeyword expression
					| field_name equalKeyword expression
				)
				| method_name leftparenthesisKeyword argument (
					commaKeyword argument
				)* rightparenthesisKeyword
			)
		)
		| column_name (
			dotKeyword writeKeyword leftparenthesisKeyword (
				expression
				| nullKeyword
			) commaKeyword offset commaKeyword length rightparenthesisKeyword
		)
		| atsymbolKeyword variable equalKeyword expression
		| atsymbolKeyword variable equalKeyword column equalKeyword expression
		| column_name (
			plusequalKeyword
			| minusequalKeyword
			| multipleequalKeyword
			| divisionequalKeyword
			| moduleequalKeyword
			| andequalKeyword
			| xorequalKeyword
			| orequalKeyword
		) expression
		| atsymbolKeyword variable (
			plusequalKeyword
			| minusequalKeyword
			| multipleequalKeyword
			| divisionequalKeyword
			| moduleequalKeyword
			| andequalKeyword
			| xorequalKeyword
			| orequalKeyword
		) expression
		| atsymbolKeyword variable equalKeyword column (
			plusequalKeyword
			| minusequalKeyword
			| multipleequalKeyword
			| divisionequalKeyword
			| moduleequalKeyword
			| andequalKeyword
			| xorequalKeyword
			| orequalKeyword
		) expression
	) (
		commaKeyword (
			column_name equalKeyword (
				expression
				| defaultKeyword
				| nullKeyword
			)
			| (
				udt_column_name dotKeyword (
					(
						property_name equalKeyword expression
						| field_name equalKeyword expression
					)
					| method_name leftparenthesisKeyword argument (
						commaKeyword argument
					)* rightparenthesisKeyword
				)
			)
			| column_name (
				dotKeyword writeKeyword leftparenthesisKeyword (
					expression
					| nullKeyword
				) commaKeyword offset commaKeyword length rightparenthesisKeyword
			)
			| atsymbolKeyword variable equalKeyword expression
			| atsymbolKeyword variable equalKeyword column equalKeyword expression
			| column_name (
				plusequalKeyword
				| minusequalKeyword
				| multipleequalKeyword
				| divisionequalKeyword
				| moduleequalKeyword
				| andequalKeyword
				| xorequalKeyword
				| orequalKeyword
			) expression
			| atsymbolKeyword variable (
				plusequalKeyword
				| minusequalKeyword
				| multipleequalKeyword
				| divisionequalKeyword
				| moduleequalKeyword
				| andequalKeyword
				| xorequalKeyword
				| orequalKeyword
			) expression
			| atsymbolKeyword variable equalKeyword column (
				plusequalKeyword
				| minusequalKeyword
				| multipleequalKeyword
				| divisionequalKeyword
				| moduleequalKeyword
				| andequalKeyword
				| xorequalKeyword
				| orequalKeyword
			) expression
		)
	)* (oUTPUT_CLAUSE)? (
		fromKeyword ( table) (commaKeyword table)*
	)? (
		whereKeyword (
			search_condition
			| (
				(
					currentKeyword ofKeyword (
						(( globalKeyword)? cursor_name)
						| cursor_variable_name
					)
				)?
			)
		)
	)? (
		optionKeyword leftparenthesisKeyword query_hint (
			commaKeyword query_hint
		)* rightparenthesisKeyword
	)? (semicolonKeyword)?;
object:
	database_name dotKeyword schema_name dotKeyword table_or_view_name	# ThreePartTableName
	| schema_name dotKeyword table_or_view_name							# TwoPartTableName
	| table_or_view_name												# OnePartTableName;

oUTPUT_CLAUSE:
	(
		outputKeyword dml_select_list intoKeyword (
			atsymbolKeyword table_variable
			| output_table
		) (
			leftparenthesisKeyword column_list rightparenthesisKeyword
		)?
		| outputKeyword dml_select_list
	);
dml_select_list:
	(column_name1 | scalar_expression) (
		( asKeyword)? column_alias_identifier
	)? (
		commaKeyword (column_name1 | scalar_expression) (
			( asKeyword)? column_alias_identifier
		)?
	)*;
column_name1:
	(deletedKeyword | insertedKeyword | from_table_name) dotKeyword (
		starKeyword
		| column_name
	)
	| dollarKeyword actionKeyword;

delete: (with_common_table_expression)? deleteKeyword (
		topKeyword leftparenthesisKeyword expression rightparenthesisKeyword (
			percentKeyword
		)?
	)? (fromKeyword)? (
		(
			table_alias
			| object
			| rowset_function_limited (
				withKeyword leftparenthesisKeyword table_hint_limited (
					commaKeyword table_hint_limited
				)* rightparenthesisKeyword
			)?
		)
		| atsymbolKeyword table_variable
	) (oUTPUT_CLAUSE)? (fromKeyword table (commaKeyword table)*)? (
		whereKeyword (
			search_condition
			| (
				(
					currentKeyword ofKeyword (
						(( globalKeyword)? cursor_name)
						| cursor_variable_name
					)
				)?
			)
		)
	)? (
		optionKeyword leftparenthesisKeyword query_hint (
			commaKeyword query_hint
		)* rightparenthesisKeyword
	)? (semicolonKeyword)?;

insert: (with_common_table_expression)? insertKeyword (
		(
			topKeyword leftparenthesisKeyword expression rightparenthesisKeyword (
				percentKeyword
			)?
		)? (intoKeyword)? (
			(table | rowset_function_limited) (
				withKeyword leftparenthesisKeyword table_hint_limited (
					commaKeyword table_hint_limited
				)* rightparenthesisKeyword
			)?
			| atsymbolKeyword variable
		) (
			(
				leftparenthesisKeyword column_list rightparenthesisKeyword
			)? (oUTPUT_CLAUSE)? (
				valuesKeyword leftparenthesisKeyword (
					defaultKeyword
					| nullKeyword
					| expression
				) (
					commaKeyword (
						defaultKeyword
						| nullKeyword
						| expression
					)
				)* rightparenthesisKeyword (
					commaKeyword leftparenthesisKeyword (
						defaultKeyword
						| nullKeyword
						| expression
					) (
						commaKeyword (
							defaultKeyword
							| nullKeyword
							| expression
						)
					)* rightparenthesisKeyword
				)*
				| derived_table
				| execute_statement
				| dml_table_source
				| defaultKeyword valuesKeyword
			)
		)
	) (semicolonKeyword)?;

dml_table_source:
	selectKeyword (
		topKeyword (
			leftparenthesisKeyword expression rightparenthesisKeyword
			| expression
		) (percentKeyword)? (withKeyword tiesKeyword)?
	)? select_list fromKeyword (
		leftparenthesisKeyword (
			dml_statement_with_output_clause
			| merge
		) rightparenthesisKeyword
		| (merge | dml_statement_with_output_clause)
	) (
		(asKeyword)? table_alias (
			leftparenthesisKeyword column_alias (
				commaKeyword column_alias
			)* rightparenthesisKeyword
		)?
	)? (whereKeyword search_condition)? order_byCLASUE? (
		optionKeyword leftparenthesisKeyword query_hint (
			commaKeyword query_hint
		)* rightparenthesisKeyword
	)?;

merge: (with_common_table_expression)? mergeKeyword (
		topKeyword leftparenthesisKeyword expression rightparenthesisKeyword (
			percentKeyword
		)?
	)? (intoKeyword)? target_table (
		withKeyword leftparenthesisKeyword merge_hint rightparenthesisKeyword
	)? (( asKeyword)? table_alias)? usingKeyword table_source (
		( asKeyword)? table_alias
	)? onKeyword merge_search_condition (
		whenKeyword matchedKeyword (
			andKeyword clause_search_condition
		)? thenKeyword merge_matched
	)* (
		whenKeyword notKeyword matchedKeyword (
			byKeyword targetKeyword
		)? (andKeyword clause_search_condition)? thenKeyword merge_not_matched
	)? (
		whenKeyword notKeyword matchedKeyword byKeyword sourceKeyword (
			andKeyword clause_search_condition
		)? thenKeyword merge_matched
	)* (oUTPUT_CLAUSE)? (
		optionKeyword leftparenthesisKeyword query_hint (
			commaKeyword query_hint
		)* rightparenthesisKeyword
	)?;

if:
	ifKeyword boolean_expression (
		sql_statement
		| statement_block
	) (elsekeyword ( sql_statement | statement_block))?;

while:
	whilekeyword boolean_expression (
		sql_statement
		| statement_block
		| breakkeyword
		| continuekeyword
	);

statement_block:
	beginkeyword semicolonKeyword? (
		sql_statement
		| statement_block
	) endKeyword semicolonKeyword?;

sql_statement: (
		insert
		| update
		| sELECTstatement
		| create
		| declare_cursor
		| open_cursor
		| fetch_cursor
		| close_cursor
		| dellocate_cursor
		| delete
		| drop
		| alter
		| truncate
		| use
		| go
	)*;

boolean_expression: search_condition;

target_table:
	(
		(
			database_name dotKeyword schema_name dotKeyword
			| schema_name dotKeyword
		)? (asKeyword)? table_or_view_name
		| atsymbolKeyword variable (( asKeyword)? target_table)?
		| common_table_expression_name (
			( asKeyword)? target_table
		)?
	);

merge_hint:
	(
		(
			(
				table_hint_limited (
					commaKeyword table_hint_limited
				)*
			)? (
				(commaKeyword)? (
					indexKeyword leftparenthesisKeyword index_value (
						commaKeyword index_value
					) rightparenthesisKeyword
					| indexKeyword equalKeyword index_value
				)
			)?
		)
	);

merge_search_condition: search_condition;

merge_matched: (
		updateKeyword setKeyword set_clause
		| deleteKeyword
	);

merge_not_matched:
	(
		insertKeyword (
			leftparenthesisKeyword column_list rightparenthesisKeyword
		)? (
			valuesKeyword leftparenthesisKeyword values_list rightparenthesisKeyword
			| defaultKeyword valuesKeyword
		)
	);

clause_search_condition: search_condition;

drop:
	dropKeyword tableKeyword (ifKeyword existsKeyword)? object (
		commaKeyword object
	)* (semicolonKeyword)?;

values_list:
	leftparenthesisKeyword (
		defaultKeyword
		| nullKeyword
		| expression
	) (commaKeyword ( defaultKeyword | nullKeyword | expression))* rightparenthesisKeyword (
		commaKeyword leftparenthesisKeyword (
			defaultKeyword
			| nullKeyword
			| expression
		) (
			commaKeyword (
				defaultKeyword
				| nullKeyword
				| expression
			)
		)* rightparenthesisKeyword
	)*;
set_clause:
	(
		(object dotKeyword)? column_name equalKeyword (
			expression
			| defaultKeyword
			| nullKeyword
		)
		| (
			udt_column_name dotKeyword (
				(
					property_name equalKeyword expression
					| field_name equalKeyword expression
				)
				| method_name leftparenthesisKeyword argument (
					commaKeyword argument
				)* rightparenthesisKeyword
			)
		)
		| column_name (
			dotKeyword writeKeyword leftparenthesisKeyword (
				expression
				| nullKeyword
			) commaKeyword offset commaKeyword length rightparenthesisKeyword
		)
		| atsymbolKeyword variable equalKeyword expression
		| atsymbolKeyword variable equalKeyword column equalKeyword expression
		| column_name (
			plusequalKeyword
			| minusequalKeyword
			| multipleequalKeyword
			| divisionequalKeyword
			| moduleequalKeyword
			| andequalKeyword
			| xorequalKeyword
			| orequalKeyword
		) expression
		| atsymbolKeyword variable (
			plusequalKeyword
			| minusequalKeyword
			| multipleequalKeyword
			| divisionequalKeyword
			| moduleequalKeyword
			| andequalKeyword
			| xorequalKeyword
			| orequalKeyword
		) expression
		| atsymbolKeyword variable equalKeyword column (
			plusequalKeyword
			| minusequalKeyword
			| multipleequalKeyword
			| divisionequalKeyword
			| moduleequalKeyword
			| andequalKeyword
			| xorequalKeyword
			| orequalKeyword
		) expression
	) (
		commaKeyword (
			column_name equalKeyword (
				expression
				| defaultKeyword
				| nullKeyword
			)
			| (
				udt_column_name dotKeyword (
					(
						property_name equalKeyword expression
						| field_name equalKeyword expression
					)
					| method_name leftparenthesisKeyword argument (
						commaKeyword argument
					)* rightparenthesisKeyword
				)
			)
			| column_name (
				dotKeyword writeKeyword leftparenthesisKeyword (
					expression
					| nullKeyword
				) commaKeyword offset commaKeyword length rightparenthesisKeyword
			)
			| atsymbolKeyword variable equalKeyword expression
			| atsymbolKeyword variable equalKeyword column equalKeyword expression
			| column_name (
				plusequalKeyword
				| minusequalKeyword
				| multipleequalKeyword
				| divisionequalKeyword
				| moduleequalKeyword
				| andequalKeyword
				| xorequalKeyword
				| orequalKeyword
			) expression
			| atsymbolKeyword variable (
				plusequalKeyword
				| minusequalKeyword
				| multipleequalKeyword
				| divisionequalKeyword
				| moduleequalKeyword
				| andequalKeyword
				| xorequalKeyword
				| orequalKeyword
			) expression
			| atsymbolKeyword variable equalKeyword column (
				plusequalKeyword
				| minusequalKeyword
				| multipleequalKeyword
				| divisionequalKeyword
				| moduleequalKeyword
				| andequalKeyword
				| xorequalKeyword
				| orequalKeyword
			) expression
		)
	)*;

alter:
	alterKeyword tableKeyword object (
		alterKeyword columnKeyword column_name (
			(type_schema_name dotKeyword)? type_name (
				leftparenthesisKeyword (
					precision ( commaKeyword scale)?
					| max
					| xml_schema_collection
				) rightparenthesisKeyword
			)? (collateKeyword collation_name)? (
				nullKeyword
				| notKeyword nullKeyword
			)? (sparseKeyword)?
			| (addKeyword | dropKeyword) (
				rowguidcolKeyword
				| persistedKeyword
				| notKeyword forKeyword replicationKeyword
				| sparseKeyword
				| HIDDEN1
			) (nullKeyword | notKeyword nullKeyword)?
			| (addKeyword | dropKeyword) maskedKeyword (
				withKeyword leftparenthesisKeyword functionKeyword equalKeyword mask_function
					rightparenthesisKeyword
			)?
		) (
			withKeyword leftparenthesisKeyword onlineKeyword equalKeyword onKeyword
			| offKeyword rightparenthesisKeyword
		)?
		| ( withKeyword ( checkKeyword | nocheckKeyword))?
		| addKeyword (
			column_definition
			| computed_column_definition
			| table_constraint
			| column_set_definition
		) (
			commaKeyword (
				column_definition
				| computed_column_definition
				| table_constraint
				| column_set_definition
			)
		)*
		| dropKeyword (
			(
				(constraintKeyword)? (ifKeyword existsKeyword)? (
					constraint_name (
						withKeyword leftparenthesisKeyword drop_clustered_constraint_option (
							commaKeyword drop_clustered_constraint_option
						)* rightparenthesisKeyword
					)?
				) (
					commaKeyword (
						constraint_name (
							withKeyword leftparenthesisKeyword drop_clustered_constraint_option (
								commaKeyword drop_clustered_constraint_option
							)* rightparenthesisKeyword
						)?
					)
				)*
				| columnKeyword (ifKeyword existsKeyword)? (
					column_name
				) (
					commaKeyword (
						constraint_name (
							withKeyword leftparenthesisKeyword drop_clustered_constraint_option (
								commaKeyword drop_clustered_constraint_option
							)* rightparenthesisKeyword
						)?
					) (
						commaKeyword (
							constraint_name (
								withKeyword leftparenthesisKeyword drop_clustered_constraint_option
									(
									commaKeyword drop_clustered_constraint_option
								)* rightparenthesisKeyword
							)?
						)
					)*
					| columnKeyword (ifKeyword existsKeyword)? (
						column_name
					)
				)*
				| periodKeyword forKeyword SYSTEM_TIME
			) (
				commaKeyword (
					(constraintKeyword)? (
						ifKeyword existsKeyword
					)? (
						constraint_name (
							withKeyword leftparenthesisKeyword drop_clustered_constraint_option (
								commaKeyword drop_clustered_constraint_option
							)* rightparenthesisKeyword
						)?
					) (
						commaKeyword (
							constraint_name (
								withKeyword leftparenthesisKeyword drop_clustered_constraint_option
									(
									commaKeyword drop_clustered_constraint_option
								)* rightparenthesisKeyword
							)?
						)
					)*
					| columnKeyword (ifKeyword existsKeyword)? (
						column_name
					) (
						commaKeyword (
							constraint_name (
								withKeyword leftparenthesisKeyword drop_clustered_constraint_option
									(
									commaKeyword drop_clustered_constraint_option
								)* rightparenthesisKeyword
							)?
						) (
							commaKeyword (
								constraint_name (
									withKeyword leftparenthesisKeyword
										drop_clustered_constraint_option (
										commaKeyword drop_clustered_constraint_option
									)* rightparenthesisKeyword
								)?
							)
						)*
						| columnKeyword (ifKeyword existsKeyword)? (
							column_name
						)
					)*
					| periodKeyword forKeyword SYSTEM_TIME
				)
			)*
		)?
		| (withKeyword ( checkKeyword | nocheckKeyword))? (
			checkKeyword
			| nocheckKeyword
		) constraintKeyword (
			allKeyword
			| constraint_name (
				commaKeyword (allKeyword | constraint_name)
			)*
		)
		| (enableKeyword | disableKeyword) triggerKeyword (
			allKeyword
			| trigger_name (
				commaKeyword (allKeyword | trigger_name)
			)*
		)
		| (enableKeyword | disableKeyword) change_trackingkeyword (
			withKeyword leftparenthesisKeyword track_columns_updatedkeyword equalKeyword (
				onKeyword
				| offKeyword
			) rightparenthesisKeyword
		)?
		| switchKeyword (
			partitionKeyword source_partition_number_expression
		)? toKeyword target_table (
			partitionKeyword target_partition_number_expression
		)? (
			withKeyword leftparenthesisKeyword low_priority_lock_wait rightparenthesisKeyword
		)?
		| setKeyword leftparenthesisKeyword (
			filestream_onkeyword equalKeyword (
				partition_scheme_name
				| filegroup
				| doublequotationKeyword default doublequotationKeyword
				| doublequotationKeyword nullKeyword doublequotationKeyword
			)
		)?
		| system_versioningkeyword equalKeyword (
			offKeyword
			| onKeyword (
				leftparenthesisKeyword history_tablekeyword equalKeyword schema_name dotKeyword
					history_table_name (
					commaKeyword data_consistency_checkkeyword equalKeyword (
						onKeyword
						| offKeyword
					)
				)? (
					commaKeyword history_retention_periodkeyword equalKeyword (
						infiniteKeyword
						| number (
							dayKeyword
							| daysKeyword
							| weekKeyword
							| weeksKeyword
							| monthKeyword
							| monthsKeyword
							| yearKeyword
							| yearsKeyword
						)
					)
				)? rightparenthesisKeyword
			)?
		)
		| data_deletionkeyword equalKeyword (
			offKeyword
			| onKeyword (
				leftparenthesisKeyword (
					filter_columnkeyword equalKeyword column_name
				)? (
					commaKeyword retention_periodkeyword equalKeyword (
						infiniteKeyword
						| number (
							dayKeyword
							| daysKeyword
							| weekKeyword
							| weeksKeyword
							| monthKeyword
							| monthsKeyword
							| yearKeyword
							| yearsKeyword
						)
					)
				)? rightparenthesisKeyword
			)?
		) rightparenthesisKeyword
		| rebuildKeyword (
			(partitionKeyword equalKeyword allKeyword)? (
				withKeyword leftparenthesisKeyword rebuild_option (
					commaKeyword rebuild_option
				)* rightparenthesisKeyword
			)?
			| (
				partitionKeyword equalKeyword partition_number (
					withKeyword leftparenthesisKeyword single_partition_rebuild__option (
						commaKeyword single_partition_rebuild__option
					)* rightparenthesisKeyword
				)?
			)?
		)
		| table_option
		| filetable_option
	) (semicolonKeyword)?;
column_set_definition:
	column_set_name xmlKeyword column_setkeyword forKeyword ALL_SPARSE_COLUMNS;
drop_clustered_constraint_option:
	(
		maxdopKeyword equalKeyword max_degree_of_parallelism
		| onlineKeyword equalKeyword (onKeyword | offKeyword)
		| moveKeyword toKeyword (
			partition_scheme_name leftparenthesisKeyword column_name rightparenthesisKeyword
			| filegroup
			| doublequotationKeyword default doublequotationKeyword
		)
	);
table_option:
	(
		setKeyword leftparenthesisKeyword lock_escalationkeyword equalKeyword (
			autoKeyword
			| tableKeyword
			| disableKeyword
		) rightparenthesisKeyword
	);
max: numbersKeyword;
filetable_option:
	(
		(( enableKeyword | disableKeyword) FILETABLE_NAMESPACE)? (
			setKeyword leftparenthesisKeyword filetable_directorykeyword equalKeyword directory_name
				rightparenthesisKeyword
		)?
	);
single_partition_rebuild__option:
	(
		sort_in_tempdbkeyword equalKeyword (
			onKeyword
			| offKeyword
		)
		| maxdopKeyword equalKeyword max_degree_of_parallelism
		| data_compressionkeyword equalKeyword (
			noneKeyword
			| rowKeyword
			| pageKeyword
			| columnstoreKeyword
			| COLUMNSTORE_ARCHIVE
		)
		| onlineKeyword equalKeyword (
			onKeyword (
				leftparenthesisKeyword low_priority_lock_wait rightparenthesisKeyword
			)?
			| offKeyword
		)
	);
low_priority_lock_wait:
	(
		wait_at_low_prioritykeyword leftparenthesisKeyword max_durationkeyword equalKeyword time (
			minutesKeyword
		)? commaKeyword abort_after_waitkeyword equalKeyword (
			noneKeyword
			| selfKeyword
			| blockersKeyword
		) rightparenthesisKeyword
	);

column_definition:
	column_name data_type (filestreamKeyword)? (
		collateKeyword collation_name
	)? (sparseKeyword)? (
		maskedKeyword withKeyword leftparenthesisKeyword functionKeyword equalKeyword mask_function
			rightparenthesisKeyword
	)? (
		(constraintKeyword constraint_name)? defaultKeyword constant_expression
	)? (
		identityKeyword (
			leftparenthesisKeyword seed commaKeyword increment rightparenthesisKeyword
		)?
	)? (notKeyword forKeyword replicationKeyword)? (
		generatedKeyword alwaysKeyword asKeyword (
			rowKeyword
			| TRANSACTION_ID
			| SEQUENCE_NUMBER
		) (startKeyword | endKeyword) (HIDDEN1)?
	)? (
		(constraintKeyword constraint_name)? (
			nullKeyword
			| notKeyword nullKeyword
		)
	)? (rowguidcolKeyword)? (
		encryptedKeyword withKeyword leftparenthesisKeyword column_encryption_keykeyword
			equalKeyword key_name commaKeyword encryption_typekeyword equalKeyword (
			deterministicKeyword
			| randomizedKeyword
		) commaKeyword algorithmKeyword equalKeyword singlequotationKeyword
			AEAD_AES_256_CBC_HMAC_SHA_256 singlequotationKeyword rightparenthesisKeyword
	)? (column_constraint (commaKeyword column_constraint)*)? (
		column_index
	)? column_index?;
datatype:
	(type_schema_name dotKeyword)? type_name (
		leftparenthesisKeyword (
			precision ( commaKeyword scale)?
			| max
			| (( contentKeyword | documentKeyword))? xml_schema_collection
		) rightparenthesisKeyword
	)?;
column_constraint:
	(constraintKeyword constraint_name)? (
		(
			primaryKeyword keyKeyword (notKeyword nullKeyword)?
			| uniqueKeyword
		) (clusteredKeyword | nonclusteredKeyword)? (
			leftparenthesisKeyword column_name1 (
				commaKeyword column_name1
			)* rightparenthesisKeyword
		)? (
			withKeyword fillfactorKeyword equalKeyword fillfactor
			| withKeyword leftparenthesisKeyword index_option (
				commaKeyword index_option
			)* rightparenthesisKeyword
		)? (
			onKeyword (
				partition_scheme_name leftparenthesisKeyword partition_column_name
					rightparenthesisKeyword
				| filegroup
				| doublequotationKeyword default doublequotationKeyword
			)
		)?
		| (foreignKeyword keyKeyword)? referencesKeyword (
			schema_name dotKeyword
		)? referenced_table_name (
			leftparenthesisKeyword ref_column rightparenthesisKeyword
		)? (
			onKeyword deleteKeyword (
				noKeyword actionKeyword
				| cascadeKeyword
				| setKeyword nullKeyword
				| setKeyword defaultKeyword
			)
		)? (
			onKeyword updateKeyword (
				noKeyword actionKeyword
				| cascadeKeyword
				| setKeyword nullKeyword
				| setKeyword defaultKeyword
			)
		)? (notKeyword forKeyword replicationKeyword)?
		| checkKeyword (notKeyword forKeyword replicationKeyword)? leftparenthesisKeyword
			logical_expression rightparenthesisKeyword
	);

index_option: (
		pad_indexkeyword equalKeyword (onKeyword | offKeyword)
		| fillfactorKeyword equalKeyword fillfactor
		| ignore_dup_keykeyword equalKeyword (
			onKeyword
			| offKeyword
		)
		| statistics_norecomputekeyword equalKeyword (
			onKeyword
			| offKeyword
		)
		| allow_row_lockskeyword equalKeyword (
			onKeyword
			| offKeyword
		)
		| allow_page_lockskeyword equalKeyword (
			onKeyword
			| offKeyword
		)
		| optimize_for_sequential_keykeyword equalKeyword (
			onKeyword
			| offKeyword
		)
		| sort_in_tempdbkeyword equalKeyword (
			onKeyword
			| offKeyword
		)
		| maxdopKeyword equalKeyword max_degree_of_parallelism
		| data_compressionkeyword equalKeyword (
			noneKeyword
			| rowKeyword
			| pageKeyword
			| columnstoreKeyword
			| COLUMNSTORE_ARCHIVE
		) (
			onKeyword partitionsKeyword leftparenthesisKeyword (
				partition_number_expression
				| range
			) (
				commaKeyword (
					partition_number_expression
					| range
				)
			)* rightparenthesisKeyword
		)?
		| xml_compressionkeyword equalKeyword (
			onKeyword
			| offKeyword
		) (
			onKeyword partitionsKeyword leftparenthesisKeyword (
				partition_number_expression
				| range
			) (
				commaKeyword (
					partition_number_expression
					| range
				)
			)* rightparenthesisKeyword
		)?
		| onlineKeyword equalKeyword (onKeyword | offKeyword)
		| resumableKeyword equalKeyword (onKeyword | offKeyword)
		| max_durationkeyword equalKeyword time (minutesKeyword)?
	);
range:
	partition_number_expression toKeyword partition_number_expression;

computed_column_definition:
	column_name asKeyword computed_column_expression (
		persistedKeyword ( notKeyword nullKeyword)?
	)? (
		(constraintKeyword constraint_name)? (
			primaryKeyword keyKeyword
			| uniqueKeyword
		) (clusteredKeyword | nonclusteredKeyword)? (
			withKeyword fillfactorKeyword equalKeyword fillfactor
		)? (
			withKeyword leftparenthesisKeyword index_option (
				commaKeyword index_option
			)* rightparenthesisKeyword
		)? (
			onKeyword (
				partition_scheme_name leftparenthesisKeyword partition_column_name
					rightparenthesisKeyword
				| filegroup
				| doublequotationKeyword default doublequotationKeyword
			)
		)?
		| (foreignKeyword keyKeyword)? referencesKeyword ref_table (
			leftparenthesisKeyword ref_column rightparenthesisKeyword
		)? (
			onKeyword deleteKeyword (
				noKeyword actionKeyword
				| cascadeKeyword
			)
		)? (onKeyword updateKeyword ( noKeyword actionKeyword))? (
			notKeyword forKeyword replicationKeyword
		)?
		| checkKeyword (notKeyword forKeyword replicationKeyword)? leftparenthesisKeyword
			logical_expression rightparenthesisKeyword
	)?;

single_partition_rebuild_option:
	(
		data_compressionkeyword equalKeyword (
			columnstoreKeyword
			| COLUMNSTORE_ARCHIVE
		)
	);

rebuild_option:
	(
		data_compressionkeyword equalKeyword (
			noneKeyword
			| rowKeyword
			| pageKeyword
			| columnstoreKeyword
			| COLUMNSTORE_ARCHIVE
		) (
			onKeyword partitionsKeyword leftparenthesisKeyword (
				partition_number (toKeyword partition_number)?
			) (
				commaKeyword (
					partition_number (toKeyword partition_number)?
				)
			)* rightparenthesisKeyword
		)?
		| xml_compressionkeyword equalKeyword (
			onKeyword
			| offKeyword
		) (
			onKeyword partitionsKeyword leftparenthesisKeyword (
				partition_number (toKeyword partition_number)?
			) (
				commaKeyword (
					partition_number (toKeyword partition_number)?
				)
			)* rightparenthesisKeyword
		)?
	);

create:
	createKeyword tableKeyword (object) leftparenthesisKeyword (
		column_definition
		| computed_column_definition
		| column_set_definition
		| (table_constraint)? (commaKeyword table_constraint)*
		| ( table_index)?
	) (
		commaKeyword (
			column_definition
			| computed_column_definition
			| column_set_definition
			| (table_constraint)? (commaKeyword table_constraint)*
			| ( table_index)?
		)
	)* (
		periodKeyword forKeyword system_timekeyword leftparenthesisKeyword
			system_start_time_column_name commaKeyword system_end_time_column_name
			rightparenthesisKeyword
	)? rightparenthesisKeyword (
		onKeyword (
			partition_scheme_name leftparenthesisKeyword partition_column_name
				rightparenthesisKeyword
			| filegroup
			| doublequotationKeyword default doublequotationKeyword
		)
	)? (
		textimage_onkeyword (
			filegroup
			| doublequotationKeyword default doublequotationKeyword
		)
	)? (
		filestream_onkeyword (
			partition_scheme_name
			| filegroup
			| doublequotationKeyword default doublequotationKeyword
		)
	)? (
		withKeyword leftparenthesisKeyword table_option (
			commaKeyword table_option
		)* rightparenthesisKeyword
	)? (semicolonKeyword)?;
data_type:
	(type_schema_name dotKeyword)? type_name (
		leftparenthesisKeyword (
			precision ( commaKeyword scale)?
			| max
			| (( contentKeyword | documentKeyword))? xml_schema_collection
		) rightparenthesisKeyword
	)?;
column_index:
	indexKeyword index_name (
		clusteredKeyword
		| nonclusteredKeyword
	)? (
		withKeyword leftparenthesisKeyword index_option (
			commaKeyword index_option
		)* rightparenthesisKeyword
	)? (
		onKeyword (
			partition_scheme_name leftparenthesisKeyword column_name rightparenthesisKeyword
			| filegroup_name
			| default
		)
	)? (
		filestream_onkeyword (
			filestream_filegroup_name
			| partition_scheme_name
			| doublequotationKeyword nullKeyword doublequotationKeyword
		)
	)?;
table_index:
	(
		(
			indexKeyword index_name (uniqueKeyword)? (
				clusteredKeyword
				| nonclusteredKeyword
			)? leftparenthesisKeyword column_name (
				ascKeyword
				| descKeyword
			)? (
				commaKeyword column_name (
					ascKeyword
					| descKeyword
				)?
			)* rightparenthesisKeyword
			| indexKeyword index_name clusteredKeyword columnstoreKeyword (
				orderKeyword leftparenthesisKeyword column_name (
					commaKeyword column_name
				)* rightparenthesisKeyword
			)?
			| indexKeyword index_name (nonclusteredKeyword)? columnstoreKeyword
				leftparenthesisKeyword column_name (
				commaKeyword column_name
			)* rightparenthesisKeyword
		) (
			includeKeyword leftparenthesisKeyword column_name (
				commaKeyword column_name
			)* rightparenthesisKeyword
		)? (whereKeyword predicate)? (
			withKeyword leftparenthesisKeyword index_option (
				commaKeyword index_option
			)* rightparenthesisKeyword
		)? (
			onKeyword (
				partition_scheme_name leftparenthesisKeyword column_name rightparenthesisKeyword
				| filegroup_name
				| default
			)
		)? (
			filestream_onkeyword (
				filestream_filegroup_name
				| partition_scheme_name
				| doublequotationKeyword nullKeyword doublequotationKeyword
			)
		)?
	);

close_cursor:
	closeKeyword (
		( ( globalKeyword)? cursor_name)
		| cursor_variable_name
	);

dellocate_cursor:
	deallocateKeyword (
		( ( globalKeyword)? cursor_name)
		| atsymbolKeyword cursor_variable_name
	);

declare_cursor:
	declareKeyword cursor_name cursorKeyword (
		localKeyword
		| globalKeyword
	)? (forward_onlykeyword | scrollKeyword)? (
		staticKeyword
		| keysetKeyword
		| dynamicKeyword
		| FAST_FORWARD
	)? (
		read_onlykeyword
		| scroll_lockskeyword
		| optimisticKeyword
	)? (TYPE_WARNING)? forKeyword select_statement (
		forKeyword updateKeyword (ofKeyword column_list)?
	)? (semicolonKeyword)?;

fetch_cursor:
	fetchKeyword (
		(
			nextKeyword
			| priorKeyword
			| firstKeyword
			| lastKeyword
			| absoluteKeyword ( n | atsymbolKeyword variable)
			| relativeKeyword ( n | atsymbolKeyword variable)
		)? fromKeyword
	)? (
		( ( globalKeyword)? cursor_name)
		| atsymbolKeyword cursor_variable_name
	) (
		intoKeyword atsymbolKeyword variable_name (
			commaKeyword atsymbolKeyword variable_name
		)*
	)?;
n: numbersKeyword;
open_cursor:
	openKeyword (
		( ( globalKeyword)? cursor_name)
		| cursor_variable_name
	);

expression:
	surroundedExpression
	| surroundedScalarSubquery
	| constant
	| scalar_function
	| objectDotColumn
	| variableName
	| unary_operator expression
	| expression (starKeyword | divisionKeyword | moduleKeyword) expression
	| expression (plusKeyword | minusKeyword) expression;

unaryOperator: unary_operator expression;

surroundedScalarSubquery:
	leftparenthesisKeyword scalar_subquery rightparenthesisKeyword;
variableName: atsymbolKeyword? variable;
scalar_expression:
	(
		constant
		| scalar_function
		| variable
		| leftparenthesisKeyword expression rightparenthesisKeyword
		| leftparenthesisKeyword scalar_subquery rightparenthesisKeyword
		| ( unary_operator) expression
		| expression ( binary_operator) expression
	);

bulk:
	bulkKeyword insertKeyword (
		database_name .schema_name .table_or_view_name
		| schema_name .table_or_view_name
		| table_or_view_name
	) fromKeyword data_file (
		withKeyword leftparenthesisKeyword (
			(commaKeyword)? data_sourcekeyword equalKeyword data_source_name
		)? (
			(commaKeyword)? codepageKeyword equalKeyword (
				'rawKeyword'
				| code_page
				| 'acpKeyword'
				| 'oemKeyword'
			)
		)? (
			(commaKeyword)? datafiletypeKeyword equalKeyword (
				charKeyword
				| 'widechar'
				| 'native'
				| 'widenative'
			)
		)? (
			(commaKeyword)? rowterminatorKeyword equalKeyword row_terminator
		)? (
			(commaKeyword)? fieldterminatorKeyword equalKeyword field_terminator
		)? (
			(commaKeyword)? formatKeyword equalKeyword 'csvKeyword'
		)? (
			(commaKeyword)? fieldquoteKeyword equalKeyword quote_characters
		)? (
			(commaKeyword)? firstrowKeyword equalKeyword first_row
		)? (( commaKeyword)? lastrowKeyword equalKeyword last_row)? (
			(commaKeyword)? formatfileKeyword equalKeyword format_file_path
		)? (
			(commaKeyword)? formatfile_data_sourcekeyword equalKeyword data_source_name
		)? (
			(commaKeyword)? maxerrorsKeyword equalKeyword max_errors
		)? (
			(commaKeyword)? errorfileKeyword equalKeyword file_name
		)? (
			(commaKeyword)? errorfile_data_sourcekeyword equalKeyword errorfile_data_source_name
		)? (( commaKeyword)? keepidentityKeyword)? (
			( commaKeyword)? keepnullsKeyword
		)? (( commaKeyword)? FIRE_TRIGGERS)? (
			( commaKeyword)? CHECK_CONSTRAINTS
		)? (( commaKeyword)? tablockKeyword)? (
			(commaKeyword)? orderKeyword leftparenthesisKeyword (
				column ( ascKeyword | descKeyword)?
			) (commaKeyword column (ascKeyword | descKeyword)?)* rightparenthesisKeyword
		)? (
			(commaKeyword)? rows_per_batchkeyword equalKeyword rows_per_batch
		)? (
			(commaKeyword)? kilobytes_per_batchkeyword equalKeyword kilobytes_per_batch
		)? (
			(commaKeyword)? batchsizeKeyword equalKeyword batch_size
		)? rightparenthesisKeyword
	)?;
openrowset:
	openrowsetKeyword leftparenthesisKeyword bulkKeyword data_file_path commaKeyword bulk_option (
		commaKeyword bulk_option
	)* rightparenthesisKeyword (
		withKeyword leftparenthesisKeyword (
			column_name sql_datatype column_path
			| column_ordinal
		)+ rightparenthesisKeyword
	)?;

bulk_option:
	data_sourcekeyword equalKeyword data_source_name
	| codepageKeyword equalKeyword (
		'acpKeyword'
		| 'oemKeyword'
		| 'rawKeyword'
		| 'code_page'
	) datafiletypeKeyword equalKeyword (charKeyword | 'widechar')
	| formatKeyword equalKeyword file_format
	| formatfileKeyword equalKeyword format_file_path
	| formatfile_data_sourcekeyword equalKeyword data_source_name
	| SINGLE_BLOB
	| SINGLE_CLOB
	| SINGLE_NCLOB
	| rowterminatorKeyword equalKeyword row_terminator
	| fieldterminatorKeyword equalKeyword field_terminator
	| fieldquoteKeyword equalKeyword quote_character
	| maxerrorsKeyword equalKeyword maximum_errors
	| errorfileKeyword equalKeyword file_name
	| errorfile_data_sourcekeyword equalKeyword data_source_name
	| firstrowKeyword equalKeyword first_row
	| lastrowKeyword equalKeyword last_row
	| orderKeyword leftparenthesisKeyword (
		column ( ascKeyword | descKeyword)?
	) (commaKeyword column (ascKeyword | descKeyword)?)* rightparenthesisKeyword (
		uniqueKeyword
	)?
	| rows_per_batchkeyword equalKeyword rows_per_batch;

rows_per_batch: numbersKeyword;
maximum_errors: numbersKeyword;
quote_character: stringKeyword;
file_format: stringKeyword;
column_ordinal: numbersKeyword;
column_path: string_expression;
sql_datatype: datatype;
data_file_path: stringKeyword;
data_source_name: string_expression;
data_file: string_expression;
field_terminator: string_expression;
row_terminator: string_expression;
code_page: string_expression;
last_row: numbersKeyword;
first_row: numbersKeyword;
quote_characters: string_expression;
errorfile_data_source_name: string_expression;
file_name: string_expression;
max_errors: numbersKeyword;
format_file_path: stringKeyword;
batch_size: numbersKeyword;
kilobytes_per_batch: numbersKeyword;
expression_name: identifiersKeyword;
string_expression:
	stringKeyword
	| atsymbolKeyword variable
	| (object dotKeyword)? column;
escape_character: string_expression;
column: identifiersKeyword;
freetext_string: string_expression;
subquery: sELECTstatement;
node_table_alias: identifiersKeyword;
node_table_name: identifiersKeyword;
edge_table_alias: identifiersKeyword;
edge_table_name: identifiersKeyword;
collation_name: identifiersKeyword;
offset_row_count_expression: expression;
integer_constant: numbersKeyword;
fetch_row_count_expression: expression;
word: string_expression;
phrase: string_expression;
prefix_term: string_expression;
proximity_term: string_expression;
integer: numbersKeyword;
weight_value: numbersKeyword;
column_expression:
	expression
	| leftparenthesisKeyword column_expression rightparenthesisKeyword;
table_or_view_name: identifiersKeyword | documentKeyword;
rowset_function: openrowset | openquery | openrowset2;
bulk_column_alias: identifiersKeyword;
table_alias: identifiersKeyword;
column_alias:
	identifiersKeyword
	| xmldataKeyword
	| stringKeyword
	| actionKeyword;
variable: identifiersKeyword;
function_call: (identifiersKeyword | maxKeyword | concatKeyword) leftparenthesisKeyword (
		(
			(object dotKeyword)? column
			| starKeyword
			| scalar_subquery
			| stringKeyword
			| yearKeyword
		) (
			commaKeyword (
				(
					(object dotKeyword)? column
					| starKeyword
					| scalar_subquery
					| stringKeyword
					| yearKeyword
				)
			)
		)*
	)? (
		(asKeyword dataType1)? leftparenthesisKeyword (
			expression*
			| maxKeyword
		) rightparenthesisKeyword
	)? rightparenthesisKeyword;
repeat_seed: numbersKeyword;
left_table_source: table_source;
right_table_source: table_source;
aggregate_function: COUNT | MIN | MAX | AVG | SUM;
value_column: identifiersKeyword;
pivot_column: identifiersKeyword;
date_time_variable: string_expression;
date_time_literal: string_expression;
view_name: identifiersKeyword;
table_name: identifiersKeyword;
field_name: identifiersKeyword;
property_name: identifiersKeyword;
udt_column_name: identifiersKeyword;
argument: expression;
method_name: identifiersKeyword;
integer_value: numbersKeyword;
numeric_value: numbersKeyword;
literal_constant: stringKeyword | numbersKeyword;
variable_name: identifiersKeyword;
hint_name: stringKeyword;
xml_plan: string_expression;
exposed_object_name: identifiersKeyword;
point_in_time: string_expression;
index_value: numbersKeyword | identifiersKeyword;
index_column_name: identifiersKeyword;

idoc: numbersKeyword;
rowpattern: string_expression;
flags: numbersKeyword;
columns_count: numbersKeyword;
openquery:
	openqueryKeyword leftparenthesisKeyword linked_server commaKeyword query rightparenthesisKeyword
		;
openrowset2:
	openrowsetKeyword leftparenthesisKeyword provider_name commaKeyword (
		datasource semicolonKeyword user_id semicolonKeyword password
		| provider_string
	) commaKeyword (
		(catalog dotKeyword)? (schema_name dotKeyword)? object
		| query
	) rightparenthesisKeyword;
provider_string: string_expression;
datasource: string_expression;
user_id: string_expression;
password: string_expression;
provider_name: string_expression;
catalog: string_expression;
query: string_expression;
linked_server: identifiersKeyword;
rowset_function_limited: openquery | openrowset | openrowset2;
table_variable: identifiersKeyword;
cursor_name: identifiersKeyword;
cursor_variable_name: identifiersKeyword;
schema_name: identifiersKeyword;
database_name: identifiersKeyword;
server_name: identifiersKeyword;
output_table: object;
column_alias_identifier: identifiersKeyword;
from_table_name: identifiersKeyword;
derived_table:
	leftparenthesisKeyword subquery rightparenthesisKeyword (
		( asKeyword)? table_alias
	)?;
dml_statement_with_output_clause: table;
type_name: dataType1 | identifiersKeyword;
type_schema_name: identifiersKeyword;
scale: numbersKeyword;
precision: numbersKeyword;
xml_schema_collection: identifiersKeyword;
mask_function: string_expression;
datetime2: string_expression;
system_start_time_column_name: identifiersKeyword;
constant_expression: expression;
constraint_name: identifiersKeyword;
system_end_time_column_name: identifiersKeyword;
start_transaction_id_column_name: identifiersKeyword;
end_sequence_number_column_name: identifiersKeyword;
start_sequence_number_column_name: identifiersKeyword;
end_transaction_id_column_name: identifiersKeyword;
trigger_name: identifiersKeyword;
source_partition_number_expression: numbersKeyword;
target_partition_number_expression: numbersKeyword;
default: defaultKeyword;
filegroup: identifiersKeyword;
partition_scheme_name: identifiersKeyword;
number: numbersKeyword;
history_table_name: identifiersKeyword;
partition_number: numbersKeyword;
max_degree_of_parallelism: numbersKeyword;
column_set_name: identifiersKeyword;
directory_name: identifiersKeyword;
null: nullKeyword;
time: numbersKeyword;
key_name: identifiersKeyword;
increment: numbersKeyword;
seed: numbersKeyword;
referenced_table_name: identifiersKeyword;
partition_column_name: identifiersKeyword;
fillfactor: numbersKeyword;
logical_expression: search_condition_without_match;
ref_column: identifiersKeyword;
partition_number_expression: numbersKeyword;
computed_column_expression: expression;
ref_table: identifiersKeyword;
filegroup_name: identifiersKeyword;
index_name: identifiersKeyword;
filestream_filegroup_name: identifiersKeyword;
table_constraint: (constraintKeyword constraint_name)? (
		(primaryKeyword keyKeyword | uniqueKeyword) (
			clusteredKeyword
			| nonclusteredKeyword
		)? leftparenthesisKeyword column (
			ascKeyword
			| descKeyword
		)? (commaKeyword column ( ascKeyword | descKeyword)?)* rightparenthesisKeyword (
			withKeyword fillfactorKeyword equalKeyword fillfactor
		)? (
			withKeyword leftparenthesisKeyword index_option (
				commaKeyword index_option
			)* rightparenthesisKeyword
		)? (
			onKeyword (
				partition_scheme_name leftparenthesisKeyword partition_column_name
					rightparenthesisKeyword
				| filegroup
				| doublequotationKeyword default doublequotationKeyword
			)
		)?
		| foreignKeyword keyKeyword leftparenthesisKeyword column (
			commaKeyword column
		)* rightparenthesisKeyword referencesKeyword referenced_table_name (
			leftparenthesisKeyword ref_column (
				commaKeyword ref_column
			)* rightparenthesisKeyword
		)? (
			onKeyword deleteKeyword (
				noKeyword actionKeyword
				| cascadeKeyword
				| setKeyword nullKeyword
				| setKeyword defaultKeyword
			)
		)? (
			onKeyword updateKeyword (
				noKeyword actionKeyword
				| cascadeKeyword
				| setKeyword nullKeyword
				| setKeyword defaultKeyword
			)
		)? (notKeyword forKeyword replicationKeyword)?
		| connectionKeyword leftparenthesisKeyword (
			node_table toKeyword node_table
		) (commaKeyword (node_table toKeyword node_table))* rightparenthesisKeyword (
			onKeyword deleteKeyword (
				noKeyword actionKeyword
				| cascadeKeyword
			)
		)?
		| defaultKeyword constant_expression forKeyword column (
			withKeyword valuesKeyword
		)?
		| checkKeyword (notKeyword forKeyword replicationKeyword)? leftparenthesisKeyword
			logical_expression rightparenthesisKeyword
	);
node_table: identifiersKeyword;
scalar_function:
	(identifiersKeyword | maxKeyword | concatKeyword) leftparenthesisKeyword (
		((object dotKeyword)? column | starKeyword | expression) (
			commaKeyword (
				(
					(object dotKeyword)? column
					| starKeyword
					| expression
				)
			)
		)*
	)? (
		(asKeyword dataType1)? leftparenthesisKeyword (
			expression*
			| maxKeyword
		) rightparenthesisKeyword
	)? rightparenthesisKeyword;

execute_statement: (execKeyword | executeKeyword) (
		(atsymbolKeyword return_status equalKeyword)? (
			module_name ( semicolonKeyword number)?
			| atsymbolKeyword module_name_var
		) (
			commaKeyword (
				(atsymbolKeyword parameter equalKeyword)? (
					value
					| atsymbolKeyword variable ( outputKeyword)?
					| defaultKeyword
				)
			)?
		)* (
			withKeyword execute_option (
				commaKeyword execute_option
			)*
		)?
	) (semicolonKeyword)?
	| (execKeyword | executeKeyword) leftparenthesisKeyword (
		string_variable
		| ( nKeyword)? 'tsql_string'
	) (
		plusKeyword (
			atsymbolKeyword string_variable
			| ( nKeyword)? 'tsql_string'
		)
	)* rightparenthesisKeyword (
		asKeyword (loginKeyword | userKeyword) equalKeyword ' name '
	)? (semicolonKeyword)?
	| (execKeyword | executeKeyword) leftparenthesisKeyword (
		string_variable
		| ( nKeyword)? 'command_string ( ? )?'
	) (
		plusKeyword (
			atsymbolKeyword string_variable
			| ( nKeyword)? 'command_string ( ? )?'
		)
	)* (
		(
			commaKeyword (
				value
				| atsymbolKeyword variable ( outputKeyword)?
			)
		)
	)* rightparenthesisKeyword (
		asKeyword (loginKeyword | userKeyword) equalKeyword ' name '
	)? (atKeyword linked_server_name)? (
		atKeyword data_sourcekeyword data_source_name
	)? (semicolonKeyword)?;

execute_option:
	(
		recompileKeyword
		| ( resultKeyword setsKeyword undefinedKeyword)
		| ( resultKeyword setsKeyword noneKeyword)
		| (
			resultKeyword setsKeyword leftparenthesisKeyword result_sets_definition (
				commaKeyword result_sets_definition
			)* rightparenthesisKeyword
		)
	);

go: goKeyword end?;

use: useKeyword object end?;

result_sets_definition:
	(
		leftparenthesisKeyword (
			column_name data_type (collateKeyword collation_name)? (
				nullKeyword
				| notKeyword nullKeyword
			)?
		) (
			commaKeyword (
				column_name data_type (
					collateKeyword collation_name
				)? (nullKeyword | notKeyword nullKeyword)?
			)
		)* rightparenthesisKeyword
		| asKeyword objectKeyword (
			db_name dotKeyword (schema_name)? dotKeyword
			| schema_name dotKeyword
		)? (table_name | view_name | table_valued_function_name)
		| asKeyword typeKeyword (schema_name dotKeyword)? table_type_name
		| asKeyword forKeyword xmlKeyword
	);

value: expression;
table_valued_function_name: identifiersKeyword;
table_type_name: identifiersKeyword;
linked_server_name: identifiersKeyword;
module_name: object;
db_name: identifiersKeyword;
string_variable: stringKeyword | atsymbolKeyword variable;
module_name_var: identifiersKeyword;
return_status: identifiersKeyword;
parameter: identifiersKeyword;
constant: stringKeyword | numbersKeyword;
binary_operator:
	minusKeyword
	| starKeyword
	| plusKeyword
	| divisionKeyword
	| moduleKeyword;
unary_operator: plusKeyword | minusKeyword | tildekeyword;
scalar_subquery:
	sELECTstatement
	| leftparenthesisKeyword sELECTstatement rightparenthesisKeyword;
select_statement: sELECTstatement;
sample_number: numbersKeyword;
user_defined_function:
	identifiersKeyword leftparenthesisKeyword expression (
		commaKeyword expression
	)* rightparenthesisKeyword;
targetNameSpaceURI: string_expression;
cTE_query_definition: sELECTstatement;
elementName: stringKeyword;
rootName: string_expression;
offset: numbersKeyword | nullKeyword;
length: numbersKeyword | nullKeyword;
opendatasource:
	opendatasourceKeyword leftparenthesisKeyword provider_name commaKeyword init_string
		rightparenthesisKeyword;
init_string: stringKeyword;
order_by_expression: expression (commaKeyword expression)*;
column_name: (object dotKeyword)? column;
common_table_expression_name: identifiersKeyword;
where: whereKeyword;
option_keyword: optionKeyword;
leftparenthesis: leftparenthesisKeyword;
comma: commaKeyword;
rightparenthesis: rightparenthesisKeyword;
end: semicolonKeyword;
setOperations: (
		unionKeyword ( allKeyword)?
		| exceptKeyword
		| intersectKeyword
	);
whereClause: where search_condition;
fromTable: fromKeyword table (commaKeyword table)*;
having: havingKeyword search_condition;

select: selectKeyword;
all: allKeyword | distinctKeyword;
percent: percentKeyword;
withTies: withKeyword tiesKeyword;
surroundedQuerySpecification:
	leftparenthesis query_expression rightparenthesis;

into: intoKeyword object;

on: onkeyword1 filegroup;

truncate:
	truncatekeyword tableKeyword object (
		withKeyword leftparenthesisKeyword partitionsKeyword leftparenthesisKeyword (
			partition_number_expression
			| range
		) (commaKeyword ( partition_number_expression | range))* rightparenthesisKeyword
			rightparenthesisKeyword
	)? end?;

cteQueryDefinition:
	asKeyword leftparenthesis cTE_query_definition rightparenthesis;
surroundedColumnList:
	leftparenthesis column_list rightparenthesis;
andSearchCondetion: and search_condition;
match:
	matchKeyword leftparenthesis graph_search_pattern rightparenthesis;

containsKeyword: CONTAINS;

leftparenthesisKeyword: LEFTPARENTHESIS;

starKeyword: STAR;

commaKeyword: COMMA;

singlequotationKeyword: SINGLEQUOTATION;

rightparenthesisKeyword: RIGHTPARENTHESIS;

freetextKeyword: FREETEXT;

notKeyword: NOT;

inKeyword: IN;

equalKeyword: EQUAL;

notequalKeyword: NOTEQUAL;

greaterthanKeyword: GREATERTHAN;

greaterthanorequalKeyword: GREATERTHANOREQUAL;

notgreaterthanKeyword: NOTGREATERTHAN;

lessthanKeyword: LESSTHAN;

lessthanorequalKeyword: LESSTHANOREQUAL;

notlessthanKeyword: NOTLESSTHAN;

allKeyword: ALL;

someKeyword: SOME;

anyKeyword: ANY;

existsKeyword: EXISTS;

likeKeyword: LIKE;

escapeKeyword: ESCAPE;

minusKeyword: MINUS;

orderKeyword: ORDER;

byKeyword: BY;

collateKeyword: COLLATE;

ascKeyword: ASC;

descKeyword: DESC;

offsetKeyword: OFFSET;

rowKeyword: ROW;

rowsKeyword: ROWS;

fetchKeyword: FETCH;

firstKeyword: FIRST;

nextKeyword: NEXT;

onlyKeyword: ONLY;

forKeyword: FOR;

browseKeyword: BROWSE;

xmlKeyword: XML;

rawKeyword: RAW;

autoKeyword: AUTO;

xmldataKeyword: XMLDATA;

xmlschemaKeyword: XMLSCHEMA;

elementsKeyword: ELEMENTS;

xsinilKeyword: XSINIL;

absentKeyword: ABSENT;

explicitKeyword: EXPLICIT;

pathKeyword: PATH;

binaryKeyword: BINARY;

typeKeyword: TYPE;

rootKeyword: ROOT;

jsonKeyword: JSON;

andKeyword: AND;

orKeyword: OR;

doublequotationKeyword: DOUBLEQUOTATION;

formsofKeyword: FORMSOF;

inflectionalKeyword: INFLECTIONAL;

thesaurusKeyword: THESAURUS;

nearKeyword: NEAR;

maxKeyword: MAX;

trueKeyword: TRUE;

falseKeyword: FALSE;

isaboutKeyword: ISABOUT;

weightKeyword: WEIGHT;

andoperationKeyword: ANDOPERATION;

oroperationKeyword: OROPERATION;

groupKeyword: GROUP;

rollupKeyword: ROLLUP;

cubeKeyword: CUBE;

groupingKeyword: GROUPING;

setsKeyword: SETS;

withKeyword: WITH;

openxmlKeyword: OPENXML;

atsymbolKeyword: ATSYMBOL;

dotKeyword: DOT;

tablesampleKeyword: TABLESAMPLE;

systemKeyword: SYSTEM;

percentKeyword: PERCENT;

repeatableKeyword: REPEATABLE;

onKeyword: ON;

crossKeyword: CROSS;

joinKeyword: JOIN;

outerKeyword: OUTER;

applyKeyword: APPLY;

innerKeyword: INNER;

leftKeyword: LEFT;

rightKeyword: RIGHT;

fullKeyword: FULL;

pivotKeyword: PIVOT;

unpivotKeyword: UNPIVOT;

ofKeyword: OF;

toKeyword: TO;

betweenKeyword: BETWEEN;

containedKeyword: CONTAINED;

identityKeyword: IDENTITY;

rowguidKeyword: ROWGUID;

tempKeyword: TEMP;

hashKeyword: HASH;

concatKeyword: CONCAT;

mergeKeyword: MERGE;

unionKeyword: UNION;

loopKeyword: LOOP;

expandKeyword: EXPAND;

viewsKeyword: VIEWS;

fastKeyword: FAST;

forceKeyword: FORCE;

disableKeyword: DISABLE;

externalpushdownKeyword: EXTERNALPUSHDOWN;

scaleoutexecutionKeyword: SCALEOUTEXECUTION;

keepKeyword: KEEP;

planKeyword: PLAN;

keepfixedKeyword: KEEPFIXED;

maxdopKeyword: MAXDOP;

maxrecursionKeyword: MAXRECURSION;

optimizeKeyword: OPTIMIZE;

unknownKeyword: UNKNOWN;

parameterizationKeyword: PARAMETERIZATION;

simpleKeyword: SIMPLE;

forcedKeyword: FORCED;

querytraceonKeyword: QUERYTRACEON;

recompileKeyword: RECOMPILE;

robustKeyword: ROBUST;

useKeyword: USE;

hintKeyword: HINT;

nKeyword: N;

tableKeyword: TABLE;

timestampKeyword: TIMESTAMP;

noexpandKeyword: NOEXPAND;

indexKeyword: INDEX;

forceseekKeyword: FORCESEEK;

forcescanKeyword: FORCESCAN;

holdlockKeyword: HOLDLOCK;

nolockKeyword: NOLOCK;

nowaitKeyword: NOWAIT;

paglockKeyword: PAGLOCK;

readcommittedKeyword: READCOMMITTED;

readcommittedlockKeyword: READCOMMITTEDLOCK;

readpastKeyword: READPAST;

readuncommittedKeyword: READUNCOMMITTED;

repeatablereadKeyword: REPEATABLEREAD;

rowlockKeyword: ROWLOCK;

serializableKeyword: SERIALIZABLE;

snapshotKeyword: SNAPSHOT;

tablockKeyword: TABLOCK;

tablockxKeyword: TABLOCKX;

updlockKeyword: UPDLOCK;

xlockKeyword: XLOCK;

keepidentityKeyword: KEEPIDENTITY;

keepdefaultsKeyword: KEEPDEFAULTS;

remoteKeyword: REMOTE;

reduceKeyword: REDUCE;

replicateKeyword: REPLICATE;

redistributeKeyword: REDISTRIBUTE;

updateKeyword: UPDATE;

setKeyword: SET;

defaultKeyword: DEFAULT;

nullKeyword: NULL;

writeKeyword: WRITE;

plusequalKeyword: PLUSEQUAL;

minusequalKeyword: MINUSEQUAL;

multipleequalKeyword: MULTIPLEEQUAL;

divisionequalKeyword: DIVISIONEQUAL;

moduleequalKeyword: MODULEEQUAL;

andequalKeyword: ANDEQUAL;

xorequalKeyword: XOREQUAL;

orequalKeyword: OREQUAL;

whereKeyword: WHERE;

currentKeyword: CURRENT;

globalKeyword: GLOBAL;

optionKeyword: OPTION;

semicolonKeyword: SEMICOLON;

outputKeyword: OUTPUT;

deletedKeyword: DELETED;

insertedKeyword: INSERTED;

dollarKeyword: DOLLAR;

actionKeyword: ACTION;

deleteKeyword: DELETE;

insertKeyword: INSERT;

valuesKeyword: VALUES;

selectKeyword: SELECT;

tiesKeyword: TIES;

usingKeyword: USING;

whenKeyword: WHEN;

matchedKeyword: MATCHED;

thenKeyword: THEN;

targetKeyword: TARGET;

sourceKeyword: SOURCE;

dropKeyword: DROP;

ifKeyword: IF;

alterKeyword: ALTER;

columnKeyword: COLUMN;

sparseKeyword: SPARSE;

addKeyword: ADD;

rowguidcolKeyword: ROWGUIDCOL;

persistedKeyword: PERSISTED;

replicationKeyword: REPLICATION;

maskedKeyword: MASKED;

functionKeyword: FUNCTION;

onlineKeyword: ONLINE;

offKeyword: OFF;

checkKeyword: CHECK;

nocheckKeyword: NOCHECK;

generatedKeyword: GENERATED;

alwaysKeyword: ALWAYS;

startKeyword: START;

constraintKeyword: CONSTRAINT;

endKeyword: END;

periodKeyword: PERIOD;

enableKeyword: ENABLE;

triggerKeyword: TRIGGER;

switchKeyword: SWITCH;

partitionKeyword: PARTITION;

infiniteKeyword: INFINITE;

dayKeyword: DAY;

daysKeyword: DAYS;

weekKeyword: WEEK;

weeksKeyword: WEEKS;

monthKeyword: MONTH;

monthsKeyword: MONTHS;

yearKeyword: YEAR;

yearsKeyword: YEARS;

rebuildKeyword: REBUILD;

moveKeyword: MOVE;

pausedKeyword: PAUSED;

outboundKeyword: OUTBOUND;

inboundKeyword: INBOUND;

noneKeyword: NONE;

pageKeyword: PAGE;

columnstoreKeyword: COLUMNSTORE;

minutesKeyword: MINUTES;

selfKeyword: SELF;

blockersKeyword: BLOCKERS;

filestreamKeyword: FILESTREAM;

encryptedKeyword: ENCRYPTED;

deterministicKeyword: DETERMINISTIC;

randomizedKeyword: RANDOMIZED;

algorithmKeyword: ALGORITHM;

contentKeyword: CONTENT;

documentKeyword: DOCUMENT;

primaryKeyword: PRIMARY;

keyKeyword: KEY;

uniqueKeyword: UNIQUE;

clusteredKeyword: CLUSTERED;

nonclusteredKeyword: NONCLUSTERED;

fillfactorKeyword: FILLFACTOR;

foreignKeyword: FOREIGN;

referencesKeyword: REFERENCES;

partitionsKeyword: PARTITIONS;

resumableKeyword: RESUMABLE;

createKeyword: CREATE;

includeKeyword: INCLUDE;

closeKeyword: CLOSE;

deallocateKeyword: DEALLOCATE;

declareKeyword: DECLARE;

cursorKeyword: CURSOR;

localKeyword: LOCAL;

scrollKeyword: SCROLL;

staticKeyword: STATIC;

keysetKeyword: KEYSET;

dynamicKeyword: DYNAMIC;

optimisticKeyword: OPTIMISTIC;

priorKeyword: PRIOR;

lastKeyword: LAST;

absoluteKeyword: ABSOLUTE;

relativeKeyword: RELATIVE;

openKeyword: OPEN;

bulkKeyword: BULK;

codepageKeyword: CODEPAGE;

acpKeyword: ACP;

oemKeyword: OEM;

datafiletypeKeyword: DATAFILETYPE;

charKeyword: CHAR;

rowterminatorKeyword: ROWTERMINATOR;

fieldterminatorKeyword: FIELDTERMINATOR;

formatKeyword: FORMAT;

csvKeyword: CSV;

fieldquoteKeyword: FIELDQUOTE;

firstrowKeyword: FIRSTROW;

lastrowKeyword: LASTROW;

formatfileKeyword: FORMATFILE;

maxerrorsKeyword: MAXERRORS;

errorfileKeyword: ERRORFILE;

keepnullsKeyword: KEEPNULLS;

batchsizeKeyword: BATCHSIZE;

openrowsetKeyword: OPENROWSET;

numbersKeyword: NUMBERS;

stringKeyword: STRING;

identifiersKeyword: IDENTIFIERS;

openqueryKeyword: OPENQUERY;

execKeyword: EXEC;

executeKeyword: EXECUTE;

plusKeyword: PLUS;

loginKeyword: LOGIN;

userKeyword: USER;

atKeyword: AT;

resultKeyword: RESULT;

undefinedKeyword: UNDEFINED;

objectKeyword: OBJECT;

divisionKeyword: DIVISION;

moduleKeyword: MODULE;

opendatasourceKeyword: OPENDATASOURCE;

exceptKeyword: EXCEPT;

intersectKeyword: INTERSECT;

distinctKeyword: DISTINCT;

goKeyword: GO;

asKeyword: AS;

fromKeyword: FROM;

isKeyword: IS;

topKeyword: TOP;

intoKeyword: INTO;

noKeyword: NO;

matchKeyword: MATCH;

cascadeKeyword: CASCADE;

connectionKeyword: CONNECTION;

dataType1: DATATYPE;

havingKeyword: HAVING;

onkeyword1: ON;

truncatekeyword: TRUNCATE;

data_sourcekeyword: DATA_SOURCE;

rows_per_batchkeyword: ROWS_PER_BATCH;

system_timekeyword: SYSTEM_TIME;
max_grant_percentkeyword: MAX_GRANT_PERCENT;
min_grant_percentkeyword: MIN_GRANT_PERCENT;
spatial_window_max_cellskeyword: SPATIAL_WINDOW_MAX_CELLS;
elsekeyword: ELSE;
sequence_numberkeyword: SEQUENCE_NUMBER;
change_trackingkeyword: CHANGE_TRACKING;
track_columns_updatedkeyword: TRACK_COLUMNS_UPDATED;
filestream_onkeyword: FILESTREAM_ON;
system_versioningkeyword: SYSTEM_VERSIONING;
history_tablekeyword: HISTORY_TABLE;
data_consistency_checkkeyword: DATA_CONSISTENCY_CHECK;
history_retention_periodkeyword: HISTORY_RETENTION_PERIOD;
data_deletionkeyword: DATA_DELETION;
filter_columnkeyword: FILTER_COLUMN;
retention_periodkeyword: RETENTION_PERIOD;
column_setkeyword: COLUMN_SET;
lock_escalationkeyword: LOCK_ESCALATION;
filetable_directorykeyword: FILETABLE_DIRECTORY;
remote_data_archivekeyword: REMOTE_DATA_ARCHIVE;
off_without_data_recoverykeyword: OFF_WITHOUT_DATA_RECOVERY;
filter_predicatekeyword: FILTER_PREDICATE;
migration_statekeyword: MIGRATION_STATE;
sort_in_tempdbkeyword: SORT_IN_TEMPDB;
data_compressionkeyword: DATA_COMPRESSION;
wait_at_low_prioritykeyword: WAIT_AT_LOW_PRIORITY;
max_durationkeyword: MAX_DURATION;
abort_after_waitkeyword: ABORT_AFTER_WAIT;
column_encryption_keykeyword: COLUMN_ENCRYPTION_KEY;
encryption_typekeyword: ENCRYPTION_TYPE;
pad_indexkeyword: PAD_INDEX;
ignore_dup_keykeyword: IGNORE_DUP_KEY;
statistics_norecomputekeyword: STATISTICS_NORECOMPUTE;
allow_row_lockskeyword: ALLOW_ROW_LOCKS;
allow_page_lockskeyword: ALLOW_PAGE_LOCKS;
optimize_for_sequential_keykeyword: OPTIMIZE_FOR_SEQUENTIAL_KEY;
xml_compressionkeyword: XML_COMPRESSION;
textimage_onkeyword: TEXTIMAGE_ON;
ledger_viewkeyword: LEDGER_VIEW;
append_onlykeyword: APPEND_ONLY;
transaction_id_column_namekeyword: TRANSACTION_ID_COLUMN_NAME;
sequence_number_column_namekeyword: SEQUENCE_NUMBER_COLUMN_NAME;
delaykeyword: DELAY;
tildekeyword: TILDE;
timekeyword: TIME;
timeoutkeyword: TIMEOUT;
operation_type_column_namekeyword: OPERATION_TYPE_COLUMN_NAME;
forward_onlykeyword: FORWARD_ONLY;
read_onlykeyword: READ_ONLY;
scroll_lockskeyword: SCROLL_LOCKS;
formatfile_data_sourcekeyword: FORMATFILE_DATA_SOURCE;
errorfile_data_sourcekeyword: ERRORFILE_DATA_SOURCE;
beginkeyword: BEGIN;
transaction_idkeyword: TRANSACTION_ID;
kilobytes_per_batchkeyword: KILOBYTES_PER_BATCH;
whilekeyword: WHILE;
breakkeyword: BREAK;
continuekeyword: CONTINUE;
waitforkeyword: WAITFOR;
test: (
		insert
		| update
		| sELECTstatement
		| create
		| declare_cursor
		| open_cursor
		| fetch_cursor
		| close_cursor
		| dellocate_cursor
		| delete
		| drop
		| alter
		| truncate
		| use
		| go
		| if
		| statement_block
		| while
	)* EOF # Program;
// test: if EOF # Program;