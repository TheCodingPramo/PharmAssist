CREATE DATABASE PHARMASSIST;
USE PHARMASSIST;

CREATE TABLE EMPLOYEE(
EID VARCHAR (10) NOT NULL,
ENAME VARCHAR (25),
ADDRESS VARCHAR (40),
TELNO INT,
JOB_ROLE VARCHAR (10),
USER_NAME VARCHAR (15),
PASSWORD VARCHAR (15),
PRIMARY KEY (EID)
);

CREATE TABLE GENERIC(
GID VARCHAR (10) NOT NULL,
GNAME VARCHAR (50),
PRIMARY KEY (GID)
);

CREATE TABLE DRUG(
DID VARCHAR (10) NOT NULL,
DNAME VARCHAR (25),
QUANTITY INT,
PRICE FLOAT,
MFD DATE,
EXP_DATE DATE,
GID VARCHAR (10) NOT NULL,
PRIMARY KEY (DID),
FOREIGN KEY (GID) REFERENCES GENERIC (GID)
);

CREATE TABLE CUSTOMER(
CID VARCHAR (10),
CNAME VARCHAR (20),
EMAIL VARCHAR (30),
PHONE INT,
PRIMARY KEY (CID)
);


CREATE TABLE PRES_ORDER(
OID VARCHAR (10) NOT NULL,
DATE_TIME DATETIME,
EID VARCHAR (10),
CID VARCHAR (10),
PRIMARY KEY (OID),
FOREIGN KEY (EID) REFERENCES EMPLOYEE (EID),
FOREIGN KEY (CID) REFERENCES CUSTOMER (CID)
);


CREATE TABLE DRUG_ORDER(
OID VARCHAR (10) ,
DID VARCHAR (10) ,
ORDER_QUANTITY INT,
ITEM_PRICE INT,
PRIMARY KEY (OID,DID),
FOREIGN KEY (OID) REFERENCES PRES_ORDER (OID),
FOREIGN KEY (DID) REFERENCES DRUG (DID)
); 

CREATE TABLE BILL(
BID VARCHAR (10) NOT NULL,
OID VARCHAR (10),
DATE_TIME DATETIME,
PAYMENT_METHOD VARCHAR (20),
TOTAL INT,
CASH_GIVEN FLOAT,
BALANCE FLOAT,
PRIMARY KEY (BID),
FOREIGN KEY (OID) REFERENCES PRES_ORDER (OID)
);

CREATE TABLE SUPPLIER(
SID VARCHAR (10) NOT NULL,
SNAME VARCHAR (50),
ADDRESS VARCHAR (100),
TELNO INT,
PRIMARY KEY (SID)
);

CREATE TABLE SUPPLY_DETAILS(
SID VARCHAR (10),
DID VARCHAR (10),
SDATE DATE,
PURCHASE_PRICE INT,
QUANTITY INT,
FOREIGN KEY (SID) REFERENCES SUPPLIER (SID),
FOREIGN KEY (DID) REFERENCES DRUG (DID)
);


