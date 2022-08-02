//for creating table(login)
--------------------------------------
CREATE TABLE `mydb`.`user` (
  `uname` VARCHAR(45) NOT NULL,
  `pwd` VARCHAR(45) NULL,
  PRIMARY KEY (`uname`),
  UNIQUE INDEX `uname_UNIQUE` (`uname` ASC) VISIBLE);



//now insert records into the table
------------------------------------------
INSERT into login values('user','pwd');



//After inserting records, retrieve them by using following.
------------------------------------------------------------------
SELECT * from jdbc.login;