INSERT INTO GENERIC(GID,GNAME)
VALUES
('GA001','PARACETAMOL'),
('GA002','ASCORBIC ACID'),
('GA003','CHLORPHENEMINE'),
('GA004','CETRAZIN DIHYDROCHLORIDE' ),
('GA005','PREDNISONE'),
('GA006','DEXAMETHSONE'),
('GA007','ETOFYLLINE + THEOPHYLLLIN'),
('GA008','TURBUTALINE SULPHATE'),
('GA009','AMOXICILLIN TRIHYDRATE'),
('GA010','PARACETAMOL 500mg + CODEIN PHOSPATE 8mg'),
('GA011','OMEPRAZOLE'),
('GA012','SALBUTAMOL'),
('GD001','METFORMIN 500mg'),
('GD002','METFORMIN SUSTAINED RELEASED '),
('GD003','GLICLAZIDE'),
('GD004','GLICLAZIDE MODIFIED RELEASED'),
('GP001','LORSARTAN POTASSIUM'),
('GC001','ATORVASTATIN CALCIUM'),
('GS001','DIPHENHYDRAMINE HYDROCHLORIDE'),
('GS002','AMOXICILLIN TRIHYDRATE'),
('GS003','AMOXICILLIN + CLAVULANIC ACID'),
('GS004','ONDANSETRON'),
('GS005','CYPROHEPTADINE'),
('GS006','CLARITHROMYCIN'),
('GS007','PARACETAMOL'),
('GS008','CHLORPHENAMINE'),
('GB001','AMOXICILLIN + CLAVULANIC ACID'),
('GB002','CLARITHROMYCIN'),
('GB003','CIPROFLOXACIN'),
('GB004','AZITHROMYCIN'),
('GE001','FUSIDIC ACID'),
('GE002','CLOBETASOL + GENTAMYCIN'),
('GE003','CLOBETASOL'),
('GE004','CLOBETASOL + GENTAMYCIN + MICANAZOLE'),
('GE005','BECLOMETHASONE + MICANAZOLE + NEOMYCIN'),
('GE006','KETACONAZOLE'),
('GE007','POVIDINE IODINE'),
('GE008','MICANAZOLE'),
('GF001',''),
('GF002',''),
('GZ001','RAXANOL'),
('GZ002','PREGABLIN'),
('GZ003','ASPRIN'),
('GZ004','IBUPROFEN'),
('GZ005','CLONEZEPAM'),
('GZ006','RESPERIDON'),
('GZ007','MEFANAMIC ACID')

;


INSERT INTO DRUG(DID,DNAME,QUANTITY,PRICE,MFD,EXP_DATE,GID)
 VALUES
('DA001','PANADOL (500mg)',1000,4,'2023-01-01','2026-01-01','GA001'),
('DA002','PARAGON (500mg)',1000,4,'2023-01-01','2026-01-01','GA001'),
('DA003','PACIDOL (500mg)',1000,4,'2023-01-01','2026-01-01','GA001'),
('DA004','VIT-C (100mg)',1000,2.50,'2023-01-01','2026-01-01','GA002'),
('DA005','XON-CE (500mg)',1000,28,'2023-01-01','2026-01-01','GA002'),
('DA006','CEE (500mg)',1000,28,'2023-01-01','2026-01-01','GA002'),
('DA007','PIRITON (4mg)',1000,2,'2023-01-01','2026-01-01','GA003'),
('DA008','ALLERMINE (4mg)',1000,3,'2023-01-01','2026-01-01','GA003'),
('DA009','ZIN (10mg)',1000,3,'2023-01-01','2026-01-01','GA004'),
('DA010','SET (10mg)',1000,3,'2023-01-01','2026-01-01','GA004'),
('DA011','ALERID (10mg)',1000,4,'2023-01-01','2026-01-01','GA004'),
('DA012','PREDNISELONE (1mg)',1000,2,'2023-01-01','2026-01-01','GA005'),
('DA013','DEXAMETHSONE (0.5mg)',1000,2,'2023-01-01','2026-01-01','GA006'),
('DA014','DERIPHYLLIN (150mg)',1000,2,'2023-01-01','2026-01-01','GA007'),
('DA015','DERIPHYLLIN (300mg)',1000,3,'2023-01-01','2026-01-01','GA007'),
('DA016','ATALIN (10mg)',1000,2.50,'2023-01-01','2026-01-01','GA008'),
('DA017','TURBUTE (10mg)',1000,3,'2023-01-01','2026-01-01','GA008'),
('DA018','AMYN (250mg)',1000,20,'2023-01-01','2026-01-01','GA009'),
('DA019','AMYN (500mg)',1000,28,'2023-01-01','2026-01-01','GA009'),
('DA020','AXCIL (250mg)',1000,22,'2023-01-01','2026-01-01','GA009'),
('DA021','AXCIL (500mg)',1000,30,'2023-01-01','2026-01-01','GA009'),
('DA022','RAPIDENE (500mg)',1000,25,'2023-01-01','2026-01-01','GA010'),
('DA023','PANADENE (500mg)',1000,26,'2023-01-01','2026-01-01','GA010'),
('DA024','OMEZ (20mg)',1000,12,'2023-01-01','2026-01-01','GA011'),
('DA025','LOKIT (20mg)',1000,10,'2023-01-01','2026-01-01','GA011'),
('DA026','SALBUTAMOL (2mg)',1000,2,'2023-01-01','2026-01-01','GA012'),
('DA027','SALBUTAMOL (4mg)',1000,3,'2023-01-01','2026-01-01','GA012'),
('DB001','AUGMENTIN (375mg)',1000,40,'2023-01-01','2026-01-01','GB001'),
('DB002','AUGMENTIN (625mg)',1000,50,'2023-01-01','2026-01-01','GB001'),
('DB003','CLARITEK (250mg)',1000,34,'2023-01-01','2026-01-01','GB002'),
('DB004','CLARITEK (500mg)',1000,42,'2023-01-01','2026-01-01','GB002'),
('DB005','CIPROBID (250mg)',1000,23,'2023-01-01','2026-01-01','GB003'),
('DB006','CIPROBID (500mg)',1000,30,'2023-01-01','2026-01-01','GB003'),
('DB007','AZEE (250mg)',1000,26,'2023-01-01','2026-01-01','GB004'),
('DB008','AZEE (500mg)',1000,34,'2023-01-01','2026-01-01','GB004'),
('DB009','AZ (250mg)',1000,26,'2023-01-01','2026-01-01','GB004'),
('DB010','AZ (500mg)',1000,34,'2023-01-01','2026-01-01','GB004'),
('DC001','ATOCOR (10mg)',1000,18,'2023-01-01','2026-01-01','GC001'),
('DC002','ATOCOR (20mg)',1000,27,'2023-01-01','2026-01-01','GC001'),
('DC003','ATOCOR (40mg)',1000,36,'2023-01-01','2026-01-01','GC001'),
('DC004','ATORVA (10mg)',1000,18,'2023-01-01','2026-01-01','GC001'),
('DC005','ATORVA (20mg)',1000,27,'2023-01-01','2026-01-01','GC001'),
('DC006','ATORVA (40mg)',1000,36,'2023-01-01','2026-01-01','GC001'),
('DD001','GLYCOMET (500mg)',1000,25,'2023-01-01','2026-01-01','GD001'),
('DD002','MELMET (500mg)',1000,25,'2023-01-01','2026-01-01','GD001'),
('DD003','SRIMET (500mg)',1000,25,'2023-01-01','2026-01-01','GD001'),
('DD004','GLUCOPHAGE (500mg)',1000,25,'2023-01-01','2026-01-01','GD001'),
('DD005','BIGMET (500mg)',1000,25,'2023-01-01','2026-01-01','GD001'),
('DD006','METFORMIN SPMC (500mg)',1000,15,'2023-01-01','2026-01-01','GD001'),
('DD007','GLYCOMET SR (500mg)',1000,25,'2023-01-01','2026-01-01','GD002'),
('DD008','MELMET SR (500mg)',1000,25,'2023-01-01','2026-01-01','GD002'),
('DD009','GLUCOPHAGE SR (500mg)',1000,27,'2023-01-01','2026-01-01','GD002'),
('DD010','DIBETA SR (500mg)',1000,28,'2023-01-01','2026-01-01','GD002'),
('DD011','NEVOX XR (500mg)',1000,32,'2023-01-01','2026-01-01','GD002'),
('DD012','METFORMIN SR SPMC (500mg)',1000,20,'2023-01-01','2026-01-01','GD002'),
('DD013','GLYCLAPAN (40mg)',1000,8,'2023-01-01','2026-01-01','GD003'),
('DD014','GLYCLAPAN (80mg)',1000,14,'2023-01-01','2026-01-01','GD003'),
('DD015','GLIX (40mg)',1000,12,'2023-01-01','2026-01-01','GD003'),
('DD016','GLIX (80mg)',1000,18,'2023-01-01','2026-01-01','GD003'),
('DD017','DIAZIDE (40mg)',1000,9,'2023-01-01','2026-01-01','GD003'),
('DD018','DIAZIDE (80mg)',1000,15,'2023-01-01','2026-01-01','GD003'),
('DD019','GLICLAZIDE SPMC (40mg)',1000,6,'2023-01-01','2026-01-01','GD003'),
('DD020','GLICLAZIDE SPMC (80mg)',1000,8,'2023-01-01','2026-01-01','GD003'),
('DD021','DIAMICRON MR (30mg)',1000,18,'2023-01-01','2026-01-01','GD004'),
('DD022','DIAMICRON MR (60mg)',1000,25,'2023-01-01','2026-01-01','GD004'),
('DD023','GLIX MR (30mg)',1000,14,'2023-01-01','2026-01-01','GD004'),
('DD024','GLIX MR (60mg)',1000,21,'2023-01-01','2026-01-01','GD004'),
('DE001','FUSID CREAM (15G)',1000,230,'2023-01-01','2026-01-01','GE001'),
('DE002','FUSIDIN CREAM (15G)',1000,300,'2023-01-01','2026-01-01','GE001'),
('DE003','ENDERM G CREAM (15G)',1000,365,'2023-01-01','2026-01-01','GE002'),
('DE004','ENDERM CREAM (15G)',1000,280,'2023-01-01','2026-01-01','GE003'),
('DE005','ENDERM GM CREAM (15G)',1000,425,'2023-01-01','2026-01-01','GE004'),
('DE006','BECLOMIN CREAM (15G)',1000,385,'2023-01-01','2026-01-01','GE005'),
('DE007','MYCORAL CREAM (15G)',1000,220,'2023-01-01','2026-01-01','GE006'),
('DE008','BETADINE CREAM (15G)',1000,625,'2023-01-01','2026-01-01','GE007'),
('DE009','NEOZOLE SPC CREAM (15G)',1000,120,'2023-01-01','2026-01-01','GE008'),
('DF001','OILATUM SOAP',500,565,'2023-01-01','2026-01-01','GF001'),
('DF002','AQUASOFT SOAP',500,625,'2023-01-01','2026-01-01','GF002'),
('DP001','ZAART (50mg)',1000,52,'2023-01-01','2026-01-01','GP001'),
('DP002','ZAART (100mg)',1000,65,'2023-01-01','2026-01-01','GP001'),
('DP003','MYOTAN (50mg)',1000,48,'2023-01-01','2026-01-01','GP001'),
('DP004','MYOTAN (100mg)',1000,60,'2023-01-01','2026-01-01','GP001'),
('DS001','PHENYCOF SYRUP (100ml)',200,680,'2023-01-01','2026-01-01','GS001'),
('DS002','AMYN SYRUP (100ml)',200,440,'2023-01-01','2026-01-01','GS002'),
('DS003','AUGMENTIN SYRUP (100ml)',200,750,'2023-01-01','2026-01-01','GS003'),
('DS004','VOMIKIND SYRUP (100ml)',200,380,'2023-01-01','2026-01-01','GS004'),
('DS005','PERITOL SYRUP (100ml)',200,550,'2023-01-01','2026-01-01','GS005'),
('DS006','CLARITEK SYRUP (100ml)',200,630,'2023-01-01','2026-01-01','GS006'),
('DS007','PANADOL SYRUP (100ml)',200,380,'2023-01-01','2026-01-01','GS007'),
('DS008','PIRITON SYRUP (100ml)',200,250,'2023-01-01','2026-01-01','GS008'),
('DZ001','MORPHINE (1Kg)',50,1200,'2023-01-01','2026-01-01','GZ001'),
('DZ002','GABLIN (50 mg)',200,27,'2023-01-01','2026-01-01','GZ002'),
('DZ003','GABLIN (75 mg)',200,38,'2023-01-01','2026-01-01','GZ002'),
('DZ004','GABLIN (150 mg)',200,52,'2023-01-01','2026-01-01','GZ002'),
('DZ005','GABLIN (300 mg)',200,80,'2023-01-01','2026-01-01','GZ002'),
('DZ006','ECOSPRIN (75 mg)',500,5,'2023-01-01','2026-01-01','GZ003'),
('DZ007','ECOSPRIN (150 mg)',500,27,'2023-01-01','2026-01-01','GZ003'),
('DZ008','IBRUPROFEN (75 mg)',250,15,'2023-01-01','2026-01-01','GZ004'),
('DZ009','CLONEZEPAM (0.5 mg)',500,34,'2023-01-01','2026-01-01','GZ005'),
('DZ010','RISNIA (1 mg)',500,32,'2023-01-01','2026-01-01','GZ006'),
('DZ011','RISNIA (2 mg)',500,38,'2023-01-01','2026-01-01','GZ006'),
('DZ012','MEFEN (500 mg)',500,28,'2023-01-01','2026-01-01','GZ007')

;


SELECT * FROM DRUG;


SELECT * FROM GENERIC;

INSERT INTO SUPPLIER
VALUES
('SU001', 'Hemas Pharmaceuticals (Pvt) Ltd', 'No.12, Glen Aber Place,Colombo 03,Sri Lanka', '0114766666'),
('SU002', 'Mega Pharma (Pvt) Ltd', '93/5, Dutugemunu Street, Colombo 06, Sri Lanka', '01128123901'),
('SU003', 'Breathe Free Lanka Pvt Ltd', '345/1,Galle Road,Colpetty,Colombo-03,Sri Lanka', '0112577730'),
('SU004', 'State Pharmaceuticals Corporation of Sri Lanka', '16th Floor,“MEHEWARA PIYASA”,NO. 41, Kirula Road,Colombo 05,Sri Lanka.', '0112381739'),
('SU005', 'Emerchemie NB (Ceylon) Limited', '60, Maligawatte Road, Colombo 10,Sri Lanka.', '0112689390'),
('SU006', 'Raj Medical Pvt. Ltd', 'No. 46, Peradeniya Road, Kandy', '0772835999'),
('SU007', 'Gamma Pharmaceuticals PVT LTD', '476 Union Place, Colombo 02,Sri Lanka', '0115220400'),
('SU008', 'Unique Pharmacy Negombo (Pvt) Ltd.', 'No:149, Colombo Road, Negombo, Sri Lanka.', '012237006'),
('SU009', 'Sunshine Healthcare Lanka Ltd', '27-4/1,York Arcade Building,York Arcade Road,Colombo 01', '0114702500'),
('SU010', 'Sukitha Pharmacy & Clinic – Pvt Ltd.', 'No. 331,Galle Road, Rathmalana, Sri Lanka.', '0112722515'),
('SU011', 'Mankind Pharma Limited', '208, Okhla Phase 3 Rd, Okhla Phase III, Okhla Industrial Estate, New Delhi, Delhi 110020', '0114654111'), 
('SU012', 'Getz Pharma ( Pvt ) Ltd , Sri Lanka', 'No.21 Sir Razik Fareed Mawatha, Colombo', '0114766666'),
('SU013', 'SmithKline Beecham (Pvt) Ltd', 'RVQM+R92, Dehiwala-Mount Lavinia', '0114790400'),
('SU014', 'A. Baur & Co. (Pvt.) Ltd', 'P.O. Box 11,5, Upper Chatham Street,Colombo 1,Sri Lanka', '0114732600'),
('SU015', 'Wallace Pharmaceuticals Pvt. Ltd.', '3rd Floor, Dempo Trade Centre Bldg., Patto Plaza,EDC Complex, Panaji 403001, Goa, India.', '0322490200'),
('SU016', 'Fredun Pharmaceuticals LTD', '11th Floor, Tower A,Urmi Estate 95, Ganpatrao Kadam Marg,Lower Parel (W), Mumbai 400013', '0224031811'), 
('SU017', 'Bev Ceylon (Pvt) Ltd', 'No. 33, Parkland Building , Level 12, Park Street, Colombo 02, Sri Lanka.', '0759991000'),
('SU018', 'Leben Laboratory Pvt Ltd', 'M3P7+C5F, Midc Phase 3 and 4, MIDC, Akola, Maharashtra 444104,India', '0724225940'), 
('SU019', 'Win Medicare Pvt Ltd', '14th floor, Modi Tower, 1309, 98, Nehru Place, New Delhi, Delhi 110019, India', '0114250555'),
('SU020', 'Sun Pharmaceutical Industries Ltd.', 'SUN HOUSE,CTS No. 201 B/1,Western Express Highway,Goregaon (E),Mumbai 400063 ,India', '0114324432'), 
('SU021', 'Aurobindo Pharma Limited,', 'Plot no. 2, Maitrivihar,Ameerpet,Hyderabad-500038 Telangana, India.', '0466721200'), 
('SU022', 'Glaxo Wellcome Ceylon Ltd.', 'No.121, Galle Road, Kaldemuna, Moratuwa-10400, Western Province, Sri Lanka', '0112636341'),
('SU023', 'Dr. Preeth Laboratoties (Pvt) Ltd', 'No.15, Union Place,Colombo 03,Sri Lanka', '0114768866'),
('SU024', 'Gigantic Pharmaceutical Corporation', 'Glen Aber Place,Colombo 02,Sri Lanka', '0112396666'),
('SU025', 'Cipla LTD', ' 1-4/1 A2, Colombo 67337', '0114768866'),
('SU026', 'Interpharm (PVT) Ltd', 'QWGG+65P, Piliyandala', '0114768566'),
('SU027', 'Astron Ltd', '688 Galle Road, Dehiwala-Mount Lavinia', '0114762066'),
('SU028', 'Benton & Cosrx', 'No.123,Main St,Colombo 07 ', '0116348866'),
('SU029', 'Medochemie Ltd', 'No.06,Union Place,Colombo 03 ', '0116349866'),
('SU030', 'Belcopharma', 'No.25, Maligawatte Road, Colombo 03 ', '0116878866')
;

SELECT * FROM SUPPLIER;

/* INSERT DATA IN TO CUSTOMER TABLE */
use PHARMASSIST;
INSERT INTO CUSTOMER
VALUES
('CM001', 'Sadeep Hasthika', 'hasthika@gmail.com', '0714523685'),
('CM002', 'Induwara Sahasraka', 'induwara23@gmail.com', '0745698235'),
('CM003', 'Sachintha Jayasekara', 'sachi34@gmail.com', '0774369855'),
('CM004', 'Gayathri Katupitiya', 'gayathk@gmail.com', '0785629874'),
('CM005', 'Sineth Renuja', 'sineth@gmail.com', '0715536682'),
('CM006', 'Dilini Tharaka', 'dilini@gmail.com', '0786654841'),
('CM007', 'Charuni Kavindya', 'charuni@gmail.com', '0765481245'),
('CM008', 'Upeak Amiru', 'amiru@gmail.com', '0754863217'),
('CM009', 'Pubudini Nisansala', 'nisansala@gmail.com', '0725589741'),
('CM0010', 'Hasini Rathnayaka', 'hasini@gmail.com', '0762536987');

/* Insert data to employee*/

INSERT INTO EMPLOYEE
VALUES
('EM001','PINIMAL','NO,123,DALUGAMA RD,KELANIYA','0762255449','ADMIN','PINIBOY','Pini123#');



